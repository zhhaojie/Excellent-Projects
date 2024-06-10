package com.meituan.sdk.model.waimaiNg.valueadded.queryCouponTotalResult;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 活动效果汇总查询接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/valueadded/queryCouponTotalResult",
    businessId = 2,
    apiVersion = "10011",
    apiName = "query_coupon_total_result",
    needAuth = true
)
public class QueryCouponTotalResultRequest implements MeituanRequest<QueryCouponTotalResultResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">发券返回的id。</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">支持手机号发券生成的任务id</font></span></p>
    */
    @NotBlank(message = "queryId不能为空")
    @SerializedName("queryId")
    private String queryId;

    public String getQueryId() {
        return queryId;
    }
    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }


    @Override
    public MeituanResponse<QueryCouponTotalResultResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCouponTotalResultResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCouponTotalResultRequest{" + "queryId=" + queryId + "}";
    }
}
