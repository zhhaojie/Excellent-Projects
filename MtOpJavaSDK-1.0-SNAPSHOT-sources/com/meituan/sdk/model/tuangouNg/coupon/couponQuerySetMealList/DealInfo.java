package com.meituan.sdk.model.tuangouNg.coupon.couponQuerySetMealList;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DealInfo {
    /**
    * 项目结束时间戳，单位是秒
    */
    @SerializedName("dealEndTime")
    private Long dealEndTime;
    /**
    * 项目ID
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 市场价格
    */
    @SerializedName("dealValue")
    private Double dealValue;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 请求的套餐状态
    */
    @SerializedName("dealStatus")
    private Integer dealStatus;
    /**
    * 项目开始时间戳，单位是秒
    */
    @SerializedName("beginTime")
    private Long beginTime;
    /**
    * 售卖价格
    */
    @SerializedName("dealPrice")
    private Double dealPrice;
    /**
    * json字符串数组
    */
    @SerializedName("dealMenu")
    private String dealMenu;
    /**
    * 是否是代金券，true为代金券，false为套餐
    */
    @SerializedName("isVoucher")
    private Boolean isVoucher;
    /**
    * C端项目名称
    */
    @SerializedName("platformDealTitle")
    private String platformDealTitle;

    public Long getDealEndTime() {
        return dealEndTime;
    }
    public void setDealEndTime(Long dealEndTime) {
        this.dealEndTime = dealEndTime;
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
    public Integer getDealStatus() {
        return dealStatus;
    }
    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }
    public Long getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
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
    public Boolean getIsVoucher() {
        return isVoucher;
    }
    public void setIsVoucher(Boolean isVoucher) {
        this.isVoucher = isVoucher;
    }
    public String getPlatformDealTitle() {
        return platformDealTitle;
    }
    public void setPlatformDealTitle(String platformDealTitle) {
        this.platformDealTitle = platformDealTitle;
    }




    @Override
    public String toString() {
        return "DealInfo{" + "dealEndTime=" + dealEndTime + "," + "dealId=" + dealId + "," + "dealValue=" + dealValue + "," + "dealTitle=" + dealTitle + "," + "dealStatus=" + dealStatus + "," + "beginTime=" + beginTime + "," + "dealPrice=" + dealPrice + "," + "dealMenu=" + dealMenu + "," + "isVoucher=" + isVoucher + "," + "platformDealTitle=" + platformDealTitle + "}";
    }
}
