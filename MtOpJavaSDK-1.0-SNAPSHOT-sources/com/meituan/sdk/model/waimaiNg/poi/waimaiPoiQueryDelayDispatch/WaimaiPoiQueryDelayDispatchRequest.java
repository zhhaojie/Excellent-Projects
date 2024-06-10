package com.meituan.sdk.model.waimaiNg.poi.waimaiPoiQueryDelayDispatch;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店是否延迟发配送
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/poi/queryDelayDispatch",
    businessId = 2,
    apiVersion = "10000",
    apiName = "waimai_poi_query_delay_dispatch",
    needAuth = false
)
public class WaimaiPoiQueryDelayDispatchRequest implements MeituanRequest<WaimaiPoiQueryDelayDispatchResponse> {



    @Override
    public MeituanResponse<WaimaiPoiQueryDelayDispatchResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WaimaiPoiQueryDelayDispatchResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
