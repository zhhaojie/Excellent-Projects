package com.meituan.sdk.model.wmoperNg.food.dishComboBatchsave;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><font style="font-size:14px;line-height:22px" data-size="14">分组下套餐关系信息</font></p>
* This file was automatically generated.
*/
public class WmComboSkuRel {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">套餐下某一单品的第三方SPU code</font></p>
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">套餐下某一单品的第三方规格code，</font>注意在创建/修改套餐前，套餐里单品商品必须要已创建</p>
    */
    @NotBlank(message = "skuId不能为空")
    @SerializedName("sku_id")
    private String skuId;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">单品数量，必须&gt;0</font></p>
    */
    @NotNull(message = "skuCount不能为空")
    @SerializedName("skuCount")
    private Integer skuCount;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">单品显示顺序，默认从1开始</font></p>
    */
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">加价，保留两位小数</font></p>
    */
    @NotNull(message = "appendPrice不能为空")
    @SerializedName("appendPrice")
    private Double appendPrice;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">是否默认选择0-否，1-是</font>，只能有一个sku默认选择</p>
    */
    @NotNull(message = "defaultSelected不能为空")
    @SerializedName("defaultSelected")
    private Integer defaultSelected;
    /**
    * <p>是否必选0-否，1-是，最多只能有一个必选，可以没有</p>
    */
    @NotNull(message = "requiredSelected不能为空")
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
        return "WmComboSkuRel{" + "appFoodCode=" + appFoodCode + "," + "skuId=" + skuId + "," + "skuCount=" + skuCount + "," + "sequence=" + sequence + "," + "appendPrice=" + appendPrice + "," + "defaultSelected=" + defaultSelected + "," + "requiredSelected=" + requiredSelected + "}";
    }
}
