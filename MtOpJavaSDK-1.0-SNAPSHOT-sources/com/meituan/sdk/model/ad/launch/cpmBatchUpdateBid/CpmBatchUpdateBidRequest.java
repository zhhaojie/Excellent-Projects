package com.meituan.sdk.model.ad.launch.cpmBatchUpdateBid;

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
* cpm批量更新出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/cpm/batchUpdateBid",
    businessId = 22,
    apiVersion = "10039",
    apiName = "cpm_batch_update_bid",
    needAuth = true
)
public class CpmBatchUpdateBidRequest implements MeituanRequest<CpmBatchUpdateBidResponse> {
    /**
    * <p data-diff-id="ct-diff-id-e917bf7d-510a-4fa0-98d8-3f2ca248f621">一批不超过50</p>
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
    public MeituanResponse<CpmBatchUpdateBidResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CpmBatchUpdateBidResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CpmBatchUpdateBidRequest{" + "batchOperateRequests=" + batchOperateRequests + "}";
    }
}
