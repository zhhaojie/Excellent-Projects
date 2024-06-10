package com.meituan.sdk.model.ad.launch.batchQueryCpcLaunchinfos;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 获取推广信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchQueryCpcLaunchInfos",
    businessId = 22,
    apiVersion = "10014",
    apiName = "batch_query_cpc_launchinfos",
    needAuth = false
)
public class BatchQueryCpcLaunchinfosRequest implements MeituanRequest<List<LaunchInfo>> {
    /**
    * 需要查询的推广id,单次最多支持50个
    */
    @NotEmpty(message = "launchIds不能为空")
    @SerializedName("launchIds")
    private List<Long> launchIds;
    @SerializedName("sonAdaccountId")
    private Integer sonAdaccountId;

    public List<Long> getLaunchIds() {
        return launchIds;
    }
    public void setLaunchIds(List<Long> launchIds) {
        this.launchIds = launchIds;
    }
    public Integer getSonAdaccountId() {
        return sonAdaccountId;
    }
    public void setSonAdaccountId(Integer sonAdaccountId) {
        this.sonAdaccountId = sonAdaccountId;
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
        return "BatchQueryCpcLaunchinfosRequest{" + "launchIds=" + launchIds + "," + "sonAdaccountId=" + sonAdaccountId + "}";
    }
}
