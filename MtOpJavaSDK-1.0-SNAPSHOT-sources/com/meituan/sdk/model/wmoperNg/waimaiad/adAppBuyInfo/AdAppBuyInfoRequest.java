package com.meituan.sdk.model.wmoperNg.waimaiad.adAppBuyInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取商家购买的应用信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/buyinfo",
    businessId = 16,
    apiVersion = "10006",
    apiName = "ad_app_buy_info",
    needAuth = false
)
public class AdAppBuyInfoRequest implements MeituanRequest<AdAppBuyInfoResponse> {



    @Override
    public MeituanResponse<AdAppBuyInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdAppBuyInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
