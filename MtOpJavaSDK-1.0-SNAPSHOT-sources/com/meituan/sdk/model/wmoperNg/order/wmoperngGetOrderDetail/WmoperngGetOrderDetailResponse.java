package com.meituan.sdk.model.wmoperNg.order.wmoperngGetOrderDetail;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 查询订单详情
* This file was automatically generated.
*/
public class WmoperngGetOrderDetailResponse {
    @NotNull(message = "orderId不能为空")
    @SerializedName("order_id")
    private Long orderId;
    @NotBlank(message = "recipientAddress不能为空")
    @SerializedName("recipient_address")
    private String recipientAddress;
    @NotBlank(message = "recipientPhone不能为空")
    @SerializedName("recipient_phone")
    private String recipientPhone;
    @NotBlank(message = "recipientName不能为空")
    @SerializedName("recipient_name")
    private String recipientName;
    @NotNull(message = "shippingFee不能为空")
    @SerializedName("shipping_fee")
    private Double shippingFee;
    @NotNull(message = "total不能为空")
    @SerializedName("total")
    private Double total;
    @NotNull(message = "originalPrice不能为空")
    @SerializedName("original_price")
    private Double originalPrice;
    @NotBlank(message = "caution不能为空")
    @SerializedName("caution")
    private String caution;
    @NotBlank(message = "shipperPhone不能为空")
    @SerializedName("shipper_phone")
    private String shipperPhone;
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Long status;
    @NotNull(message = "deliveryTime不能为空")
    @SerializedName("delivery_time")
    private Long deliveryTime;
    @NotNull(message = "payType不能为空")
    @SerializedName("pay_type")
    private Long payType;
    @NotNull(message = "pickType不能为空")
    @SerializedName("pick_type")
    private Long pickType;
    @NotNull(message = "daySeq不能为空")
    @SerializedName("day_seq")
    private Long daySeq;
    @NotEmpty(message = "detail不能为空")
    @SerializedName("detail")
    private List<Detail> detail;
    @NotEmpty(message = "activity不能为空")
    @SerializedName("activity")
    private List<Activity> activity;
    @NotNull(message = "orderSendTime不能为空")
    @SerializedName("orderSendTime")
    private Long orderSendTime;
    @NotNull(message = "orderConfirmTime不能为空")
    @SerializedName("orderConfirmTime")
    private Long orderConfirmTime;
    @NotNull(message = "orderReceiveTime不能为空")
    @SerializedName("orderReceiveTime")
    private Long orderReceiveTime;
    @NotNull(message = "orderCancelTime不能为空")
    @SerializedName("orderCancelTime")
    private Long orderCancelTime;
    @NotNull(message = "orderCompletedTime不能为空")
    @SerializedName("orderCompletedTime")
    private Long orderCompletedTime;
    @NotNull(message = "logisticsSendTime不能为空")
    @SerializedName("logisticsSendTime")
    private Long logisticsSendTime;
    @NotNull(message = "logisticsConfirmTime不能为空")
    @SerializedName("logisticsConfirmTime")
    private Long logisticsConfirmTime;
    @NotNull(message = "logisticsCancelTime不能为空")
    @SerializedName("logisticsCancelTime")
    private Long logisticsCancelTime;
    @NotNull(message = "logisticsFetchTime不能为空")
    @SerializedName("logisticsFetchTime")
    private Long logisticsFetchTime;
    @NotNull(message = "logisticsCompletedTime不能为空")
    @SerializedName("logisticsCompletedTime")
    private Long logisticsCompletedTime;
    @NotNull(message = "latitude不能为空")
    @SerializedName("latitude")
    private Double latitude;
    @NotNull(message = "longitude不能为空")
    @SerializedName("longitude")
    private Double longitude;
    @NotBlank(message = "poiReceiveDetail不能为空")
    @SerializedName("poiReceiveDetail")
    private String poiReceiveDetail;
    @NotNull(message = "userIdView不能为空")
    @SerializedName("userIdView")
    private Long userIdView;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getRecipientAddress() {
        return recipientAddress;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
    public String getRecipientPhone() {
        return recipientPhone;
    }
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }
    public String getRecipientName() {
        return recipientName;
    }
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public String getCaution() {
        return caution;
    }
    public void setCaution(String caution) {
        this.caution = caution;
    }
    public String getShipperPhone() {
        return shipperPhone;
    }
    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }
    public Long getStatus() {
        return status;
    }
    public void setStatus(Long status) {
        this.status = status;
    }
    public Long getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public Long getPayType() {
        return payType;
    }
    public void setPayType(Long payType) {
        this.payType = payType;
    }
    public Long getPickType() {
        return pickType;
    }
    public void setPickType(Long pickType) {
        this.pickType = pickType;
    }
    public Long getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(Long daySeq) {
        this.daySeq = daySeq;
    }
    public List<Detail> getDetail() {
        return detail;
    }
    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }
    public List<Activity> getActivity() {
        return activity;
    }
    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }
    public Long getOrderSendTime() {
        return orderSendTime;
    }
    public void setOrderSendTime(Long orderSendTime) {
        this.orderSendTime = orderSendTime;
    }
    public Long getOrderConfirmTime() {
        return orderConfirmTime;
    }
    public void setOrderConfirmTime(Long orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }
    public Long getOrderReceiveTime() {
        return orderReceiveTime;
    }
    public void setOrderReceiveTime(Long orderReceiveTime) {
        this.orderReceiveTime = orderReceiveTime;
    }
    public Long getOrderCancelTime() {
        return orderCancelTime;
    }
    public void setOrderCancelTime(Long orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }
    public Long getOrderCompletedTime() {
        return orderCompletedTime;
    }
    public void setOrderCompletedTime(Long orderCompletedTime) {
        this.orderCompletedTime = orderCompletedTime;
    }
    public Long getLogisticsSendTime() {
        return logisticsSendTime;
    }
    public void setLogisticsSendTime(Long logisticsSendTime) {
        this.logisticsSendTime = logisticsSendTime;
    }
    public Long getLogisticsConfirmTime() {
        return logisticsConfirmTime;
    }
    public void setLogisticsConfirmTime(Long logisticsConfirmTime) {
        this.logisticsConfirmTime = logisticsConfirmTime;
    }
    public Long getLogisticsCancelTime() {
        return logisticsCancelTime;
    }
    public void setLogisticsCancelTime(Long logisticsCancelTime) {
        this.logisticsCancelTime = logisticsCancelTime;
    }
    public Long getLogisticsFetchTime() {
        return logisticsFetchTime;
    }
    public void setLogisticsFetchTime(Long logisticsFetchTime) {
        this.logisticsFetchTime = logisticsFetchTime;
    }
    public Long getLogisticsCompletedTime() {
        return logisticsCompletedTime;
    }
    public void setLogisticsCompletedTime(Long logisticsCompletedTime) {
        this.logisticsCompletedTime = logisticsCompletedTime;
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
    public String getPoiReceiveDetail() {
        return poiReceiveDetail;
    }
    public void setPoiReceiveDetail(String poiReceiveDetail) {
        this.poiReceiveDetail = poiReceiveDetail;
    }
    public Long getUserIdView() {
        return userIdView;
    }
    public void setUserIdView(Long userIdView) {
        this.userIdView = userIdView;
    }




    @Override
    public String toString() {
        return "WmoperngGetOrderDetailResponse{" + "orderId=" + orderId + "," + "recipientAddress=" + recipientAddress + "," + "recipientPhone=" + recipientPhone + "," + "recipientName=" + recipientName + "," + "shippingFee=" + shippingFee + "," + "total=" + total + "," + "originalPrice=" + originalPrice + "," + "caution=" + caution + "," + "shipperPhone=" + shipperPhone + "," + "status=" + status + "," + "deliveryTime=" + deliveryTime + "," + "payType=" + payType + "," + "pickType=" + pickType + "," + "daySeq=" + daySeq + "," + "detail=" + detail + "," + "activity=" + activity + "," + "orderSendTime=" + orderSendTime + "," + "orderConfirmTime=" + orderConfirmTime + "," + "orderReceiveTime=" + orderReceiveTime + "," + "orderCancelTime=" + orderCancelTime + "," + "orderCompletedTime=" + orderCompletedTime + "," + "logisticsSendTime=" + logisticsSendTime + "," + "logisticsConfirmTime=" + logisticsConfirmTime + "," + "logisticsCancelTime=" + logisticsCancelTime + "," + "logisticsFetchTime=" + logisticsFetchTime + "," + "logisticsCompletedTime=" + logisticsCompletedTime + "," + "latitude=" + latitude + "," + "longitude=" + longitude + "," + "poiReceiveDetail=" + poiReceiveDetail + "," + "userIdView=" + userIdView + "}";
    }
}
