package com.meituan.sdk.model.waimaiNg.decoration.queryImageForSingle;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ImageForSingleInfo {
    /**
    * 图片地址
    */
    @SerializedName("url")
    private String url;
    /**
    * 审核状态： 0：免审 1：审核中 2：审核通过 3：审核驳回
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 驳回code
    */
    @SerializedName("statusCode")
    private Integer statusCode;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getStatusCode() {
        return statusCode;
    }
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }




    @Override
    public String toString() {
        return "ImageForSingleInfo{" + "url=" + url + "," + "status=" + status + "," + "statusCode=" + statusCode + "}";
    }
}
