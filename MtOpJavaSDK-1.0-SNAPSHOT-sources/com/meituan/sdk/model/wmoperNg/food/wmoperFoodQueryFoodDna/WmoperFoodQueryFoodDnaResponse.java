package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryFoodDna;

import com.google.gson.annotations.SerializedName;

/**
* 查询商品DNA
* This file was automatically generated.
*/
public class WmoperFoodQueryFoodDnaResponse {
    /**
    * 后台类目ID
    */
    @SerializedName("category_id")
    private Long categoryId;
    /**
    * 模板ID
    */
    @SerializedName("template_id")
    private Long templateId;
    /**
    * 后台类目对应模板下属性父ID
    */
    @SerializedName("parent_property_id")
    private Long parentPropertyId;
    /**
    * 后台类目对应模板下属性ID
    */
    @SerializedName("code")
    private Long code;
    /**
    * 后台类目对应模板下属性名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 后台类目对应模板下属性填的值
    */
    @SerializedName("value")
    private String value;
    /**
    * 后台类目对应模板下属性填的值的ID
    */
    @SerializedName("value_id")
    private Long valueId;
    /**
    * 层级
    */
    @SerializedName("level")
    private Integer level;
    /**
    * 是否叶子节点
    */
    @SerializedName("is_leaf")
    private Integer isLeaf;
    /**
    * 排序
    */
    @SerializedName("sequence")
    private Integer sequence;

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public Long getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    public Long getParentPropertyId() {
        return parentPropertyId;
    }
    public void setParentPropertyId(Long parentPropertyId) {
        this.parentPropertyId = parentPropertyId;
    }
    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public Long getValueId() {
        return valueId;
    }
    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }
    public Integer getLevel() {
        return level;
    }
    public void setLevel(Integer level) {
        this.level = level;
    }
    public Integer getIsLeaf() {
        return isLeaf;
    }
    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }
    public Integer getSequence() {
        return sequence;
    }
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }




    @Override
    public String toString() {
        return "WmoperFoodQueryFoodDnaResponse{" + "categoryId=" + categoryId + "," + "templateId=" + templateId + "," + "parentPropertyId=" + parentPropertyId + "," + "code=" + code + "," + "name=" + name + "," + "value=" + value + "," + "valueId=" + valueId + "," + "level=" + level + "," + "isLeaf=" + isLeaf + "," + "sequence=" + sequence + "}";
    }
}
