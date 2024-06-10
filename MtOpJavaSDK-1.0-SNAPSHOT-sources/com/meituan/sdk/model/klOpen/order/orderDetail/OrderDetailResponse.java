package com.meituan.sdk.model.klOpen.order.orderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 查询订单详细信息
* This file was automatically generated.
*/
public class OrderDetailResponse {
    @SerializedName("orderId")
    private String orderId;
    @SerializedName("status")
    private String status;
    @SerializedName("createDate")
    private String createDate;
    @SerializedName("receiverName")
    private String receiverName;
    @SerializedName("receiverPhone")
    private String receiverPhone;
    @SerializedName("addressDetail")
    private String addressDetail;
    @SerializedName("expectTime")
    private String expectTime;
    @SerializedName("remark")
    private String remark;
    @SerializedName("proTotalAmount")
    private String proTotalAmount;
    @SerializedName("freightAmount")
    private String freightAmount;
    @SerializedName("discountAmount")
    private String discountAmount;
    @SerializedName("receivableAmount")
    private String receivableAmount;
    @SerializedName("totalAmount")
    private String totalAmount;
    @SerializedName("cancelReason")
    private String cancelReason;
    @SerializedName("cancelRemark")
    private String cancelRemark;
    @SerializedName("cancelUser")
    private String cancelUser;
    @SerializedName("payType")
    private String payType;
    @SerializedName("verStatus")
    private String verStatus;
    @SerializedName("orderProducts")
    private OrderDetailSkuItemDto orderProducts;
    @SerializedName("driverName")
    private String driverName;
    @SerializedName("driverPhone")
    private String driverPhone;
    @SerializedName("plateNumber")
    private String plateNumber;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getCreateDate() {
        return createDate;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
    public String getReceiverName() {
        return receiverName;
    }
    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
    public String getReceiverPhone() {
        return receiverPhone;
    }
    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }
    public String getAddressDetail() {
        return addressDetail;
    }
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }
    public String getExpectTime() {
        return expectTime;
    }
    public void setExpectTime(String expectTime) {
        this.expectTime = expectTime;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getProTotalAmount() {
        return proTotalAmount;
    }
    public void setProTotalAmount(String proTotalAmount) {
        this.proTotalAmount = proTotalAmount;
    }
    public String getFreightAmount() {
        return freightAmount;
    }
    public void setFreightAmount(String freightAmount) {
        this.freightAmount = freightAmount;
    }
    public String getDiscountAmount() {
        return discountAmount;
    }
    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }
    public String getReceivableAmount() {
        return receivableAmount;
    }
    public void setReceivableAmount(String receivableAmount) {
        this.receivableAmount = receivableAmount;
    }
    public String getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }
    public String getCancelReason() {
        return cancelReason;
    }
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    public String getCancelRemark() {
        return cancelRemark;
    }
    public void setCancelRemark(String cancelRemark) {
        this.cancelRemark = cancelRemark;
    }
    public String getCancelUser() {
        return cancelUser;
    }
    public void setCancelUser(String cancelUser) {
        this.cancelUser = cancelUser;
    }
    public String getPayType() {
        return payType;
    }
    public void setPayType(String payType) {
        this.payType = payType;
    }
    public String getVerStatus() {
        return verStatus;
    }
    public void setVerStatus(String verStatus) {
        this.verStatus = verStatus;
    }
    public OrderDetailSkuItemDto getOrderProducts() {
        return orderProducts;
    }
    public void setOrderProducts(OrderDetailSkuItemDto orderProducts) {
        this.orderProducts = orderProducts;
    }
    public String getDriverName() {
        return driverName;
    }
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    public String getDriverPhone() {
        return driverPhone;
    }
    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }
    public String getPlateNumber() {
        return plateNumber;
    }
    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }




    @Override
    public String toString() {
        return "OrderDetailResponse{" + "orderId=" + orderId + "," + "status=" + status + "," + "createDate=" + createDate + "," + "receiverName=" + receiverName + "," + "receiverPhone=" + receiverPhone + "," + "addressDetail=" + addressDetail + "," + "expectTime=" + expectTime + "," + "remark=" + remark + "," + "proTotalAmount=" + proTotalAmount + "," + "freightAmount=" + freightAmount + "," + "discountAmount=" + discountAmount + "," + "receivableAmount=" + receivableAmount + "," + "totalAmount=" + totalAmount + "," + "cancelReason=" + cancelReason + "," + "cancelRemark=" + cancelRemark + "," + "cancelUser=" + cancelUser + "," + "payType=" + payType + "," + "verStatus=" + verStatus + "," + "orderProducts=" + orderProducts + "," + "driverName=" + driverName + "," + "driverPhone=" + driverPhone + "," + "plateNumber=" + plateNumber + "}";
    }
}
