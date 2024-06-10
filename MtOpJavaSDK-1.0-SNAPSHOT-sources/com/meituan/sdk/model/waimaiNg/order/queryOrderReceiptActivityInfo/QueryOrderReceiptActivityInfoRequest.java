package com.meituan.sdk.model.waimaiNg.order.queryOrderReceiptActivityInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询活动分摊接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/getOrderReceiptActivityInfo",
    businessId = 2,
    apiVersion = "10004",
    apiName = "query_order_receipt_activity_info",
    needAuth = false
)
public class QueryOrderReceiptActivityInfoRequest implements MeituanRequest<QueryOrderReceiptActivityInfoResponse> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<QueryOrderReceiptActivityInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryOrderReceiptActivityInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "QueryOrderReceiptActivityInfoRequest{" + "data=" + data + "}";
    }
}
