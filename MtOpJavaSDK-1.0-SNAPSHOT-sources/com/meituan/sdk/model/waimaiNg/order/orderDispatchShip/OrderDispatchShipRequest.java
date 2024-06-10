package com.meituan.sdk.model.waimaiNg.order.orderDispatchShip;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 美团专送场景－发配送
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/dispatchShip",
    businessId = 2,
    apiVersion = "10055",
    apiName = "order_dispatch_ship",
    needAuth = true
)
public class OrderDispatchShipRequest implements MeituanRequest<String> {
    /**
    * <p>订单号</p>
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
        return "OrderDispatchShipRequest{" + "orderId=" + orderId + "}";
    }
}
