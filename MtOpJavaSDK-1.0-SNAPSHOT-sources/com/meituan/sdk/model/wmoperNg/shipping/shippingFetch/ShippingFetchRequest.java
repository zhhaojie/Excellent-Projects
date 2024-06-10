package com.meituan.sdk.model.wmoperNg.shipping.shippingFetch;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店配送范围（混合送）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/shipping/fetch",
    businessId = 16,
    apiVersion = "10001",
    apiName = "shipping_fetch",
    needAuth = true
)
public class ShippingFetchRequest implements MeituanRequest<List<Data>> {



    @Override
    public MeituanResponse<List<Data>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Data>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
