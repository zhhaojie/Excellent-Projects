package com.meituan.sdk.model.waimaiNg.poi.waimaiPoiQueryDelayDispatch;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店是否延迟发配送
* This file was automatically generated.
*/
public class WaimaiPoiQueryDelayDispatchResponse {
    /**
    * 延迟时长，单位:秒
    */
    @SerializedName("delayPushSecond")
    private String delayPushSecond;
    /**
    * 门店是否在延迟发配送名单中
    */
    @SerializedName("supportDelayPush")
    private String supportDelayPush;

    public String getDelayPushSecond() {
        return delayPushSecond;
    }
    public void setDelayPushSecond(String delayPushSecond) {
        this.delayPushSecond = delayPushSecond;
    }
    public String getSupportDelayPush() {
        return supportDelayPush;
    }
    public void setSupportDelayPush(String supportDelayPush) {
        this.supportDelayPush = supportDelayPush;
    }




    @Override
    public String toString() {
        return "WaimaiPoiQueryDelayDispatchResponse{" + "delayPushSecond=" + delayPushSecond + "," + "supportDelayPush=" + supportDelayPush + "}";
    }
}
