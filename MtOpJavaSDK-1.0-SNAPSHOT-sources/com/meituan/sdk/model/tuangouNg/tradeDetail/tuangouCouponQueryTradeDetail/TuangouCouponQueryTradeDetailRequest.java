package com.meituan.sdk.model.tuangouNg.tradeDetail.tuangouCouponQueryTradeDetail;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询团购订单结算明细
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/queryTradeDetail",
    businessId = 1,
    apiVersion = "10000",
    apiName = "tuangou_coupon_query_trade_detail",
    needAuth = true
)
public class TuangouCouponQueryTradeDetailRequest implements MeituanRequest<List<CouponTradeDetail>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">团购券码</font></span></p>
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
    public MeituanResponse<List<CouponTradeDetail>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<CouponTradeDetail>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "TuangouCouponQueryTradeDetailRequest{" + "couponCode=" + couponCode + "}";
    }
}
