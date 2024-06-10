package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDealQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * 团单id
    */
    @SerializedName("dealId")
    private Integer dealId;
    /**
    * 市场价格
    */
    @SerializedName("dealValue")
    private Double dealValue;
    /**
    * 团单名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 团单开始售卖时间戳，单位秒
    */
    @SerializedName("beginTime")
    private Long beginTime;
    /**
    * 售卖价格
    */
    @SerializedName("dealPrice")
    private Double dealPrice;
    /**
    * 团单状态
    */
    @SerializedName("dealStatus")
    private Integer dealStatus;
    /**
    * 团单结束售卖时间戳，单位秒
    */
    @SerializedName("endTime")
    private Long endTime;
    /**
    * json字符串数组
    */
    @SerializedName("dealMenu")
    private String dealMenu;
    /**
    * 是否是代金券，true为代金券，false为套餐券
    */
    @SerializedName("isVoucher")
    private Boolean isVoucher;
    /**
    * 第三方Id(商家商品ID)
    */
    @SerializedName("productThirdPartyId")
    private String productThirdPartyId;

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
    public Integer getDealStatus() {
        return dealStatus;
    }
    public void setDealStatus(Integer dealStatus) {
        this.dealStatus = dealStatus;
    }
    public Long getEndTime() {
        return endTime;
    }
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
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
    public String getProductThirdPartyId() {
        return productThirdPartyId;
    }
    public void setProductThirdPartyId(String productThirdPartyId) {
        this.productThirdPartyId = productThirdPartyId;
    }




    @Override
    public String toString() {
        return "Data{" + "dealId=" + dealId + "," + "dealValue=" + dealValue + "," + "dealTitle=" + dealTitle + "," + "beginTime=" + beginTime + "," + "dealPrice=" + dealPrice + "," + "dealStatus=" + dealStatus + "," + "endTime=" + endTime + "," + "dealMenu=" + dealMenu + "," + "isVoucher=" + isVoucher + "," + "productThirdPartyId=" + productThirdPartyId + "}";
    }
}
