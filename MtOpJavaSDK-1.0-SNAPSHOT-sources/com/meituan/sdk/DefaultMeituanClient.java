package com.meituan.sdk;

import com.google.gson.JsonSyntaxException;
import com.meituan.sdk.auth.MeituanTokenResponse;
import com.meituan.sdk.domain.ApiMetaInfo;
import com.meituan.sdk.internal.exceptions.MtSdkException;
import com.meituan.sdk.internal.http.DefaultHttpClient;
import com.meituan.sdk.internal.http.HttpClient;
import com.meituan.sdk.internal.http.HttpConfig;
import com.meituan.sdk.internal.utils.AnnotationUtil;
import com.meituan.sdk.internal.constants.CommonConstants;
import com.meituan.sdk.internal.enums.SdkError;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.meituan.sdk.internal.utils.SignerUtil;
import com.meituan.sdk.internal.utils.StringUtil;
import com.meituan.sdk.internal.utils.ValidationUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.util.*;

/**
 * <p>
 * SDK默认客户端
 * </p>
 */
public class DefaultMeituanClient implements MeituanClient {

    /**
     * 美团技术服务合作中心请求域名
     */
    private String serverUrl;

    /**
     * 开发者Id
     */
    private Long developerId;

    /**
     * 开发者signKey
     */
    private String signKey;

    /**
     * 美团技术服务合作中心网关版本（默认2）
     */
    private String version;

    /**
     * 编码格式（默认UTF-8）
     */
    private String charset;

    /**
     * 通信模块
     */
    private HttpClient httpClient;

    /**
     * 网络请求配置
     */
    private HttpConfig httpConfig;

    private static final Logger logger = LoggerFactory.getLogger(DefaultMeituanClient.class);

    private DefaultMeituanClient(String serverUrl, String signKey, String charset, String version, Long developerId,
                                 HttpClient httpClient, HttpConfig httpConfig) {
        this.developerId = developerId;
        this.signKey = signKey;
        this.serverUrl = serverUrl;
        this.charset = charset;
        this.version = version;
        this.httpClient = httpClient;
        this.httpConfig = httpConfig;
    }


    @Override
    public <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request) throws MtSdkException {
        return invokeApi(request, null, null, null);
    }

    @Override
    public <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request, String appAuthToken) throws MtSdkException {
        return invokeApi(request, appAuthToken, null, null);
    }

    @Override
    public <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request, Integer connectTimeout, Integer readTimeout) throws MtSdkException {
        return invokeApi(request, null, connectTimeout, readTimeout);
    }

    @Override
    public <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request, String appAuthToken, Integer connectTimeout, Integer readTimeout) throws MtSdkException {
        if (Objects.isNull(request)) {
            logger.error("request参数不能为NULL");
            throw new MtSdkException(SdkError.MISS_PARAM_ERROR);
        }
        logger.info("request:{},developerId:{},appAuthToken:{}", request.serializeToJson(), this.developerId, appAuthToken);

        if (Objects.nonNull(connectTimeout)) {
            this.httpConfig.setConnectTimeout(connectTimeout);
        }
        if (Objects.nonNull(readTimeout)) {
            this.httpConfig.setReadTimeout(readTimeout);
        }

        ApiMetaInfo apiMetaInfo = AnnotationUtil.getApiMeta(request);
        // 参数校验
        verifyParams(request, apiMetaInfo, appAuthToken);

        // 执行请求
        String url = this.serverUrl + apiMetaInfo.getPath();
        String resp = execute(url, request.serializeToJson(), apiMetaInfo.getBusinessId(), appAuthToken);
        if (StringUtil.isEmpty(resp)) {
            logger.error("请求返回结果为空，url:{}，Request:{}，apiMetaInfo:{}", url, request.serializeToJson(), apiMetaInfo);
            throw new MtSdkException(SdkError.REQUEST_FAILED_ERROR.getCode(), SdkError.REQUEST_FAILED_ERROR.getMsg());
        }

        // 解析请求返回值
        try {
            return request.deserializeResponse(resp);
        } catch (JsonSyntaxException e) {
            logger.error("解析请求返回值为Response失败，request:{}, apiMetaInfo:{}, resp:{}",
                    request.serializeToJson(), apiMetaInfo, resp, e);
            throw new MtSdkException(SdkError.PARSE_RESPONSE_ERROR, e);
        }
    }

    @Override
    public <T> MeituanResponse<T> commonInvokeApi(CommonRequest request, Type responseType) throws MtSdkException {
        if (Objects.isNull(request)) {
            logger.error("request参数不能为NULL");
            throw new MtSdkException(SdkError.MISS_PARAM_ERROR);
        }
        logger.info("request:{},developerId:{}", JsonUtil.toJson(request), this.developerId);

        if (Objects.nonNull(request.getConnectTimeout())) {
            this.httpConfig.setConnectTimeout(request.getConnectTimeout());
        }
        if (Objects.nonNull(request.getReadTimeout())) {
            this.httpConfig.setReadTimeout(request.getReadTimeout());
        }

        // 参数校验
        ValidationUtil.validate(request);

        // 执行请求
        String url = this.serverUrl + request.getApiPath();
        String resp = execute(url, JsonUtil.toJson(request.getBizParams()), request.getBusinessId(), request.getAppAuthToken());
        if (StringUtil.isEmpty(resp)) {
            logger.error("请求返回结果为空，url:{}，Request:{}", url, JsonUtil.toJson(request));
            throw new MtSdkException(SdkError.REQUEST_FAILED_ERROR.getCode(), SdkError.REQUEST_FAILED_ERROR.getMsg());
        }

        try {
            return JsonUtil.fromJson(resp, responseType);
        } catch (JsonSyntaxException e) {
            logger.error("解析请求返回值为responseType对应的对象失败，request:{}, resp:{}, responseType:{}", request, resp, responseType.getTypeName(), e);
            throw new MtSdkException(SdkError.PARSE_RESPONSE_ERROR, e);
        }
    }

    @Override
    public MeituanTokenResponse getOAuthToken(Integer businessId, String code) throws MtSdkException {
        if(StringUtil.isEmpty(code) || businessId == null) {
            throw new MtSdkException(SdkError.MISS_PARAM_ERROR);
        }
        String url = this.serverUrl + "/oauth/token";

        // 构建请求
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put(CommonConstants.TIMESTAMP, String.valueOf(System.currentTimeMillis() / 1000));
        queryMap.put(CommonConstants.BUSINESS_ID, String.valueOf(businessId));
        queryMap.put(CommonConstants.DEVELOPER_ID, this.developerId.toString());
        queryMap.put(CommonConstants.CHARSET, this.charset);
        queryMap.put("code", code); //code为通过授权回调URL，获取到的OAuth授权码
        queryMap.put("grantType", "authorization_code"); //固定为authorization_code
        queryMap.put(CommonConstants.SIGN, SignerUtil.getSign(this.signKey, queryMap));
        return executeToken(url, queryMap);
    }

    @Override
    public MeituanTokenResponse refreshToken(Integer businessId, String refreshToken) throws MtSdkException {
        if(StringUtil.isEmpty(refreshToken) || businessId == null) {
            throw new MtSdkException(SdkError.MISS_PARAM_ERROR);
        }
        String url = this.serverUrl + "/oauth/refresh";

        // 构建请求
        Map<String, String> queryMap = new HashMap<>();
        queryMap.put(CommonConstants.TIMESTAMP, String.valueOf(System.currentTimeMillis() / 1000));
        queryMap.put(CommonConstants.BUSINESS_ID, String.valueOf(businessId));
        queryMap.put(CommonConstants.DEVELOPER_ID, this.developerId.toString());
        queryMap.put(CommonConstants.CHARSET, this.charset);
        queryMap.put("refreshToken", refreshToken); //code为通过授权回调URL，获取到的OAuth授权码
        queryMap.put("grantType", "refresh_token"); //固定为refresh_token
        queryMap.put("scope", "all"); //固定为all
        queryMap.put(CommonConstants.SIGN, SignerUtil.getSign(this.signKey, queryMap));
        return executeToken(url, queryMap);
    }

    private String execute(String url, String bizParams, Integer businessId, String appAuthToken) throws MtSdkException {

        // 构建请求&执行
        Map<String, String> queryContentMap = buildQueryContentMap(bizParams, businessId, appAuthToken);
        // 构建header
        Map<String, String> headers = buildHeaders();

        logger.info("url:{},queryContentMap:{},httpConfig:{}", url, queryContentMap, this.httpConfig);
        return httpClient.postWithUrlEncoded(url, queryContentMap, headers, this.httpConfig);
    }

    private MeituanTokenResponse executeToken(String url, Map<String, String> queryMap) throws MtSdkException {
        // 构建header
        Map<String, String> headers = buildHeaders();
        logger.info("executeToken url:{},queryMap:{},httpConfig:{}", url, queryMap, this.httpConfig);
        String resp = httpClient.postWithUrlEncoded(url, queryMap, headers, this.httpConfig);

        if (StringUtil.isEmpty(resp)) {
            logger.error("请求返回结果为空，url:{}，queryMap:{}", url, JsonUtil.toJson(queryMap));
            throw new MtSdkException(SdkError.REQUEST_FAILED_ERROR.getCode(), SdkError.REQUEST_FAILED_ERROR.getMsg());
        }

        try {
            return JsonUtil.fromJson(resp, MeituanTokenResponse.class);
        } catch (JsonSyntaxException e) {
            logger.error("解析token请求的返回值失败，resp:{}", resp, e);
            throw new MtSdkException(SdkError.PARSE_RESPONSE_ERROR, e);
        }
    }

    // 构建请求体
    private Map<String, String> buildQueryContentMap(String bizParams, Integer businessId, String appAuthToken) throws MtSdkException {
        Map<String, String> queryMap = new HashMap<>();

        queryMap.put(CommonConstants.BIZ_FIELD, bizParams);
        queryMap.put(CommonConstants.TIMESTAMP, String.valueOf(System.currentTimeMillis() / 1000));
        queryMap.put(CommonConstants.BUSINESS_ID, String.valueOf(businessId));
        queryMap.put(CommonConstants.DEVELOPER_ID, this.developerId.toString());
        queryMap.put(CommonConstants.CHARSET, this.charset);
        queryMap.put(CommonConstants.VERSION, this.version);
        if (!StringUtil.isEmpty(appAuthToken)) {
            queryMap.put(CommonConstants.APP_AUTH_TOKEN, appAuthToken);
        }
        queryMap.put(CommonConstants.SIGN, SignerUtil.getSign(this.signKey, queryMap));
        return queryMap;
    }

    private void verifyParams(MeituanRequest<?> request, ApiMetaInfo apiMetaInfo, String appAuthToken) throws MtSdkException {
        if (apiMetaInfo.isNeedAuth() && StringUtil.isEmpty(appAuthToken)) {
            logger.error("此接口需要鉴权，缺少appAuthToken参数, request:{}, apiMetaInfo:{}", request.serializeToJson(), apiMetaInfo);
            throw new MtSdkException(SdkError.MISS_APPAUTHTOKEN_ERROR.getCode(), SdkError.MISS_APPAUTHTOKEN_ERROR.getMsg());
        }
        ValidationUtil.validate(request);
    }

    private Map<String, String> buildHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Sdk-Info", CommonConstants.SDK_VERSION);
        headers.put("DeveloperId", this.developerId.toString());

        return headers;
    }

    public static Builder builder(Long developerId, String signKey) {
        return new Builder(developerId, signKey);
    }

    public static class Builder {

        private String serverUrl = CommonConstants.SERVER_URL_PROD;

        private String charset = CommonConstants.CHARSET_UTF8;

        private HttpClient httpClient = new DefaultHttpClient();

        private String version = "2";

        private String signKey;

        private Long developerId;

        private HttpConfig httpConfig = new HttpConfig();

        private Builder(Long developerId, String signKey) {
            this.developerId = developerId;
            this.signKey = signKey;
        }

        public Builder charset(String name) {
            this.charset = name;
            return this;
        }

        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public Builder serverUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder httpUtil(HttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        public Builder connectTimeout(Integer connectTimeout) {
            httpConfig.setConnectTimeout(connectTimeout);
            return this;
        }

        public Builder readTimeout(Integer readTimeout) {
            httpConfig.setReadTimeout(readTimeout);
            return this;
        }

        public Builder needSSLCheck(Boolean needSSLCheck) {
            httpConfig.setNeedSSLCheck(needSSLCheck);
            return this;
        }

        public DefaultMeituanClient build() {
            return new DefaultMeituanClient(serverUrl, signKey, charset, version,
                    developerId, httpClient, httpConfig);
        }

    }
}
