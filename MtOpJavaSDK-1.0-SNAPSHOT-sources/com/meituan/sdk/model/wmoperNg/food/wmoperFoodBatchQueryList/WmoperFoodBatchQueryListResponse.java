package com.meituan.sdk.model.wmoperNg.food.wmoperFoodBatchQueryList;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class WmoperFoodBatchQueryListResponse {
    @NotBlank(message = "epoiId不能为空")
    @SerializedName("epoiId")
    private String epoiId;
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    @NotBlank(message = "description不能为空")
    @SerializedName("description")
    private String description;
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;
    @NotNull(message = "minOrderCount不能为空")
    @SerializedName("min_order_count")
    private Long minOrderCount;
    @NotBlank(message = "unit不能为空")
    @SerializedName("unit")
    private String unit;
    @NotNull(message = "boxNum不能为空")
    @SerializedName("box_num")
    private Double boxNum;
    @NotNull(message = "boxPrice不能为空")
    @SerializedName("box_price")
    private Double boxPrice;
    @NotBlank(message = "categoryName不能为空")
    @SerializedName("category_name")
    private String categoryName;
    @NotNull(message = "isSoldOut不能为空")
    @SerializedName("is_sold_out")
    private Long isSoldOut;
    @NotBlank(message = "picture不能为空")
    @SerializedName("picture")
    private String picture;
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Long sequence;
    @NotBlank(message = "skus不能为空")
    @SerializedName("skus")
    private String skus;
    @NotNull(message = "ctime不能为空")
    @SerializedName("ctime")
    private Long ctime;
    @NotNull(message = "utime不能为空")
    @SerializedName("utime")
    private Long utime;
    @SerializedName("spuAttr")
    private String spuAttr;
    @NotNull(message = "mtSpuId不能为空")
    @SerializedName("mt_spu_id")
    private Long mtSpuId;
    @NotNull(message = "mtTagId不能为空")
    @SerializedName("mt_tag_id")
    private Long mtTagId;
    @NotBlank(message = "tagName不能为空")
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
    public Long getMinOrderCount() {
        return minOrderCount;
    }
    public void setMinOrderCount(Long minOrderCount) {
        this.minOrderCount = minOrderCount;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
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
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Long getIsSoldOut() {
        return isSoldOut;
    }
    public void setIsSoldOut(Long isSoldOut) {
        this.isSoldOut = isSoldOut;
    }
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public Long getSequence() {
        return sequence;
    }
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
    public String getSkus() {
        return skus;
    }
    public void setSkus(String skus) {
        this.skus = skus;
    }
    public Long getCtime() {
        return ctime;
    }
    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }
    public Long getUtime() {
        return utime;
    }
    public void setUtime(Long utime) {
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
        return "WmoperFoodBatchQueryListResponse{" + "epoiId=" + epoiId + "," + "appFoodCode=" + appFoodCode + "," + "name=" + name + "," + "description=" + description + "," + "price=" + price + "," + "minOrderCount=" + minOrderCount + "," + "unit=" + unit + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "categoryName=" + categoryName + "," + "isSoldOut=" + isSoldOut + "," + "picture=" + picture + "," + "sequence=" + sequence + "," + "skus=" + skus + "," + "ctime=" + ctime + "," + "utime=" + utime + "," + "spuAttr=" + spuAttr + "," + "mtSpuId=" + mtSpuId + "," + "mtTagId=" + mtTagId + "," + "tagName=" + tagName + "," + "originSpuId=" + originSpuId + "," + "pictures=" + pictures + "," + "highLight=" + highLight + "," + "speciality=" + speciality + "," + "isNotSingle=" + isNotSingle + "," + "monthSaled=" + monthSaled + "," + "longPictures=" + longPictures + "}";
    }
}
