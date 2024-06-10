package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryDetail;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 查询菜品详情
* This file was automatically generated.
*/
public class WmoperFoodQueryDetailResponse {
    @NotBlank(message = "epoiId不能为空")
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * APP方菜品id
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    @NotBlank(message = "description不能为空")
    @SerializedName("description")
    private String description;
    /**
    * sku价格
    */
    @SerializedName("price")
    private Float price;
    /**
    * 最小购买量，最小为1
    */
    @SerializedName("min_order_count")
    private Integer minOrderCount;
    /**
    * 单位
    */
    @SerializedName("unit")
    private String unit;
    /**
    * sku餐盒数量
    */
    @SerializedName("box_num")
    private Float boxNum;
    /**
    * sku餐盒价格
    */
    @SerializedName("box_price")
    private Float boxPrice;
    /**
    * 菜品分类
    */
    @SerializedName("category_name")
    private String categoryName;
    /**
    * 菜品上下架状态，0表上架，1表下架
    */
    @SerializedName("is_sold_out")
    private Integer isSoldOut;
    /**
    * 菜品图片id
    */
    @SerializedName("picture")
    private String picture;
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Long sequence;
    /**
    * 代表菜品下的多个sku信息，使用json格式传递参数
    */
    @SerializedName("skus")
    private String skus;
    /**
    * 创建时间（当前距离Epoch（1970年1月1日） 以秒计算的时间，即unix-timestamp）
    */
    @SerializedName("ctime")
    private Integer ctime;
    /**
    * 更新时间（当前距离Epoch（1970年1月1日） 以秒计算的时间，即unix-timestamp）
    */
    @SerializedName("utime")
    private Integer utime;
    /**
    * spu属性，该字段为JSON String
    */
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
    /**
    * 图片URL,多张图片用逗号隔开
    */
    @SerializedName("pictures")
    private String pictures;
    @NotBlank(message = "highLight不能为空")
    @SerializedName("high_light")
    private String highLight;
    /**
    * 是否设置为招牌商品，最多可以设置15个。1-是，2-否，默认0，不修改该信息
    */
    @SerializedName("speciality")
    private Integer speciality;
    /**
    * 是否设置为单点不送，1-是，2-否，默认0，不修改该信息
    */
    @SerializedName("is_not_single")
    private Integer isNotSingle;
    /**
    * 月销量
    */
    @SerializedName("monthSaled")
    private Integer monthSaled;
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
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
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
    public Integer getSpeciality() {
        return speciality;
    }
    public void setSpeciality(Integer speciality) {
        this.speciality = speciality;
    }
    public Integer getIsNotSingle() {
        return isNotSingle;
    }
    public void setIsNotSingle(Integer isNotSingle) {
        this.isNotSingle = isNotSingle;
    }
    public Integer getMonthSaled() {
        return monthSaled;
    }
    public void setMonthSaled(Integer monthSaled) {
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
        return "WmoperFoodQueryDetailResponse{" + "epoiId=" + epoiId + "," + "appFoodCode=" + appFoodCode + "," + "name=" + name + "," + "description=" + description + "," + "price=" + price + "," + "minOrderCount=" + minOrderCount + "," + "unit=" + unit + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "categoryName=" + categoryName + "," + "isSoldOut=" + isSoldOut + "," + "picture=" + picture + "," + "sequence=" + sequence + "," + "skus=" + skus + "," + "ctime=" + ctime + "," + "utime=" + utime + "," + "spuAttr=" + spuAttr + "," + "mtSpuId=" + mtSpuId + "," + "mtTagId=" + mtTagId + "," + "tagName=" + tagName + "," + "originSpuId=" + originSpuId + "," + "pictures=" + pictures + "," + "highLight=" + highLight + "," + "speciality=" + speciality + "," + "isNotSingle=" + isNotSingle + "," + "monthSaled=" + monthSaled + "," + "longPictures=" + longPictures + "}";
    }
}
