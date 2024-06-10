package com.meituan.sdk.model.wmoperNg.im.getPoiImStatus;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店IM状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/getPoiIMStatus",
    businessId = 16,
    apiVersion = "10008",
    apiName = "get_poi_im_status",
    needAuth = false
)
public class GetPoiImStatusRequest implements MeituanRequest<GetPoiImStatusResponse> {



    @Override
    public MeituanResponse<GetPoiImStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetPoiImStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
