package com.meituan.sdk.model.waimaiNg.card.queryCard;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询安心卡
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/card/query",
    businessId = 2,
    apiVersion = "10010",
    apiName = "query_card",
    needAuth = false
)
public class QueryCardRequest implements MeituanRequest<QueryCardResponse> {



    @Override
    public MeituanResponse<QueryCardResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCardResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
