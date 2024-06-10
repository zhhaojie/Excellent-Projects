package com.meituan.sdk.model.waimaiNg.dish.dishFoodListAll;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 分组可选套餐的分组信息。当套餐为可选分组套餐时，需要传入。当套餐为固定搭配套餐时，不传入。固定搭配套餐分组数量不能超过5个
* This file was automatically generated.
*/
public class WmComboGroupVo {
    /**
    * 套餐分组展示顺序，默认从1开始
    */
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * 分组名称
    */
    @SerializedName("groupName")
    private String groupName;
    /**
    * 传1，代表非固定分组。传0，代表固定分组
    */
    @SerializedName("groupType")
    private Integer groupType;
    /**
    * 分组规则。固定分组不需要传分组规则，非固定分组需要传递分组规则
    */
    @SerializedName("groupRule")
    private WmComboGroupRuleVo groupRule;
    /**
    * 分组下套餐与单品关系信息
    */
    @SerializedName("comboSkuRelList")
    private List<WmComboSkuRelVo> comboSkuRelList;

    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public Integer getGroupType() {
        return groupType;
    }
    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }
    public WmComboGroupRuleVo getGroupRule() {
        return groupRule;
    }
    public void setGroupRule(WmComboGroupRuleVo groupRule) {
        this.groupRule = groupRule;
    }
    public List<WmComboSkuRelVo> getComboSkuRelList() {
        return comboSkuRelList;
    }
    public void setComboSkuRelList(List<WmComboSkuRelVo> comboSkuRelList) {
        this.comboSkuRelList = comboSkuRelList;
    }




    @Override
    public String toString() {
        return "WmComboGroupVo{" + "sequence=" + sequence + "," + "groupName=" + groupName + "," + "groupType=" + groupType + "," + "groupRule=" + groupRule + "," + "comboSkuRelList=" + comboSkuRelList + "}";
    }
}
