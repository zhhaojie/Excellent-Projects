package com.meituan.sdk.model.peisong.order.preCreateByShop;

import com.google.gson.annotations.SerializedName;

/**
* 预发单接口
* This file was automatically generated.
*/
public class PreCreateByShopResponse {
    /**
    * 订单配送距离
    */
    @SerializedName("delivery_distance")
    private Integer deliveryDistance;
    /**
    * 订单配送价格
    */
    @SerializedName("delivery_fee")
    private Double deliveryFee;
    /**
    * 优惠可用配送金额，单位为元；使用余额支付时有值；总配送费中可使用优惠券抵扣的部分配送费金额，金额受到不同计费因素以及优惠券使用规则影响；
    */
    @SerializedName("base_delivery_fee")
    private Double baseDeliveryFee;
    /**
    * 优惠券ID，使用余额支付时有值；  当前时刻可用的、最优的优惠券ID；实际发单过程中依旧会校验优惠券ID是否可用；
    */
    @SerializedName("coupons_id")
    private String couponsId;
    /**
    * 优惠券金额，单位为元，使用余额支付时有值；  当前时刻可用的、最优的优惠券ID对应的优惠券金额；
    */
    @SerializedName("coupons_amount")
    private Double couponsAmount;

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
    public String getCouponsId() {
        return couponsId;
    }
    public void setCouponsId(String couponsId) {
        this.couponsId = couponsId;
    }
    public Double getCouponsAmount() {
        return couponsAmount;
    }
    public void setCouponsAmount(Double couponsAmount) {
        this.couponsAmount = couponsAmount;
    }




    @Override
    public String toString() {
        return "PreCreateByShopResponse{" + "deliveryDistance=" + deliveryDistance + "," + "deliveryFee=" + deliveryFee + "," + "baseDeliveryFee=" + baseDeliveryFee + "," + "couponsId=" + couponsId + "," + "couponsAmount=" + couponsAmount + "}";
    }
}
