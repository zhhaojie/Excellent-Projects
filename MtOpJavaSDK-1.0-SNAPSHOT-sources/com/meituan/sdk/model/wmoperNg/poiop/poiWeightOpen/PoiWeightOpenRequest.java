package com.meituan.sdk.model.wmoperNg.poiop.poiWeightOpen;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店开启加权
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poiop/poi/weight/open",
    businessId = 16,
    apiVersion = "10002",
    apiName = "poi_weight_open",
    needAuth = true
)
public class PoiWeightOpenRequest implements MeituanRequest<PoiWeightOpenResponse> {



    @Override
    public MeituanResponse<PoiWeightOpenResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<PoiWeightOpenResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
