package com.meituan.sdk.model.tuangouself.coupon.couponPrepare;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 验券准备
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangouself/coupon/prepare",
    businessId = 33,
    apiVersion = "10013",
    apiName = "coupon_prepare",
    needAuth = true
)
public class CouponPrepareRequest implements MeituanRequest<List<CouponPrepareResponse>> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">券码集合</font></span></p>
    */
    @NotEmpty(message = "codes不能为空")
    @SerializedName("codes")
    private List<String> codes;

    public List<String> getCodes() {
        return codes;
    }
    public void setCodes(List<String> codes) {
        this.codes = codes;
    }


    @Override
    public MeituanResponse<List<CouponPrepareResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<CouponPrepareResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CouponPrepareRequest{" + "codes=" + codes + "}";
    }
}
