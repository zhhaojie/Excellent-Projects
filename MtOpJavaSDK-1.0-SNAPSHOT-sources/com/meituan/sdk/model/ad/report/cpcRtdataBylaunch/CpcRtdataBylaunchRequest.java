package com.meituan.sdk.model.ad.report.cpcRtdataBylaunch;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* cpc推广实时天数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getCpcRtDataByLaunch",
    businessId = 22,
    apiVersion = "10015",
    apiName = "cpc_rtdata_bylaunch",
    needAuth = false
)
public class CpcRtdataBylaunchRequest implements MeituanRequest<List<LaunchInfo>> {
    /**
    * 推广id列表,单次最多支持50个
    */
    @SerializedName("launchIds")
    private List<Long> launchIds;
    /**
    * 平台，默认全部
    */
    @SerializedName("platform")
    private Integer platform;
    /**
    * 子账号id
    */
    @SerializedName("accountId")
    private Integer accountId;

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
    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
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
        return "CpcRtdataBylaunchRequest{" + "launchIds=" + launchIds + "," + "platform=" + platform + "," + "accountId=" + accountId + "}";
    }
}
