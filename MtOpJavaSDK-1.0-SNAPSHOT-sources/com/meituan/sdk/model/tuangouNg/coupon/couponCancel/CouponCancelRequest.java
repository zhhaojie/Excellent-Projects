package com.meituan.sdk.model.tuangouNg.coupon.couponCancel;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 撤销验券
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/cancel",
    businessId = 1,
    apiVersion = "10009",
    apiName = "coupon_cancel",
    needAuth = true
)
public class CouponCancelRequest implements MeituanRequest<CouponCancelResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">商家登录ERP帐号ID，长度不超过32。</font></span></p>
    */
    @NotBlank(message = "eId不能为空")
    @SerializedName("eId")
    private String eId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">商家登录ERP帐号名称，长度不超过32位</font></span></p>
    */
    @NotBlank(message = "eName不能为空")
    @SerializedName("eName")
    private String eName;
    /**
    * <p>type值永远为1撤销验券</p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">券码</font></span></p>
    */
    @NotBlank(message = "couponCode不能为空")
    @SerializedName("couponCode")
    private String couponCode;

    public String getEId() {
        return eId;
    }
    public void setEId(String eId) {
        this.eId = eId;
    }
    public String getEName() {
        return eName;
    }
    public void setEName(String eName) {
        this.eName = eName;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getCouponCode() {
        return couponCode;
    }
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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
        return "CouponCancelRequest{" + "eId=" + eId + "," + "eName=" + eName + "," + "type=" + type + "," + "couponCode=" + couponCode + "}";
    }
}
