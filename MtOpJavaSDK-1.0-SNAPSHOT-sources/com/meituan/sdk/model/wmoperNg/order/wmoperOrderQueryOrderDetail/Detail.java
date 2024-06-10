package com.meituan.sdk.model.wmoperNg.order.wmoperOrderQueryOrderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 菜品信息
* This file was automatically generated.
*/
public class Detail {
    /**
    * 菜品code
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 餐盒数量
    */
    @SerializedName("box_num")
    private Double boxNum;
    /**
    * 餐盒价格
    */
    @SerializedName("box_price")
    private Double boxPrice;
    /**
    * 菜品名称
    */
    @SerializedName("food_name")
    private String foodName;
    /**
    * 菜品属性
    */
    @SerializedName("food_property")
    private String foodProperty;
    /**
    * 透传给第三方的偏移后的sku的id
    */
    @SerializedName("mt_sku_id")
    private Long mtSkuId;
    /**
    * 透传给第三方的偏移后的spu的id
    */
    @SerializedName("mt_spu_id")
    private Long mtSpuId;
    /**
    * 透传给第三方的偏移后的tag_id
    */
    @SerializedName("mt_tag_id")
    private Long mtTagId;
    /**
    * 商品单价
    */
    @SerializedName("price")
    private Double price;
    /**
    * 商品数量
    */
    @SerializedName("quantity")
    private Double quantity;
    /**
    * sku编码
    */
    @SerializedName("sku_id")
    private String skuId;
    /**
    * 菜品规格名称
    */
    @SerializedName("spec")
    private String spec;
    /**
    * 透传给第三方的tag_name
    */
    @SerializedName("tag_name")
    private String tagName;
    /**
    * 单位
    */
    @SerializedName("unit")
    private String unit;

    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public Double getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(Double boxNum) {
        this.boxNum = boxNum;
    }
    public Double getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(Double boxPrice) {
        this.boxPrice = boxPrice;
    }
    public String getFoodName() {
        return foodName;
    }
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
    public String getFoodProperty() {
        return foodProperty;
    }
    public void setFoodProperty(String foodProperty) {
        this.foodProperty = foodProperty;
    }
    public Long getMtSkuId() {
        return mtSkuId;
    }
    public void setMtSkuId(Long mtSkuId) {
        this.mtSkuId = mtSkuId;
    }
    public Long getMtSpuId() {
        return mtSpuId;
    }
    public void setMtSpuId(Long mtSpuId) {
        this.mtSpuId = mtSpuId;
    }
    public Long getMtTagId() {
        return mtTagId;
    }
    public void setMtTagId(Long mtTagId) {
        this.mtTagId = mtTagId;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public String getSpec() {
        return spec;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }




    @Override
    public String toString() {
        return "Detail{" + "appFoodCode=" + appFoodCode + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "foodName=" + foodName + "," + "foodProperty=" + foodProperty + "," + "mtSkuId=" + mtSkuId + "," + "mtSpuId=" + mtSpuId + "," + "mtTagId=" + mtTagId + "," + "price=" + price + "," + "quantity=" + quantity + "," + "skuId=" + skuId + "," + "spec=" + spec + "," + "tagName=" + tagName + "," + "unit=" + unit + "}";
    }
}
