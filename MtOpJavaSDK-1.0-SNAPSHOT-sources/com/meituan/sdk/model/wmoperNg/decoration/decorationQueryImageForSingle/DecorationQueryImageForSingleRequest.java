package com.meituan.sdk.model.wmoperNg.decoration.decorationQueryImageForSingle;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台查询招牌
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decoration/queryImageForSingle",
    businessId = 16,
    apiVersion = "10000",
    apiName = "decoration_query_image_for_single",
    needAuth = true
)
public class DecorationQueryImageForSingleRequest implements MeituanRequest<List<DecorationQueryImageForSingleResponse>> {



    @Override
    public MeituanResponse<List<DecorationQueryImageForSingleResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<DecorationQueryImageForSingleResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
