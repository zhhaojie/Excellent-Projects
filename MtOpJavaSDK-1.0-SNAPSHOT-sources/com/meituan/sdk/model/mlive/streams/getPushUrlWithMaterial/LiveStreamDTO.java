package com.meituan.sdk.model.mlive.streams.getPushUrlWithMaterial;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LiveStreamDTO {
    /**
    * 推流地址的过期时间
    */
    @SerializedName("expires")
    private Long expires;
    /**
    * 推流地址
    */
    @SerializedName("pushUrl")
    private String pushUrl;

    public Long getExpires() {
        return expires;
    }
    public void setExpires(Long expires) {
        this.expires = expires;
    }
    public String getPushUrl() {
        return pushUrl;
    }
    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }




    @Override
    public String toString() {
        return "LiveStreamDTO{" + "expires=" + expires + "," + "pushUrl=" + pushUrl + "}";
    }
}
