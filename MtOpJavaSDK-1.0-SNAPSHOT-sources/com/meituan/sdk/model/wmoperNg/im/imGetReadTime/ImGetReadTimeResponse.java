package com.meituan.sdk.model.wmoperNg.im.imGetReadTime;

import com.google.gson.annotations.SerializedName;

/**
* 查询会话最新已读时间戳
* This file was automatically generated.
*/
public class ImGetReadTimeResponse {
    /**
    * 开发者应用标识
    */
    @SerializedName("app_id")
    private Long appId;
    /**
    * ERP 商户门店ID
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 美团C端用户ID
    */
    @SerializedName("open_user_id")
    private String openUserId;
    /**
    * 毫秒时间戳
    */
    @SerializedName("last_read_time")
    private Long lastReadTime;

    public Long getAppId() {
        return appId;
    }
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public String getOpenUserId() {
        return openUserId;
    }
    public void setOpenUserId(String openUserId) {
        this.openUserId = openUserId;
    }
    public Long getLastReadTime() {
        return lastReadTime;
    }
    public void setLastReadTime(Long lastReadTime) {
        this.lastReadTime = lastReadTime;
    }




    @Override
    public String toString() {
        return "ImGetReadTimeResponse{" + "appId=" + appId + "," + "epoiId=" + epoiId + "," + "openUserId=" + openUserId + "," + "lastReadTime=" + lastReadTime + "}";
    }
}
