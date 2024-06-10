package com.meituan.sdk.model.wmoperNg.waimaiad.adAppBuyInfo;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 获取商家购买的应用信息
* This file was automatically generated.
*/
public class AdAppBuyInfoResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "valid不能为空")
    @SerializedName("valid")
    private Long valid;
    @NotBlank(message = "version不能为空")
    @SerializedName("version")
    private String version;
    @NotNull(message = "days不能为空")
    @SerializedName("days")
    private Long days;
    @NotNull(message = "startTime不能为空")
    @SerializedName("startTime")
    private Long startTime;
    @NotNull(message = "endTime不能为空")
    @SerializedName("endTime")
    private Long endTime;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public Long getValid() {
        return valid;
    }
    public void setValid(Long valid) {
        this.valid = valid;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    public Long getDays() {
        return days;
    }
    public void setDays(Long days) {
        this.days = days;
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




    @Override
    public String toString() {
        return "AdAppBuyInfoResponse{" + "result=" + result + "," + "valid=" + valid + "," + "version=" + version + "," + "days=" + days + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "}";
    }
}
