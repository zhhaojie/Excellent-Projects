package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiBizDeliveryRuleFeeUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TieredDeliveryFee {
    @SerializedName("tiered")
    private Integer tiered;
    @SerializedName("startDistance")
    private String startDistance;
    @SerializedName("endDistance")
    private String endDistance;
    @SerializedName("fee")
    private String fee;

    public Integer getTiered() {
        return tiered;
    }
    public void setTiered(Integer tiered) {
        this.tiered = tiered;
    }
    public String getStartDistance() {
        return startDistance;
    }
    public void setStartDistance(String startDistance) {
        this.startDistance = startDistance;
    }
    public String getEndDistance() {
        return endDistance;
    }
    public void setEndDistance(String endDistance) {
        this.endDistance = endDistance;
    }
    public String getFee() {
        return fee;
    }
    public void setFee(String fee) {
        this.fee = fee;
    }




    @Override
    public String toString() {
        return "TieredDeliveryFee{" + "tiered=" + tiered + "," + "startDistance=" + startDistance + "," + "endDistance=" + endDistance + "," + "fee=" + fee + "}";
    }
}
