package com.meituan.sdk.model.waimaiNg.poi.waimaiPoiClose;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店置休息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/poi/close",
    businessId = 2,
    apiVersion = "10015",
    apiName = "waimai_poi_close",
    needAuth = true
)
public class WaimaiPoiCloseRequest implements MeituanRequest<String> {



    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
