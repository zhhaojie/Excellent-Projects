package com.meituan.sdk.model.wmoperNg.waimaiad.peerAdEffectdata;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 竞价推广-商圈效果数据-曝光与点击
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/peer/effectdata",
    businessId = 16,
    apiVersion = "10007",
    apiName = "peer_ad_effectdata",
    needAuth = false
)
public class PeerAdEffectdataRequest implements MeituanRequest<List<Data>> {
    /**
    * 最新N日内数据，[1-31]
    */
    @SerializedName("days")
    private Integer days;

    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }


    @Override
    public MeituanResponse<List<Data>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Data>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "PeerAdEffectdataRequest{" + "days=" + days + "}";
    }
}
