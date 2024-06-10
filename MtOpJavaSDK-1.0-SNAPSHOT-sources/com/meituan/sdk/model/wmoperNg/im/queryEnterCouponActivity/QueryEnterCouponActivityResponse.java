package com.meituan.sdk.model.wmoperNg.im.queryEnterCouponActivity;

import com.google.gson.annotations.SerializedName;

/**
* 查询当前的进群领券活动
* This file was automatically generated.
*/
public class QueryEnterCouponActivityResponse {
    /**
    * 查询游标
    */
    @SerializedName("index")
    private Long index;
    /**
    * 是否还有记录
    */
    @SerializedName("hasMore")
    private Boolean hasMore;
    /**
    * 活动ID
    */
    @SerializedName("activityId")
    private Long activityId;
    /**
    * 优惠券金额 单位元
    */
    @SerializedName("price")
    private Integer price;
    /**
    * 优惠券门槛 单位元
    */
    @SerializedName("limitPrice")
    private Integer limitPrice;
    /**
    * 有效性：-1无效，1有效
    */
    @SerializedName("valid")
    private Integer valid;
    /**
    * 券有效期 7代表7天
    */
    @SerializedName("validity")
    private Integer validity;
    /**
    * 券创建时间（秒）
    */
    @SerializedName("cTime")
    private Integer cTime;
    /**
    * 券结束时间，未结束为0（秒）
    */
    @SerializedName("endTime")
    private Integer endTime;

    public Long getIndex() {
        return index;
    }
    public void setIndex(Long index) {
        this.index = index;
    }
    public Boolean getHasMore() {
        return hasMore;
    }
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
    public Long getActivityId() {
        return activityId;
    }
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getLimitPrice() {
        return limitPrice;
    }
    public void setLimitPrice(Integer limitPrice) {
        this.limitPrice = limitPrice;
    }
    public Integer getValid() {
        return valid;
    }
    public void setValid(Integer valid) {
        this.valid = valid;
    }
    public Integer getValidity() {
        return validity;
    }
    public void setValidity(Integer validity) {
        this.validity = validity;
    }
    public Integer getCTime() {
        return cTime;
    }
    public void setCTime(Integer cTime) {
        this.cTime = cTime;
    }
    public Integer getEndTime() {
        return endTime;
    }
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }




    @Override
    public String toString() {
        return "QueryEnterCouponActivityResponse{" + "index=" + index + "," + "hasMore=" + hasMore + "," + "activityId=" + activityId + "," + "price=" + price + "," + "limitPrice=" + limitPrice + "," + "valid=" + valid + "," + "validity=" + validity + "," + "cTime=" + cTime + "," + "endTime=" + endTime + "}";
    }
}
