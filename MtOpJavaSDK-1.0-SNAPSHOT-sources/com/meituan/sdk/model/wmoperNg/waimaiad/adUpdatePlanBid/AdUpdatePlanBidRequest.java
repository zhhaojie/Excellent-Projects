package com.meituan.sdk.model.wmoperNg.waimaiad.adUpdatePlanBid;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改广告投放计划出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/plan/update/bid",
    businessId = 16,
    apiVersion = "10005",
    apiName = "ad_update_plan_bid",
    needAuth = false
)
public class AdUpdatePlanBidRequest implements MeituanRequest<AdUpdatePlanBidResponse> {
    /**
    * 外卖广告的产品类型，1表示点金推广
    */
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Integer channel;
    /**
    * 出价，单位分
    */
    @NotNull(message = "bid不能为空")
    @SerializedName("bid")
    private Integer bid;

    public Integer getChannel() {
        return channel;
    }
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
    public Integer getBid() {
        return bid;
    }
    public void setBid(Integer bid) {
        this.bid = bid;
    }


    @Override
    public MeituanResponse<AdUpdatePlanBidResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdUpdatePlanBidResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdUpdatePlanBidRequest{" + "channel=" + channel + "," + "bid=" + bid + "}";
    }
}
