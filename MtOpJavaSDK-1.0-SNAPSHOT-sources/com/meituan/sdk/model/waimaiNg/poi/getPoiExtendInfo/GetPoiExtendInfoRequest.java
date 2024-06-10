package com.meituan.sdk.model.waimaiNg.poi.getPoiExtendInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店二维码
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/poi/getPoiExtendInfo",
    businessId = 2,
    apiVersion = "10006",
    apiName = "get_poi_extend_info",
    needAuth = true
)
public class GetPoiExtendInfoRequest implements MeituanRequest<GetPoiExtendInfoResponse> {



    @Override
    public MeituanResponse<GetPoiExtendInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetPoiExtendInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
