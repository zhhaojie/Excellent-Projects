package com.meituan.sdk.model.tuangouself.coupon.couponCancel;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 撤销验券
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangouself/coupon/cancel",
    businessId = 33,
    apiVersion = "10015",
    apiName = "coupon_cancel",
    needAuth = true
)
public class CouponCancelRequest implements MeituanRequest<CouponCancelResponse> {
    /**
    * <p>券码</p>
    */
    @NotBlank(message = "code不能为空")
    @SerializedName("code")
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }


    @Override
    public MeituanResponse<CouponCancelResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CouponCancelResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CouponCancelRequest{" + "code=" + code + "}";
    }
}
