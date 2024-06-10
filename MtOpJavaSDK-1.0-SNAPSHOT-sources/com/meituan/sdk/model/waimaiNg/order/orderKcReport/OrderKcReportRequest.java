package com.meituan.sdk.model.waimaiNg.order.orderKcReport;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 上报卡餐
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/kc/report",
    businessId = 2,
    apiVersion = "10010",
    apiName = "order_kc_report",
    needAuth = true
)
public class OrderKcReportRequest implements MeituanRequest<String> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "OrderKcReportRequest{" + "data=" + data + "}";
    }
}
