package com.meituan.sdk.model.waimaiNg.dish.dishFoodListAll;

import com.google.gson.annotations.SerializedName;

/**
* 分组下套餐与单品关系信息
* This file was automatically generated.
*/
public class WmComboSkuRelVo {
    /**
    * 套餐下某一单品的第三方SPU code，注意在创建/修改套餐前，套餐里单品商品必须要已创建
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 套餐下某一单品的第三方规格code，注意在创建/修改套餐前，套餐里单品商品必须要已创建
    */
    @SerializedName("sku_id")
    private String skuId;
    /**
    * 单品数量，必须>0。可选套餐商品下单个单品的skuCount最多为10
    */
    @SerializedName("skuCount")
    private Integer skuCount;
    /**
    * 单品显示顺序，默认从1开始
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * 加价。保留两位小数
    */
    @SerializedName("appendPrice")
    private Double appendPrice;
    /**
    * 是否默认选择。0-否，1-是，只能有一个默认选择
    */
    @SerializedName("defaultSelected")
    private Integer defaultSelected;
    /**
    * 是否必选。0-否，1-是，最多只能有一个必选
    */
    @SerializedName("requiredSelected")
    private Integer requiredSelected;

    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public Integer getSkuCount() {
        return skuCount;
    }
    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public Double getAppendPrice() {
        return appendPrice;
    }
    public void setAppendPrice(Double appendPrice) {
        this.appendPrice = appendPrice;
    }
    public Integer getDefaultSelected() {
        return defaultSelected;
    }
    public void setDefaultSelected(Integer defaultSelected) {
        this.defaultSelected = defaultSelected;
    }
    public Integer getRequiredSelected() {
        return requiredSelected;
    }
    public void setRequiredSelected(Integer requiredSelected) {
        this.requiredSelected = requiredSelected;
    }




    @Override
    public String toString() {
        return "WmComboSkuRelVo{" + "appFoodCode=" + appFoodCode + "," + "skuId=" + skuId + "," + "skuCount=" + skuCount + "," + "sequence=" + sequence + "," + "appendPrice=" + appendPrice + "," + "defaultSelected=" + defaultSelected + "," + "requiredSelected=" + requiredSelected + "}";
    }
}
