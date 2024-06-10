package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 配料组基本信息
* This file was automatically generated.
*/
public class SpuPremiumGroupBasicDTO {
    /**
    * 配料属性组编码
    */
    @NotBlank(message = "groupCode不能为空")
    @SerializedName("groupCode")
    private String groupCode;
    /**
    * 配料属性组名称
    */
    @NotBlank(message = "groupName不能为空")
    @SerializedName("groupName")
    private String groupName;
    /**
    * 配料属性组排序
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;
    /**
    * 配料组是否支持选多个配料  true：支持  false：不支持
    */
    @SerializedName("chooseMultiPremium")
    private Boolean chooseMultiPremium;
    /**
    * 配料组下配料是否支持选多份  true：支持  false：不支持
    */
    @SerializedName("multiChoosePremium")
    private Boolean multiChoosePremium;

    public String getGroupCode() {
        return groupCode;
    }
    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Integer getRank() {
        return rank;
    }
    public void setRank(Integer rank) {
        this.rank = rank;
    }
    public Boolean getChooseMultiPremium() {
        return chooseMultiPremium;
    }
    public void setChooseMultiPremium(Boolean chooseMultiPremium) {
        this.chooseMultiPremium = chooseMultiPremium;
    }
    public Boolean getMultiChoosePremium() {
        return multiChoosePremium;
    }
    public void setMultiChoosePremium(Boolean multiChoosePremium) {
        this.multiChoosePremium = multiChoosePremium;
    }




    @Override
    public String toString() {
        return "SpuPremiumGroupBasicDTO{" + "groupCode=" + groupCode + "," + "groupName=" + groupName + "," + "rank=" + rank + "," + "chooseMultiPremium=" + chooseMultiPremium + "," + "multiChoosePremium=" + multiChoosePremium + "}";
    }
}
