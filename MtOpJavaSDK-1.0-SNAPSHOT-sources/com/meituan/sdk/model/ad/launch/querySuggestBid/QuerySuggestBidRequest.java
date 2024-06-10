package com.meituan.sdk.model.ad.launch.querySuggestBid;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询广告位次出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/querySuggestBid",
    businessId = 22,
    apiVersion = "10027",
    apiName = "query_suggest_bid",
    needAuth = true
)
public class QuerySuggestBidRequest implements MeituanRequest<QuerySuggestBidResponse> {
    /**
    * <p data-diff-id="ct-diff-id-ebf694c3-5046-471b-9014-3a8d33643404">门店以及对应的投放时段</p>
    */
    @NotBlank(message = "suggestBid不能为空")
    @SerializedName("suggestBid")
    private String suggestBid;

    public String getSuggestBid() {
        return suggestBid;
    }
    public void setSuggestBid(String suggestBid) {
        this.suggestBid = suggestBid;
    }


    @Override
    public MeituanResponse<QuerySuggestBidResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QuerySuggestBidResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QuerySuggestBidRequest{" + "suggestBid=" + suggestBid + "}";
    }
}
