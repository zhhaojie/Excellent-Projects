package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class CouponInfoDTO {
    /**
    * 优惠抵扣金额
    */
    @SerializedName("couponAmount")
    private Long couponAmount;
    /**
    * 优惠类型
    */
    @SerializedName("couponType")
    private Long couponType;
    /**
    * 代金券对应的商品ID
    */
    @SerializedName("dealId")
    private Long dealId;
    /**
    * 扩展信息
    */
    @SerializedName("extraMessage")
    private String extraMessage;
    /**
    * 用户实付金额
    */
    @SerializedName("realPayAmount")
    private Long realPayAmount;
    /**
    * 优惠类型ID
    */
    @SerializedName("couponIdStr")
    private String couponIdStr;

    public Long getCouponAmount() {
        return couponAmount;
    }
    public void setCouponAmount(Long couponAmount) {
        this.couponAmount = couponAmount;
    }
    public Long getCouponType() {
        return couponType;
    }
    public void setCouponType(Long couponType) {
        this.couponType = couponType;
    }
    public Long getDealId() {
        return dealId;
    }
    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }
    public String getExtraMessage() {
        return extraMessage;
    }
    public void setExtraMessage(String extraMessage) {
        this.extraMessage = extraMessage;
    }
    public Long getRealPayAmount() {
        return realPayAmount;
    }
    public void setRealPayAmount(Long realPayAmount) {
        this.realPayAmount = realPayAmount;
    }
    public String getCouponIdStr() {
        return couponIdStr;
    }
    public void setCouponIdStr(String couponIdStr) {
        this.couponIdStr = couponIdStr;
    }




    @Override
    public String toString() {
        return "CouponInfoDTO{" + "couponAmount=" + couponAmount + "," + "couponType=" + couponType + "," + "dealId=" + dealId + "," + "extraMessage=" + extraMessage + "," + "realPayAmount=" + realPayAmount + "," + "couponIdStr=" + couponIdStr + "}";
    }
}
