package com.meituan.sdk.model.tuangouself.coupon.couponConsume;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 执行验券
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangouself/coupon/consume",
    businessId = 33,
    apiVersion = "10019",
    apiName = "coupon_consume",
    needAuth = true
)
public class CouponConsumeRequest implements MeituanRequest<CouponConsumeResponse> {
    /**
    * <p>券码</p>
    */
    @NotEmpty(message = "codes不能为空")
    @SerializedName("codes")
    private List<String> codes;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">幂等因子（会与授权的门店一起构造唯一请求标识校验幂等，缓存时间为5分钟）</font></span></p>
    */
    @NotBlank(message = "idempotent不能为空")
    @SerializedName("idempotent")
    private String idempotent;

    public List<String> getCodes() {
        return codes;
    }
    public void setCodes(List<String> codes) {
        this.codes = codes;
    }
    public String getIdempotent() {
        return idempotent;
    }
    public void setIdempotent(String idempotent) {
        this.idempotent = idempotent;
    }


    @Override
    public MeituanResponse<CouponConsumeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CouponConsumeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CouponConsumeRequest{" + "codes=" + codes + "," + "idempotent=" + idempotent + "}";
    }
}
