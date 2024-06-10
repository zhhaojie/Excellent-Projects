package com.meituan.sdk.model.corgiTest.corgiGroup.eweq;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* sadfasdf
* This file was automatically generated.
*/
@ApiMeta(
    path = "/corgi_test/corgi_group/sdfsdfsd",
    businessId = 10001,
    apiVersion = "10094",
    apiName = "eweq",
    needAuth = true
)
public class EweqRequest implements MeituanRequest<Void> {



    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
