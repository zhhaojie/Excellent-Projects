package com.meituan.sdk.model.tuangouNg.coupon.getCouponPriceInfo;

import com.google.gson.annotations.SerializedName;

/**
* 获取团购券交易快照
* This file was automatically generated.
*/
public class GetCouponPriceInfoResponse {
    /**
    * 团购券售卖价。用户交易成功时，商家开店宝设置的团购促销前的购买价格，单位：分
    */
    @SerializedName("salePrice")
    private Long salePrice;
    /**
    * 团购券面值或门市价。用户交易成功时，商家开店宝设置的团购券面值，单位：分
    */
    @SerializedName("originalPrice")
    private Long originalPrice;
    /**
    * 交易时间，即团购券交易成功时间，秒级
    */
    @SerializedName("buyTime")
    private Long buyTime;

    public Long getSalePrice() {
        return salePrice;
    }
    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }
    public Long getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Long originalPrice) {
        this.originalPrice = originalPrice;
    }
    public Long getBuyTime() {
        return buyTime;
    }
    public void setBuyTime(Long buyTime) {
        this.buyTime = buyTime;
    }




    @Override
    public String toString() {
        return "GetCouponPriceInfoResponse{" + "salePrice=" + salePrice + "," + "originalPrice=" + originalPrice + "," + "buyTime=" + buyTime + "}";
    }
}
