package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleCreate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TieredDiscount {
    @SerializedName("discount")
    private String discount;
    @SerializedName("endDistance")
    private String endDistance;
    @SerializedName("startDistance")
    private String startDistance;
    @SerializedName("tiered")
    private Integer tiered;

    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }
    public String getEndDistance() {
        return endDistance;
    }
    public void setEndDistance(String endDistance) {
        this.endDistance = endDistance;
    }
    public String getStartDistance() {
        return startDistance;
    }
    public void setStartDistance(String startDistance) {
        this.startDistance = startDistance;
    }
    public Integer getTiered() {
        return tiered;
    }
    public void setTiered(Integer tiered) {
        this.tiered = tiered;
    }




    @Override
    public String toString() {
        return "TieredDiscount{" + "discount=" + discount + "," + "endDistance=" + endDistance + "," + "startDistance=" + startDistance + "," + "tiered=" + tiered + "}";
    }
}
