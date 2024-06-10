package com.meituan.sdk.domain;

/**
 * <p>
 * ApiMeta类，记录API接口的基本信息
 * </p>
 */
public class ApiMetaInfo {

    private String path;

    private int businessId;

    private String apiVersion;

    private String apiName;

    private boolean needAuth;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getBusinessId() {
        return businessId;
    }

    public void setBusinessId(int businessId) {
        this.businessId = businessId;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public boolean isNeedAuth() {
        return needAuth;
    }

    public void setNeedAuth(boolean needAuth) {
        this.needAuth = needAuth;
    }

    @Override
    public String toString() {
        return "ApiMetaDO{" +
                "path='" + path + '\'' +
                ", businessId=" + businessId +
                ", apiVersion='" + apiVersion + '\'' +
                ", apiName='" + apiName + '\'' +
                ", needAuth=" + needAuth +
                '}';
    }
}
