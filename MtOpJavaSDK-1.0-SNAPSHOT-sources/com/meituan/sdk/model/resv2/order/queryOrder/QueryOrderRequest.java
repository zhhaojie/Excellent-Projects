package com.meituan.sdk.model.resv2.order.queryOrder;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询订单信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/resv2/order/queryById",
    businessId = 7,
    apiVersion = "10000",
    apiName = "query_order",
    needAuth = true
)
public class QueryOrderRequest implements MeituanRequest<QueryOrderResponse> {
    /**
    * <p data-diff-id="ct-diff-id-74fadcf3-323a-4f8e-b6d3-75e769f18139"><span style="color: rgba(0, 0, 0, 0.65)">订单id</span></p>
    */
    @NotBlank(message = "orderSerializedId不能为空")
    @SerializedName("orderSerializedId")
    private String orderSerializedId;

    public String getOrderSerializedId() {
        return orderSerializedId;
    }
    public void setOrderSerializedId(String orderSerializedId) {
        this.orderSerializedId = orderSerializedId;
    }


    @Override
    public MeituanResponse<QueryOrderResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryOrderResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryOrderRequest{" + "orderSerializedId=" + orderSerializedId + "}";
    }
}
