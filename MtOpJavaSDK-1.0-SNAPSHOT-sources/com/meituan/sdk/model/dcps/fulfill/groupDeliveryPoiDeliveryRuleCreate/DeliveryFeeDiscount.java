package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleCreate;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DeliveryFeeDiscount {
    @SerializedName("discountSwitch")
    private Boolean discountSwitch;
    @SerializedName("discountType")
    private Integer discountType;
    @SerializedName("tieredDiscounts")
    private List<TieredDiscount> tieredDiscounts;
    @SerializedName("unifiedDiscount")
    private String unifiedDiscount;

    public Boolean getDiscountSwitch() {
        return discountSwitch;
    }
    public void setDiscountSwitch(Boolean discountSwitch) {
        this.discountSwitch = discountSwitch;
    }
    public Integer getDiscountType() {
        return discountType;
    }
    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }
    public List<TieredDiscount> getTieredDiscounts() {
        return tieredDiscounts;
    }
    public void setTieredDiscounts(List<TieredDiscount> tieredDiscounts) {
        this.tieredDiscounts = tieredDiscounts;
    }
    public String getUnifiedDiscount() {
        return unifiedDiscount;
    }
    public void setUnifiedDiscount(String unifiedDiscount) {
        this.unifiedDiscount = unifiedDiscount;
    }




    @Override
    public String toString() {
        return "DeliveryFeeDiscount{" + "discountSwitch=" + discountSwitch + "," + "discountType=" + discountType + "," + "tieredDiscounts=" + tieredDiscounts + "," + "unifiedDiscount=" + unifiedDiscount + "}";
    }
}
