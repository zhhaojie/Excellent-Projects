package com.meituan.sdk.model.waimaiNg.act.actDiscountList;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DiscountInfo {
    /**
    * 折扣价格，单位元
    */
    @SerializedName("act_price")
    private Double actPrice;
    /**
    * APP方商品id
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 当日活动库存，-1表示无限库存
    */
    @SerializedName("day_limit")
    private Integer dayLimit;
    /**
    * 活动开始时间，单位秒
    */
    @SerializedName("start_time")
    private Integer startTime;
    /**
    * 活动结束时间，单位秒
    */
    @SerializedName("end_time")
    private Integer endTime;
    /**
    * 每单限购
    */
    @SerializedName("order_limit")
    private Integer orderLimit;
    /**
    * 生效时间段，多个用英文逗号分隔，最多支持3个时间段
    */
    @SerializedName("period")
    private String period;
    /**
    * 参与活动的用户类型，0为不限制，1为新用户，2为老用户
    */
    @SerializedName("user_type")
    private Integer userType;
    /**
    * 生效活动周期，1-7表示周一至周日，多个星期用英文逗号分隔
    */
    @SerializedName("weeks_time")
    private String weeksTime;
    /**
    * 商品名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 商品原价，单位元
    */
    @SerializedName("origin_price")
    private Double originPrice;
    /**
    * 当日剩余可购买数
    */
    @SerializedName("stock")
    private Integer stock;
    /**
    * 活动状态，2表示待生效，1表示生效，0表示过期
    */
    @SerializedName("status")
    private Integer status;

    public Double getActPrice() {
        return actPrice;
    }
    public void setActPrice(Double actPrice) {
        this.actPrice = actPrice;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public Integer getDayLimit() {
        return dayLimit;
    }
    public void setDayLimit(Integer dayLimit) {
        this.dayLimit = dayLimit;
    }
    public Integer getStartTime() {
        return startTime;
    }
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
    public Integer getEndTime() {
        return endTime;
    }
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
    public Integer getOrderLimit() {
        return orderLimit;
    }
    public void setOrderLimit(Integer orderLimit) {
        this.orderLimit = orderLimit;
    }
    public String getPeriod() {
        return period;
    }
    public void setPeriod(String period) {
        this.period = period;
    }
    public Integer getUserType() {
        return userType;
    }
    public void setUserType(Integer userType) {
        this.userType = userType;
    }
    public String getWeeksTime() {
        return weeksTime;
    }
    public void setWeeksTime(String weeksTime) {
        this.weeksTime = weeksTime;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getOriginPrice() {
        return originPrice;
    }
    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "DiscountInfo{" + "actPrice=" + actPrice + "," + "appFoodCode=" + appFoodCode + "," + "dayLimit=" + dayLimit + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "orderLimit=" + orderLimit + "," + "period=" + period + "," + "userType=" + userType + "," + "weeksTime=" + weeksTime + "," + "name=" + name + "," + "originPrice=" + originPrice + "," + "stock=" + stock + "," + "status=" + status + "}";
    }
}
