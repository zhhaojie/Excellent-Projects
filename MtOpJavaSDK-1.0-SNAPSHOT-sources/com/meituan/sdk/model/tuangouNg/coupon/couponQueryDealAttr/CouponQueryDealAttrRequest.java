package com.meituan.sdk.model.tuangouNg.coupon.couponQueryDealAttr;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询团购项目限制条件接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/coupon/queryDealAttr",
    businessId = 1,
    apiVersion = "10010",
    apiName = "coupon_query_deal_attr",
    needAuth = true
)
public class CouponQueryDealAttrRequest implements MeituanRequest<CouponQueryDealAttrResponse> {
    /**
    * <p>项目id列表，不超过50个，英文逗号隔开【,】。</p>
    */
    @NotBlank(message = "dealIds不能为空")
    @SerializedName("dealIds")
    private String dealIds;

    public String getDealIds() {
        return dealIds;
    }
    public void setDealIds(String dealIds) {
        this.dealIds = dealIds;
    }


    @Override
    public MeituanResponse<CouponQueryDealAttrResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CouponQueryDealAttrResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CouponQueryDealAttrRequest{" + "dealIds=" + dealIds + "}";
    }
}
