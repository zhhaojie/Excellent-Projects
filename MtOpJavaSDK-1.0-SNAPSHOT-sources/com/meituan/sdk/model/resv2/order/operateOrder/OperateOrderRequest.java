package com.meituan.sdk.model.resv2.order.operateOrder;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 向开放平台发起订单接单/拒单/确认到店/未到店/分配订单桌位操作
* This file was automatically generated.
*/
@ApiMeta(
    path = "/resv2/order/operation",
    businessId = 7,
    apiVersion = "10001",
    apiName = "operate_order",
    needAuth = true
)
public class OperateOrderRequest implements MeituanRequest<String> {
    @SerializedName("data")
    private Data data;

    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OperateOrderRequest{" + "data=" + data + "}";
    }
}
