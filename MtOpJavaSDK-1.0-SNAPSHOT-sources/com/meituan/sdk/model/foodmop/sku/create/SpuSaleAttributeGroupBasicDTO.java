package com.meituan.sdk.model.foodmop.sku.create;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-c08d493d-bb9f-4403-9282-6c3fffdc1c7f">商品售卖属性基本信息</p>
* This file was automatically generated.
*/
public class SpuSaleAttributeGroupBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-e4bd4bc7-831c-4f57-9bbd-e428f37da685">属性组编码</p>
    */
    @NotBlank(message = "groupCode不能为空")
    @SerializedName("groupCode")
    private String groupCode;
    /**
    * <p data-diff-id="ct-diff-id-97bbe47d-5be7-4c50-b7cd-7c777a91e0b2">属性组名称</p>
    */
    @NotBlank(message = "groupName不能为空")
    @SerializedName("groupName")
    private String groupName;
    /**
    * <p data-diff-id="ct-diff-id-156c446a-ac60-49d2-8c3b-dfbdeb3c7110">属性组排序</p>
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
