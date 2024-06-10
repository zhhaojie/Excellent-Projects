package com.meituan.sdk.model.wmoperNg.waimaiad.adDataHistory;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 广告历史数据，区分到天
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/data/history",
    businessId = 16,
    apiVersion = "10006",
    apiName = "ad_data_history",
    needAuth = false
)
public class AdDataHistoryRequest implements MeituanRequest<AdDataHistoryResponse> {
    /**
    * 外卖广告产品类型，1表示点金推广
    */
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Integer channel;
    /**
    * 查询的历史天数，不能大于30天
    */
    @NotNull(message = "days不能为空")
    @SerializedName("days")
    private Integer days;
    /**
    * 查询的数据类型，1：全部数据，2：仅KA系统数据，3：仅单门店数据
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
    public Integer getDays() {
        return days;
    }
    public void setDays(Integer days) {
        this.days = days;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }


    @Override
    public MeituanResponse<AdDataHistoryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdDataHistoryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdDataHistoryRequest{" + "channel=" + channel + "," + "days=" + days + "," + "type=" + type + "}";
    }
}
