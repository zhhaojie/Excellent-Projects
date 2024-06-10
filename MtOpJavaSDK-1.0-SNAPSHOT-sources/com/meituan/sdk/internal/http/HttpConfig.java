package com.meituan.sdk.internal.http;

/**
 * <p>
 * Http请求配置
 * </p>
 */
public class HttpConfig {

    /**
     * 连接超时时间
     */
    private int connectTimeout;

    /**
     * 读取超时时间
     */
    private int readTimeout;

    /**
     * 是否校验服务端证书
     */
    private boolean needSSLCheck;

    public HttpConfig() {
        this.connectTimeout = 3000;
        this.readTimeout = 5000;
        this.needSSLCheck = true;
    }

    public int getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public int getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    public boolean isNeedSSLCheck() {
        return needSSLCheck;
    }

    public void setNeedSSLCheck(boolean needSSLCheck) {
        this.needSSLCheck = needSSLCheck;
    }

}
