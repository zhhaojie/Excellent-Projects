package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleBaseUpdate;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-46b78676-552e-4fd1-bee4-ae34314639f5">配送时间，结构同查询接口</p>
* This file was automatically generated.
*/
public class DeliveryHours {
    @SerializedName("beginTime")
    private String beginTime;
    @SerializedName("endTime")
    private String endTime;

    public String getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }




    @Override
    public String toString() {
        return "DeliveryHours{" + "beginTime=" + beginTime + "," + "endTime=" + endTime + "}";
    }
}
