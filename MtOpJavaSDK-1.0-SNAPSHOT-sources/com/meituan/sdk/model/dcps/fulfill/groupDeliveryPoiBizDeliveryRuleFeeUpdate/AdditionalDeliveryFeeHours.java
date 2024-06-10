package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiBizDeliveryRuleFeeUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class AdditionalDeliveryFeeHours {
    @SerializedName("hour")
    private TimeSpan hour;
    @SerializedName("additionalDeliveryFee")
    private String additionalDeliveryFee;

    public TimeSpan getHour() {
        return hour;
    }
    public void setHour(TimeSpan hour) {
        this.hour = hour;
    }
    public String getAdditionalDeliveryFee() {
        return additionalDeliveryFee;
    }
    public void setAdditionalDeliveryFee(String additionalDeliveryFee) {
        this.additionalDeliveryFee = additionalDeliveryFee;
    }




    @Override
    public String toString() {
        return "AdditionalDeliveryFeeHours{" + "hour=" + hour + "," + "additionalDeliveryFee=" + additionalDeliveryFee + "}";
    }
}
