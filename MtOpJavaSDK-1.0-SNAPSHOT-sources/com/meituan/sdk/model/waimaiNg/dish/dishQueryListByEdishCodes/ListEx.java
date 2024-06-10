package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEdishCodes;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 数据
* This file was automatically generated.
*/
public class ListEx {
    /**
    * 餐盒数量
    */
    @SerializedName("boxNum")
    private Float boxNum;
    /**
    * 餐盒单价
    */
    @SerializedName("boxPrice")
    private Float boxPrice;
    /**
    * 菜品分类
    */
    @SerializedName("categoryName")
    private String categoryName;
    /**
    * 菜品描述
    */
    @SerializedName("description")
    private String description;
    @NotNull(message = "dishId不能为空")
    @SerializedName("dishId")
    private Long dishId;
    /**
    * 菜名
    */
    @SerializedName("dishName")
    private String dishName;
    /**
    * ERP方菜品Id
    */
    @SerializedName("eDishCode")
    private String eDishCode;
    @NotBlank(message = "epoiId不能为空")
    @SerializedName("epoiId")
    private String epoiId;
    @NotNull(message = "foodId不能为空")
    @SerializedName("foodId")
    private Long foodId;
    /**
    * 菜品上下架状态，0表上架，1表下架
    */
    @SerializedName("isSoldOut")
    private Integer isSoldOut;
    @NotNull(message = "maxOrderCount不能为空")
    @SerializedName("maxOrderCount")
    private Long maxOrderCount;
    /**
    * 最小购买数量
    */
    @SerializedName("minOrderCount")
    private Integer minOrderCount;
    @NotNull(message = "operation不能为空")
    @SerializedName("operation")
    private Long operation;
    /**
    * 图片id或地址
    */
    @SerializedName("picture")
    private String picture;
    /**
    * 价格
    */
    @SerializedName("price")
    private Float price;
    /**
    * 当前分类下的排序序号
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * ERP方菜品的skus，代表菜品下的多个sku信息
    */
    @SerializedName("skus")
    private List<Skus> skus;
    @NotNull(message = "specialPrice不能为空")
    @SerializedName("specialPrice")
    private Double specialPrice;
    /**
    * 单位/规格
    */
    @SerializedName("unit")
    private String unit;

    public Float getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(Float boxNum) {
        this.boxNum = boxNum;
    }
    public Float getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(Float boxPrice) {
        this.boxPrice = boxPrice;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getDishId() {
        return dishId;
    }
    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }
    public String getDishName() {
        return dishName;
    }
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    public String getEDishCode() {
        return eDishCode;
    }
    public void setEDishCode(String eDishCode) {
        this.eDishCode = eDishCode;
    }
    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public Long getFoodId() {
        return foodId;
    }
    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }
    public Integer getIsSoldOut() {
        return isSoldOut;
    }
    public void setIsSoldOut(Integer isSoldOut) {
        this.isSoldOut = isSoldOut;
    }
    public Long getMaxOrderCount() {
        return maxOrderCount;
    }
    public void setMaxOrderCount(Long maxOrderCount) {
        this.maxOrderCount = maxOrderCount;
    }
    public Integer getMinOrderCount() {
        return minOrderCount;
    }
    public void setMinOrderCount(Integer minOrderCount) {
        this.minOrderCount = minOrderCount;
    }
    public Long getOperation() {
        return operation;
    }
    public void setOperation(Long operation) {
        this.operation = operation;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public List<Skus> getSkus() {
        return skus;
    }
    public void setSkus(List<Skus> skus) {
        this.skus = skus;
    }
    public Double getSpecialPrice() {
        return specialPrice;
    }
    public void setSpecialPrice(Double specialPrice) {
        this.specialPrice = specialPrice;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }




    @Override
    public String toString() {
        return "ListEx{" + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "categoryName=" + categoryName + "," + "description=" + description + "," + "dishId=" + dishId + "," + "dishName=" + dishName + "," + "eDishCode=" + eDishCode + "," + "epoiId=" + epoiId + "," + "foodId=" + foodId + "," + "isSoldOut=" + isSoldOut + "," + "maxOrderCount=" + maxOrderCount + "," + "minOrderCount=" + minOrderCount + "," + "operation=" + operation + "," + "picture=" + picture + "," + "price=" + price + "," + "sequence=" + sequence + "," + "skus=" + skus + "," + "specialPrice=" + specialPrice + "," + "unit=" + unit + "}";
    }
}
