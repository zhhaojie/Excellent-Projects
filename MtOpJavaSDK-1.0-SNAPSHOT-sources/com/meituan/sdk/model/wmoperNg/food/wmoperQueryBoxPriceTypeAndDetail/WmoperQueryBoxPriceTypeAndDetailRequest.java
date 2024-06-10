package com.meituan.sdk.model.wmoperNg.food.wmoperQueryBoxPriceTypeAndDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店打包费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/queryBoxPriceTypeAndDetail",
    businessId = 16,
    apiVersion = "10032",
    apiName = "wmoper_query_box_price_type_and_detail",
    needAuth = true
)
public class WmoperQueryBoxPriceTypeAndDetailRequest implements MeituanRequest<WmoperQueryBoxPriceTypeAndDetailResponse> {



    @Override
    public MeituanResponse<WmoperQueryBoxPriceTypeAndDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperQueryBoxPriceTypeAndDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
