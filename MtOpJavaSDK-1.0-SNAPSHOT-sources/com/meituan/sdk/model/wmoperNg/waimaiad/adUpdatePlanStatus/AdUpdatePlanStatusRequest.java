package com.meituan.sdk.model.wmoperNg.waimaiad.adUpdatePlanStatus;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改广告投放计划状态（不能新建）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/plan/update/status",
    businessId = 16,
    apiVersion = "10005",
    apiName = "ad_update_plan_status",
    needAuth = false
)
public class AdUpdatePlanStatusRequest implements MeituanRequest<AdUpdatePlanStatusResponse> {
    /**
    * 外卖广告的产品类型，1表示点金推广
    */
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Integer channel;
    /**
    * 计划状态。0：开启，1：关闭
    */
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Integer status;

    public Integer getChannel() {
        return channel;
    }
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public MeituanResponse<AdUpdatePlanStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdUpdatePlanStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdUpdatePlanStatusRequest{" + "channel=" + channel + "," + "status=" + status + "}";
    }
}
