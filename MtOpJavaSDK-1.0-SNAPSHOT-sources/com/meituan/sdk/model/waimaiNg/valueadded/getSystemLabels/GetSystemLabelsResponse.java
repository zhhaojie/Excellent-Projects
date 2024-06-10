package com.meituan.sdk.model.waimaiNg.valueadded.getSystemLabels;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 获取系统标签
* This file was automatically generated.
*/
public class GetSystemLabelsResponse {
    /**
    * 系统标签列表
    */
    @SerializedName("labelList")
    private List<LabelList> labelList;

    public List<LabelList> getLabelList() {
        return labelList;
    }
    public void setLabelList(List<LabelList> labelList) {
        this.labelList = labelList;
    }




    @Override
    public String toString() {
        return "GetSystemLabelsResponse{" + "labelList=" + labelList + "}";
    }
}
