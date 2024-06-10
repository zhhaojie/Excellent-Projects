package com.meituan.sdk.model.ad.launch.queryCpcLaunchids;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取推广id列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryCpcLaunchIds",
    businessId = 22,
    apiVersion = "10008",
    apiName = "query_cpc_launchids",
    needAuth = false
)
public class QueryCpcLaunchidsRequest implements MeituanRequest<List<LaunchObj>> {
    /**
    * 1有效，2过期，3暂停，4审核中，5审核驳回 6 删除 8 未投放（推广计划暂停） 9待推广，10 状态异常
    */
    @SerializedName("status")
    private List<Integer> status;
    @SerializedName("sonAdaccountId")
    private Integer sonAdaccountId;

    public List<Integer> getStatus() {
        return status;
    }
    public void setStatus(List<Integer> status) {
        this.status = status;
    }
    public Integer getSonAdaccountId() {
        return sonAdaccountId;
    }
    public void setSonAdaccountId(Integer sonAdaccountId) {
        this.sonAdaccountId = sonAdaccountId;
    }


    @Override
    public MeituanResponse<List<LaunchObj>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LaunchObj>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCpcLaunchidsRequest{" + "status=" + status + "," + "sonAdaccountId=" + sonAdaccountId + "}";
    }
}
