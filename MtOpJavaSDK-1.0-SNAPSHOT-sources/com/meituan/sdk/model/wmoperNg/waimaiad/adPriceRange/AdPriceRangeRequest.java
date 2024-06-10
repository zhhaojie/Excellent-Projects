package com.meituan.sdk.model.wmoperNg.waimaiad.adPriceRange;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取广告不同类型价格范围
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/pricerange",
    businessId = 16,
    apiVersion = "10006",
    apiName = "ad_price_range",
    needAuth = false
)
public class AdPriceRangeRequest implements MeituanRequest<AdPriceRangeResponse> {
    /**
    * 外卖广告产品类型，1是点金推广
    */
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Integer channel;
    /**
    * 1：预算，2：出价，3：定向出价
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;

    public Integer getChannel() {
        return channel;
    }
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public MeituanResponse<AdPriceRangeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdPriceRangeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdPriceRangeRequest{" + "channel=" + channel + "," + "type=" + type + "}";
    }
}
