package com.meituan.sdk.model.waimaiNg.order.orderConfirm;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家确认接单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/confirm",
    businessId = 2,
    apiVersion = "10057",
    apiName = "order_confirm",
    needAuth = true
)
public class OrderConfirmRequest implements MeituanRequest<String> {
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
        return "OrderConfirmRequest{" + "orderId=" + orderId + "}";
    }
}
