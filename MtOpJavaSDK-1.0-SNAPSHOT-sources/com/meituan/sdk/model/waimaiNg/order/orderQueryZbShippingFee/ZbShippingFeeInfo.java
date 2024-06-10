package com.meituan.sdk.model.waimaiNg.order.orderQueryZbShippingFee;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ZbShippingFeeInfo {
    /**
    * 订单号
    */
    @SerializedName("orderId")
    private String orderId;
    /**
    * 用户可见订单号
    */
    @SerializedName("orderViewId")
    private String orderViewId;
    /**
    * 配送费
    */
    @SerializedName("shippingFee")
    private String shippingFee;
    /**
    * 配送费说明	
    */
    @SerializedName("shippingTip")
    private String shippingTip;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getOrderViewId() {
        return orderViewId;
    }
    public void setOrderViewId(String orderViewId) {
        this.orderViewId = orderViewId;
    }
    public String getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(String shippingFee) {
        this.shippingFee = shippingFee;
    }
    public String getShippingTip() {
        return shippingTip;
    }
    public void setShippingTip(String shippingTip) {
        this.shippingTip = shippingTip;
    }




    @Override
    public String toString() {
        return "ZbShippingFeeInfo{" + "orderId=" + orderId + "," + "orderViewId=" + orderViewId + "," + "shippingFee=" + shippingFee + "," + "shippingTip=" + shippingTip + "}";
    }
}
