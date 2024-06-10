package com.meituan.sdk.model.ad.launch.cpmBatchUpdateBudget;

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
* cpm批量修改预算
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/cpm/batchUpdateBudget",
    businessId = 22,
    apiVersion = "10038",
    apiName = "cpm_batch_update_budget",
    needAuth = true
)
public class CpmBatchUpdateBudgetRequest implements MeituanRequest<CpmBatchUpdateBudgetResponse> {
    /**
    * <p data-diff-id="ct-diff-id-5bb36589-5d9b-4048-befc-6b5a32a27ea1">大小不超过50</p>
    */
    @NotEmpty(message = "batchOperateRequests不能为空")
    @SerializedName("batchOperateRequests")
    private List<BatchOperateRequest> batchOperateRequests;

    public List<BatchOperateRequest> getBatchOperateRequests() {
        return batchOperateRequests;
    }
    public void setBatchOperateRequests(List<BatchOperateRequest> batchOperateRequests) {
        this.batchOperateRequests = batchOperateRequests;
    }


    @Override
    public MeituanResponse<CpmBatchUpdateBudgetResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CpmBatchUpdateBudgetResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpmBatchUpdateBudgetRequest{" + "batchOperateRequests=" + batchOperateRequests + "}";
    }
}
