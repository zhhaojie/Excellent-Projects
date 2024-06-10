package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleQuery;

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
    @SerializedName("unifiedDiscount")
    private String unifiedDiscount;
    @SerializedName("tieredDiscounts")
    private List<TieredDiscount> tieredDiscounts;

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
    public String getUnifiedDiscount() {
        return unifiedDiscount;
    }
    public void setUnifiedDiscount(String unifiedDiscount) {
        this.unifiedDiscount = unifiedDiscount;
    }
    public List<TieredDiscount> getTieredDiscounts() {
        return tieredDiscounts;
    }
    public void setTieredDiscounts(List<TieredDiscount> tieredDiscounts) {
        this.tieredDiscounts = tieredDiscounts;
    }




    @Override
    public String toString() {
        return "DeliveryFeeDiscount{" + "discountSwitch=" + discountSwitch + "," + "discountType=" + discountType + "," + "unifiedDiscount=" + unifiedDiscount + "," + "tieredDiscounts=" + tieredDiscounts + "}";
    }
}
