package com.meituan.sdk.model.wmoperNg.im.queryCouponDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询发券的活动效果
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/queryReceiveCouponDetail",
    businessId = 16,
    apiVersion = "10039",
    apiName = "query_coupon_detail",
    needAuth = true
)
public class QueryCouponDetailRequest implements MeituanRequest<QueryCouponDetailResponse> {
    /**
    * <p>配置ID</p>
    */
    @SerializedName("couponConfigId")
    private String couponConfigId;

    public String getCouponConfigId() {
        return couponConfigId;
    }
    public void setCouponConfigId(String couponConfigId) {
        this.couponConfigId = couponConfigId;
    }


    @Override
    public MeituanResponse<QueryCouponDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCouponDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCouponDetailRequest{" + "couponConfigId=" + couponConfigId + "}";
    }
}
