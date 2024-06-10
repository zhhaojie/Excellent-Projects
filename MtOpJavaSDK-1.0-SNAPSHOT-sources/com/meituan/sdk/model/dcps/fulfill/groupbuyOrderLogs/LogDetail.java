package com.meituan.sdk.model.dcps.fulfill.groupbuyOrderLogs;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LogDetail {
    @SerializedName("orderId")
    private Long orderId;
    @SerializedName("type")
    private Integer type;
    @SerializedName("status")
    private Integer status;
    @SerializedName("oldStatus")
    private Integer oldStatus;
    @SerializedName("describe")
    private String describe;
    @SerializedName("operatorSource")
    private Integer operatorSource;
    @SerializedName("addTime")
    private Long addTime;
    @SerializedName("bookingOrderId")
    private String bookingOrderId;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getOldStatus() {
        return oldStatus;
    }
    public void setOldStatus(Integer oldStatus) {
        this.oldStatus = oldStatus;
    }
    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }
    public Integer getOperatorSource() {
        return operatorSource;
    }
    public void setOperatorSource(Integer operatorSource) {
        this.operatorSource = operatorSource;
    }
    public Long getAddTime() {
        return addTime;
    }
    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }
    public String getBookingOrderId() {
        return bookingOrderId;
    }
    public void setBookingOrderId(String bookingOrderId) {
        this.bookingOrderId = bookingOrderId;
    }




    @Override
    public String toString() {
        return "LogDetail{" + "orderId=" + orderId + "," + "type=" + type + "," + "status=" + status + "," + "oldStatus=" + oldStatus + "," + "describe=" + describe + "," + "operatorSource=" + operatorSource + "," + "addTime=" + addTime + "," + "bookingOrderId=" + bookingOrderId + "}";
    }
}
