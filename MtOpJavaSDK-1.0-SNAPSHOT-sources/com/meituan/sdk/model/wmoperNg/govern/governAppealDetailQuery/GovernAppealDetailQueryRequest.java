package com.meituan.sdk.model.wmoperNg.govern.governAppealDetailQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 申诉详情查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/govern/appeal/detail/query",
    businessId = 16,
    apiVersion = "10001",
    apiName = "govern_appeal_detail_query",
    needAuth = true
)
public class GovernAppealDetailQueryRequest implements MeituanRequest<GovernAppealDetailQueryResponse> {
    /**
    * <p>违规单Id</p>
    */
    @SerializedName("violationDetailId")
    private Long violationDetailId;

    public Long getViolationDetailId() {
        return violationDetailId;
    }
    public void setViolationDetailId(Long violationDetailId) {
        this.violationDetailId = violationDetailId;
    }


    @Override
    public MeituanResponse<GovernAppealDetailQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GovernAppealDetailQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GovernAppealDetailQueryRequest{" + "violationDetailId=" + violationDetailId + "}";
    }
}
