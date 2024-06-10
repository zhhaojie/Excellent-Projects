package com.meituan.sdk.model.wmoperNg.food.wmoperFoodBatchQueryFoodDna;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 模板信息
* This file was automatically generated.
*/
public class Property {
    /**
    * 后台类目对应模板下属性ID
    */
    @SerializedName("code")
    private Long code;
    /**
    * 模板ID
    */
    @SerializedName("template_id")
    private Long templateId;
    /**
    * 后台类目id
    */
    @SerializedName("category_id")
    private Long categoryId;
    /**
    * 后台类目对应模板下属性父ID
    */
    @SerializedName("parent_property_id")
    private Long parentPropertyId;
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
    /**
    * 子节点
    */
    @SerializedName("child")
    private List<String> child;

    public Long getCode() {
        return code;
    }
    public void setCode(Long code) {
        this.code = code;
    }
    public Long getTemplateId() {
        return templateId;
    }
    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
    public Long getParentPropertyId() {
        return parentPropertyId;
    }
    public void setParentPropertyId(Long parentPropertyId) {
        this.parentPropertyId = parentPropertyId;
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
    public List<String> getChild() {
        return child;
    }
    public void setChild(List<String> child) {
        this.child = child;
    }




    @Override
    public String toString() {
        return "Property{" + "code=" + code + "," + "templateId=" + templateId + "," + "categoryId=" + categoryId + "," + "parentPropertyId=" + parentPropertyId + "," + "name=" + name + "," + "value=" + value + "," + "valueId=" + valueId + "," + "level=" + level + "," + "isLeaf=" + isLeaf + "," + "sequence=" + sequence + "," + "child=" + child + "}";
    }
}
