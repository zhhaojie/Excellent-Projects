package com.meituan.sdk.model.ad.report.dailyLaunchReportOffline;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 推广分日报告
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getDailyDataByLaunchOffline",
    businessId = 22,
    apiVersion = "10016",
    apiName = "daily_launch_report_offline",
    needAuth = false
)
public class DailyLaunchReportOfflineRequest implements MeituanRequest<List<LaunchInfo>> {
    /**
    * 推广id列表,单次最多支持50个
    */
    @SerializedName("launchIds")
    private List<Long> launchIds;
    /**
    * 平台（0全平台，1点评，2美团）
    */
    @NotNull(message = "platform不能为空")
    @SerializedName("platform")
    private Integer platform;
    /**
    * 查询开始时间
    */
    @NotBlank(message = "beginTime不能为空")
    @SerializedName("beginTime")
    private String beginTime;
    /**
    * 查询截止时间
    */
    @NotBlank(message = "endTime不能为空")
    @SerializedName("endTime")
    private String endTime;

    public List<Long> getLaunchIds() {
        return launchIds;
    }
    public void setLaunchIds(List<Long> launchIds) {
        this.launchIds = launchIds;
    }
    public Integer getPlatform() {
        return platform;
    }
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }
    public String getBeginTime() {
        return beginTime;
    }
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }


    @Override
    public MeituanResponse<List<LaunchInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LaunchInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DailyLaunchReportOfflineRequest{" + "launchIds=" + launchIds + "," + "platform=" + platform + "," + "beginTime=" + beginTime + "," + "endTime=" + endTime + "}";
    }
}
