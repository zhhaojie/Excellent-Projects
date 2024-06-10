package com.meituan.sdk.model.waimaiNg.dish.dishFoodListAll;

import com.google.gson.annotations.SerializedName;

/**
* 固定搭配套餐的单品关联信息。固定搭配套餐必须传入，可选分组套餐不传入
* This file was automatically generated.
*/
public class WmCombineSkuRelVo {
    /**
    * 固定搭配套餐里单品显示顺序，从1开始
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * 该单品对应的数量,必须>0。固定搭配套餐里的单个单品的skuCount最多为10，固定搭配套餐里的所有单品的skuCount累加不超过20。
    */
    @SerializedName("skuCount")
    private Integer skuCount;
    /**
    * 套餐下某一个单品的第三方商品SPUcode
    */
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * 套餐下某一单品的第三方规格code，注意在创建/修改套餐前，套餐里单品商品必须要已创建
    */
    @SerializedName("sku_id")
    private String skuId;

    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public Integer getSkuCount() {
        return skuCount;
    }
    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }
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




    @Override
    public String toString() {
        return "WmCombineSkuRelVo{" + "sequence=" + sequence + "," + "skuCount=" + skuCount + "," + "appFoodCode=" + appFoodCode + "," + "skuId=" + skuId + "}";
    }
}
