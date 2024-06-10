package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderRefund;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * 退款类型，0:商家通过账号退款，1：系统直接退款
    */
    @SerializedName("refundType")
    private Long refundType;
    /**
    * 用户订单ID
    */
    @SerializedName("serialNumber")
    private String serialNumber;
    /**
    * 厂商退款请求地址ip
    */
    @SerializedName("vendorIp")
    private String vendorIp;
    /**
    * 系统订单ID
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 退款原因
    */
    @SerializedName("refundReason")
    private String refundReason;
    /**
    * 退款结果true成功false失败
    */
    @SerializedName("refundResult")
    private Boolean refundResult;
    /**
    * 厂商ID
    */
    @SerializedName("vendorId")
    private String vendorId;
    /**
    * 厂商管理员账号id
    */
    @SerializedName("vendorShopAdminId")
    private String vendorShopAdminId;
    /**
    * 美团门店ID
    */
    @SerializedName("mtShopId")
    private Long mtShopId;
    /**
    * 时间戳
    */
    @SerializedName("timestamp")
    private Long timestamp;

    public Long getRefundType() {
        return refundType;
    }
    public void setRefundType(Long refundType) {
        this.refundType = refundType;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public String getVendorIp() {
        return vendorIp;
    }
    public void setVendorIp(String vendorIp) {
        this.vendorIp = vendorIp;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getRefundReason() {
        return refundReason;
    }
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
    public Boolean getRefundResult() {
        return refundResult;
    }
    public void setRefundResult(Boolean refundResult) {
        this.refundResult = refundResult;
    }
    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorShopAdminId() {
        return vendorShopAdminId;
    }
    public void setVendorShopAdminId(String vendorShopAdminId) {
        this.vendorShopAdminId = vendorShopAdminId;
    }
    public Long getMtShopId() {
        return mtShopId;
    }
    public void setMtShopId(Long mtShopId) {
        this.mtShopId = mtShopId;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }




    @Override
    public String toString() {
        return "Data{" + "refundType=" + refundType + "," + "serialNumber=" + serialNumber + "," + "vendorIp=" + vendorIp + "," + "orderId=" + orderId + "," + "refundReason=" + refundReason + "," + "refundResult=" + refundResult + "," + "vendorId=" + vendorId + "," + "vendorShopAdminId=" + vendorShopAdminId + "," + "mtShopId=" + mtShopId + "," + "timestamp=" + timestamp + "}";
    }
}
