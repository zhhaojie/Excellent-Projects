package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiBizDeliveryRuleFeeUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TimeSpan {
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
        return "TimeSpan{" + "beginTime=" + beginTime + "," + "endTime=" + endTime + "}";
    }
}
