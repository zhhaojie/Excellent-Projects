package com.meituan.sdk.model.wmoperNg.valueadded.queryCouponStock;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询商家当前剩余可发券数量
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/valueadded/queryCouponStock",
    businessId = 16,
    apiVersion = "10000",
    apiName = "query_coupon_stock",
    needAuth = true
)
public class QueryCouponStockRequest implements MeituanRequest<QueryCouponStockResponse> {



    @Override
    public MeituanResponse<QueryCouponStockResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCouponStockResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
