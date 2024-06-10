package com.meituan.sdk.model.waimaiNg.dish.dishComboSave;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p>套餐分组规则。固定分组不需要传分组规则，非固定分组需要传递分组规则。</p>
* This file was automatically generated.
*/
public class WmComboGroupRule {
    /**
    * <p>最小选购数量，当套餐分组是M选N时，最小选购数量为N</p>
    */
    @NotNull(message = "minOptionalQuantity不能为空")
    @SerializedName("minOptionalQuantity")
    private Integer minOptionalQuantity;
    /**
    * <p>同一单品是否可以多选。0为否，1为是</p>
    */
    @NotNull(message = "canBeReSelected不能为空")
    @SerializedName("canBeReSelected")
    private Boolean canBeReSelected;

    public Integer getMinOptionalQuantity() {
        return minOptionalQuantity;
    }
    public void setMinOptionalQuantity(Integer minOptionalQuantity) {
        this.minOptionalQuantity = minOptionalQuantity;
    }
    public Boolean getCanBeReSelected() {
        return canBeReSelected;
    }
    public void setCanBeReSelected(Boolean canBeReSelected) {
        this.canBeReSelected = canBeReSelected;
    }




    @Override
    public String toString() {
        return "WmComboGroupRule{" + "minOptionalQuantity=" + minOptionalQuantity + "," + "canBeReSelected=" + canBeReSelected + "}";
    }
}
