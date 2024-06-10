package com.meituan.sdk.model.tuangouNg.coupon.msSuperConsume;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 提供开放平台的验券接口，聚合商品数据信息
* This file was automatically generated.
*/
public class MsSuperConsumeResponse {
    /**
    * 验证券码数组
    */
    @SerializedName("couponCodes")
    private List<String> couponCodes;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 项目ID
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 券面值，即人们常说的市场价
    */
    @SerializedName("dealValue")
    private Float dealValue;
    /**
    * 开店宝套餐名
    */
    @SerializedName("rawTitle")
    private String rawTitle;
    /**
    * 开店宝商品列表标题
    */
    @SerializedName("platformTitle")
    private String platformTitle;
    /**
    * C端场景中提单页、支付结果页、查看券码和订单页面的项目标题以及开店宝核销后展示的标题。C端场景包括美团App，点评App，美团小程序
    */
    @SerializedName("shortAttrTitle")
    private String shortAttrTitle;
    /**
    * 第三方商品ID
    */
    @SerializedName("thirdProductId")
    private String thirdProductId;

    public List<String> getCouponCodes() {
        return couponCodes;
    }
    public void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }
    public String getDealTitle() {
        return dealTitle;
    }
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }
    public Integer getDealId() {
        return dealId;
    }
    public void setDealId(Integer dealId) {
        this.dealId = dealId;
    }
    public Float getDealValue() {
        return dealValue;
    }
    public void setDealValue(Float dealValue) {
        this.dealValue = dealValue;
    }
    public String getRawTitle() {
        return rawTitle;
    }
    public void setRawTitle(String rawTitle) {
        this.rawTitle = rawTitle;
    }
    public String getPlatformTitle() {
        return platformTitle;
    }
    public void setPlatformTitle(String platformTitle) {
        this.platformTitle = platformTitle;
    }
    public String getShortAttrTitle() {
        return shortAttrTitle;
    }
    public void setShortAttrTitle(String shortAttrTitle) {
        this.shortAttrTitle = shortAttrTitle;
    }
    public String getThirdProductId() {
        return thirdProductId;
    }
    public void setThirdProductId(String thirdProductId) {
        this.thirdProductId = thirdProductId;
    }




    @Override
    public String toString() {
        return "MsSuperConsumeResponse{" + "couponCodes=" + couponCodes + "," + "dealTitle=" + dealTitle + "," + "dealId=" + dealId + "," + "dealValue=" + dealValue + "," + "rawTitle=" + rawTitle + "," + "platformTitle=" + platformTitle + "," + "shortAttrTitle=" + shortAttrTitle + "," + "thirdProductId=" + thirdProductId + "}";
    }
}
