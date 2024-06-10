package com.meituan.sdk.model.tuangouNg.coupon.couponConsume;

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
* 执行验券
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/consume",
    businessId = 1,
    apiVersion = "10011",
    apiName = "coupon_consume",
    needAuth = true
)
public class CouponConsumeRequest implements MeituanRequest<CouponConsumeResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">商家登录ERP帐号ID</font></span></p>
    */
    @NotBlank(message = "eId不能为空")
    @SerializedName("eId")
    private String eId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">商家登录ERP帐号名称</font></span></p>
    */
    @NotBlank(message = "eName不能为空")
    @SerializedName("eName")
    private String eName;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">第三方ERP订单号</font></span></p>
    */
    @NotBlank(message = "eOrderId不能为空")
    @SerializedName("eOrderId")
    private String eOrderId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">数量</font></span></p>
    */
    @NotNull(message = "count不能为空")
    @SerializedName("count")
    private Integer count;
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
    public String getEOrderId() {
        return eOrderId;
    }
    public void setEOrderId(String eOrderId) {
        this.eOrderId = eOrderId;
    }
    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public String getCouponCode() {
        return couponCode;
    }
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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
        return "CouponConsumeRequest{" + "eId=" + eId + "," + "eName=" + eName + "," + "eOrderId=" + eOrderId + "," + "count=" + count + "," + "couponCode=" + couponCode + "}";
    }
}
