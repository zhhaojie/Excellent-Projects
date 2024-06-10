package com.meituan.sdk.model.waimaiNg.order.orderBatchFetchAbnormalOrder;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量拉取异常订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/batchFetchAbnormalOrder",
    businessId = 2,
    apiVersion = "10006",
    apiName = "order_batch_fetch_abnormal_order",
    needAuth = false
)
public class OrderBatchFetchAbnormalOrderRequest implements MeituanRequest<List<Long>> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<List<Long>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Long>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "OrderBatchFetchAbnormalOrderRequest{" + "data=" + data + "}";
    }
}
