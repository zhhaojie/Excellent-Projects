package com.meituan.sdk.model.waimaiNg.dish.queryCategoryProperties;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 
* This file was automatically generated.
*/
public class PropertiesKeys {
    /**
    * 	 后台类目对应模板下属性ID
    */
    @NotNull(message = "code不能为空")
    @SerializedName("code")
    private Long code;
    /**
    * 后台类目对应模板下属性名称
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * 后台类目对应模板下属性父ID
    */
    @NotNull(message = "parentPropertyId不能为空")
    @SerializedName("parent_property_id")
    private Long parentPropertyId;
    /**
    * 	 1必填;2非必填
    */
    @NotNull(message = "isRequired不能为空")
    @SerializedName("is_required")
    private Integer isRequired;
    /**
    * (1: "单选");(2: "多选");(3: "输入");(4: "单选可输入");(5: "多选可添加");(6: "输入可添加");(7: "单选可添加")
    */
    @NotNull(message = "inputType不能为空")
    @SerializedName("input_type")
    private Integer inputType;
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
    * 子节点，结构相同
    */
    @NotEmpty(message = "child不能为空")
    @SerializedName("child")
    private List<PropertiesKeys> child;
    @NotBlank(message = "promptDocument不能为空")
    @SerializedName("prompt_document")
    private String promptDocument;

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
    public Long getParentPropertyId() {
        return parentPropertyId;
    }
    public void setParentPropertyId(Long parentPropertyId) {
        this.parentPropertyId = parentPropertyId;
    }
    public Integer getIsRequired() {
        return isRequired;
    }
    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }
    public Integer getInputType() {
        return inputType;
    }
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
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
    public List<PropertiesKeys> getChild() {
        return child;
    }
    public void setChild(List<PropertiesKeys> child) {
        this.child = child;
    }
    public String getPromptDocument() {
        return promptDocument;
    }
    public void setPromptDocument(String promptDocument) {
        this.promptDocument = promptDocument;
    }




    @Override
    public String toString() {
        return "PropertiesKeys{" + "code=" + code + "," + "name=" + name + "," + "parentPropertyId=" + parentPropertyId + "," + "isRequired=" + isRequired + "," + "inputType=" + inputType + "," + "level=" + level + "," + "isLeaf=" + isLeaf + "," + "sequence=" + sequence + "," + "child=" + child + "," + "promptDocument=" + promptDocument + "}";
    }
}
