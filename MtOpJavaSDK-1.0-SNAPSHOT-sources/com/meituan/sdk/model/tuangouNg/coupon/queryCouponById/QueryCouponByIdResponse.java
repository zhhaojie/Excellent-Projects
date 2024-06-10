package com.meituan.sdk.model.tuangouNg.coupon.queryCouponById;

import com.google.gson.annotations.SerializedName;

/**
* 已验券码查询
* This file was automatically generated.
*/
public class QueryCouponByIdResponse {
    /**
    * 团购券码购买价格
    */
    @SerializedName("couponBuyPrice")
    private Double couponBuyPrice;
    /**
    * 券码是否可撤销，表示可撤销，0表示不可撤销
    */
    @SerializedName("couponCancelStatus")
    private Integer couponCancelStatus;
    /**
    * 券码
    */
    @SerializedName("couponCode")
    private String couponCode;
    /**
    * 券状态
    */
    @SerializedName("couponStatusDesc")
    private String couponStatusDesc;
    /**
    * 券码使用时间
    */
    @SerializedName("couponUseTime")
    private String couponUseTime;
    /**
    * 项目开始时间
    */
    @SerializedName("dealBeginTime")
    private String dealBeginTime;
    /**
    * 项目id
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 市场价
    */
    @SerializedName("dealValue")
    private Double dealValue;
    /**
    * 是否代金券，代表代金券,false代表套餐券
    */
    @SerializedName("isVoucher")
    private Boolean isVoucher;
    /**
    * 量贩项目的单张券原价（普通券单张券原价与项目总价相同）
    */
    @SerializedName("singleValue")
    private Double singleValue;
    /**
    * 验券帐号
    */
    @SerializedName("verifyAcct")
    private String verifyAcct;
    /**
    * 验券方式
    */
    @SerializedName("verifyType")
    private String verifyType;
    /**
    * 是否量贩：0：不是，1：是
    */
    @SerializedName("volume")
    private Integer volume;

    public Double getCouponBuyPrice() {
        return couponBuyPrice;
    }
    public void setCouponBuyPrice(Double couponBuyPrice) {
        this.couponBuyPrice = couponBuyPrice;
    }
    public Integer getCouponCancelStatus() {
        return couponCancelStatus;
    }
    public void setCouponCancelStatus(Integer couponCancelStatus) {
        this.couponCancelStatus = couponCancelStatus;
    }
    public String getCouponCode() {
        return couponCode;
    }
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }
    public String getCouponStatusDesc() {
        return couponStatusDesc;
    }
    public void setCouponStatusDesc(String couponStatusDesc) {
        this.couponStatusDesc = couponStatusDesc;
    }
    public String getCouponUseTime() {
        return couponUseTime;
    }
    public void setCouponUseTime(String couponUseTime) {
        this.couponUseTime = couponUseTime;
    }
    public String getDealBeginTime() {
        return dealBeginTime;
    }
    public void setDealBeginTime(String dealBeginTime) {
        this.dealBeginTime = dealBeginTime;
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
    public Double getDealValue() {
        return dealValue;
    }
    public void setDealValue(Double dealValue) {
        this.dealValue = dealValue;
    }
    public Boolean getIsVoucher() {
        return isVoucher;
    }
    public void setIsVoucher(Boolean isVoucher) {
        this.isVoucher = isVoucher;
    }
    public Double getSingleValue() {
        return singleValue;
    }
    public void setSingleValue(Double singleValue) {
        this.singleValue = singleValue;
    }
    public String getVerifyAcct() {
        return verifyAcct;
    }
    public void setVerifyAcct(String verifyAcct) {
        this.verifyAcct = verifyAcct;
    }
    public String getVerifyType() {
        return verifyType;
    }
    public void setVerifyType(String verifyType) {
        this.verifyType = verifyType;
    }
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }




    @Override
    public String toString() {
        return "QueryCouponByIdResponse{" + "couponBuyPrice=" + couponBuyPrice + "," + "couponCancelStatus=" + couponCancelStatus + "," + "couponCode=" + couponCode + "," + "couponStatusDesc=" + couponStatusDesc + "," + "couponUseTime=" + couponUseTime + "," + "dealBeginTime=" + dealBeginTime + "," + "dealId=" + dealId + "," + "dealTitle=" + dealTitle + "," + "dealValue=" + dealValue + "," + "isVoucher=" + isVoucher + "," + "singleValue=" + singleValue + "," + "verifyAcct=" + verifyAcct + "," + "verifyType=" + verifyType + "," + "volume=" + volume + "}";
    }
}
