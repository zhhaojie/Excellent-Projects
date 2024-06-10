package com.meituan.sdk.model.tuangouself.coupon.couponQuery;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询用户授权门店可核销券
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangouself/coupon/query",
    businessId = 33,
    apiVersion = "10022",
    apiName = "coupon_query",
    needAuth = true
)
public class CouponQueryRequest implements MeituanRequest<List<CouponResponse>> {



    @Override
    public MeituanResponse<List<CouponResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<CouponResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
