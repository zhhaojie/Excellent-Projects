package com.meituan.sdk.model.waimaiNg.dish.dishFoodListAll;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class FoodInfo {
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
    * 是否为仅套餐售卖。true仅在套餐中售卖，false非仅套餐中售卖
    */
    @SerializedName("onlySellInCombo")
    private Boolean onlySellInCombo;
    /**
    * 菜品名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 菜品价格
    */
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;
    /**
    * 最小选购数量
    */
    @SerializedName("min_order_count")
    private Integer minOrderCount;
    /**
    * 最大选购数量
    */
    @SerializedName("max_order_count")
    private Integer maxOrderCount;
    /**
    * 单位
    */
    @SerializedName("unit")
    private String unit;
    /**
    * 餐盒数量
    */
    @SerializedName("box_num")
    private Float boxNum;
    /**
    * 餐盒价格
    */
    @SerializedName("box_price")
    private Float boxPrice;
    /**
    * 1下架，0上架
    */
    @SerializedName("is_sold_out")
    private Integer isSoldOut;
    /**
    * 菜品图片
    */
    @SerializedName("picture")
    private String picture;
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
    * 透传给第三方的tag_name
    */
    @SerializedName("tag_name")
    private String tagName;
    /**
    * 菜品图片。多个图片间用逗号分隔
    */
    @SerializedName("pictures")
    private String pictures;
    /**
    * 是否设置为招牌商品。最多可以设置15个。1是，2否，默认0未设置
    */
    @SerializedName("speciality")
    private Integer speciality;
    /**
    * 是否设置为单点不送。1是，2否，默认0未设置
    */
    @SerializedName("is_not_single")
    private Integer isNotSingle;
    /**
    * 菜品描述
    */
    @SerializedName("description")
    private String description;
    /**
    * 菜品分类名
    */
    @SerializedName("category_name")
    private String categoryName;
    /**
    * 当前分类下的排序序号
    */
    @SerializedName("sequence")
    private Integer sequence;
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
    * 美团真实SPUID
    */
    @SerializedName("origin_spu_id")
    private Long originSpuId;
    @NotBlank(message = "highLight不能为空")
    @SerializedName("high_light")
    private String highLight;
    @NotNull(message = "monthSaled不能为空")
    @SerializedName("monthSaled")
    private Long monthSaled;
    /**
    * spu售卖属性。spuAttr与skuAttr中的属性数量相同且属性内容相同（mode=2)
    */
    @SerializedName("spuAttr")
    private String spuAttr;
    /**
    * 三方菜品的skus
    */
    @SerializedName("skus")
    private List<Skus> skus;
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
    public Boolean getOnlySellInCombo() {
        return onlySellInCombo;
    }
    public void setOnlySellInCombo(Boolean onlySellInCombo) {
        this.onlySellInCombo = onlySellInCombo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public Integer getMaxOrderCount() {
        return maxOrderCount;
    }
    public void setMaxOrderCount(Integer maxOrderCount) {
        this.maxOrderCount = maxOrderCount;
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
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public String getPictures() {
        return pictures;
    }
    public void setPictures(String pictures) {
        this.pictures = pictures;
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
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
    public Long getOriginSpuId() {
        return originSpuId;
    }
    public void setOriginSpuId(Long originSpuId) {
        this.originSpuId = originSpuId;
    }
    public String getHighLight() {
        return highLight;
    }
    public void setHighLight(String highLight) {
        this.highLight = highLight;
    }
    public Long getMonthSaled() {
        return monthSaled;
    }
    public void setMonthSaled(Long monthSaled) {
        this.monthSaled = monthSaled;
    }
    public String getSpuAttr() {
        return spuAttr;
    }
    public void setSpuAttr(String spuAttr) {
        this.spuAttr = spuAttr;
    }
    public List<Skus> getSkus() {
        return skus;
    }
    public void setSkus(List<Skus> skus) {
        this.skus = skus;
    }
    public String getLongPictures() {
        return longPictures;
    }
    public void setLongPictures(String longPictures) {
        this.longPictures = longPictures;
    }




    @Override
    public String toString() {
        return "FoodInfo{" + "epoiId=" + epoiId + "," + "appFoodCode=" + appFoodCode + "," + "onlySellInCombo=" + onlySellInCombo + "," + "name=" + name + "," + "price=" + price + "," + "minOrderCount=" + minOrderCount + "," + "maxOrderCount=" + maxOrderCount + "," + "unit=" + unit + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "isSoldOut=" + isSoldOut + "," + "picture=" + picture + "," + "ctime=" + ctime + "," + "utime=" + utime + "," + "tagName=" + tagName + "," + "pictures=" + pictures + "," + "speciality=" + speciality + "," + "isNotSingle=" + isNotSingle + "," + "description=" + description + "," + "categoryName=" + categoryName + "," + "sequence=" + sequence + "," + "mtSpuId=" + mtSpuId + "," + "mtTagId=" + mtTagId + "," + "originSpuId=" + originSpuId + "," + "highLight=" + highLight + "," + "monthSaled=" + monthSaled + "," + "spuAttr=" + spuAttr + "," + "skus=" + skus + "," + "longPictures=" + longPictures + "}";
    }
}
