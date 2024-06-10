package com.meituan.sdk.model.peisong.order.createByShop;

import com.google.gson.annotations.SerializedName;

/**
* 订单创建（门店方式）
* This file was automatically generated.
*/
public class CreateByShopResponse {
    /**
    * 美团配送内部订单id
    */
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 配送活动标识
    */
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 外部订单id
    */
    @SerializedName("order_id")
    private String orderId;
    /**
    * 订单配送距离，单位为米，当前订单计算的配送距离
    */
    @SerializedName("delivery_distance")
    private Integer deliveryDistance;
    /**
    * 订单配送价格，单位为元，价格受距离、发单时间、配送高峰、特殊天气等不同计费因素影响
    */
    @SerializedName("delivery_fee")
    private Double deliveryFee;
    /**
    * 优惠可用金额，单位为元；使用余额支付时有值；总配送费仲可使用优惠券抵扣的部分配送费用，金额受到不同计费因素以及优惠券使用规则影响
    */
    @SerializedName("base_delivery_fee")
    private Double baseDeliveryFee;
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
    * 优惠券金额，单位为元；  当前订单创建时刻传入的优惠券且符合使用条件时则有值，反之无值或为0。
    */
    @SerializedName("coupons_amount")
    private Double couponsAmount;

    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
    public Double getBaseDeliveryFee() {
        return baseDeliveryFee;
    }
    public void setBaseDeliveryFee(Double baseDeliveryFee) {
        this.baseDeliveryFee = baseDeliveryFee;
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
        return "CreateByShopResponse{" + "mtPeisongId=" + mtPeisongId + "," + "deliveryId=" + deliveryId + "," + "orderId=" + orderId + "," + "deliveryDistance=" + deliveryDistance + "," + "deliveryFee=" + deliveryFee + "," + "baseDeliveryFee=" + baseDeliveryFee + "," + "payAmount=" + payAmount + "," + "settlementModeCode=" + settlementModeCode + "," + "couponsAmount=" + couponsAmount + "}";
    }
}
