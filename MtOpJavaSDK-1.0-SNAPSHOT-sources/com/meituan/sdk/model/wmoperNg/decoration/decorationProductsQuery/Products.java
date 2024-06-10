package com.meituan.sdk.model.wmoperNg.decoration.decorationProductsQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Products {
    /**
    * ERP 商品id
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 商品名称
    */
    @SerializedName("food_name")
    private String foodName;
    /**
    * 图片url
    */
    @SerializedName("picture")
    private String picture;
    /**
    * 是否可选
    */
    @SerializedName("selectable")
    private Boolean selectable;

    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Boolean getSelectable() {
        return selectable;
    }
    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }




    @Override
    public String toString() {
        return "Products{" + "appFoodCode=" + appFoodCode + "," + "foodName=" + foodName + "," + "picture=" + picture + "," + "selectable=" + selectable + "}";
    }
}
