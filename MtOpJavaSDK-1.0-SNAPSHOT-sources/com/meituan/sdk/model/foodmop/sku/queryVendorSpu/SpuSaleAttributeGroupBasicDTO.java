package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 商品售卖属性组基本信息
* This file was automatically generated.
*/
public class SpuSaleAttributeGroupBasicDTO {
    /**
    * 属性组编码
    */
    @NotBlank(message = "groupCode不能为空")
    @SerializedName("groupCode")
    private String groupCode;
    /**
    * 属性组名称
    */
    @NotBlank(message = "groupName不能为空")
    @SerializedName("groupName")
    private String groupName;
    /**
    * 属性组排序
    */
    @NotNull(message = "rank不能为空")
    @SerializedName("rank")
    private Integer rank;

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




    @Override
    public String toString() {
        return "SpuSaleAttributeGroupBasicDTO{" + "groupCode=" + groupCode + "," + "groupName=" + groupName + "," + "rank=" + rank + "}";
    }
}
