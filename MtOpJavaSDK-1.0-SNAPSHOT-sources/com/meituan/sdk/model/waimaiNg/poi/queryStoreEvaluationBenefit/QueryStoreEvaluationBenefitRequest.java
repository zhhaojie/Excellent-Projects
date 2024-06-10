package com.meituan.sdk.model.waimaiNg.poi.queryStoreEvaluationBenefit;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店实时评价权益
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/poi/queryStoreEvaluationBenefit",
    businessId = 2,
    apiVersion = "10008",
    apiName = "query_store_evaluation_benefit",
    needAuth = true
)
public class QueryStoreEvaluationBenefitRequest implements MeituanRequest<QueryStoreEvaluationBenefitResponse> {



    @Override
    public MeituanResponse<QueryStoreEvaluationBenefitResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryStoreEvaluationBenefitResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
