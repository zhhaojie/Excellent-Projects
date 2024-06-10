package com.meituan.sdk.model.waimaiNg.dish.dishFoodListAll;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 三方菜品的skus
* This file was automatically generated.
*/
public class Skus {
    /**
    * 菜品可售时间
    */
    @SerializedName("available_times")
    private AvailableTimes availableTimes;
    /**
    * 打包盒数量
    */
    @SerializedName("box_num")
    private String boxNum;
    /**
    * 餐盒价格
    */
    @SerializedName("box_price")
    private String boxPrice;
    /**
    * 每M个商品需N元包装费，本字段代表M个商品。不可为0。如传“ladder_num”和“ladder_price”，则代表商家使用了阶梯价格，“box_num”和“box_price”中的内容不生效
    */
    @SerializedName("ladder_num")
    private String ladderNum;
    /**
    * 每M个商品需N元包装费，本字段代表N元。如传“ladder_num”和“ladder_price”，则代表商家使用了阶梯价格，“box_num”和“box_price”中的内容不生效
    */
    @SerializedName("ladder_price")
    private String ladderPrice;
    /**
    * 位置码
    */
    @SerializedName("location_code")
    private String locationCode;
    /**
    * sku价格
    */
    @SerializedName("price")
    private String price;
    /**
    * sku唯一标识
    */
    @SerializedName("sku_id")
    private String skuId;
    /**
    * sku的规格
    */
    @SerializedName("spec")
    private String spec;
    /**
    * sku库存数量，不能为负数或小数，传'*'表示库存无限
    */
    @SerializedName("stock")
    private String stock;
    /**
    * 规格排序
    */
    @SerializedName("sku_sequence")
    private Integer skuSequence;
    @NotNull(message = "weight不能为空")
    @SerializedName("weight")
    private Long weight;
    @NotBlank(message = "weightUnit不能为空")
    @SerializedName("weight_unit")
    private String weightUnit;
    /**
    * 透传给第三方的偏移后的sku的id
    */
    @SerializedName("mt_sku_id")
    private Long mtSkuId;
    /**
    * 美团真实SKUID
    */
    @SerializedName("origin_sku_id")
    private Long originSkuId;
    /**
    * 售卖属性。spuAttr与skuAttr中的属性数量相同且属性内容相同（mode=2)
    */
    @NotBlank(message = "skuAttr不能为空")
    @SerializedName("skuAttr")
    private String skuAttr;
    /**
    * upc码
    */
    @SerializedName("upc")
    private String upc;
    /**
    * 分组可选套餐的分组信息。当套餐为可选分组套餐时，需要传入。当套餐为固定搭配套餐时，不传入。固定搭配套餐分组数量不能超过5个
    */
    @SerializedName("comboGroupList")
    private List<WmComboGroupVo> comboGroupList;
    /**
    * 固定搭配套餐的单品关联信息。固定搭配套餐必须传入，可选分组套餐不传入
    */
    @SerializedName("combineSkuRelList")
    private List<WmCombineSkuRelVo> combineSkuRelList;

    public AvailableTimes getAvailableTimes() {
        return availableTimes;
    }
    public void setAvailableTimes(AvailableTimes availableTimes) {
        this.availableTimes = availableTimes;
    }
    public String getBoxNum() {
        return boxNum;
    }
    public void setBoxNum(String boxNum) {
        this.boxNum = boxNum;
    }
    public String getBoxPrice() {
        return boxPrice;
    }
    public void setBoxPrice(String boxPrice) {
        this.boxPrice = boxPrice;
    }
    public String getLadderNum() {
        return ladderNum;
    }
    public void setLadderNum(String ladderNum) {
        this.ladderNum = ladderNum;
    }
    public String getLadderPrice() {
        return ladderPrice;
    }
    public void setLadderPrice(String ladderPrice) {
        this.ladderPrice = ladderPrice;
    }
    public String getLocationCode() {
        return locationCode;
    }
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
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
    public String getStock() {
        return stock;
    }
    public void setStock(String stock) {
        this.stock = stock;
    }
    public Integer getSkuSequence() {
        return skuSequence;
    }
    public void setSkuSequence(Integer skuSequence) {
        this.skuSequence = skuSequence;
    }
    public Long getWeight() {
        return weight;
    }
    public void setWeight(Long weight) {
        this.weight = weight;
    }
    public String getWeightUnit() {
        return weightUnit;
    }
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }
    public Long getMtSkuId() {
        return mtSkuId;
    }
    public void setMtSkuId(Long mtSkuId) {
        this.mtSkuId = mtSkuId;
    }
    public Long getOriginSkuId() {
        return originSkuId;
    }
    public void setOriginSkuId(Long originSkuId) {
        this.originSkuId = originSkuId;
    }
    public String getSkuAttr() {
        return skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
        this.skuAttr = skuAttr;
    }
    public String getUpc() {
        return upc;
    }
    public void setUpc(String upc) {
        this.upc = upc;
    }
    public List<WmComboGroupVo> getComboGroupList() {
        return comboGroupList;
    }
    public void setComboGroupList(List<WmComboGroupVo> comboGroupList) {
        this.comboGroupList = comboGroupList;
    }
    public List<WmCombineSkuRelVo> getCombineSkuRelList() {
        return combineSkuRelList;
    }
    public void setCombineSkuRelList(List<WmCombineSkuRelVo> combineSkuRelList) {
        this.combineSkuRelList = combineSkuRelList;
    }




    @Override
    public String toString() {
        return "Skus{" + "availableTimes=" + availableTimes + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "ladderNum=" + ladderNum + "," + "ladderPrice=" + ladderPrice + "," + "locationCode=" + locationCode + "," + "price=" + price + "," + "skuId=" + skuId + "," + "spec=" + spec + "," + "stock=" + stock + "," + "skuSequence=" + skuSequence + "," + "weight=" + weight + "," + "weightUnit=" + weightUnit + "," + "mtSkuId=" + mtSkuId + "," + "originSkuId=" + originSkuId + "," + "skuAttr=" + skuAttr + "," + "upc=" + upc + "," + "comboGroupList=" + comboGroupList + "," + "combineSkuRelList=" + combineSkuRelList + "}";
    }
}
