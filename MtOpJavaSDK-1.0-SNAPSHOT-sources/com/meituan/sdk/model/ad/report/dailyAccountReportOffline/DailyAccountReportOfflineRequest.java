package com.meituan.sdk.model.ad.report.dailyAccountReportOffline;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 账户分日报告
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getDailyDataByAccountOffline",
    businessId = 22,
    apiVersion = "10014",
    apiName = "daily_account_report_offline",
    needAuth = false
)
public class DailyAccountReportOfflineRequest implements MeituanRequest<List<Data>> {
    /**
    * 查询范围开始时间
    */
    @NotBlank(message = "beginTime不能为空")
    @SerializedName("beginTime")
    private String beginTime;
    /**
    * 查询范围截止时间
    */
    @NotBlank(message = "endTime不能为空")
    @SerializedName("endTime")
    private String endTime;

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
    public MeituanResponse<List<Data>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Data>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DailyAccountReportOfflineRequest{" + "beginTime=" + beginTime + "," + "endTime=" + endTime + "}";
    }
}
