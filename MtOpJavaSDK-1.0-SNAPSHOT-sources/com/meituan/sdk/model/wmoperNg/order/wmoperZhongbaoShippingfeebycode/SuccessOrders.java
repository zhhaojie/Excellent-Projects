package com.meituan.sdk.model.wmoperNg.order.wmoperZhongbaoShippingfeebycode;

import com.google.gson.annotations.SerializedName;

/**
* 成功列表
* This file was automatically generated.
*/
public class SuccessOrders {
    /**
    * 订单ID
    */
    @SerializedName("wm_order_id")
    private Long wmOrderId;
    /**
    * 配送费
    */
    @SerializedName("shipping_fee")
    private Double shippingFee;
    /**
    * 订单展示号
    */
    @SerializedName("wm_order_view_id")
    private Long wmOrderViewId;
    /**
    * 配送费备注
    */
    @SerializedName("shipping_tips")
    private String shippingTips;
    /**
    * 美团跑腿服务品牌code
    */
    @SerializedName("logistics_code")
    private String logisticsCode;

    public Long getWmOrderId() {
        return wmOrderId;
    }
    public void setWmOrderId(Long wmOrderId) {
        this.wmOrderId = wmOrderId;
    }
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public Long getWmOrderViewId() {
        return wmOrderViewId;
    }
    public void setWmOrderViewId(Long wmOrderViewId) {
        this.wmOrderViewId = wmOrderViewId;
    }
    public String getShippingTips() {
        return shippingTips;
    }
    public void setShippingTips(String shippingTips) {
        this.shippingTips = shippingTips;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }




    @Override
    public String toString() {
        return "SuccessOrders{" + "wmOrderId=" + wmOrderId + "," + "shippingFee=" + shippingFee + "," + "wmOrderViewId=" + wmOrderViewId + "," + "shippingTips=" + shippingTips + "," + "logisticsCode=" + logisticsCode + "}";
    }
}
