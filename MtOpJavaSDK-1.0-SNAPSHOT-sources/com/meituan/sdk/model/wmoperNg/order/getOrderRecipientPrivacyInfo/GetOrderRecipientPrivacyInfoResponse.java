package com.meituan.sdk.model.wmoperNg.order.getOrderRecipientPrivacyInfo;

import com.google.gson.annotations.SerializedName;

/**
* 查询订单收餐人隐私信息
* This file was automatically generated.
*/
public class GetOrderRecipientPrivacyInfoResponse {
    /**
    * 订单Id
    */
    @SerializedName("wmOrderId")
    private Long wmOrderId;
    /**
    * 收餐人手机号。当下单用户关闭隐私号保护，为收餐人真实手机号码，示例：13000220022。 当下单用户开启隐私号保护，为收餐人手机号码隐私号格式，示例：13101230000_1234。
    */
    @SerializedName("recipientPhone")
    private String recipientPhone;
    /**
    * 收餐人脱敏真实号
    */
    @SerializedName("recipientPhoneDesensitization")
    private String recipientPhoneDesensitization;
    /**
    * 收餐人脱敏地址
    */
    @SerializedName("recipientAddressDesensitization")
    private String recipientAddressDesensitization;

    public Long getWmOrderId() {
        return wmOrderId;
    }
    public void setWmOrderId(Long wmOrderId) {
        this.wmOrderId = wmOrderId;
    }
    public String getRecipientPhone() {
        return recipientPhone;
    }
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }
    public String getRecipientPhoneDesensitization() {
        return recipientPhoneDesensitization;
    }
    public void setRecipientPhoneDesensitization(String recipientPhoneDesensitization) {
        this.recipientPhoneDesensitization = recipientPhoneDesensitization;
    }
    public String getRecipientAddressDesensitization() {
        return recipientAddressDesensitization;
    }
    public void setRecipientAddressDesensitization(String recipientAddressDesensitization) {
        this.recipientAddressDesensitization = recipientAddressDesensitization;
    }




    @Override
    public String toString() {
        return "GetOrderRecipientPrivacyInfoResponse{" + "wmOrderId=" + wmOrderId + "," + "recipientPhone=" + recipientPhone + "," + "recipientPhoneDesensitization=" + recipientPhoneDesensitization + "," + "recipientAddressDesensitization=" + recipientAddressDesensitization + "}";
    }
}
