package com.meituan.sdk.model.wmoperNg.waimaiad.poipeerAdEffectdata;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 竞价推广-商圈与门店效果数据-新客进店
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/poipeer/effectdata",
    businessId = 16,
    apiVersion = "10007",
    apiName = "poipeer_ad_effectdata",
    needAuth = false
)
public class PoipeerAdEffectdataRequest implements MeituanRequest<PoipeerAdEffectdataResponse> {
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
    public MeituanResponse<PoipeerAdEffectdataResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<PoipeerAdEffectdataResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "PoipeerAdEffectdataRequest{" + "days=" + days + "}";
    }
}
