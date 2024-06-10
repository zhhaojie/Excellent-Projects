package com.meituan.sdk.model.waimaiNg.decoration.bossRecommendQuery;

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
    path = "/waimai/ng/decoration/bossRecommendQuery",
    businessId = 2,
    apiVersion = "10001",
    apiName = "boss_recommend_query",
    needAuth = false
)
public class BossRecommendQueryRequest implements MeituanRequest<BossRecommendQueryResponse> {



    @Override
    public MeituanResponse<BossRecommendQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BossRecommendQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
