package com.meituan.sdk.model.wmoperNg.order.wmoperngQueryOrderDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 查询订单详情(展示费率相关字段)
* This file was automatically generated.
*/
public class WmoperngQueryOrderDetailResponse {
    /**
    * 订单金额
    */
    @SerializedName("total")
    private Double total;
    /**
    * 菜品信息 List类型
    */
    @SerializedName("detail")
    private List<Detail> detail;
    /**
    * 备注。去掉隐私号，去掉脱敏的真实号，去掉预订人手机号。
    */
    @SerializedName("caution")
    private String caution;
    /**
    * 订单取消时间
    */
    @SerializedName("orderCancelTime")
    private Long orderCancelTime;
    /**
    * 商户收到时间
    */
    @SerializedName("orderReceiveTime")
    private Long orderReceiveTime;
    /**
    * 商家对账信息，此字段为JSON字符串
    */
    @SerializedName("poiReceiveDetail")
    private String poiReceiveDetail;
    /**
    * 配送单取消时间
    */
    @SerializedName("logisticsCancelTime")
    private Long logisticsCancelTime;
    /**
    * 配送单确认时间
    */
    @SerializedName("logisticsConfirmTime")
    private Long logisticsConfirmTime;
    /**
    * 收货人电话。字段默认内容“***********”。
    */
    @SerializedName("recipientPhone")
    private String recipientPhone;
    /**
    * 配送方式
    */
    @SerializedName("logisticsCode")
    private String logisticsCode;
    @NotNull(message = "detailSize不能为空")
    @SerializedName("detailSize")
    private Long detailSize;
    /**
    * 实际送餐地址经度。字段默认内容“0.0”。
    */
    @SerializedName("longitude")
    private Double longitude;
    @NotNull(message = "activitySize不能为空")
    @SerializedName("activitySize")
    private Long activitySize;
    /**
    * 商户确认时间
    */
    @SerializedName("orderConfirmTime")
    private Long orderConfirmTime;
    /**
    * 活动信息 List类型
    */
    @SerializedName("activity")
    private List<Activity> activity;
    /**
    * 订单展示Id
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 即时单：字段值为配送eta系统提供的预计送达时间 到店自取单：字段值为用户到店取餐时间 预订单：字段值为用户下单时填写的预计送达时间
    */
    @SerializedName("estimateArrivalTime")
    private Long estimateArrivalTime;
    /**
    * 订单状态 2 新订单，4 已接单，8 订单完成，9 订单取消
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 收货地址
    */
    @SerializedName("recipientAddress")
    private String recipientAddress;
    /**
    * 流水单号
    */
    @SerializedName("daySeq")
    private Integer daySeq;
    /**
    * 用户下单时间
    */
    @SerializedName("orderSendTime")
    private Long orderSendTime;
    /**
    * 配送完成时间
    */
    @SerializedName("logisticsCompletedTime")
    private Long logisticsCompletedTime;
    /**
    * 配送单下单时间
    */
    @SerializedName("logisticsSendTime")
    private Long logisticsSendTime;
    /**
    * 门店配送费
    */
    @SerializedName("shippingFee")
    private Double shippingFee;
    /**
    * 订单完成时间
    */
    @SerializedName("orderCompletedTime")
    private Long orderCompletedTime;
    /**
    * 配送员电话
    */
    @SerializedName("shipperPhone")
    private String shipperPhone;
    /**
    * 用户预计送达时间
    */
    @SerializedName("deliveryTime")
    private Long deliveryTime;
    /**
    * 商品原价
    */
    @SerializedName("originalPrice")
    private Double originalPrice;
    /**
    * 收货人名字
    */
    @SerializedName("recipientName")
    private String recipientName;
    /**
    * 骑手取单时间
    */
    @SerializedName("logisticsFetchTime")
    private Long logisticsFetchTime;
    /**
    * 支付类型，1表货到付款，2表在线支付
    */
    @SerializedName("payType")
    private Integer payType;
    /**
    * 透传给第三方的偏移后的user_id
    */
    @SerializedName("userIdView")
    private String userIdView;
    /**
    * 实际送餐地址纬度。字段默认内容“0.0”。
    */
    @SerializedName("latitude")
    private Double latitude;
    /**
    * 外卖门店ID
    */
    @SerializedName("wmPoiId")
    private Long wmPoiId;
    /**
    * 取餐类型（0：普通取餐；1：到店取餐）
    */
    @SerializedName("pickType")
    private Integer pickType;
    @SerializedName("etaModify")
    private EtaModifyVO etaModify;
    /**
    * 收餐地址行政区域
    */
    @SerializedName("address_of_receiving_administrative")
    private String addressOfReceivingAdministrative;
    /**
    * 打包费模块
    */
    @SerializedName("package_bag_fee_info")
    private PackageBagFeeInfo packageBagFeeInfo;
    /**
    * 是否是商企通订单 1是商企通订单 2非商企通 0降级
    */
    @SerializedName("sqtOrder")
    private Integer sqtOrder;
    /**
    * 是否需要开发票 1需要开发票 2无需开发票 0降级
    */
    @SerializedName("needSqtInvoice")
    private Integer needSqtInvoice;

    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public List<Detail> getDetail() {
        return detail;
    }
    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }
    public String getCaution() {
        return caution;
    }
    public void setCaution(String caution) {
        this.caution = caution;
    }
    public Long getOrderCancelTime() {
        return orderCancelTime;
    }
    public void setOrderCancelTime(Long orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }
    public Long getOrderReceiveTime() {
        return orderReceiveTime;
    }
    public void setOrderReceiveTime(Long orderReceiveTime) {
        this.orderReceiveTime = orderReceiveTime;
    }
    public String getPoiReceiveDetail() {
        return poiReceiveDetail;
    }
    public void setPoiReceiveDetail(String poiReceiveDetail) {
        this.poiReceiveDetail = poiReceiveDetail;
    }
    public Long getLogisticsCancelTime() {
        return logisticsCancelTime;
    }
    public void setLogisticsCancelTime(Long logisticsCancelTime) {
        this.logisticsCancelTime = logisticsCancelTime;
    }
    public Long getLogisticsConfirmTime() {
        return logisticsConfirmTime;
    }
    public void setLogisticsConfirmTime(Long logisticsConfirmTime) {
        this.logisticsConfirmTime = logisticsConfirmTime;
    }
    public String getRecipientPhone() {
        return recipientPhone;
    }
    public void setRecipientPhone(String recipientPhone) {
        this.recipientPhone = recipientPhone;
    }
    public String getLogisticsCode() {
        return logisticsCode;
    }
    public void setLogisticsCode(String logisticsCode) {
        this.logisticsCode = logisticsCode;
    }
    public Long getDetailSize() {
        return detailSize;
    }
    public void setDetailSize(Long detailSize) {
        this.detailSize = detailSize;
    }
    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
    public Long getActivitySize() {
        return activitySize;
    }
    public void setActivitySize(Long activitySize) {
        this.activitySize = activitySize;
    }
    public Long getOrderConfirmTime() {
        return orderConfirmTime;
    }
    public void setOrderConfirmTime(Long orderConfirmTime) {
        this.orderConfirmTime = orderConfirmTime;
    }
    public List<Activity> getActivity() {
        return activity;
    }
    public void setActivity(List<Activity> activity) {
        this.activity = activity;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getEstimateArrivalTime() {
        return estimateArrivalTime;
    }
    public void setEstimateArrivalTime(Long estimateArrivalTime) {
        this.estimateArrivalTime = estimateArrivalTime;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getRecipientAddress() {
        return recipientAddress;
    }
    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }
    public Integer getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(Integer daySeq) {
        this.daySeq = daySeq;
    }
    public Long getOrderSendTime() {
        return orderSendTime;
    }
    public void setOrderSendTime(Long orderSendTime) {
        this.orderSendTime = orderSendTime;
    }
    public Long getLogisticsCompletedTime() {
        return logisticsCompletedTime;
    }
    public void setLogisticsCompletedTime(Long logisticsCompletedTime) {
        this.logisticsCompletedTime = logisticsCompletedTime;
    }
    public Long getLogisticsSendTime() {
        return logisticsSendTime;
    }
    public void setLogisticsSendTime(Long logisticsSendTime) {
        this.logisticsSendTime = logisticsSendTime;
    }
    public Double getShippingFee() {
        return shippingFee;
    }
    public void setShippingFee(Double shippingFee) {
        this.shippingFee = shippingFee;
    }
    public Long getOrderCompletedTime() {
        return orderCompletedTime;
    }
    public void setOrderCompletedTime(Long orderCompletedTime) {
        this.orderCompletedTime = orderCompletedTime;
    }
    public String getShipperPhone() {
        return shipperPhone;
    }
    public void setShipperPhone(String shipperPhone) {
        this.shipperPhone = shipperPhone;
    }
    public Long getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(Long deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public Double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public String getRecipientName() {
        return recipientName;
    }
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }
    public Long getLogisticsFetchTime() {
        return logisticsFetchTime;
    }
    public void setLogisticsFetchTime(Long logisticsFetchTime) {
        this.logisticsFetchTime = logisticsFetchTime;
    }
    public Integer getPayType() {
        return payType;
    }
    public void setPayType(Integer payType) {
        this.payType = payType;
    }
    public String getUserIdView() {
        return userIdView;
    }
    public void setUserIdView(String userIdView) {
        this.userIdView = userIdView;
    }
    public Double getLatitude() {
        return latitude;
    }
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
    public Long getWmPoiId() {
        return wmPoiId;
    }
    public void setWmPoiId(Long wmPoiId) {
        this.wmPoiId = wmPoiId;
    }
    public Integer getPickType() {
        return pickType;
    }
    public void setPickType(Integer pickType) {
        this.pickType = pickType;
    }
    public EtaModifyVO getEtaModify() {
        return etaModify;
    }
    public void setEtaModify(EtaModifyVO etaModify) {
        this.etaModify = etaModify;
    }
    public String getAddressOfReceivingAdministrative() {
        return addressOfReceivingAdministrative;
    }
    public void setAddressOfReceivingAdministrative(String addressOfReceivingAdministrative) {
        this.addressOfReceivingAdministrative = addressOfReceivingAdministrative;
    }
    public PackageBagFeeInfo getPackageBagFeeInfo() {
        return packageBagFeeInfo;
    }
    public void setPackageBagFeeInfo(PackageBagFeeInfo packageBagFeeInfo) {
        this.packageBagFeeInfo = packageBagFeeInfo;
    }
    public Integer getSqtOrder() {
        return sqtOrder;
    }
    public void setSqtOrder(Integer sqtOrder) {
        this.sqtOrder = sqtOrder;
    }
    public Integer getNeedSqtInvoice() {
        return needSqtInvoice;
    }
    public void setNeedSqtInvoice(Integer needSqtInvoice) {
        this.needSqtInvoice = needSqtInvoice;
    }




    @Override
    public String toString() {
        return "WmoperngQueryOrderDetailResponse{" + "total=" + total + "," + "detail=" + detail + "," + "caution=" + caution + "," + "orderCancelTime=" + orderCancelTime + "," + "orderReceiveTime=" + orderReceiveTime + "," + "poiReceiveDetail=" + poiReceiveDetail + "," + "logisticsCancelTime=" + logisticsCancelTime + "," + "logisticsConfirmTime=" + logisticsConfirmTime + "," + "recipientPhone=" + recipientPhone + "," + "logisticsCode=" + logisticsCode + "," + "detailSize=" + detailSize + "," + "longitude=" + longitude + "," + "activitySize=" + activitySize + "," + "orderConfirmTime=" + orderConfirmTime + "," + "activity=" + activity + "," + "orderId=" + orderId + "," + "estimateArrivalTime=" + estimateArrivalTime + "," + "status=" + status + "," + "recipientAddress=" + recipientAddress + "," + "daySeq=" + daySeq + "," + "orderSendTime=" + orderSendTime + "," + "logisticsCompletedTime=" + logisticsCompletedTime + "," + "logisticsSendTime=" + logisticsSendTime + "," + "shippingFee=" + shippingFee + "," + "orderCompletedTime=" + orderCompletedTime + "," + "shipperPhone=" + shipperPhone + "," + "deliveryTime=" + deliveryTime + "," + "originalPrice=" + originalPrice + "," + "recipientName=" + recipientName + "," + "logisticsFetchTime=" + logisticsFetchTime + "," + "payType=" + payType + "," + "userIdView=" + userIdView + "," + "latitude=" + latitude + "," + "wmPoiId=" + wmPoiId + "," + "pickType=" + pickType + "," + "etaModify=" + etaModify + "," + "addressOfReceivingAdministrative=" + addressOfReceivingAdministrative + "," + "packageBagFeeInfo=" + packageBagFeeInfo + "," + "sqtOrder=" + sqtOrder + "," + "needSqtInvoice=" + needSqtInvoice + "}";
    }
}
