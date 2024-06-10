package com.meituan.sdk.model.ad.launch.batchEditCpcPlanbudget;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改预算
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchEditCpcPlanBudget",
    businessId = 22,
    apiVersion = "10006",
    apiName = "batch_edit_cpc_planbudget",
    needAuth = false
)
public class BatchEditCpcPlanbudgetRequest implements MeituanRequest<BatchEditCpcPlanbudgetResponse> {
    /**
    * 批量修改预算,单次最多支持50个
    */
    @NotBlank(message = "launchs不能为空")
    @SerializedName("launchs")
    private String launchs;
    @SerializedName("sonAdaccountId")
    private Integer sonAdaccountId;

    public String getLaunchs() {
        return launchs;
    }
    public void setLaunchs(String launchs) {
        this.launchs = launchs;
    }
    public Integer getSonAdaccountId() {
        return sonAdaccountId;
    }
    public void setSonAdaccountId(Integer sonAdaccountId) {
        this.sonAdaccountId = sonAdaccountId;
    }


    @Override
    public MeituanResponse<BatchEditCpcPlanbudgetResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchEditCpcPlanbudgetResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchEditCpcPlanbudgetRequest{" + "launchs=" + launchs + "," + "sonAdaccountId=" + sonAdaccountId + "}";
    }
}
