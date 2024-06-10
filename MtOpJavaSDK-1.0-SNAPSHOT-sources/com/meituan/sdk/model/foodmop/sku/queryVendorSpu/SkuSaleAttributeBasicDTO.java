package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* 组成该 SKU 的售卖属性列表
* This file was automatically generated.
*/
public class SkuSaleAttributeBasicDTO {
    /**
    * 售卖属性组名称
    */
    @NotBlank(message = "attributeGroupName不能为空")
    @SerializedName("attributeGroupName")
    private String attributeGroupName;
    /**
    * 售卖属性组编码
    */
    @NotBlank(message = "attributeGroupCode不能为空")
    @SerializedName("attributeGroupCode")
    private String attributeGroupCode;
    /**
    * 售卖属性名称
    */
    @NotBlank(message = "attributeName不能为空")
    @SerializedName("attributeName")
    private String attributeName;
    /**
    * 售卖属性编码
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
