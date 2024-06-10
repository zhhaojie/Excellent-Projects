package com.meituan.sdk.model.tuangouNg.tradeDetail.tuangouCouponQueryTradeDetail;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class CouponTradeDetail {
    /**
    * 商家促销金额
    */
    @SerializedName("bizCost")
    private Double bizCost;
    /**
    * 券进价，即美团从商家获取的团购券结算批发价，也是开店宝中的“顾客实付”-“服务费”。如果商家有另外的促销（指从开店宝发起的促销），则美团与商家的结算价格为结算批发价-商家促销金额；如无另外的促销，结算批发价即作为美团与商家的结算价格
    */
    @SerializedName("buyPrice")
    private Double buyPrice;
    /**
    * 券购买价，即用户在购买团购券时所需付的价格，这里指剔除商家促销金额后的价格，即实时价格
    */
    @SerializedName("couponBuyPrice")
    private Double couponBuyPrice;
    /**
    * 券码
    */
    @SerializedName("couponCode")
    private String couponCode;
    /**
    * 项目id
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 券面值，即人们常说的市场价
    */
    @SerializedName("dealValue")
    private Double dealValue;
    /**
    * 商家预计应得金额
    */
    @SerializedName("due")
    private Double due;
    /**
    * 订单id
    */
    @SerializedName("orderId")
    private Long orderId;
    /**
    * 量贩项目的单张券原价（普通券单张券原价与项目总价相同）
    */
    @SerializedName("singleValue")
    private Double singleValue;
    /**
    * 验券时间
    */
    @SerializedName("useTime")
    private Long useTime;
    /**
    * 是否量贩：0：不是，1：是
    */
    @SerializedName("volume")
    private Integer volume;

    public Double getBizCost() {
        return bizCost;
    }
    public void setBizCost(Double bizCost) {
        this.bizCost = bizCost;
    }
    public Double getBuyPrice() {
        return buyPrice;
    }
    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }
    public Double getCouponBuyPrice() {
        return couponBuyPrice;
    }
    public void setCouponBuyPrice(Double couponBuyPrice) {
        this.couponBuyPrice = couponBuyPrice;
    }
    public String getCouponCode() {
        return couponCode;
    }
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
    public Integer getDealId() {
        return dealId;
    }
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }
    public Double getDealValue() {
        return dealValue;
    }
    public void setDealValue(Double dealValue) {
        this.dealValue = dealValue;
    }
    public Double getDue() {
        return due;
    }
    public void setDue(Double due) {
        this.due = due;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Double getSingleValue() {
        return singleValue;
    }
    public void setSingleValue(Double singleValue) {
        this.singleValue = singleValue;
    }
    public Long getUseTime() {
        return useTime;
    }
    public void setUseTime(Long useTime) {
        this.useTime = useTime;
    }
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }




    @Override
    public String toString() {
        return "CouponTradeDetail{" + "bizCost=" + bizCost + "," + "buyPrice=" + buyPrice + "," + "couponBuyPrice=" + couponBuyPrice + "," + "couponCode=" + couponCode + "," + "dealId=" + dealId + "," + "dealValue=" + dealValue + "," + "due=" + due + "," + "orderId=" + orderId + "," + "singleValue=" + singleValue + "," + "useTime=" + useTime + "," + "volume=" + volume + "}";
    }
}
