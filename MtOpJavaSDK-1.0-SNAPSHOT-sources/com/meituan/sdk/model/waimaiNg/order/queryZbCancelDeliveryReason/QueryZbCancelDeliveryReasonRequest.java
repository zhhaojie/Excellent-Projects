package com.meituan.sdk.model.waimaiNg.order.queryZbCancelDeliveryReason;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取订单可以取消跑腿的原因
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/queryZbCancelDeliveryReason",
    businessId = 2,
    apiVersion = "10063",
    apiName = "query_zb_cancel_delivery_reason",
    needAuth = true
)
public class QueryZbCancelDeliveryReasonRequest implements MeituanRequest<QueryZbCancelDeliveryReasonResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单号</font></span></p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
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
