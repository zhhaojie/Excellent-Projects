package com.meituan.sdk.model.wmoperNg.valueadded.taskResultQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class TaskResultQueryResponse {
    @SerializedName("sendNum")
    private Long sendNum;
    @SerializedName("sendTime")
    private Long sendTime;
    @SerializedName("successUser")
    private List<Long> successUser;
    @SerializedName("failUser")
    private List<FailUser> failUser;

    public Long getSendNum() {
        return sendNum;
    }
    public void setSendNum(Long sendNum) {
        this.sendNum = sendNum;
    }
    public Long getSendTime() {
        return sendTime;
    }
    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }
    public List<Long> getSuccessUser() {
        return successUser;
    }
    public void setSuccessUser(List<Long> successUser) {
        this.successUser = successUser;
    }
    public List<FailUser> getFailUser() {
        return failUser;
    }
    public void setFailUser(List<FailUser> failUser) {
        this.failUser = failUser;
    }




    @Override
    public String toString() {
        return "TaskResultQueryResponse{" + "sendNum=" + sendNum + "," + "sendTime=" + sendTime + "," + "successUser=" + successUser + "," + "failUser=" + failUser + "}";
    }
}
