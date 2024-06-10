package com.meituan.sdk.model.wmoperNg.waimaiad.adDataDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 广告明细数据，区分小时
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/waimaiad/data/detail",
    businessId = 16,
    apiVersion = "10004",
    apiName = "ad_data_detail",
    needAuth = false
)
public class AdDataDetailRequest implements MeituanRequest<AdDataDetailResponse> {
    /**
    * 外卖广告产品类型，1表示点金推广
    */
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Integer channel;
    /**
    * 日期
    */
    @NotBlank(message = "date不能为空")
    @SerializedName("date")
    private String date;

    public Integer getChannel() {
        return channel;
    }
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public MeituanResponse<AdDataDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<AdDataDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "AdDataDetailRequest{" + "channel=" + channel + "," + "date=" + date + "}";
    }
}
