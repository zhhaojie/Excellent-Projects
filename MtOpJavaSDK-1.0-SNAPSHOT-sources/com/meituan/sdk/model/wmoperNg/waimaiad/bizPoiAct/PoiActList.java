package com.meituan.sdk.model.wmoperNg.waimaiad.bizPoiAct;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class PoiActList {
    @NotNull(message = "wmActType不能为空")
    @SerializedName("wmActType")
    private Long wmActType;
    @NotBlank(message = "detail不能为空")
    @SerializedName("detail")
    private String detail;
    @NotNull(message = "priority不能为空")
    @SerializedName("priority")
    private Long priority;
    @NotNull(message = "startTime不能为空")
    @SerializedName("startTime")
    private Long startTime;
    @NotNull(message = "endTime不能为空")
    @SerializedName("endTime")
    private Long endTime;
    @NotNull(message = "dt不能为空")
    @SerializedName("dt")
    private Long dt;

    public Long getWmActType() {
        return wmActType;
    }
    public void setWmActType(Long wmActType) {
        this.wmActType = wmActType;
    }
    public String getDetail() {
        return detail;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public Long getPriority() {
        return priority;
    }
    public void setPriority(Long priority) {
        this.priority = priority;
    }
    public Long getStartTime() {
        return startTime;
    }
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }
    public Long getEndTime() {
        return endTime;
    }
    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
    public Long getDt() {
        return dt;
    }
    public void setDt(Long dt) {
        this.dt = dt;
    }




    @Override
    public String toString() {
        return "PoiActList{" + "wmActType=" + wmActType + "," + "detail=" + detail + "," + "priority=" + priority + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "dt=" + dt + "}";
    }
}
