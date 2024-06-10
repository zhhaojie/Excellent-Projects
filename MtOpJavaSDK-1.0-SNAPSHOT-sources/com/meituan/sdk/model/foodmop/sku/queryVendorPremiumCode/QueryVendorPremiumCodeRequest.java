package com.meituan.sdk.model.foodmop.sku.queryVendorPremiumCode;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询品牌所有配料编码
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/premium/queryAll",
    businessId = 51,
    apiVersion = "10013",
    apiName = "query_vendor_premium_code",
    needAuth = true
)
public class QueryVendorPremiumCodeRequest implements MeituanRequest<QueryVendorPremiumCodeResponse> {



    @Override
    public MeituanResponse<QueryVendorPremiumCodeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryVendorPremiumCodeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
