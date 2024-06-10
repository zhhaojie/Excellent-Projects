package com.meituan.sdk.model.waimaiNg.dish.batchQueryFoodDna;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 模板信息
* This file was automatically generated.
*/
public class PropertiesValue {
    /**
    * 后台类目对应模板下属性ID
    */
    @NotNull(message = "code不能为空")
    @SerializedName("code")
    private Long code;
    /**
    * 模板ID
    */
    @NotNull(message = "templateId不能为空")
    @SerializedName("template_id")
    private Long templateId;
    /**
    * 后台类目id
    */
    @NotNull(message = "categoryId不能为空")
    @SerializedName("category_id")
    private Long categoryId;
    /**
    * 后台类目对应模板下属性父ID
    */
    @NotNull(message = "parentPropertyId不能为空")
    @SerializedName("parent_property_id")
    private Long parentPropertyId;
    /**
    * 后台类目对应模板下属性名称
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * 后台类目对应模板下属性填的值
    */
    @NotBlank(message = "value不能为空")
    @SerializedName("value")
    private String value;
    /**
    * 后台类目对应模板下属性填的值的ID
    */
    @NotNull(message = "valueId不能为空")
    @SerializedName("value_id")
    private Long valueId;
    /**
    * 层级
    */
    @NotNull(message = "level不能为空")
    @SerializedName("level")
    private Integer level;
    /**
    * 是否叶子节点
    */
    @NotNull(message = "isLeaf不能为空")
    @SerializedName("is_leaf")
    private Integer isLeaf;
    /**
    * 排序
    */
    @NotNull(message = "sequence不能为空")
    @SerializedName("sequence")
    private Integer sequence;
    /**
    * 子节点
    */
    @NotEmpty(message = "child不能为空")
    @SerializedName("child")
    private List<PropertiesValue> child;

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
    public List<PropertiesValue> getChild() {
        return child;
    }
    public void setChild(List<PropertiesValue> child) {
        this.child = child;
    }




    @Override
    public String toString() {
        return "PropertiesValue{" + "code=" + code + "," + "templateId=" + templateId + "," + "categoryId=" + categoryId + "," + "parentPropertyId=" + parentPropertyId + "," + "name=" + name + "," + "value=" + value + "," + "valueId=" + valueId + "," + "level=" + level + "," + "isLeaf=" + isLeaf + "," + "sequence=" + sequence + "," + "child=" + child + "}";
    }
}
