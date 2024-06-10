package com.meituan.sdk.model.waimaiNg.dish.waimaiQueryBoxPricetypeAndDetail;

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
    path = "/waimai/ng/dish/queryBoxPriceTypeAndDetail",
    businessId = 2,
    apiVersion = "10105",
    apiName = "waimai_query_box_pricetype_and_detail",
    needAuth = true
)
public class WaimaiQueryBoxPricetypeAndDetailRequest implements MeituanRequest<WaimaiQueryBoxPricetypeAndDetailResponse> {



    @Override
    public MeituanResponse<WaimaiQueryBoxPricetypeAndDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WaimaiQueryBoxPricetypeAndDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
