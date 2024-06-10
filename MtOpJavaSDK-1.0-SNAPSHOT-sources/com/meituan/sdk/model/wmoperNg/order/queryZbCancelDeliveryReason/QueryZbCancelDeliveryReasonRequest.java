package com.meituan.sdk.model.wmoperNg.order.queryZbCancelDeliveryReason;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取订单可以取消跑腿的原因
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/queryZbCancelDeliveryReason",
    businessId = 16,
    apiVersion = "10027",
    apiName = "query_zb_cancel_delivery_reason",
    needAuth = true
)
public class QueryZbCancelDeliveryReasonRequest implements MeituanRequest<QueryZbCancelDeliveryReasonResponse> {
    /**
    * <p>外卖订单id</p>
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
    public MeituanResponse<QueryZbCancelDeliveryReasonResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryZbCancelDeliveryReasonResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryZbCancelDeliveryReasonRequest{" + "orderId=" + orderId + "}";
    }
}
