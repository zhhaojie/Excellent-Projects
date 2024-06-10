package com.meituan.sdk.model.waimaiNg.order.orderQueryById;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据订单Id查询订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/queryById",
    businessId = 2,
    apiVersion = "10100",
    apiName = "order_query_by_id",
    needAuth = true
)
public class OrderQueryByIdRequest implements MeituanRequest<OrderQueryByIdResponse> {
    /**
    * <ul><li><p>订单号</p></li></ul>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    @Override
    public MeituanResponse<OrderQueryByIdResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<OrderQueryByIdResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderQueryByIdRequest{" + "orderId=" + orderId + "}";
    }
}
