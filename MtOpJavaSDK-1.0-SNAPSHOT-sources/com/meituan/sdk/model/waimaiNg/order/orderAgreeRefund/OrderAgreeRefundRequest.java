package com.meituan.sdk.model.waimaiNg.order.orderAgreeRefund;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 订单同意退款
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/agreeRefund",
    businessId = 2,
    apiVersion = "10060",
    apiName = "order_agree_refund",
    needAuth = true
)
public class OrderAgreeRefundRequest implements MeituanRequest<String> {
    /**
    * <p>原因</p>
    */
    @NotBlank(message = "reason不能为空")
    @SerializedName("reason")
    private String reason;
    /**
    * <p>订单号</p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
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
        return "OrderAgreeRefundRequest{" + "reason=" + reason + "," + "orderId=" + orderId + "}";
    }
}
