package com.meituan.sdk.model.waimaiNg.govern.governViolationScoreQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 积分信息查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/govern/violation/score/query",
    businessId = 2,
    apiVersion = "10001",
    apiName = "govern_violation_score_query",
    needAuth = true
)
public class GovernViolationScoreQueryRequest implements MeituanRequest<GovernViolationScoreQueryResponse> {



    @Override
    public MeituanResponse<GovernViolationScoreQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GovernViolationScoreQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
