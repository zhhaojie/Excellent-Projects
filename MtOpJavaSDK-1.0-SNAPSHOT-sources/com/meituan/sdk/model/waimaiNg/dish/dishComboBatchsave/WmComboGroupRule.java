package com.meituan.sdk.model.waimaiNg.dish.dishComboBatchsave;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">套餐分组规则。固定分组不需要传分组规则，非固定分组需要传递分组规则。</font></span></p>
* This file was automatically generated.
*/
public class WmComboGroupRule {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">最小选购数量，当套餐分组是M选N时，最小选购数量为N</font></span></p>
    */
    @NotNull(message = "minOptionalQuantity不能为空")
    @SerializedName("minOptionalQuantity")
    private Integer minOptionalQuantity;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">同一单品是否可以多选，0为否，1为是</font></p>
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
