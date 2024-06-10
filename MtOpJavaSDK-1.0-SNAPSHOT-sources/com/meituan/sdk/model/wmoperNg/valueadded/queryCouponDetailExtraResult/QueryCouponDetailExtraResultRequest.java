package com.meituan.sdk.model.wmoperNg.valueadded.queryCouponDetailExtraResult;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 精准营销-活动效果汇总查询接口（含券使用时间）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/valueadded/queryCouponDetailExtraResult",
    businessId = 16,
    apiVersion = "10014",
    apiName = "query_coupon_detail_extra_result",
    needAuth = true
)
public class QueryCouponDetailExtraResultRequest implements MeituanRequest<QueryCouponDetailExtraResultResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">发券返回的id。</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">支持手机号发券生成的任务id。</font></span></p>
    */
    @SerializedName("queryId")
    private String queryId;

    public String getQueryId() {
        return queryId;
    }
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }


    @Override
    public MeituanResponse<QueryCouponDetailExtraResultResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCouponDetailExtraResultResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCouponDetailExtraResultRequest{" + "queryId=" + queryId + "}";
    }
}
