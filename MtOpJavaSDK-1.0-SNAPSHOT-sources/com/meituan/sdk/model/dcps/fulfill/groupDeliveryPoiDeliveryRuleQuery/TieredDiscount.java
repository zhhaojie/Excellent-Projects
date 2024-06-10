package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TieredDiscount {
    @SerializedName("tiered")
    private Integer tiered;
    @SerializedName("startDistance")
    private String startDistance;
    @SerializedName("endDistance")
    private String endDistance;
    @SerializedName("discount")
    private String discount;

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
    public String getDiscount() {
        return discount;
    }
    public void setDiscount(String discount) {
        this.discount = discount;
    }




    @Override
    public String toString() {
        return "TieredDiscount{" + "tiered=" + tiered + "," + "startDistance=" + startDistance + "," + "endDistance=" + endDistance + "," + "discount=" + discount + "}";
    }
}
