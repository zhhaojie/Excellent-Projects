package com.meituan.sdk.model.wmoperNg.delivery.getRecipientInfo;

import com.google.gson.annotations.SerializedName;

/**
* 配送类服务商提供收货人的信息
* This file was automatically generated.
*/
public class GetRecipientInfoResponse {
    /**
    * 收货人姓名
    */
    @SerializedName("recipientName")
    private String recipientName;
    /**
    * 收货人手机号，C端启用号码保护时该字段展示隐私号，如15696424612_7472。C端未启用号码保护或隐私号降级时，该字段为真实手机号，如12345678901
    */
    @SerializedName("recipientPhone")
    private String recipientPhone;
    /**
    * 收货人地址。订单完成3小时后展示“为保护顾客隐私，地址已隐藏”。实际的地址@#后是经纬度反查的地址，是用户订餐时定位的地址。
    */
    @SerializedName("recipientAddress")
    private String recipientAddress;
    /**
    * 脱敏收货人地址。订单完成3小时后展示“为保护顾客隐私，地址已隐藏”
    */
    @SerializedName("recipientAddressDesensitization")
    private String recipientAddressDesensitization;
    /**
    * 实际送餐地址纬度，美团使用的是高德坐标系
    */
    @SerializedName("latitude")
    private Double latitude;
    /**
    * 实际送餐地址经度，美团使用的是高德坐标系
    */
    @SerializedName("longitude")
    private Double longitude;
    /**
    * 收货人备份隐私号，具体为json格式的字符串数组 1、当recipientPhone字段为隐私号时，该字段作为其备份，目前为1个号码，将来为可能为多个，用英文逗号隔开“,”。 2、有至少2个可用的隐私号时，该字段返回备用的隐私号；如果只有1个隐私号可用或所有隐私号均不可用时，该字段返回内容为空。 3、recipientPhone和backupRecipientPhone的隐私号间没有优劣之分，任何一个隐私号故障时，请尝试用其他隐私号联系用户。当所有隐私号都故障且美团触发降级时，重新获取的recipientPhone字段才会展示真实号。
    */
    @SerializedName("backupRecipientPhone")
    private String backupRecipientPhone;
    /**
    * 订单状态，订单状态。2新订单，4已接单，8订单完成，9订单取消
    */
    @SerializedName("status")
    private Integer status;

    public String getRecipientName() {
        return recipientName;
    }
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
    public String getRecipientPhone() {
        return recipientPhone;
    }
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }
    public String getRecipientAddress() {
        return recipientAddress;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
    public String getRecipientAddressDesensitization() {
        return recipientAddressDesensitization;
    }
    public void setRecipientAddressDesensitization(String recipientAddressDesensitization) {
        this.recipientAddressDesensitization = recipientAddressDesensitization;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public String getBackupRecipientPhone() {
        return backupRecipientPhone;
    }
    public void setBackupRecipientPhone(String backupRecipientPhone) {
        this.backupRecipientPhone = backupRecipientPhone;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "GetRecipientInfoResponse{" + "recipientName=" + recipientName + "," + "recipientPhone=" + recipientPhone + "," + "recipientAddress=" + recipientAddress + "," + "recipientAddressDesensitization=" + recipientAddressDesensitization + "," + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "backupRecipientPhone=" + backupRecipientPhone + "," + "status=" + status + "}";
    }
}
