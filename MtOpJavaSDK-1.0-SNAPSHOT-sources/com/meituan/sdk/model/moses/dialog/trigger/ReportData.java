package com.meituan.sdk.model.moses.dialog.trigger;

import com.google.gson.annotations.SerializedName;

/**
* 上报数据节点
* This file was automatically generated.
*/
public class ReportData {
    /**
    * 意图ID列表
    */
    @SerializedName("intentIdList")
    private String intentIdList;
    /**
    * 当前轮对话之后是否还处于Task执行中
    */
    @SerializedName("isInTask")
    private String isInTask;

    public String getIntentIdList() {
        return intentIdList;
    }
    public void setIntentIdList(String intentIdList) {
        this.intentIdList = intentIdList;
    }
    public String getIsInTask() {
        return isInTask;
    }
    public void setIsInTask(String isInTask) {
        this.isInTask = isInTask;
    }




    @Override
    public String toString() {
        return "ReportData{" + "intentIdList=" + intentIdList + "," + "isInTask=" + isInTask + "}";
    }
}
