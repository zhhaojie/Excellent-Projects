package com.meituan.sdk.model.wmoperNg.food.dishComboBatchsave;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* <p><font style="font-size:14px;line-height:22px" data-size="14">分组可选套餐 的分组信息</font></p><p></p><p>套餐为可选分组套餐时，需要传入</p><p>当套餐为固定搭配套餐时，不传入</p><p></p><p><font style="font-size:14px;line-height:22px" data-size="14">限制分组数量最多为5个</font></p>
* This file was automatically generated.
*/
public class WmComboGroup {
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">套餐分组展示顺序，默认从1开始</font></p>
    */
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">分组名称</font></p><p></p><p><font style="font-size:14px;line-height:22px" data-size="14">长度限制 10</font></p>
    */
    @NotBlank(message = "groupName不能为空")
    @SerializedName("groupName")
    private String groupName;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">传1，代表非固定分组</font></p><p><font style="font-size:14px;line-height:22px" data-size="14">传0，代表固定分组</font></p>
    */
    @NotNull(message = "groupType不能为空")
    @SerializedName("groupType")
    private Integer groupType;
    /**
    * <p>套餐分组规则，固定分组不需要传，非固定分组需要传递</p>
    */
    @SerializedName("groupRule")
    private WmComboGroupRule groupRule;
    /**
    * <p><font style="font-size:14px;line-height:22px" data-size="14">分组下套餐关系信息</font></p>
    */
    @NotEmpty(message = "comboSkuRelList不能为空")
    @SerializedName("comboSkuRelList")
    private List<WmComboSkuRel> comboSkuRelList;

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
    public WmComboGroupRule getGroupRule() {
        return groupRule;
    }
    public void setGroupRule(WmComboGroupRule groupRule) {
        this.groupRule = groupRule;
    }
    public List<WmComboSkuRel> getComboSkuRelList() {
        return comboSkuRelList;
    }
    public void setComboSkuRelList(List<WmComboSkuRel> comboSkuRelList) {
        this.comboSkuRelList = comboSkuRelList;
    }




    @Override
    public String toString() {
        return "WmComboGroup{" + "sequence=" + sequence + "," + "groupName=" + groupName + "," + "groupType=" + groupType + "," + "groupRule=" + groupRule + "," + "comboSkuRelList=" + comboSkuRelList + "}";
    }
}
