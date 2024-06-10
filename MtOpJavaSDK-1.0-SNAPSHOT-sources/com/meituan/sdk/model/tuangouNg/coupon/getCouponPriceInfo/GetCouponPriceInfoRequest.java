package com.meituan.sdk.model.tuangouNg.coupon.getCouponPriceInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取团购券交易快照
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/ng/coupon/getCouponPriceInfo",
    businessId = 1,
    apiVersion = "10000",
    apiName = "get_coupon_price_info",
    needAuth = true
)
public class GetCouponPriceInfoRequest implements MeituanRequest<GetCouponPriceInfoResponse> {
    /**
    * <p><span style="color: null"><font style="font-size:10.5pt;line-height:24px" data-size="10.5pt">要验证的美团券密码、二维码</font></span></p>
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
    public MeituanResponse<GetCouponPriceInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetCouponPriceInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetCouponPriceInfoRequest{" + "code=" + code + "}";
    }
}
