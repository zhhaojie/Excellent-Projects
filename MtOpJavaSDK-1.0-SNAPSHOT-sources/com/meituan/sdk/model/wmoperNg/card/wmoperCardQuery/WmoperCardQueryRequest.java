package com.meituan.sdk.model.wmoperNg.card.wmoperCardQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 非接单查询安心卡
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/card/queryCard",
    businessId = 16,
    apiVersion = "10000",
    apiName = "wmoper_card_query",
    needAuth = true
)
public class WmoperCardQueryRequest implements MeituanRequest<WmoperCardQueryResponse> {



    @Override
    public MeituanResponse<WmoperCardQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperCardQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
