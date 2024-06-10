package com.meituan.sdk.model.wmoperNg.valueadded.getSystemLabels;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取系统标签
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/valueadded/getSystemLabels",
    businessId = 16,
    apiVersion = "10002",
    apiName = "get_system_labels",
    needAuth = true
)
public class GetSystemLabelsRequest implements MeituanRequest<GetSystemLabelsResponse> {



    @Override
    public MeituanResponse<GetSystemLabelsResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetSystemLabelsResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
