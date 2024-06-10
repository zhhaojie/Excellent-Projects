package com.meituan.sdk.model.waimaiNg.dish.dishFoodListAll;

import com.google.gson.annotations.SerializedName;

/**
* 分组规则。固定分组不需要传分组规则，非固定分组需要传递分组规则
* This file was automatically generated.
*/
public class WmComboGroupRuleVo {
    /**
    * 最小选购数量，当套餐分组是M选N时，最小选购数量为N
    */
    @SerializedName("minOptionalQuantity")
    private Integer minOptionalQuantity;
    /**
    * 同一单品是否可以多选，0为否，1为是
    */
    @SerializedName("canBeReelected")
    private Boolean canBeReelected;

    public Integer getMinOptionalQuantity() {
        return minOptionalQuantity;
    }
    public void setMinOptionalQuantity(Integer minOptionalQuantity) {
        this.minOptionalQuantity = minOptionalQuantity;
    }
    public Boolean getCanBeReelected() {
        return canBeReelected;
    }
    public void setCanBeReelected(Boolean canBeReelected) {
        this.canBeReelected = canBeReelected;
    }




    @Override
    public String toString() {
        return "WmComboGroupRuleVo{" + "minOptionalQuantity=" + minOptionalQuantity + "," + "canBeReelected=" + canBeReelected + "}";
    }
}
