package com.meituan.sdk.model.wmoperNg.waimaiad.adUpdatePlanBudget;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改广告投放计划预算
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/plan/update/budget",
    businessId = 16,
    apiVersion = "10005",
    apiName = "ad_update_plan_budget",
    needAuth = false
)
public class AdUpdatePlanBudgetRequest implements MeituanRequest<AdUpdatePlanBudgetResponse> {
    /**
    * 外卖广告的产品类型，1表示点金推广
    */
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Integer channel;
    /**
    * 预算，单位分
    */
    @NotNull(message = "budget不能为空")
    @SerializedName("budget")
    private Integer budget;

    public Integer getChannel() {
        return channel;
    }
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
    public Integer getBudget() {
        return budget;
    }
    public void setBudget(Integer budget) {
        this.budget = budget;
    }


    @Override
    public MeituanResponse<AdUpdatePlanBudgetResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdUpdatePlanBudgetResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdUpdatePlanBudgetRequest{" + "channel=" + channel + "," + "budget=" + budget + "}";
    }
}
