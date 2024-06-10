package com.meituan.sdk.model.wmoperNg.waimaiad.appOrderList;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Order {
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    @NotNull(message = "orderViewId不能为空")
    @SerializedName("orderViewId")
    private Long orderViewId;
    @NotNull(message = "appId不能为空")
    @SerializedName("appId")
    private Long appId;
    @NotBlank(message = "serviceCode不能为空")
    @SerializedName("serviceCode")
    private String serviceCode;
    @NotNull(message = "payStatus不能为空")
    @SerializedName("payStatus")
    private Long payStatus;
    @NotBlank(message = "version不能为空")
    @SerializedName("version")
    private String version;
    @NotBlank(message = "versionName不能为空")
    @SerializedName("versionName")
    private String versionName;
    @NotNull(message = "days不能为空")
    @SerializedName("days")
    private Long days;
    @NotNull(message = "startTime不能为空")
    @SerializedName("startTime")
    private Long startTime;
    @NotNull(message = "endTime不能为空")
    @SerializedName("endTime")
    private Long endTime;
    @NotNull(message = "rightStatus不能为空")
    @SerializedName("rightStatus")
    private Long rightStatus;
    @NotNull(message = "realPayPrice不能为空")
    @SerializedName("realPayPrice")
    private Long realPayPrice;
    @NotNull(message = "orderTime不能为空")
    @SerializedName("orderTime")
    private Long orderTime;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOrderViewId() {
        return orderViewId;
    }
    public void setOrderViewId(Long orderViewId) {
        this.orderViewId = orderViewId;
    }
    public Long getAppId() {
        return appId;
    }
    public void setAppId(Long appId) {
        this.appId = appId;
    }
    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    public Long getPayStatus() {
        return payStatus;
    }
    public void setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersionName() {
        return versionName;
    }
    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }
    public Long getDays() {
        return days;
    }
    public void setDays(Long days) {
        this.days = days;
    }
    public Long getStartTime() {
        return startTime;
    }
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    public Long getEndTime() {
        return endTime;
    }
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    public Long getRightStatus() {
        return rightStatus;
    }
    public void setRightStatus(Long rightStatus) {
        this.rightStatus = rightStatus;
    }
    public Long getRealPayPrice() {
        return realPayPrice;
    }
    public void setRealPayPrice(Long realPayPrice) {
        this.realPayPrice = realPayPrice;
    }
    public Long getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(Long orderTime) {
        this.orderTime = orderTime;
    }




    @Override
    public String toString() {
        return "Order{" + "orderId=" + orderId + "," + "orderViewId=" + orderViewId + "," + "appId=" + appId + "," + "serviceCode=" + serviceCode + "," + "payStatus=" + payStatus + "," + "version=" + version + "," + "versionName=" + versionName + "," + "days=" + days + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "rightStatus=" + rightStatus + "," + "realPayPrice=" + realPayPrice + "," + "orderTime=" + orderTime + "}";
    }
}
