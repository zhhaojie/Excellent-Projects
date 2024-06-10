package com.meituan.sdk.model.tuangouNg.coupon.couponQueryListByDate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class CouponCodes {
    /**
    * 团购券购买价格
    */
    @NotNull(message = "couponBuyPrice不能为空")
    @SerializedName("couponBuyPrice")
    private Double couponBuyPrice;
    /**
    * 团购券是否可撤销。1表示可撤销，0表示不可撤销
    */
    @NotNull(message = "couponCancelStatus不能为空")
    @SerializedName("couponCancelStatus")
    private Long couponCancelStatus;
    /**
    * 团购券码
    */
    @NotBlank(message = "couponCode不能为空")
    @SerializedName("couponCode")
    private String couponCode;
    /**
    * 团购券状态，包含：未使用、已使用、已冻结、作弊已冻结、已退款
    */
    @NotBlank(message = "couponStatusDesc不能为空")
    @SerializedName("couponStatusDesc")
    private String couponStatusDesc;
    /**
    * 验券时间
    */
    @NotBlank(message = "couponUseTime不能为空")
    @SerializedName("couponUseTime")
    private String couponUseTime;
    /**
    * 团购券对应项目开始售卖时间
    */
    @NotBlank(message = "dealBeginTime不能为空")
    @SerializedName("dealBeginTime")
    private String dealBeginTime;
    /**
    * 项目对应的标题
    */
    @NotBlank(message = "dealTitle不能为空")
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 项目售卖价
    */
    @NotNull(message = "dealValue不能为空")
    @SerializedName("dealValue")
    private Double dealValue;
    @NotNull(message = "isVerifyPay不能为空")
    @SerializedName("isVerifyPay")
    private Long isVerifyPay;
    @NotNull(message = "isVoucher不能为空")
    @SerializedName("isVoucher")
    private Boolean isVoucher;
    /**
    * 验券帐号
    */
    @NotBlank(message = "verifyAcct不能为空")
    @SerializedName("verifyAcct")
    private String verifyAcct;
    /**
    * 验券方式
    */
    @NotBlank(message = "verifyType不能为空")
    @SerializedName("verifyType")
    private String verifyType;

    public Double getCouponBuyPrice() {
        return couponBuyPrice;
    }
    public void setCouponBuyPrice(Double couponBuyPrice) {
        this.couponBuyPrice = couponBuyPrice;
    }
    public Long getCouponCancelStatus() {
        return couponCancelStatus;
    }
    public void setCouponCancelStatus(Long couponCancelStatus) {
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
    public Long getIsVerifyPay() {
        return isVerifyPay;
    }
    public void setIsVerifyPay(Long isVerifyPay) {
        this.isVerifyPay = isVerifyPay;
    }
    public Boolean getIsVoucher() {
        return isVoucher;
    }
    public void setIsVoucher(Boolean isVoucher) {
        this.isVoucher = isVoucher;
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




    @Override
    public String toString() {
        return "CouponCodes{" + "couponBuyPrice=" + couponBuyPrice + "," + "couponCancelStatus=" + couponCancelStatus + "," + "couponCode=" + couponCode + "," + "couponStatusDesc=" + couponStatusDesc + "," + "couponUseTime=" + couponUseTime + "," + "dealBeginTime=" + dealBeginTime + "," + "dealTitle=" + dealTitle + "," + "dealValue=" + dealValue + "," + "isVerifyPay=" + isVerifyPay + "," + "isVoucher=" + isVoucher + "," + "verifyAcct=" + verifyAcct + "," + "verifyType=" + verifyType + "}";
    }
}
