package com.meituan.sdk.model.waimaiNg.order.zbLogisticsPreview;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询众包配送费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/zbLogisticsPreview",
    businessId = 2,
    apiVersion = "10076",
    apiName = "zb_logistics_preview",
    needAuth = true
)
public class ZbLogisticsPreviewRequest implements MeituanRequest<ZbLogisticsPreviewResponse> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<ZbLogisticsPreviewResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ZbLogisticsPreviewResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "ZbLogisticsPreviewRequest{" + "data=" + data + "}";
    }
}
