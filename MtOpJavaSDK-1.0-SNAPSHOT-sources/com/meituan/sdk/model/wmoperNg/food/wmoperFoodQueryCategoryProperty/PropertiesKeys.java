package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryCategoryProperty;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class PropertiesKeys {
    /**
    * 分类ID
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
    * (1: "单选");(2: "多选");(3: "输入");(4: "单选可输入");(5: "多选可添加");(6: "输入可添加");(7: "单选可添加")
    */
    @SerializedName("input_type")
    private Integer inputType;
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
    * 子节点，结构相同
    */
    @SerializedName("child")
    private List<PropertiesKeys> child;
    /**
    * 1必填;2非必填
    */
    @SerializedName("is_required")
    private Integer isRequired;

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
    public Integer getInputType() {
        return inputType;
    }
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
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
    public List<PropertiesKeys> getChild() {
        return child;
    }
    public void setChild(List<PropertiesKeys> child) {
        this.child = child;
    }
    public Integer getIsRequired() {
        return isRequired;
    }
    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }




    @Override
    public String toString() {
        return "PropertiesKeys{" + "categoryId=" + categoryId + "," + "templateId=" + templateId + "," + "parentPropertyId=" + parentPropertyId + "," + "code=" + code + "," + "name=" + name + "," + "value=" + value + "," + "valueId=" + valueId + "," + "level=" + level + "," + "inputType=" + inputType + "," + "isLeaf=" + isLeaf + "," + "sequence=" + sequence + "," + "child=" + child + "," + "isRequired=" + isRequired + "}";
    }
}
