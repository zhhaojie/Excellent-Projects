package com.meituan.sdk;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Map;

/**
 * <p>
 * 美团技术服务合作中心公共请求参数
 * </p>
 */
public class CommonRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * API路径
     */
    @NotEmpty
    private String apiPath;

    /**
     * 业务id
     */
    @NotNull
    private Integer businessId;

    /**
     * 业务参数
     */
    private Map<String, String> bizParams;

    /**
     * 连接超时时间
     */
    private Integer connectTimeout;

    /**
     * 读取超时时间
     */
    private Integer readTimeout;

    /**
     * 鉴权token
     */
    private String appAuthToken;


    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    public String getApiPath() {
        return apiPath;
    }

    public void setApiPath(String apiPath) {
        this.apiPath = apiPath;
    }

    public Map<String, String> getBizParams() {
        return bizParams;
    }

    public void setBizParams(Map<String, String> bizParams) {
        this.bizParams = bizParams;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    @Override
    public String toString() {
        return "CommonRequest{" +
                "apiPath='" + apiPath + '\'' +
                ", businessId=" + businessId +
                ", bizParams=" + bizParams +
                ", connectTimeout=" + connectTimeout +
                ", readTimeout=" + readTimeout +
                ", appAuthToken='" + appAuthToken + '\'' +
                '}';
    }
}
