package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderRelate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * 用户订单号
    */
    @SerializedName("serialNumber")
    private String serialNumber;
    /**
    * 是否关联厂商订单,true关联false不关联
    */
    @SerializedName("isRelate")
    private Boolean isRelate;
    /**
    * 系统订单号
    */
    @SerializedName("orderId")
    private Long orderId;
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
    /**
    * 关联的结果
    */
    @SerializedName("isRelateResult")
    private Boolean isRelateResult;
    /**
    * 厂商收银订单ID
    */
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * 桌台号
    */
    @SerializedName("tableNo")
    private String tableNo;

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Boolean getIsRelate() {
        return isRelate;
    }
    public void setIsRelate(Boolean isRelate) {
        this.isRelate = isRelate;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
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
    public Boolean getIsRelateResult() {
        return isRelateResult;
    }
    public void setIsRelateResult(Boolean isRelateResult) {
        this.isRelateResult = isRelateResult;
    }
    public String getVendorOrderId() {
        return vendorOrderId;
    }
    public void setVendorOrderId(String vendorOrderId) {
        this.vendorOrderId = vendorOrderId;
    }
    public String getTableNo() {
        return tableNo;
    }
    public void setTableNo(String tableNo) {
        this.tableNo = tableNo;
    }




    @Override
    public String toString() {
        return "Data{" + "serialNumber=" + serialNumber + "," + "isRelate=" + isRelate + "," + "orderId=" + orderId + "," + "vendorId=" + vendorId + "," + "vendorShopAdminId=" + vendorShopAdminId + "," + "mtShopId=" + mtShopId + "," + "timestamp=" + timestamp + "," + "isRelateResult=" + isRelateResult + "," + "vendorOrderId=" + vendorOrderId + "," + "tableNo=" + tableNo + "}";
    }
}
