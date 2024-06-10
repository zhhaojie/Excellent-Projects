package com.meituan.sdk.model.waimaiNg.im.queryCoupon;

import com.google.gson.annotations.SerializedName;

/**
* 查询粉丝群发券信息
* This file was automatically generated.
*/
public class QueryCouponResponse {
    /**
    * 总页数
    */
    @SerializedName("totalPage")
    private Integer totalPage;
    /**
    * 总条数
    */
    @SerializedName("total")
    private Integer total;
    /**
    * 券配置ID
    */
    @SerializedName("couponConfigId")
    private String couponConfigId;
    /**
    * 券名称
    */
    @SerializedName("couponName")
    private String couponName;
    /**
    * 优惠券金额
    */
    @SerializedName("price")
    private Integer price;
    /**
    * 使用门槛
    */
    @SerializedName("limitPrice")
    private Integer limitPrice;
    /**
    * INIT(0,"处理中"), STARTED(1,"进行中"), FINISH(2,"已结束"), STOP(3,"已停止"),
    */
    @SerializedName("status")
    private Integer status;
    /**
    * 活动创建时间
    */
    @SerializedName("createTime")
    private String createTime;
    /**
    * 活动结束时间
    */
    @SerializedName("endTime")
    private String endTime;
    /**
    * 券领取后有效期，单位秒
    */
    @SerializedName("validTime")
    private Long validTime;
    /**
    * 剩余的券数量  等于总数-已领取的
    */
    @SerializedName("remain")
    private Integer remain;
    /**
    * 商品折扣，0到98，98代表0.98折
    */
    @SerializedName("discount")
    private Integer discount;
    /**
    * 商品名称
    */
    @SerializedName("skuName")
    private String skuName;
    /**
    * 券类型，1：门店满减券，2:商品券
    */
    @SerializedName("category")
    private Integer category;

    public Integer getTotalPage() {
        return totalPage;
    }
    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public String getCouponConfigId() {
        return couponConfigId;
    }
    public void setCouponConfigId(String couponConfigId) {
        this.couponConfigId = couponConfigId;
    }
    public String getCouponName() {
        return couponName;
    }
    public void setCouponName(String couponName) {
        this.couponName = couponName;
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
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public Long getValidTime() {
        return validTime;
    }
    public void setValidTime(Long validTime) {
        this.validTime = validTime;
    }
    public Integer getRemain() {
        return remain;
    }
    public void setRemain(Integer remain) {
        this.remain = remain;
    }
    public Integer getDiscount() {
        return discount;
    }
    public void setDiscount(Integer discount) {
        this.discount = discount;
    }
    public String getSkuName() {
        return skuName;
    }
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
    public Integer getCategory() {
        return category;
    }
    public void setCategory(Integer category) {
        this.category = category;
    }




    @Override
    public String toString() {
        return "QueryCouponResponse{" + "totalPage=" + totalPage + "," + "total=" + total + "," + "couponConfigId=" + couponConfigId + "," + "couponName=" + couponName + "," + "price=" + price + "," + "limitPrice=" + limitPrice + "," + "status=" + status + "," + "createTime=" + createTime + "," + "endTime=" + endTime + "," + "validTime=" + validTime + "," + "remain=" + remain + "," + "discount=" + discount + "," + "skuName=" + skuName + "," + "category=" + category + "}";
    }
}
