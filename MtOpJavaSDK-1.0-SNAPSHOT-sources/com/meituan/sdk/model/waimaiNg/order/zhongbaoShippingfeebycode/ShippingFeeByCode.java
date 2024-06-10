package com.meituan.sdk.model.waimaiNg.order.zhongbaoShippingfeebycode;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ShippingFeeByCode {
    @SerializedName("order_id")
    private String orderId;
    @SerializedName("logistics_code")
    private String logisticsCode;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }




    @Override
    public String toString() {
        return "ShippingFeeByCode{" + "orderId=" + orderId + "," + "logisticsCode=" + logisticsCode + "}";
    }
}
