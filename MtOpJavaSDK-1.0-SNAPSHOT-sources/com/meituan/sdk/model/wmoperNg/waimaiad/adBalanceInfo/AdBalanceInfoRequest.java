package com.meituan.sdk.model.wmoperNg.waimaiad.adBalanceInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取商家广告余额
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/balance",
    businessId = 16,
    apiVersion = "10005",
    apiName = "ad_balance_info",
    needAuth = false
)
public class AdBalanceInfoRequest implements MeituanRequest<AdBalanceInfoResponse> {



    @Override
    public MeituanResponse<AdBalanceInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdBalanceInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
