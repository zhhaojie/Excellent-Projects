package com.meituan.sdk.model.waimaiNg.dish.dishQueryListByEdishCodes;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

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
    @NotNull(message = "boxNum不能为空")
    @SerializedName("boxNum")
    private Double boxNum;
    @NotNull(message = "boxPrice不能为空")
    @SerializedName("boxPrice")
    private Double boxPrice;
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
    @SerializedName("skuAttr")
    private String skuAttr;
    /**
    * ERP sku ID
    */
    @SerializedName("skuId")
    private String skuId;
    @NotNull(message = "skuSequence不能为空")
    @SerializedName("sku_sequence")
    private Long skuSequence;
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
    @NotNull(message = "weight不能为空")
    @SerializedName("weight")
    private Long weight;
    @NotBlank(message = "weightUnit不能为空")
    @SerializedName("weightUnit")
    private String weightUnit;
    @SerializedName("ladderNum")
    private String ladderNum;
    @SerializedName("ladderPrice")
    private String ladderPrice;

    public AvailableTimes getAvailableTimes() {
        return availableTimes;
    }
    public void setAvailableTimes(AvailableTimes availableTimes) {
        this.availableTimes = availableTimes;
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
    public Long getSkuSequence() {
        return skuSequence;
    }
    public void setSkuSequence(Long skuSequence) {
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
