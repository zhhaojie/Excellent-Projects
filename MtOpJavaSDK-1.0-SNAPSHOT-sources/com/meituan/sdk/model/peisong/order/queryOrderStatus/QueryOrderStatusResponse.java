package com.meituan.sdk.model.peisong.order.queryOrderStatus;

import com.google.gson.annotations.SerializedName;

/**
* 订单状态查询
* This file was automatically generated.
*/
public class QueryOrderStatusResponse {
    /**
    * 配送活动标识
    */
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 美团配送内部订单id，最长不超过32个字符
    */
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 外部订单号，最长不超过32个字符
    */
    @SerializedName("order_id")
    private String orderId;
    /**
    * 状态代码，可选值为  0：待调度  20：已接单  30：已取货  50：已送达  99：已取消
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 订单状态变更时间，格式为unix-timestamp
    */
    @SerializedName("operate_time")
    private Integer operateTime;
    /**
    * 配送员姓名（订单已被骑手接单后会返回骑手信息）
    */
    @SerializedName("courier_name")
    private String courierName;
    /**
    * 配送员电话（订单已被骑手接单后会返回骑手信息）
    */
    @SerializedName("courier_phone")
    private String courierPhone;
    /**
    * 取消原因id，详情请参考 美团配送开放平台接口文档--门户页面-4.3，订单取消原因列表
    */
    @SerializedName("cancel_reason_id")
    private Integer cancelReasonId;
    /**
    * 取消原因详情，最长不超过256个字符
    */
    @SerializedName("cancel_reason")
    private String cancelReason;
    /**
    * 非必须，订单预计送达时间
    */
    @SerializedName("predict_delivery_time")
    private String predictDeliveryTime;
    /**
    * 订单配送距离，单位为米
    */
    @SerializedName("delivery_distance")
    private Integer deliveryDistance;
    /**
    * 订单配送价格，单位为元
    */
    @SerializedName("delivery_fee")
    private Double deliveryFee;
    /**
    * 实际支付价格，单位为元；使用优惠券等扣减后价格；支付方式为账期时支付价格以账单为准
    */
    @SerializedName("pay_amount")
    private Double payAmount;
    /**
    * 结算方式，1、实时结算，2、账期结算；账期结算下包含的支付方式为账期；实时结算下包含的支付方式为余额；后续会扩展多种支付方式
    */
    @SerializedName("settlement_mode_code")
    private Integer settlementModeCode;
    /**
    * 优惠券金额，单位为元；  当前订单存在使用符合条件的优惠券则有值，反之无值或为0
    */
    @SerializedName("coupons_amount")
    private Double couponsAmount;

    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getOperateTime() {
        return operateTime;
    }
    public void setOperateTime(Integer operateTime) {
        this.operateTime = operateTime;
    }
    public String getCourierName() {
        return courierName;
    }
    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }
    public String getCourierPhone() {
        return courierPhone;
    }
    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone;
    }
    public Integer getCancelReasonId() {
        return cancelReasonId;
    }
    public void setCancelReasonId(Integer cancelReasonId) {
        this.cancelReasonId = cancelReasonId;
    }
    public String getCancelReason() {
        return cancelReason;
    }
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }
    public String getPredictDeliveryTime() {
        return predictDeliveryTime;
    }
    public void setPredictDeliveryTime(String predictDeliveryTime) {
        this.predictDeliveryTime = predictDeliveryTime;
    }
    public Integer getDeliveryDistance() {
        return deliveryDistance;
    }
    public void setDeliveryDistance(Integer deliveryDistance) {
        this.deliveryDistance = deliveryDistance;
    }
    public Double getDeliveryFee() {
        return deliveryFee;
    }
    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
    public Double getPayAmount() {
        return payAmount;
    }
    public void setPayAmount(Double payAmount) {
        this.payAmount = payAmount;
    }
    public Integer getSettlementModeCode() {
        return settlementModeCode;
    }
    public void setSettlementModeCode(Integer settlementModeCode) {
        this.settlementModeCode = settlementModeCode;
    }
    public Double getCouponsAmount() {
        return couponsAmount;
    }
    public void setCouponsAmount(Double couponsAmount) {
        this.couponsAmount = couponsAmount;
    }




    @Override
    public String toString() {
        return "QueryOrderStatusResponse{" + "deliveryId=" + deliveryId + "," + "mtPeisongId=" + mtPeisongId + "," + "orderId=" + orderId + "," + "status=" + status + "," + "operateTime=" + operateTime + "," + "courierName=" + courierName + "," + "courierPhone=" + courierPhone + "," + "cancelReasonId=" + cancelReasonId + "," + "cancelReason=" + cancelReason + "," + "predictDeliveryTime=" + predictDeliveryTime + "," + "deliveryDistance=" + deliveryDistance + "," + "deliveryFee=" + deliveryFee + "," + "payAmount=" + payAmount + "," + "settlementModeCode=" + settlementModeCode + "," + "couponsAmount=" + couponsAmount + "}";
    }
}
