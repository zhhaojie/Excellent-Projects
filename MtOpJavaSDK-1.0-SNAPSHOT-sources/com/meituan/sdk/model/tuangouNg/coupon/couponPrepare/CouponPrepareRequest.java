package com.meituan.sdk.model.tuangouNg.coupon.couponPrepare;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 验券准备
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/prepare",
    businessId = 1,
    apiVersion = "10011",
    apiName = "coupon_prepare",
    needAuth = true
)
public class CouponPrepareRequest implements MeituanRequest<CouponPrepareResponse> {
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
    public MeituanResponse<CouponPrepareResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CouponPrepareResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CouponPrepareRequest{" + "couponCode=" + couponCode + "}";
    }
}
