package com.meituan.sdk.model.waimaiNg.valueadded.getCustomLabels;

import com.google.gson.annotations.SerializedName;

/**
* 当特征类型为1和2的时候，提供的供选择的特征值json数组，具体说明如下
* This file was automatically generated.
*/
public class LabelValue {
    /**
    * 特征值选项中文名，显示用
    */
    @SerializedName("label")
    private String label;
    /**
    * 描述
    */
    @SerializedName("desc")
    private String desc;
    /**
    * 取值，提交时需要提交
    */
    @SerializedName("value")
    private String value;

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }




    @Override
    public String toString() {
        return "LabelValue{" + "label=" + label + "," + "desc=" + desc + "," + "value=" + value + "}";
    }
}
