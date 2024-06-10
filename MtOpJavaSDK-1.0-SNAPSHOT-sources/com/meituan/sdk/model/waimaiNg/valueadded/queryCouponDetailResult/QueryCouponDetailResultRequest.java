package com.meituan.sdk.model.waimaiNg.valueadded.queryCouponDetailResult;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据发券任务ID查询发券活动效果明细
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/valueadded/queryCouponDetailResult",
    businessId = 2,
    apiVersion = "10010",
    apiName = "query_coupon_detail_result",
    needAuth = true
)
public class QueryCouponDetailResultRequest implements MeituanRequest<QueryCouponDetailResultResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">发券返回的id。</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">支持手机号发券生成的任务id。</font></span></p>
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
    public MeituanResponse<QueryCouponDetailResultResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCouponDetailResultResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCouponDetailResultRequest{" + "queryId=" + queryId + "}";
    }
}
