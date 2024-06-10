package com.meituan.sdk.model.waimaiNg.decoration.deleteImgeForSingle;

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
    path = "/waimai/ng/decoration/deleteImgeForSingle",
    businessId = 2,
    apiVersion = "10001",
    apiName = "delete_imge_for_single",
    needAuth = false
)
public class DeleteImgeForSingleRequest implements MeituanRequest<String> {



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
