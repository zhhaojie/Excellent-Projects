package com.meituan.sdk.model.wmoperNg.order.zbLogisticsPreview;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class WmUserTaskBMLDetail {
    /**
    * 惊喜立减id
    */
    @SerializedName("userTaskId")
    private Long userTaskId;
    /**
    * 惊喜立减taskId
    */
    @SerializedName("taskId")
    private Long taskId;
    /**
    * 惊喜立减金额 元
    */
    @SerializedName("bmlAmount")
    private Double bmlAmount;

    public Long getUserTaskId() {
        return userTaskId;
    }
    public void setUserTaskId(Long userTaskId) {
        this.userTaskId = userTaskId;
    }
    public Long getTaskId() {
        return taskId;
    }
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
    public Double getBmlAmount() {
        return bmlAmount;
    }
    public void setBmlAmount(Double bmlAmount) {
        this.bmlAmount = bmlAmount;
    }




    @Override
    public String toString() {
        return "WmUserTaskBMLDetail{" + "userTaskId=" + userTaskId + "," + "taskId=" + taskId + "," + "bmlAmount=" + bmlAmount + "}";
    }
}
