package com.meituan.sdk.model.wmoperNg.card.wmoperNgCardQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 安心卡查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/card/queryCard",
    businessId = 16,
    apiVersion = "10001",
    apiName = "wmoper_ng_card_query",
    needAuth = true
)
public class WmoperNgCardQueryRequest implements MeituanRequest<WmoperNgCardQueryResponse> {



    @Override
    public MeituanResponse<WmoperNgCardQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperNgCardQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
