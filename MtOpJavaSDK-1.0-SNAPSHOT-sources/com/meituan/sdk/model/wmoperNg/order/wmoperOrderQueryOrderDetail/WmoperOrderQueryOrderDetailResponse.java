package com.meituan.sdk.model.wmoperNg.order.wmoperOrderQueryOrderDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询订单详情
* This file was automatically generated.
*/
public class WmoperOrderQueryOrderDetailResponse {
    /**
    * 活动信息
    */
    @SerializedName("activity")
    private List<Activity> activity;
    /**
    * 备注
    */
    @SerializedName("caution")
    private String caution;
    /**
    * 流水单号
    */
    @SerializedName("daySeq")
    private Integer daySeq;
    /**
    * 用户预计送达时间
    */
    @SerializedName("deliveryTime")
    private Long deliveryTime;
    /**
    * 菜品信息
    */
    @SerializedName("detail")
    private List<Detail> detail;
    /**
    * erp门店id
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 实际送餐地址纬度
    */
    @SerializedName("latitude")
    private Double latitude;
    /**
    * 配送单取消时间
    */
    @SerializedName("logisticsCancelTime")
    private Long logisticsCancelTime;
    /**
    * 配送方式
    */
    @SerializedName("logisticsCode")
    private String logisticsCode;
    /**
    * 配送完成时间
    */
    @SerializedName("logisticsCompletedTime")
    private Long logisticsCompletedTime;
    /**
    * 配送单确认时间
    */
    @SerializedName("logisticsConfirmTime")
    private Long logisticsConfirmTime;
    /**
    * 骑手取单时间
    */
    @SerializedName("logisticsFetchTime")
    private Long logisticsFetchTime;
    /**
    * 配送单下单时间
    */
    @SerializedName("logisticsSendTime")
    private Long logisticsSendTime;
    /**
    * 实际送餐地址经度
    */
    @SerializedName("longitude")
    private Double longitude;
    /**
    * 订单取消时间
    */
    @SerializedName("orderCancelTime")
    private Long orderCancelTime;
    /**
    * 订单完成时间
    */
    @SerializedName("orderCompletedTime")
    private Long orderCompletedTime;
    /**
    * 商户确认时间
    */
    @SerializedName("orderConfirmTime")
    private Long orderConfirmTime;
    /**
    * 订单ID（订单展示Id。用户下单时看到的订单号）
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 商户收到时间
    */
    @SerializedName("orderReceiveTime")
    private Long orderReceiveTime;
    /**
    * 用户下单时间
    */
    @SerializedName("orderSendTime")
    private Long orderSendTime;
    /**
    * 商品原价
    */
    @SerializedName("originalPrice")
    private Double originalPrice;
    /**
    * 支付类型，1表货到付款，2表在线支付
    */
    @SerializedName("payType")
    private Integer payType;
    /**
    * 取餐类型（0：普通取餐；1：到店取餐）
    */
    @SerializedName("pickType")
    private Integer pickType;
    /**
    * 门店ID
    */
    @SerializedName("poiId")
    private Long poiId;
    /**
    * 商家对账信息，此字段为JSON字符串
    */
    @SerializedName("poi_receive_detail")
    private String poiReceiveDetail;
    /**
    * 收货地址
    */
    @SerializedName("recipientAddress")
    private String recipientAddress;
    /**
    * 收货人名字
    */
    @SerializedName("recipientName")
    private String recipientName;
    /**
    * 收货人手机号
    */
    @SerializedName("recipientPhone")
    private String recipientPhone;
    /**
    * 配送员电话
    */
    @SerializedName("shipperPhone")
    private String shipperPhone;
    /**
    * 门店配送费
    */
    @SerializedName("shippingFee")
    private Double shippingFee;
    /**
    * 订单状态 2 新订单，4 已接单，8 订单完成，9 订单取消
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 订单金额
    */
    @SerializedName("total")
    private Double total;
    /**
    * 透传给第三方的偏移后的user_id
    */
    @SerializedName("userIdView")
    private Long userIdView;

    public List<Activity> getActivity() {
        return activity;
    }
    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }
    public String getCaution() {
        return caution;
    }
    public void setCaution(String caution) {
        this.caution = caution;
    }
    public Integer getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(Integer daySeq) {
        this.daySeq = daySeq;
    }
    public Long getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public List<Detail> getDetail() {
        return detail;
    }
    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }
    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Long getLogisticsCancelTime() {
        return logisticsCancelTime;
    }
    public void setLogisticsCancelTime(Long logisticsCancelTime) {
        this.logisticsCancelTime = logisticsCancelTime;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
    public Long getLogisticsCompletedTime() {
        return logisticsCompletedTime;
    }
    public void setLogisticsCompletedTime(Long logisticsCompletedTime) {
        this.logisticsCompletedTime = logisticsCompletedTime;
    }
    public Long getLogisticsConfirmTime() {
        return logisticsConfirmTime;
    }
    public void setLogisticsConfirmTime(Long logisticsConfirmTime) {
        this.logisticsConfirmTime = logisticsConfirmTime;
    }
    public Long getLogisticsFetchTime() {
        return logisticsFetchTime;
    }
    public void setLogisticsFetchTime(Long logisticsFetchTime) {
        this.logisticsFetchTime = logisticsFetchTime;
    }
    public Long getLogisticsSendTime() {
        return logisticsSendTime;
    }
    public void setLogisticsSendTime(Long logisticsSendTime) {
        this.logisticsSendTime = logisticsSendTime;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
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
    public Long getOrderConfirmTime() {
        return orderConfirmTime;
    }
    public void setOrderConfirmTime(Long orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOrderReceiveTime() {
        return orderReceiveTime;
    }
    public void setOrderReceiveTime(Long orderReceiveTime) {
        this.orderReceiveTime = orderReceiveTime;
    }
    public Long getOrderSendTime() {
        return orderSendTime;
    }
    public void setOrderSendTime(Long orderSendTime) {
        this.orderSendTime = orderSendTime;
    }
    public Double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public Integer getPayType() {
        return payType;
    }
    public void setPayType(Integer payType) {
        this.payType = payType;
    }
    public Integer getPickType() {
        return pickType;
    }
    public void setPickType(Integer pickType) {
        this.pickType = pickType;
    }
    public Long getPoiId() {
        return poiId;
    }
    public void setPoiId(Long poiId) {
        this.poiId = poiId;
    }
    public String getPoiReceiveDetail() {
        return poiReceiveDetail;
    }
    public void setPoiReceiveDetail(String poiReceiveDetail) {
        this.poiReceiveDetail = poiReceiveDetail;
    }
    public String getRecipientAddress() {
        return recipientAddress;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
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
    public String getShipperPhone() {
        return shipperPhone;
    }
    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public Long getUserIdView() {
        return userIdView;
    }
    public void setUserIdView(Long userIdView) {
        this.userIdView = userIdView;
    }




    @Override
    public String toString() {
        return "WmoperOrderQueryOrderDetailResponse{" + "activity=" + activity + "," + "caution=" + caution + "," + "daySeq=" + daySeq + "," + "deliveryTime=" + deliveryTime + "," + "detail=" + detail + "," + "epoiId=" + epoiId + "," + "latitude=" + latitude + "," + "logisticsCancelTime=" + logisticsCancelTime + "," + "logisticsCode=" + logisticsCode + "," + "logisticsCompletedTime=" + logisticsCompletedTime + "," + "logisticsConfirmTime=" + logisticsConfirmTime + "," + "logisticsFetchTime=" + logisticsFetchTime + "," + "logisticsSendTime=" + logisticsSendTime + "," + "longitude=" + longitude + "," + "orderCancelTime=" + orderCancelTime + "," + "orderCompletedTime=" + orderCompletedTime + "," + "orderConfirmTime=" + orderConfirmTime + "," + "orderId=" + orderId + "," + "orderReceiveTime=" + orderReceiveTime + "," + "orderSendTime=" + orderSendTime + "," + "originalPrice=" + originalPrice + "," + "payType=" + payType + "," + "pickType=" + pickType + "," + "poiId=" + poiId + "," + "poiReceiveDetail=" + poiReceiveDetail + "," + "recipientAddress=" + recipientAddress + "," + "recipientName=" + recipientName + "," + "recipientPhone=" + recipientPhone + "," + "shipperPhone=" + shipperPhone + "," + "shippingFee=" + shippingFee + "," + "status=" + status + "," + "total=" + total + "," + "userIdView=" + userIdView + "}";
    }
}
