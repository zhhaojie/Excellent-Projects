package com.meituan.sdk.model.tuangouNg.coupon.msSuperPrepare;

import com.google.gson.annotations.SerializedName;

/**
* 提供开放平台的预验券接口，聚合商品数据信息
* This file was automatically generated.
*/
public class MsSuperPrepareResponse {
    /**
    * 项目开始时间
    */
    @SerializedName("dealBeginTime")
    private String dealBeginTime;
    /**
    * 项目ID
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 券面值，即人们常说的市场价
    */
    @SerializedName("dealValue")
    private Double dealValue;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 最大可验证张数
    */
    @SerializedName("count")
    private Integer count;
    /**
    * 量贩项目的单张券原价（普通券单张券原价与项目总价相同
    */
    @SerializedName("singleValue")
    private Double singleValue;
    /**
    * 团购券价格，即商家促销前的券购买价格，如首次购买有更多优惠这类需要在开店宝设置的促销
    */
    @SerializedName("dealPrice")
    private Double dealPrice;
    /**
    * 套餐类券码对应套餐详细内容，代金券券码包含适用范围(如酒水除外)
    */
    @SerializedName("dealMenu")
    private String dealMenu;
    /**
    * 返回消息
    */
    @SerializedName("message")
    private String message;
    /**
    * 最小消费张数
    */
    @SerializedName("minConsume")
    private Integer minConsume;
    /**
    * 券码有效期
    */
    @SerializedName("couponEndTime")
    private String couponEndTime;
    /**
    * 是否量贩：0：不是，1：是
    */
    @SerializedName("volume")
    private Integer volume;
    /**
    * 操作状态,0表示成功
    */
    @SerializedName("result")
    private Integer result;
    /**
    * 券购买价,即用户在购买团购券时所付的实际价格，单张券的用户实付，由于优惠分摊不保证均摊，当Count=1时此字段可用；当Count>1此字段不可用
    */
    @SerializedName("couponBuyPrice")
    private Double couponBuyPrice;
    /**
    * 券码
    */
    @SerializedName("couponCode")
    private String couponCode;
    /**
    * 是否代金券,true代表代金券,false代表套餐券
    */
    @SerializedName("vourcher")
    private Boolean vourcher;
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
    * 第三方商品ID(三方上单填入）
    */
    @SerializedName("thirdProductId")
    private String thirdProductId;
    /**
    * C端场景中提单页、支付结果页、查看券码和订单页面的项目标题以及开店宝核销后展示的标题。C端场景包括美团App，点评App，美团小程序
    */
    @SerializedName("shortAttrTitle")
    private String shortAttrTitle;
    /**
    * 返参内容与dealMenu一致，仅解析结构不同
    */
    @SerializedName("dealMenuStd")
    private String dealMenuStd;

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
    public Double getDealValue() {
        return dealValue;
    }
    public void setDealValue(Double dealValue) {
        this.dealValue = dealValue;
    }
    public String getDealTitle() {
        return dealTitle;
    }
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Double getSingleValue() {
        return singleValue;
    }
    public void setSingleValue(Double singleValue) {
        this.singleValue = singleValue;
    }
    public Double getDealPrice() {
        return dealPrice;
    }
    public void setDealPrice(Double dealPrice) {
        this.dealPrice = dealPrice;
    }
    public String getDealMenu() {
        return dealMenu;
    }
    public void setDealMenu(String dealMenu) {
        this.dealMenu = dealMenu;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Integer getMinConsume() {
        return minConsume;
    }
    public void setMinConsume(Integer minConsume) {
        this.minConsume = minConsume;
    }
    public String getCouponEndTime() {
        return couponEndTime;
    }
    public void setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime;
    }
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public Integer getResult() {
        return result;
    }
    public void setResult(Integer result) {
        this.result = result;
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
    public Boolean getVourcher() {
        return vourcher;
    }
    public void setVourcher(Boolean vourcher) {
        this.vourcher = vourcher;
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
    public String getThirdProductId() {
        return thirdProductId;
    }
    public void setThirdProductId(String thirdProductId) {
        this.thirdProductId = thirdProductId;
    }
    public String getShortAttrTitle() {
        return shortAttrTitle;
    }
    public void setShortAttrTitle(String shortAttrTitle) {
        this.shortAttrTitle = shortAttrTitle;
    }
    public String getDealMenuStd() {
        return dealMenuStd;
    }
    public void setDealMenuStd(String dealMenuStd) {
        this.dealMenuStd = dealMenuStd;
    }




    @Override
    public String toString() {
        return "MsSuperPrepareResponse{" + "dealBeginTime=" + dealBeginTime + "," + "dealId=" + dealId + "," + "dealValue=" + dealValue + "," + "dealTitle=" + dealTitle + "," + "count=" + count + "," + "singleValue=" + singleValue + "," + "dealPrice=" + dealPrice + "," + "dealMenu=" + dealMenu + "," + "message=" + message + "," + "minConsume=" + minConsume + "," + "couponEndTime=" + couponEndTime + "," + "volume=" + volume + "," + "result=" + result + "," + "couponBuyPrice=" + couponBuyPrice + "," + "couponCode=" + couponCode + "," + "vourcher=" + vourcher + "," + "rawTitle=" + rawTitle + "," + "platformTitle=" + platformTitle + "," + "thirdProductId=" + thirdProductId + "," + "shortAttrTitle=" + shortAttrTitle + "," + "dealMenuStd=" + dealMenuStd + "}";
    }
}
