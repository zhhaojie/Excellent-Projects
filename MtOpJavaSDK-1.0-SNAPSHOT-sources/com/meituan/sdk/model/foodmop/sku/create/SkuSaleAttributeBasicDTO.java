package com.meituan.sdk.model.foodmop.sku.create;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-96a8d3d6-6468-4d90-b9fc-4b571206f9df">组成该 SKU 的售卖属性列表</p>
* This file was automatically generated.
*/
public class SkuSaleAttributeBasicDTO {
    /**
    * <p data-diff-id="ct-diff-id-43d148d0-4a8c-49cc-a985-9c2776e6097e">售卖属性组名称</p>
    */
    @NotBlank(message = "attributeGroupName不能为空")
    @SerializedName("attributeGroupName")
    private String attributeGroupName;
    /**
    * <p data-diff-id="ct-diff-id-63029167-964f-4a47-ae56-58498e4ba293">售卖属性组编码<br></p>
    */
    @NotBlank(message = "attributeGroupCode不能为空")
    @SerializedName("attributeGroupCode")
    private String attributeGroupCode;
    /**
    * <p data-diff-id="ct-diff-id-d1dff027-e79a-4965-9eed-7ac6ef179203">售卖属性名称</p>
    */
    @NotBlank(message = "attributeName不能为空")
    @SerializedName("attributeName")
    private String attributeName;
    /**
    * <p data-diff-id="ct-diff-id-89234879-cc50-43b3-bfda-1769054490a4">售卖属性编码</p>
    */
    @NotBlank(message = "attributeCode不能为空")
    @SerializedName("attributeCode")
    private String attributeCode;

    public String getAttributeGroupName() {
        return attributeGroupName;
    }
    public void setAttributeGroupName(String attributeGroupName) {
        this.attributeGroupName = attributeGroupName;
    }
    public String getAttributeGroupCode() {
        return attributeGroupCode;
    }
    public void setAttributeGroupCode(String attributeGroupCode) {
        this.attributeGroupCode = attributeGroupCode;
    }
    public String getAttributeName() {
        return attributeName;
    }
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }
    public String getAttributeCode() {
        return attributeCode;
    }
    public void setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
    }




    @Override
    public String toString() {
        return "SkuSaleAttributeBasicDTO{" + "attributeGroupName=" + attributeGroupName + "," + "attributeGroupCode=" + attributeGroupCode + "," + "attributeName=" + attributeName + "," + "attributeCode=" + attributeCode + "}";
    }
}
