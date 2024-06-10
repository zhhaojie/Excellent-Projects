package com.meituan.sdk.model.waimaiNg.order.orderCancel;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家取消订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/cancel",
    businessId = 2,
    apiVersion = "10051",
    apiName = "order_cancel",
    needAuth = true
)
public class OrderCancelRequest implements MeituanRequest<String> {
    /**
    * <p>取消原因</p>
    */
    @NotBlank(message = "reason不能为空")
    @SerializedName("reason")
    private String reason;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单号</font></span></p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">取消原因码 参考备注信息</font></span></p>
    */
    @NotBlank(message = "reasonCode不能为空")
    @SerializedName("reasonCode")
    private String reasonCode;

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getReasonCode() {
        return reasonCode;
    }
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
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
        return "OrderCancelRequest{" + "reason=" + reason + "," + "orderId=" + orderId + "," + "reasonCode=" + reasonCode + "}";
    }
}
