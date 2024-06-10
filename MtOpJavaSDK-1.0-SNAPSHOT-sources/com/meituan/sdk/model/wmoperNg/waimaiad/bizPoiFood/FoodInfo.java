package com.meituan.sdk.model.wmoperNg.waimaiad.bizPoiFood;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class FoodInfo {
    @SerializedName("wmFoodId")
    private Long wmFoodId;
    @SerializedName("foodName")
    private String foodName;
    @SerializedName("foodPrice")
    private Long foodPrice;
    @SerializedName("originFoodPrice")
    private Long originFoodPrice;
    @SerializedName("foodSaleCnt")
    private Long foodSaleCnt;
    @SerializedName("foodSaleAmt")
    private Long foodSaleAmt;
    @SerializedName("dt")
    private Long dt;

    public Long getWmFoodId() {
        return wmFoodId;
    }
    public void setWmFoodId(Long wmFoodId) {
        this.wmFoodId = wmFoodId;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public Long getFoodPrice() {
        return foodPrice;
    }
    public void setFoodPrice(Long foodPrice) {
        this.foodPrice = foodPrice;
    }
    public Long getOriginFoodPrice() {
        return originFoodPrice;
    }
    public void setOriginFoodPrice(Long originFoodPrice) {
        this.originFoodPrice = originFoodPrice;
    }
    public Long getFoodSaleCnt() {
        return foodSaleCnt;
    }
    public void setFoodSaleCnt(Long foodSaleCnt) {
        this.foodSaleCnt = foodSaleCnt;
    }
    public Long getFoodSaleAmt() {
        return foodSaleAmt;
    }
    public void setFoodSaleAmt(Long foodSaleAmt) {
        this.foodSaleAmt = foodSaleAmt;
    }
    public Long getDt() {
        return dt;
    }
    public void setDt(Long dt) {
        this.dt = dt;
    }




    @Override
    public String toString() {
        return "FoodInfo{" + "wmFoodId=" + wmFoodId + "," + "foodName=" + foodName + "," + "foodPrice=" + foodPrice + "," + "originFoodPrice=" + originFoodPrice + "," + "foodSaleCnt=" + foodSaleCnt + "," + "foodSaleAmt=" + foodSaleAmt + "," + "dt=" + dt + "}";
    }
}
