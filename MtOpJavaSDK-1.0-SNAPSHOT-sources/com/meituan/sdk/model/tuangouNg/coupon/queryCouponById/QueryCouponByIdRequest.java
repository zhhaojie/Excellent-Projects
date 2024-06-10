package com.meituan.sdk.model.tuangouNg.coupon.queryCouponById;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 已验券码查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/queryById",
    businessId = 1,
    apiVersion = "10002",
    apiName = "query_coupon_by_id",
    needAuth = true
)
public class QueryCouponByIdRequest implements MeituanRequest<QueryCouponByIdResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">券码</font></span></p>
    */
    @NotBlank(message = "couponCode不能为空")
    @SerializedName("couponCode")
    private String couponCode;

    public String getCouponCode() {
        return couponCode;
    }
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }


    @Override
    public MeituanResponse<QueryCouponByIdResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCouponByIdResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCouponByIdRequest{" + "couponCode=" + couponCode + "}";
    }
}
