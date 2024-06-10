package com.meituan.sdk.model.wmoperNg.decoration.decorationBossRecommendQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台查询老板推荐
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decoration/bossRecommendQuery",
    businessId = 16,
    apiVersion = "10000",
    apiName = "decoration_boss_recommend_query",
    needAuth = true
)
public class DecorationBossRecommendQueryRequest implements MeituanRequest<DecorationBossRecommendQueryResponse> {



    @Override
    public MeituanResponse<DecorationBossRecommendQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<DecorationBossRecommendQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
