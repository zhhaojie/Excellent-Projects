package com.meituan.sdk.model.wmoperNg.order.wmoperngGetOrderDetail;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Detail {
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    @NotBlank(message = "foodName不能为空")
    @SerializedName("food_name")
    private String foodName;
    @NotBlank(message = "skuId不能为空")
    @SerializedName("sku_id")
    private String skuId;
    @NotNull(message = "quantity不能为空")
    @SerializedName("quantity")
    private Double quantity;
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;
    @NotNull(message = "boxNum不能为空")
    @SerializedName("box_num")
    private Double boxNum;
    @NotNull(message = "boxPrice不能为空")
    @SerializedName("box_price")
    private Double boxPrice;
    @NotBlank(message = "unit不能为空")
    @SerializedName("unit")
    private String unit;
    @NotBlank(message = "foodProperty不能为空")
    @SerializedName("food_property")
    private String foodProperty;
    @NotBlank(message = "spec不能为空")
    @SerializedName("spec")
    private String spec;
    @NotNull(message = "mtSkuId不能为空")
    @SerializedName("mt_sku_id")
    private Long mtSkuId;
    @NotNull(message = "mtSpuId不能为空")
    @SerializedName("mt_spu_id")
    private Long mtSpuId;
    @NotNull(message = "mtTagId不能为空")
    @SerializedName("mt_tag_id")
    private Long mtTagId;
    @NotBlank(message = "tagName不能为空")
    @SerializedName("tag_name")
    private String tagName;

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
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public Double getQuantity() {
        return quantity;
    }
    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
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
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getFoodProperty() {
        return foodProperty;
    }
    public void setFoodProperty(String foodProperty) {
        this.foodProperty = foodProperty;
    }
    public String getSpec() {
        return spec;
    }
    public void setSpec(String spec) {
        this.spec = spec;
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
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }




    @Override
    public String toString() {
        return "Detail{" + "appFoodCode=" + appFoodCode + "," + "foodName=" + foodName + "," + "skuId=" + skuId + "," + "quantity=" + quantity + "," + "price=" + price + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "unit=" + unit + "," + "foodProperty=" + foodProperty + "," + "spec=" + spec + "," + "mtSkuId=" + mtSkuId + "," + "mtSpuId=" + mtSpuId + "," + "mtTagId=" + mtTagId + "," + "tagName=" + tagName + "}";
    }
}
