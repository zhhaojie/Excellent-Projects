package com.meituan.sdk.model.waimaiNg.decoration.queryImageForSingle;

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
    path = "/waimai/ng/decoration/queryImageForSingle",
    businessId = 2,
    apiVersion = "10001",
    apiName = "query_image_for_single",
    needAuth = false
)
public class QueryImageForSingleRequest implements MeituanRequest<List<ImageForSingleInfo>> {



    @Override
    public MeituanResponse<List<ImageForSingleInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<ImageForSingleInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
