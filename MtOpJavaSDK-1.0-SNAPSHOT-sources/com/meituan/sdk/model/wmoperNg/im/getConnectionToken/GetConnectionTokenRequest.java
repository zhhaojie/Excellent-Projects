package com.meituan.sdk.model.wmoperNg.im.getConnectionToken;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取长连接的token
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/getConnectionToken",
    businessId = 16,
    apiVersion = "10044",
    apiName = "get_connection_token",
    needAuth = false
)
public class GetConnectionTokenRequest implements MeituanRequest<GetConnectionTokenResponse> {



    @Override
    public MeituanResponse<GetConnectionTokenResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetConnectionTokenResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
