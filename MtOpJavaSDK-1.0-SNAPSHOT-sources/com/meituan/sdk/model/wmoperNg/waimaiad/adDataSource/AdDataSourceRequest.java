package com.meituan.sdk.model.wmoperNg.waimaiad.adDataSource;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取不同位置的效果数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/data/source",
    businessId = 16,
    apiVersion = "10005",
    apiName = "ad_data_source",
    needAuth = false
)
public class AdDataSourceRequest implements MeituanRequest<AdDataSourceResponse> {
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
    * 查询的日期，不能早于T-31
    */
    @NotNull(message = "date不能为空")
    @SerializedName("date")
    private Integer date;

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
    public Integer getDate() {
        return date;
    }
    public void setDate(Integer date) {
        this.date = date;
    }


    @Override
    public MeituanResponse<AdDataSourceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdDataSourceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdDataSourceRequest{" + "channel=" + channel + "," + "days=" + days + "," + "date=" + date + "}";
    }
}
