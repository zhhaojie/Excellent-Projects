package com.meituan.sdk.model.foodmop.pay.tuangouTradeQueryByPage;

import com.google.gson.annotations.SerializedName;

/**
* 扩展信息
* This file was automatically generated.
*/
public class ExtendInfo {
    /**
    * 服务费率，保留4位小数  bizType=40点餐必传，单位1，保留4位小数。如0.0060表示千分之六的费率
    */
    @SerializedName("serviceFeeRate")
    private Double serviceFeeRate;
    /**
    * 团购券抵扣金额，单位元，保留两位小数  bizType=40点餐必传，即美团团购券（含代金券、套餐券）在该笔点餐订单中总计抵扣掉的金额，actType为10消费时为正数，20撤销消费为负数
    */
    @SerializedName("couponExchangeAmount")
    private Double couponExchangeAmount;
    /**
    * 美团订单号  bizType=10且券码用于点餐，必传，即美团系统内点餐订单号
    */
    @SerializedName("orderId")
    private Long orderId;

    public Double getServiceFeeRate() {
        return serviceFeeRate;
    }
    public void setServiceFeeRate(Double serviceFeeRate) {
        this.serviceFeeRate = serviceFeeRate;
    }
    public Double getCouponExchangeAmount() {
        return couponExchangeAmount;
    }
    public void setCouponExchangeAmount(Double couponExchangeAmount) {
        this.couponExchangeAmount = couponExchangeAmount;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }




    @Override
    public String toString() {
        return "ExtendInfo{" + "serviceFeeRate=" + serviceFeeRate + "," + "couponExchangeAmount=" + couponExchangeAmount + "," + "orderId=" + orderId + "}";
    }
}
