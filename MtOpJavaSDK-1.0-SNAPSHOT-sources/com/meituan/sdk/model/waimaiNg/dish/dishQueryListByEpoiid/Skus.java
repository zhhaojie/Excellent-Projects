package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEpoiid;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* ERP方菜品的skus，代表菜品下的多个sku信息
* This file was automatically generated.
*/
public class Skus {
    /**
    * 配送时间， 默认门店营业时间
    */
    @SerializedName("availableTimes")
    private AvailableTimes availableTimes;
    /**
    * 打包盒数量
    */
    @SerializedName("boxNum")
    private Float boxNum;
    /**
    * 打包盒价格
    */
    @SerializedName("boxPrice")
    private Float boxPrice;
    /**
    * sku的料位码
    */
    @SerializedName("locationCode")
    private String locationCode;
    /**
    * 价格
    */
    @SerializedName("price")
    private String price;
    /**
    * 售卖属性，spuAttr与skuAttr中的属性数量相同且属性内容相同（mode\u003d2)
    */
    @SerializedName("skuAttr")
    private String skuAttr;
    /**
    * ERP sku ID
    */
    @SerializedName("skuId")
    private String skuId;
    /**
    * 规格排序
    */
    @SerializedName("sku_sequence")
    private Integer skuSequence;
    /**
    * 规格
    */
    @SerializedName("spec")
    private String spec;
    /**
    * 库存
    */
    @SerializedName("stock")
    private String stock;
    /**
    * 菜品upc码
    */
    @SerializedName("upc")
    private String upc;
    /**
    * 重量或份量数值
    */
    @SerializedName("weight")
    private Long weight;
    @NotBlank(message = "weightUnit不能为空")
    @SerializedName("weightUnit")
    private String weightUnit;
    /**
    * 每M个商品需N元包装费，本字段代表M个商品。
    */
    @SerializedName("ladderNum")
    private String ladderNum;
    /**
    * 每M个商品需N元包装费，本字段代表N元。
    */
    @SerializedName("ladderPrice")
    private String ladderPrice;

    public AvailableTimes getAvailableTimes() {
        return availableTimes;
    }
    public void setAvailableTimes(AvailableTimes availableTimes) {
        this.availableTimes = availableTimes;
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
    public String getSkuAttr() {
        return skuAttr;
    }
    public void setSkuAttr(String skuAttr) {
        this.skuAttr = skuAttr;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public Integer getSkuSequence() {
        return skuSequence;
    }
    public void setSkuSequence(Integer skuSequence) {
        this.skuSequence = skuSequence;
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
    public String getUpc() {
        return upc;
    }
    public void setUpc(String upc) {
        this.upc = upc;
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




    @Override
    public String toString() {
        return "Skus{" + "availableTimes=" + availableTimes + "," + "boxNum=" + boxNum + "," + "boxPrice=" + boxPrice + "," + "locationCode=" + locationCode + "," + "price=" + price + "," + "skuAttr=" + skuAttr + "," + "skuId=" + skuId + "," + "skuSequence=" + skuSequence + "," + "spec=" + spec + "," + "stock=" + stock + "," + "upc=" + upc + "," + "weight=" + weight + "," + "weightUnit=" + weightUnit + "," + "ladderNum=" + ladderNum + "," + "ladderPrice=" + ladderPrice + "}";
    }
}
