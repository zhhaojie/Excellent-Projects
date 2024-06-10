package com.meituan.sdk.model.foodmop.sku.queryVendorSkuCustomrule;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 客制化规则列表
* This file was automatically generated.
*/
public class SkuCustomRuleBasicDTO {
    /**
    * 规则类型： 10：配料组客制化规则 20：配料客制化规则
    */
    @NotNull(message = "ruleType不能为空")
    @SerializedName("ruleType")
    private Integer ruleType;
    /**
    * 配料组编码
    */
    @SerializedName("groupCode")
    private String groupCode;
    /**
    * 配料编码
    */
    @SerializedName("itemCode")
    private String itemCode;
    /**
    * 是否必选
    */
    @NotNull(message = "mustSelect不能为空")
    @SerializedName("mustSelect")
    private Boolean mustSelect;
    /**
    * 是否默认选中
    */
    @SerializedName("defaultSelect")
    private Boolean defaultSelect;
    /**
    * 属性组是否折叠
    */
    @SerializedName("fold")
    private Boolean fold;
    /**
    * 属性组 or 属性值展示排序
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * 最小选择数，默认 1
    */
    @SerializedName("minChoice")
    private Integer minChoice;
    /**
    * 最大选择数，默认 1
    */
    @SerializedName("maxChoice")
    private Integer maxChoice;
    /**
    * 配料 or 配料组是否在页面隐藏
    */
    @NotNull(message = "hide不能为空")
    @SerializedName("hide")
    private Boolean hide;
    /**
    * 是否支持换购
    */
    @NotNull(message = "exchange不能为空")
    @SerializedName("exchange")
    private Boolean exchange;
    /**
    * 最大免费数，默认 0
    */
    @SerializedName("maxFreeNum")
    private Integer maxFreeNum;
    /**
    * 默认选中数，默认 0
    */
    @SerializedName("defaultSelectNum")
    private Integer defaultSelectNum;
    /**
    * 每份数量，按份计价用，一般品牌无特殊要求，默认填 1 即可
    */
    @SerializedName("numOfPortion")
    private Integer numOfPortion;

    public Integer getRuleType() {
        return ruleType;
    }
    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }
    public String getGroupCode() {
        return groupCode;
    }
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    public String getItemCode() {
        return itemCode;
    }
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    public Boolean getMustSelect() {
        return mustSelect;
    }
    public void setMustSelect(Boolean mustSelect) {
        this.mustSelect = mustSelect;
    }
    public Boolean getDefaultSelect() {
        return defaultSelect;
    }
    public void setDefaultSelect(Boolean defaultSelect) {
        this.defaultSelect = defaultSelect;
    }
    public Boolean getFold() {
        return fold;
    }
    public void setFold(Boolean fold) {
        this.fold = fold;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Integer getMinChoice() {
        return minChoice;
    }
    public void setMinChoice(Integer minChoice) {
        this.minChoice = minChoice;
    }
    public Integer getMaxChoice() {
        return maxChoice;
    }
    public void setMaxChoice(Integer maxChoice) {
        this.maxChoice = maxChoice;
    }
    public Boolean getHide() {
        return hide;
    }
    public void setHide(Boolean hide) {
        this.hide = hide;
    }
    public Boolean getExchange() {
        return exchange;
    }
    public void setExchange(Boolean exchange) {
        this.exchange = exchange;
    }
    public Integer getMaxFreeNum() {
        return maxFreeNum;
    }
    public void setMaxFreeNum(Integer maxFreeNum) {
        this.maxFreeNum = maxFreeNum;
    }
    public Integer getDefaultSelectNum() {
        return defaultSelectNum;
    }
    public void setDefaultSelectNum(Integer defaultSelectNum) {
        this.defaultSelectNum = defaultSelectNum;
    }
    public Integer getNumOfPortion() {
        return numOfPortion;
    }
    public void setNumOfPortion(Integer numOfPortion) {
        this.numOfPortion = numOfPortion;
    }




    @Override
    public String toString() {
        return "SkuCustomRuleBasicDTO{" + "ruleType=" + ruleType + "," + "groupCode=" + groupCode + "," + "itemCode=" + itemCode + "," + "mustSelect=" + mustSelect + "," + "defaultSelect=" + defaultSelect + "," + "fold=" + fold + "," + "rank=" + rank + "," + "minChoice=" + minChoice + "," + "maxChoice=" + maxChoice + "," + "hide=" + hide + "," + "exchange=" + exchange + "," + "maxFreeNum=" + maxFreeNum + "," + "defaultSelectNum=" + defaultSelectNum + "," + "numOfPortion=" + numOfPortion + "}";
    }
}
