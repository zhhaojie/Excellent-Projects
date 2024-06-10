package com.meituan.sdk.model.wmoperNg.waimaiad.waimaiPoiInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取商家基本信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/common/wmpoiinfo",
    businessId = 16,
    apiVersion = "10006",
    apiName = "waimai_poi_info",
    needAuth = false
)
public class WaimaiPoiInfoRequest implements MeituanRequest<WaimaiPoiInfoResponse> {



    @Override
    public MeituanResponse<WaimaiPoiInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WaimaiPoiInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
