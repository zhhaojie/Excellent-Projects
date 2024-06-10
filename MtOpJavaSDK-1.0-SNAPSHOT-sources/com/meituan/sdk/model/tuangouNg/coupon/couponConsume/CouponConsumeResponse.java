package com.meituan.sdk.model.tuangouNg.coupon.couponConsume;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 执行验券
* This file was automatically generated.
*/
public class CouponConsumeResponse {
    /**
    * 验证券码数组
    */
    @SerializedName("couponCodes")
    private List<String> couponCodes;
    /**
    * 操作状态
    */
    @SerializedName("result")
    private Integer result;
    /**
    * 项目ID
    */
    @SerializedName("dealId")
    private Long dealId;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 美团门店ID
    */
    @SerializedName("poiid")
    private Long poiid;
    /**
    * 返回值消息
    */
    @SerializedName("message")
    private String message;
    /**
    * 开店宝套餐名
    */
    @SerializedName("rawTitle")
    private String rawTitle;
    /**
    * 团购项目在App端的展示标题
    */
    @SerializedName("platformTitle")
    private String platformTitle;
    /**
    * 券面值，即人们常说的市场价
    */
    @SerializedName("dealValue")
    private Double dealValue;

    public List<String> getCouponCodes() {
        return couponCodes;
    }
    public void setCouponCodes(List<String> couponCodes) {
        this.couponCodes = couponCodes;
    }
    public Integer getResult() {
        return result;
    }
    public void setResult(Integer result) {
        this.result = result;
    }
    public Long getDealId() {
        return dealId;
    }
    public void setDealId(Long dealId) {
        this.dealId = dealId;
    }
    public String getDealTitle() {
        return dealTitle;
    }
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }
    public Long getPoiid() {
        return poiid;
    }
    public void setPoiid(Long poiid) {
        this.poiid = poiid;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
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
    public Double getDealValue() {
        return dealValue;
    }
    public void setDealValue(Double dealValue) {
        this.dealValue = dealValue;
    }




    @Override
    public String toString() {
        return "CouponConsumeResponse{" + "couponCodes=" + couponCodes + "," + "result=" + result + "," + "dealId=" + dealId + "," + "dealTitle=" + dealTitle + "," + "poiid=" + poiid + "," + "message=" + message + "," + "rawTitle=" + rawTitle + "," + "platformTitle=" + platformTitle + "," + "dealValue=" + dealValue + "}";
    }
}
