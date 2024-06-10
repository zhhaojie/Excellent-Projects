package com.meituan.sdk.model.dcps.fulfill.groupbuyOrderLogs;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 套餐配送-查询轨迹
* This file was automatically generated.
*/
public class GroupbuyOrderLogsResponse {
    @SerializedName("message")
    private String message;
    @SerializedName("code")
    private Integer code;
    @SerializedName("logDetails")
    private List<LogDetail> logDetails;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public List<LogDetail> getLogDetails() {
        return logDetails;
    }
    public void setLogDetails(List<LogDetail> logDetails) {
        this.logDetails = logDetails;
    }




    @Override
    public String toString() {
        return "GroupbuyOrderLogsResponse{" + "message=" + message + "," + "code=" + code + "," + "logDetails=" + logDetails + "}";
    }
}
