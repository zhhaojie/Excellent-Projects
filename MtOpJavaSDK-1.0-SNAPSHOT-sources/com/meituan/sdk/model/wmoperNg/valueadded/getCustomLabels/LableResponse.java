package com.meituan.sdk.model.wmoperNg.valueadded.getCustomLabels;

import com.google.gson.annotations.SerializedName;

/**
* 自定义标签列表，每个列表元素是一个特征模版json,json里的属性对应不同的特征。示例如下：
* This file was automatically generated.
*/
public class LableResponse {
    /**
    * 特征中文名，显示用
    */
    @SerializedName("name")
    private String name;
    /**
    * 特征英文名，提交时需要提交特征英文名
    */
    @SerializedName("field")
    private String field;
    /**
    * 特征类型：1 单值，2 多值 ,3 文本。如果是1，则提交对应特征值时只能提交一个，如果是2，则可以提交多个值，如果是3，则可以自己填写值。
    */
    @SerializedName("type")
    private String type;
    /**
    * 是否必填，true必填，false非必填
    */
    @SerializedName("required")
    private String required;
    /**
    * 当特征类型为1和2的时候，提供的供选择的特征值json数组，具体说明如下
    */
    @SerializedName("labelValue")
    private LabelValue labelValue;
    /**
    * 这个特征的描述说明，包括它的提填写规则说明。
    */
    @SerializedName("desc")
    private String desc;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getRequired() {
        return required;
    }
    public void setRequired(String required) {
        this.required = required;
    }
    public LabelValue getLabelValue() {
        return labelValue;
    }
    public void setLabelValue(LabelValue labelValue) {
        this.labelValue = labelValue;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }




    @Override
    public String toString() {
        return "LableResponse{" + "name=" + name + "," + "field=" + field + "," + "type=" + type + "," + "required=" + required + "," + "labelValue=" + labelValue + "," + "desc=" + desc + "}";
    }
}
