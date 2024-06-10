package com.meituan.sdk.model.wmoperNg.food.dishComboSave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><font style="font-size:14px;line-height:22px" data-size="14">固定搭配套餐的单品关联信息。</font>固定搭配套餐必须传入，可选分组套餐不传入</p>
* This file was automatically generated.
*/
public class WmCombineSkuRel {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">固定搭配套餐里单品显示顺序，默认从1开始</font></p>
    */
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">该单品对应的数量。必须&gt;0。</font>固定搭配套餐里的单个单品的skuCount最多为10，固定搭配套餐里的所有单品的skuCount累加不超过20</p>
    */
    @NotNull(message = "skuCount不能为空")
    @SerializedName("skuCount")
    private Integer skuCount;
    /**
    * <p style="text-align: start;"><font style="font-size:14px;line-height:22px" data-size="14">套餐下某一个单品的第三方商品SPUcode</font></p>
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">套餐下某一单品的第三方规格code。</font>注意在创建/修改套餐前，套餐里单品商品必须要已创建</p>
    */
    @NotBlank(message = "skuId不能为空")
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
        return "WmCombineSkuRel{" + "sequence=" + sequence + "," + "skuCount=" + skuCount + "," + "appFoodCode=" + appFoodCode + "," + "skuId=" + skuId + "}";
    }
}
