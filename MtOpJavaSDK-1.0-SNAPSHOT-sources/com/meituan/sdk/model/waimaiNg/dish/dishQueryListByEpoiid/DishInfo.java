package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEpoiid;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DishInfo {
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
    /**
    * 服务商门店id
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 是否设置为单点不送，1-是，2-否，默认0，不修改该信息
    */
    @SerializedName("isNotSingle")
    private Integer isNotSingle;
    /**
    * 菜品上下架状态。0-上架，1-下架
    */
    @SerializedName("isSoldOut")
    private Integer isSoldOut;
    /**
    * 最小购买数量
    */
    @SerializedName("minOrderCount")
    private Integer minOrderCount;
    /**
    * 图片id或地址
    */
    @SerializedName("picture")
    private String picture;
    /**
    * 图片URL,多张图片用逗号隔开
    */
    @SerializedName("pictures")
    private String pictures;
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
    /**
    * 是否设置为招牌商品，最多可以设置15个。1-是，2-否，默认0，不修改该信息
    */
    @SerializedName("speciality")
    private Integer speciality;
    /**
    * spu售卖属性，spuAttr与skuAttr中的属性数量相同且属性内容相同（mode\u003d2)
    */
    @SerializedName("spuAttr")
    private String spuAttr;
    /**
    * 单位/规格
    */
    @SerializedName("unit")
    private String unit;
    /**
    * 图文详情URL	
    */
    @SerializedName("longPictures")
    private String longPictures;

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
    public Integer getIsNotSingle() {
        return isNotSingle;
    }
    public void setIsNotSingle(Integer isNotSingle) {
        this.isNotSingle = isNotSingle;
    }
    public Integer getIsSoldOut() {
        return isSoldOut;
    }
    public void setIsSoldOut(Integer isSoldOut) {
        this.isSoldOut = isSoldOut;
    }
    public Integer getMinOrderCount() {
        return minOrderCount;
    }
    public void setMinOrderCount(Integer minOrderCount) {
        this.minOrderCount = minOrderCount;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public String getPictures() {
        return pictures;
    }
    public void setPictures(String pictures) {
        this.pictures = pictures;
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
    public Integer getSpeciality() {
        return speciality;
    }
    public void setSpeciality(Integer speciality) {
        this.speciality = speciality;
    }
    public String getSpuAttr() {
        return spuAttr;
    }
    public void setSpuAttr(String spuAttr) {
        this.spuAttr = spuAttr;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public String getLongPictures() {
        return longPictures;
    }
    public void setLongPictures(String longPictures) {
        this.longPictures = longPictures;
    }




    @Override
    public String toString() {
        return "DishInfo{" + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "categoryName=" + categoryName + "," + "description=" + description + "," + "dishName=" + dishName + "," + "eDishCode=" + eDishCode + "," + "epoiId=" + epoiId + "," + "isNotSingle=" + isNotSingle + "," + "isSoldOut=" + isSoldOut + "," + "minOrderCount=" + minOrderCount + "," + "picture=" + picture + "," + "pictures=" + pictures + "," + "price=" + price + "," + "sequence=" + sequence + "," + "skus=" + skus + "," + "speciality=" + speciality + "," + "spuAttr=" + spuAttr + "," + "unit=" + unit + "," + "longPictures=" + longPictures + "}";
    }
}
