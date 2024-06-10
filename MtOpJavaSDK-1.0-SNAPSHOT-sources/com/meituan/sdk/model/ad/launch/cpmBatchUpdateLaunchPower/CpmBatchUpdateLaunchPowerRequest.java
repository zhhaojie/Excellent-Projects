package com.meituan.sdk.model.ad.launch.cpmBatchUpdateLaunchPower;

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
* cpm批量修改投放状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/cpm/batchUpdate",
    businessId = 22,
    apiVersion = "10037",
    apiName = "cpm_batch_update_launch_power",
    needAuth = true
)
public class CpmBatchUpdateLaunchPowerRequest implements MeituanRequest<CpmBatchUpdateLaunchPowerResponse> {
    /**
    * <p data-diff-id="ct-diff-id-1fbc497d-10a2-4ac4-8566-af39c425d11f">一批不超过50</p>
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
    public MeituanResponse<CpmBatchUpdateLaunchPowerResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CpmBatchUpdateLaunchPowerResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpmBatchUpdateLaunchPowerRequest{" + "batchOperateRequests=" + batchOperateRequests + "}";
    }
}
