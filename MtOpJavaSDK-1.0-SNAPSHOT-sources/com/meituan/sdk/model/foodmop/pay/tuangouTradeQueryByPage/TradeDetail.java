package com.meituan.sdk.model.foodmop.pay.tuangouTradeQueryByPage;

import com.google.gson.annotations.SerializedName;

/**
* 流水数据，查询成功时返回
* This file was automatically generated.
*/
public class TradeDetail {
    /**
    * 美团券码，bizType=10团购业务  买单订单号,bizType=20买单业务  点餐订单号，biztype=40点餐业务
    */
    @SerializedName("couponCode")
    private String couponCode;
    /**
    * 美团团单ID，bizType=10  买单项目ID，bizType=20  不传，bizType=40
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 美团团单名称,bizType in (10,20)有值  不传，bizType=40点餐
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 原价，单位元，保留两位小数  bizType=40点餐，为0.00
    */
    @SerializedName("originalPrice")
    private Double originalPrice;
    /**
    * 券售价/买单消费金额，单位元，保留两位小数  bizType=40点餐，为0.00
    */
    @SerializedName("salePrice")
    private Double salePrice;
    /**
    * 服务费，单位元，保留两位小数  bizType=10团购，服务费=售价salePrice - 进价buyPrice；  bizType=20买单，美团扣除的商家佣金  bizType=40点餐，美团扣除的商家佣金，actType为10消费时为正数，20撤销消费为负数
    */
    @SerializedName("serviceFee")
    private Double serviceFee;
    /**
    * 商家优惠，单位元，保留两位小数  bizType=40点餐，商户优惠，actType为10消费时为正数，20撤销消费为负数
    */
    @SerializedName("bizCost")
    private Double bizCost;
    /**
    * 结算金额，单位元，保留两位小数  bizType=10团购，结算金额=进价 buyPrice- 商家优惠bizCost；  bizType=20买单，结算金额即指商家实际到账的钱  bizType=40点餐，结算金额即指商家实际到账的钱，actType为10消费时为正数，20撤销消费为负数
    */
    @SerializedName("settlementAmount")
    private Double settlementAmount;
    /**
    * 进价，单位元，保留两位小数  bizType=40点餐，为0.00
    */
    @SerializedName("buyprice")
    private Double buyprice;
    /**
    * 退款金额，单位元，保留两位小数  bizType=40点餐，退款金额，actType为10消费时为0.00，20撤销消费为0.00
    */
    @SerializedName("bizRefund")
    private Double bizRefund;
    /**
    * 流水类型  10 : 消费  20 : 撤销消费  30 : 已消费退  40 : 购买  50 : 未消费退
    */
    @SerializedName("actType")
    private Integer actType;
    /**
    * 交易流水发生时间，毫秒时间戳，需要转换成日期格式，需使用北京时间，即UTC+8时区  具体释义视actType（流水类型）字段取值而定 例：若actType=10，即消费流水，则actTime为消费时间；若actType=20，即撤销消费流水，则actTime为撤销消费时间；其余取值情况以此类推
    */
    @SerializedName("actTime")
    private String actTime;
    /**
    * 收益时间，毫秒时间戳，需要转换成日期格式，需使用北京时间，即UTC+8时区
    */
    @SerializedName("clearTime")
    private String clearTime;
    /**
    * 美团门店Id,Long类型
    */
    @SerializedName("poiIdL")
    private Long poiIdL;
    /**
    * 收银门店Id即商家门店Id
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * 收银订单号  bizType=10且券码用于点餐，必传，即商家点餐订单号（当商家点餐拒单或未接单，则该值为空）  bizType=10且券码未用于点餐，非必传，即商家上传的商家订单号  当BizType=40即点餐业务时，该字段必传，表示商家点餐订单号
    */
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * 扩展信息
    */
    @SerializedName("extendInfo")
    private ExtendInfo extendInfo;

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
    public String getDealTitle() {
        return dealTitle;
    }
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }
    public Double getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }
    public Double getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }
    public Double getServiceFee() {
        return serviceFee;
    }
    public void setServiceFee(Double serviceFee) {
        this.serviceFee = serviceFee;
    }
    public Double getBizCost() {
        return bizCost;
    }
    public void setBizCost(Double bizCost) {
        this.bizCost = bizCost;
    }
    public Double getSettlementAmount() {
        return settlementAmount;
    }
    public void setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }
    public Double getBuyprice() {
        return buyprice;
    }
    public void setBuyprice(Double buyprice) {
        this.buyprice = buyprice;
    }
    public Double getBizRefund() {
        return bizRefund;
    }
    public void setBizRefund(Double bizRefund) {
        this.bizRefund = bizRefund;
    }
    public Integer getActType() {
        return actType;
    }
    public void setActType(Integer actType) {
        this.actType = actType;
    }
    public String getActTime() {
        return actTime;
    }
    public void setActTime(String actTime) {
        this.actTime = actTime;
    }
    public String getClearTime() {
        return clearTime;
    }
    public void setClearTime(String clearTime) {
        this.clearTime = clearTime;
    }
    public Long getPoiIdL() {
        return poiIdL;
    }
    public void setPoiIdL(Long poiIdL) {
        this.poiIdL = poiIdL;
    }
    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public String getVendorOrderId() {
        return vendorOrderId;
    }
    public void setVendorOrderId(String vendorOrderId) {
        this.vendorOrderId = vendorOrderId;
    }
    public ExtendInfo getExtendInfo() {
        return extendInfo;
    }
    public void setExtendInfo(ExtendInfo extendInfo) {
        this.extendInfo = extendInfo;
    }




    @Override
    public String toString() {
        return "TradeDetail{" + "couponCode=" + couponCode + "," + "dealId=" + dealId + "," + "dealTitle=" + dealTitle + "," + "originalPrice=" + originalPrice + "," + "salePrice=" + salePrice + "," + "serviceFee=" + serviceFee + "," + "bizCost=" + bizCost + "," + "settlementAmount=" + settlementAmount + "," + "buyprice=" + buyprice + "," + "bizRefund=" + bizRefund + "," + "actType=" + actType + "," + "actTime=" + actTime + "," + "clearTime=" + clearTime + "," + "poiIdL=" + poiIdL + "," + "vendorShopId=" + vendorShopId + "," + "vendorOrderId=" + vendorOrderId + "," + "extendInfo=" + extendInfo + "}";
    }
}
