package com.meituan.sdk.model.waimaiNg.shipping.shippingList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店配送范围
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/shipping/list",
    businessId = 2,
    apiVersion = "10000",
    apiName = "shipping_list",
    needAuth = true
)
public class ShippingListRequest implements MeituanRequest<List<ShippingInfo>> {



    @Override
    public MeituanResponse<List<ShippingInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<ShippingInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
