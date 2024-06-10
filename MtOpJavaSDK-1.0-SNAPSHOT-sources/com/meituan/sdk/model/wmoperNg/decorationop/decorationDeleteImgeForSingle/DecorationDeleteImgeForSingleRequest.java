package com.meituan.sdk.model.wmoperNg.decorationop.decorationDeleteImgeForSingle;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台删除招牌
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/decorationop/deleteImgeForSingle",
    businessId = 16,
    apiVersion = "10000",
    apiName = "decoration_delete_imge_for_single",
    needAuth = true
)
public class DecorationDeleteImgeForSingleRequest implements MeituanRequest<String> {



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
