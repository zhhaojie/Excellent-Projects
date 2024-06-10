package com.meituan.sdk.model.wmoperNg.valueadded.getSystemLabels;

import com.google.gson.annotations.SerializedName;

/**
* 系统标签列表
* This file was automatically generated.
*/
public class LabelList {
    /**
    * 系统标签id
    */
    @SerializedName("labelId")
    private Long labelId;
    /**
    * 标签名称
    */
    @SerializedName("name")
    private String name;
    /**
    * 描述
    */
    @SerializedName("desc")
    private String desc;

    public Long getLabelId() {
        return labelId;
    }
    public void setLabelId(Long labelId) {
        this.labelId = labelId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }




    @Override
    public String toString() {
        return "LabelList{" + "labelId=" + labelId + "," + "name=" + name + "," + "desc=" + desc + "}";
    }
}
