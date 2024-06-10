package com.meituan.sdk.model.waimaiNg.dish.foodBatchQueryList;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class DishInfo {
    /**
    * APP方门店ID(保留字段，目前为空字符串)
    */
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * APP方菜品id
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 菜品名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 菜品描述
    */
    @SerializedName("description")
    private String description;
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;
    /**
    * 最小购买量
    */
    @SerializedName("min_order_count")
    private Integer minOrderCount;
    /**
    * 单位
    */
    @SerializedName("unit")
    private String unit;
    /**
    * 打包盒数量
    */
    @SerializedName("box_num")
    private Float boxNum;
    /**
    * 餐盒价格
    */
    @SerializedName("box_price")
    private Float boxPrice;
    /**
    * 菜品分类名
    */
    @SerializedName("category_name")
    private String categoryName;
    /**
    * 1：下架，0：上架
    */
    @SerializedName("is_sold_out")
    private Integer isSoldOut;
    /**
    * 菜品图片
    */
    @SerializedName("picture")
    private String picture;
    /**
    * 当前分类下的排序序号
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * App方菜品的skus
    */
    @SerializedName("skus")
    private String skus;
    /**
    * 菜品创建时间
    */
    @SerializedName("ctime")
    private Integer ctime;
    /**
    * 菜品修改时间
    */
    @SerializedName("utime")
    private Integer utime;
    /**
    * 菜品属性
    */
    @SerializedName("spuAttr")
    private String spuAttr;
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
    * 透传给第三方的tag_name
    */
    @SerializedName("tag_name")
    private String tagName;
    @NotNull(message = "originSpuId不能为空")
    @SerializedName("origin_spu_id")
    private Long originSpuId;
    @NotBlank(message = "pictures不能为空")
    @SerializedName("pictures")
    private String pictures;
    @NotBlank(message = "highLight不能为空")
    @SerializedName("high_light")
    private String highLight;
    @NotNull(message = "speciality不能为空")
    @SerializedName("speciality")
    private Long speciality;
    @NotNull(message = "isNotSingle不能为空")
    @SerializedName("is_not_single")
    private Long isNotSingle;
    @NotNull(message = "monthSaled不能为空")
    @SerializedName("monthSaled")
    private Long monthSaled;
    /**
    * 图文详情URL
    */
    @SerializedName("longPictures")
    private String longPictures;

    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getMinOrderCount() {
        return minOrderCount;
    }
    public void setMinOrderCount(Integer minOrderCount) {
        this.minOrderCount = minOrderCount;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
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
    public Integer getIsSoldOut() {
        return isSoldOut;
    }
    public void setIsSoldOut(Integer isSoldOut) {
        this.isSoldOut = isSoldOut;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public String getSkus() {
        return skus;
    }
    public void setSkus(String skus) {
        this.skus = skus;
    }
    public Integer getCtime() {
        return ctime;
    }
    public void setCtime(Integer ctime) {
        this.ctime = ctime;
    }
    public Integer getUtime() {
        return utime;
    }
    public void setUtime(Integer utime) {
        this.utime = utime;
    }
    public String getSpuAttr() {
        return spuAttr;
    }
    public void setSpuAttr(String spuAttr) {
        this.spuAttr = spuAttr;
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
    public Long getOriginSpuId() {
        return originSpuId;
    }
    public void setOriginSpuId(Long originSpuId) {
        this.originSpuId = originSpuId;
    }
    public String getPictures() {
        return pictures;
    }
    public void setPictures(String pictures) {
        this.pictures = pictures;
    }
    public String getHighLight() {
        return highLight;
    }
    public void setHighLight(String highLight) {
        this.highLight = highLight;
    }
    public Long getSpeciality() {
        return speciality;
    }
    public void setSpeciality(Long speciality) {
        this.speciality = speciality;
    }
    public Long getIsNotSingle() {
        return isNotSingle;
    }
    public void setIsNotSingle(Long isNotSingle) {
        this.isNotSingle = isNotSingle;
    }
    public Long getMonthSaled() {
        return monthSaled;
    }
    public void setMonthSaled(Long monthSaled) {
        this.monthSaled = monthSaled;
    }
    public String getLongPictures() {
        return longPictures;
    }
    public void setLongPictures(String longPictures) {
        this.longPictures = longPictures;
    }




    @Override
    public String toString() {
        return "DishInfo{" + "epoiId=" + epoiId + "," + "appFoodCode=" + appFoodCode + "," + "name=" + name + "," + "description=" + description + "," + "price=" + price + "," + "minOrderCount=" + minOrderCount + "," + "unit=" + unit + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "categoryName=" + categoryName + "," + "isSoldOut=" + isSoldOut + "," + "picture=" + picture + "," + "sequence=" + sequence + "," + "skus=" + skus + "," + "ctime=" + ctime + "," + "utime=" + utime + "," + "spuAttr=" + spuAttr + "," + "mtSpuId=" + mtSpuId + "," + "mtTagId=" + mtTagId + "," + "tagName=" + tagName + "," + "originSpuId=" + originSpuId + "," + "pictures=" + pictures + "," + "highLight=" + highLight + "," + "speciality=" + speciality + "," + "isNotSingle=" + isNotSingle + "," + "monthSaled=" + monthSaled + "," + "longPictures=" + longPictures + "}";
    }
}
