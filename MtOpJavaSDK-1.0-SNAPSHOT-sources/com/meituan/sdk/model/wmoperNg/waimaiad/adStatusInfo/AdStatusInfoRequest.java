package com.meituan.sdk.model.wmoperNg.waimaiad.adStatusInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取广告计划状态，包括是否开启、预算、出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/status",
    businessId = 16,
    apiVersion = "10004",
    apiName = "ad_status_info",
    needAuth = false
)
public class AdStatusInfoRequest implements MeituanRequest<AdStatusInfoResponse> {
    /**
    * 外卖广告的产品类型，1表示点金推广
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
    public MeituanResponse<AdStatusInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdStatusInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdStatusInfoRequest{" + "channel=" + channel + "}";
    }
}
