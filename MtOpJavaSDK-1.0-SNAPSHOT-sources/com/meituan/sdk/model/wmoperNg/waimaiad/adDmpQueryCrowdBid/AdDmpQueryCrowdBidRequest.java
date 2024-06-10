package com.meituan.sdk.model.wmoperNg.waimaiad.adDmpQueryCrowdBid;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取三方人群包出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/dmp/queryCrowdBid",
    businessId = 16,
    apiVersion = "10019",
    apiName = "ad_dmp_query_crowd_bid",
    needAuth = true
)
public class AdDmpQueryCrowdBidRequest implements MeituanRequest<AdDmpQueryCrowdBidResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">外卖广告的产品类型，1表示点金推广</font></span></p>
    */
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Integer channel;

    public Integer getChannel() {
        return channel;
    }
    public void setChannel(Integer channel) {
        this.channel = channel;
    }


    @Override
    public MeituanResponse<AdDmpQueryCrowdBidResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdDmpQueryCrowdBidResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdDmpQueryCrowdBidRequest{" + "channel=" + channel + "}";
    }
}
