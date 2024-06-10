package com.meituan.sdk.model.waimaiNg.order.orderGetRealRecipientAddress;

import com.google.gson.annotations.SerializedName;

/**
* 查询真实地址接口
* This file was automatically generated.
*/
public class OrderGetRealRecipientAddressResponse {
    /**
    * 订单Id
    */
    @SerializedName("order_id")
    private String orderId;
    /**
    * 收货人地址。 订单完成3小时后展示“为保护顾客隐私，地址已隐藏”
    */
    @SerializedName("recipient_address")
    private String recipientAddress;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getRecipientAddress() {
        return recipientAddress;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }




    @Override
    public String toString() {
        return "OrderGetRealRecipientAddressResponse{" + "orderId=" + orderId + "," + "recipientAddress=" + recipientAddress + "}";
    }
}
