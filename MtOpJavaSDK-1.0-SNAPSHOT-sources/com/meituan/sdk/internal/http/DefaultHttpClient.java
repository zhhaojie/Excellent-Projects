package com.meituan.sdk.internal.http;

import com.meituan.sdk.internal.constants.CommonConstants;
import com.meituan.sdk.internal.exceptions.MtSdkException;
import com.meituan.sdk.internal.enums.SdkError;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.meituan.sdk.internal.utils.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * 网络相关工具默认实现
 * </p>
 */
public class DefaultHttpClient implements HttpClient {

    private static final String POST = "POST";

    private static final String HTTPS = "https";

    private static SSLContext ctx = null;

    private static HostnameVerifier verifier;

    /**
     * 是否校验服务端证书
     */
    private static final boolean needSSLCheck = true;

    private static final Logger logger = LoggerFactory.getLogger(DefaultHttpClient.class);

    static {
        try {
            ctx = SSLContext.getInstance("TLS");
            ctx.init(new KeyManager[0], new TrustManager[]{new DefaultTrustManager()}, new SecureRandom());
        } catch (Exception e) {
            logger.error("初始化SSLContext失败，errMsg:{}", e.getMessage());
        }

        verifier = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }

    @Override
    public String postWithUrlEncoded(String url, Map<String, String> requestParams, Map<String, String> headers, HttpConfig httpConfig) throws MtSdkException {
        String charset = requestParams.get(CommonConstants.CHARSET);
        String ctype = "application/x-www-form-urlencoded;charset=" + charset;
        // 构建请求体
        byte[] content = buildQuery(requestParams, charset);

        return doPost(url, ctype, content, headers, httpConfig);
    }

    private static String doPost(String url, String ctype, byte[] content, Map<String, String> headerMap, HttpConfig httpConfig) throws MtSdkException {
        HttpURLConnection conn = null;
        OutputStream out = null;
        String resp;
        try {
            try {
                conn = getConnection(new URL(url), ctype, headerMap);
                conn.setConnectTimeout(httpConfig.getConnectTimeout());
                conn.setReadTimeout(httpConfig.getReadTimeout());

                out = conn.getOutputStream();
                out.write(content);
                if (200 != conn.getResponseCode()) {
                    logger.error("请求返回状态码异常，url:{}, connectTimeout:{}, readTimeout:{}, headerMap:{}, resPonseCode:{}",
                            url, httpConfig.getConnectTimeout(), httpConfig.getReadTimeout(), JsonUtil.toJson(headerMap), conn.getResponseCode());
                    throw new MtSdkException(SdkError.HTTPCLIENT_ERROR.getCode(), "请求返回状态码异常,ResponseCode:" + conn.getResponseCode());
                }
                resp = getResponseAsString(conn);
            } finally {
                if (out != null) {
                    out.close();
                }
                if (conn != null) {
                    conn.disconnect();
                }
            }
        } catch (IOException e) {
            logger.error("执行post请求时发生异常，url:{}, connectTimeout:{}, readTimeout:{}, headerMap:{}",
                    url, httpConfig.getConnectTimeout(), httpConfig.getReadTimeout(), JsonUtil.toJson(headerMap), e);
            throw new MtSdkException(SdkError.HTTPCLIENT_ERROR, e);
        }

        return resp;
    }

    private static String getResponseAsString(HttpURLConnection conn) throws IOException {
        String charset = getResponseCharset(conn.getContentType());
        InputStream es = conn.getErrorStream();
        if (es == null) {
            return getStreamAsString(conn.getInputStream(), charset);
        } else {
            String msg = getStreamAsString(es, charset);
            if (StringUtil.isEmpty(msg)) {
                throw new IOException(conn.getResponseCode() + ":" + conn.getResponseMessage());
            } else {
                throw new IOException(msg);
            }
        }
    }

    private static byte[] buildQuery(Map<String, String> params, String charset) throws MtSdkException {
        if (params == null || params.isEmpty() || StringUtil.isEmpty(charset)) {
            return null;
        }

        StringBuilder query = new StringBuilder();
        boolean flag = false;
        try {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String name = entry.getKey();
                String value = entry.getValue();
                if (StringUtil.areNotEmpty(name, value)) {
                    if (flag) {
                        query.append("&");
                    } else {
                        flag = true;
                    }
                    query.append(name).append("=").append(URLEncoder.encode(value, charset));
                }
            }

            if (!StringUtil.isEmpty(query.toString())) {
                return query.toString().getBytes(charset);
            } else {
                return new byte[0];
            }
        } catch (IOException e) {
            throw new MtSdkException(SdkError.HTTPCLIENT_ERROR, e);
        }
    }

    private static String getStreamAsString(InputStream inputStream, String charset) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, charset));
            StringWriter writer = new StringWriter();

            char[] chars = new char[256];
            int count = 0;
            while ((count = reader.read(chars)) > 0) {
                writer.write(chars, 0, count);
            }
            return writer.toString();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    private static String getResponseCharset(String ctype) {
        String charset = CommonConstants.CHARSET_UTF8;

        if (!StringUtil.isEmpty(ctype)) {
            String[] params = ctype.split(";");
            for (String param : params) {
                param = param.trim();
                if (param.startsWith("charset")) {
                    String[] pair = param.split("=", 2);
                    if (pair.length == 2) {
                        if (!StringUtil.isEmpty(pair[1])) {
                            charset = pair[1].trim();
                        }
                    }
                    break;
                }
            }
        }
        return charset;
    }

    private static HttpURLConnection getConnection(URL url, String ctype, Map<String, String> headers) throws IOException {
        HttpURLConnection conn;
        if (HTTPS.equals(url.getProtocol())) {
            HttpsURLConnection connHttps = (HttpsURLConnection) url.openConnection();
            if (!needSSLCheck) {
                connHttps.setSSLSocketFactory(ctx.getSocketFactory());
                connHttps.setHostnameVerifier(verifier);
            }
            conn = connHttps;
        } else {
            conn = (HttpURLConnection) url.openConnection();
        }

        conn.setRequestMethod(POST);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        // 设置header
        conn.setRequestProperty("Accept", "application/json");
        conn.setRequestProperty("User-Agent", "mt-sdk-java");
        conn.setRequestProperty("Content-Type", ctype);
        if (Objects.nonNull(headers)) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                conn.setRequestProperty(header.getKey(), header.getValue());
            }
        }
        return conn;
    }

    /**
     * X509证书信任管理器
     */
    private static class DefaultTrustManager implements X509TrustManager {
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }

        public void checkClientTrusted(X509Certificate[] chain, String authType) {
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType) {
        }
    }
}
