package com.meituan.sdk.model.wmoperNg.waimaiad.poiAdEffectdata;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 营业分析-查询流量曝光与入店数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/poi/effectdata",
    businessId = 16,
    apiVersion = "10007",
    apiName = "poi_ad_effectdata",
    needAuth = false
)
public class PoiAdEffectdataRequest implements MeituanRequest<PoiAdEffectdataResponse> {
    /**
    * 流量属性-1 全部  1自然流量  2付费流量  3全部流量
    */
    @SerializedName("flowProp")
    private Integer flowProp;
    /**
    * 最新N日内数据，[1-31]
    */
    @SerializedName("days")
    private Integer days;

    public Integer getFlowProp() {
        return flowProp;
    }
    public void setFlowProp(Integer flowProp) {
        this.flowProp = flowProp;
    }
    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }


    @Override
    public MeituanResponse<PoiAdEffectdataResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<PoiAdEffectdataResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "PoiAdEffectdataRequest{" + "flowProp=" + flowProp + "," + "days=" + days + "}";
    }
}
