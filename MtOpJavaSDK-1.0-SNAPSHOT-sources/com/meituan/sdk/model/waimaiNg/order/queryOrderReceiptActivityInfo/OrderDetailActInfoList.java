package com.meituan.sdk.model.waimaiNg.order.queryOrderReceiptActivityInfo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 商品优惠分摊信息
* This file was automatically generated.
*/
public class OrderDetailActInfoList {
    /**
    * APP方菜品id
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * sku编码
    */
    @SerializedName("sku_id")
    private String skuId;
    /**
    * sku总数量
    */
    @SerializedName("sku_num")
    private Integer skuNum;
    /**
    * 商品原价
    */
    @SerializedName("origin_price")
    private Double originPrice;
    /**
    * sku优惠前总金额
    */
    @SerializedName("total_origin_price")
    private Double totalOriginPrice;
    /**
    * sku优惠后总金额
    */
    @SerializedName("total_activity_price")
    private Double totalActivityPrice;
    /**
    * sku总优惠金额
    */
    @SerializedName("total_reduce_price")
    private Double totalReducePrice;
    /**
    * sku优惠后平均金额
    */
    @SerializedName("activity_price")
    private Double activityPrice;
    /**
    * 该sku非商家承担活动总金额
    */
    @SerializedName("total_mt_charge")
    private Double totalMtCharge;
    /**
    * 该sku商家承担活动总金额
    */
    @SerializedName("total_poi_charge")
    private Double totalPoiCharge;
    /**
    * 该sku总餐盒费
    */
    @SerializedName("total_box_price")
    private Double totalBoxPrice;
    /**
    * 该sku单商品餐盒费
    */
    @SerializedName("box_price")
    private Double boxPrice;
    /**
    * 该sku单商品的餐盒数
    */
    @SerializedName("box_num")
    private Double boxNum;
    /**
    * 该sku参与的所有活动情况
    */
    @SerializedName("activities")
    private List<Activities> activities;

    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public Integer getSkuNum() {
        return skuNum;
    }
    public void setSkuNum(Integer skuNum) {
        this.skuNum = skuNum;
    }
    public Double getOriginPrice() {
        return originPrice;
    }
    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }
    public Double getTotalOriginPrice() {
        return totalOriginPrice;
    }
    public void setTotalOriginPrice(Double totalOriginPrice) {
        this.totalOriginPrice = totalOriginPrice;
    }
    public Double getTotalActivityPrice() {
        return totalActivityPrice;
    }
    public void setTotalActivityPrice(Double totalActivityPrice) {
        this.totalActivityPrice = totalActivityPrice;
    }
    public Double getTotalReducePrice() {
        return totalReducePrice;
    }
    public void setTotalReducePrice(Double totalReducePrice) {
        this.totalReducePrice = totalReducePrice;
    }
    public Double getActivityPrice() {
        return activityPrice;
    }
    public void setActivityPrice(Double activityPrice) {
        this.activityPrice = activityPrice;
    }
    public Double getTotalMtCharge() {
        return totalMtCharge;
    }
    public void setTotalMtCharge(Double totalMtCharge) {
        this.totalMtCharge = totalMtCharge;
    }
    public Double getTotalPoiCharge() {
        return totalPoiCharge;
    }
    public void setTotalPoiCharge(Double totalPoiCharge) {
        this.totalPoiCharge = totalPoiCharge;
    }
    public Double getTotalBoxPrice() {
        return totalBoxPrice;
    }
    public void setTotalBoxPrice(Double totalBoxPrice) {
        this.totalBoxPrice = totalBoxPrice;
    }
    public Double getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(Double boxPrice) {
        this.boxPrice = boxPrice;
    }
    public Double getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(Double boxNum) {
        this.boxNum = boxNum;
    }
    public List<Activities> getActivities() {
        return activities;
    }
    public void setActivities(List<Activities> activities) {
        this.activities = activities;
    }




    @Override
    public String toString() {
        return "OrderDetailActInfoList{" + "appFoodCode=" + appFoodCode + "," + "skuId=" + skuId + "," + "skuNum=" + skuNum + "," + "originPrice=" + originPrice + "," + "totalOriginPrice=" + totalOriginPrice + "," + "totalActivityPrice=" + totalActivityPrice + "," + "totalReducePrice=" + totalReducePrice + "," + "activityPrice=" + activityPrice + "," + "totalMtCharge=" + totalMtCharge + "," + "totalPoiCharge=" + totalPoiCharge + "," + "totalBoxPrice=" + totalBoxPrice + "," + "boxPrice=" + boxPrice + "," + "boxNum=" + boxNum + "," + "activities=" + activities + "}";
    }
}
