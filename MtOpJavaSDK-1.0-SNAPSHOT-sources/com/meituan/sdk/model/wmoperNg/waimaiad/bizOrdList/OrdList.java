package com.meituan.sdk.model.wmoperNg.waimaiad.bizOrdList;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class OrdList {
    @NotNull(message = "wmOrderViewId不能为空")
    @SerializedName("wmOrderViewId")
    private Long wmOrderViewId;
    @NotNull(message = "originalPrice不能为空")
    @SerializedName("originalPrice")
    private Long originalPrice;
    @NotNull(message = "actualPrice不能为空")
    @SerializedName("actualPrice")
    private Long actualPrice;
    @NotNull(message = "shippingFee不能为空")
    @SerializedName("shippingFee")
    private Long shippingFee;
    @NotBlank(message = "orderTime不能为空")
    @SerializedName("orderTime")
    private String orderTime;
    /**
    * json字符串，foodId&food名称
    */
    @NotBlank(message = "foodSet不能为空")
    @SerializedName("foodSet")
    private String foodSet;
    /**
    * json字符串
    */
    @NotBlank(message = "actSet不能为空")
    @SerializedName("actSet")
    private String actSet;
    @NotNull(message = "dt不能为空")
    @SerializedName("dt")
    private Long dt;

    public Long getWmOrderViewId() {
        return wmOrderViewId;
    }
    public void setWmOrderViewId(Long wmOrderViewId) {
        this.wmOrderViewId = wmOrderViewId;
    }
    public Long getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }
    public Long getActualPrice() {
        return actualPrice;
    }
    public void setActualPrice(Long actualPrice) {
        this.actualPrice = actualPrice;
    }
    public Long getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Long shippingFee) {
        this.shippingFee = shippingFee;
    }
    public String getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
    public String getFoodSet() {
        return foodSet;
    }
    public void setFoodSet(String foodSet) {
        this.foodSet = foodSet;
    }
    public String getActSet() {
        return actSet;
    }
    public void setActSet(String actSet) {
        this.actSet = actSet;
    }
    public Long getDt() {
        return dt;
    }
    public void setDt(Long dt) {
        this.dt = dt;
    }




    @Override
    public String toString() {
        return "OrdList{" + "wmOrderViewId=" + wmOrderViewId + "," + "originalPrice=" + originalPrice + "," + "actualPrice=" + actualPrice + "," + "shippingFee=" + shippingFee + "," + "orderTime=" + orderTime + "," + "foodSet=" + foodSet + "," + "actSet=" + actSet + "," + "dt=" + dt + "}";
    }
}
