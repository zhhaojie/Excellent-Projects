package com.meituan.sdk.model.tuangouNg.coupon.queryReceiptsByReceiptIds;

import com.google.gson.annotations.SerializedName;

/**
* 团购券优惠
* This file was automatically generated.
*/
public class ReceiptPromotionDTO {
    @SerializedName("promotionId")
    private String promotionId;
    @SerializedName("activityProductId")
    private Integer activityProductId;
    @SerializedName("promotionType")
    private Integer promotionType;
    @SerializedName("bizReduce")
    private String bizReduce;

    public String getPromotionId() {
        return promotionId;
    }
    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }
    public Integer getActivityProductId() {
        return activityProductId;
    }
    public void setActivityProductId(Integer activityProductId) {
        this.activityProductId = activityProductId;
    }
    public Integer getPromotionType() {
        return promotionType;
    }
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }
    public String getBizReduce() {
        return bizReduce;
    }
    public void setBizReduce(String bizReduce) {
        this.bizReduce = bizReduce;
    }




    @Override
    public String toString() {
        return "ReceiptPromotionDTO{" + "promotionId=" + promotionId + "," + "activityProductId=" + activityProductId + "," + "promotionType=" + promotionType + "," + "bizReduce=" + bizReduce + "}";
    }
}
