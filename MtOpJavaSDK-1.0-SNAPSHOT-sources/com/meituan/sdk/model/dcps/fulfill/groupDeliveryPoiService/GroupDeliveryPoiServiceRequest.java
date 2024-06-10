package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiService;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 团购配送门店服务接口，用于获取门店信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/getPoiInfo",
    businessId = 46,
    apiVersion = "10000",
    apiName = "group_delivery_poi_service",
    needAuth = true
)
public class GroupDeliveryPoiServiceRequest implements MeituanRequest<GroupDeliveryPoiServiceResponse> {



    @Override
    public MeituanResponse<GroupDeliveryPoiServiceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupDeliveryPoiServiceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
