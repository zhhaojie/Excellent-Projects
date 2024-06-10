package com.meituan.sdk.model.waimaiNg.order.orderUpdateZbDispatchTip;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 众包配送场景－配送单加小费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/updateZbDispatchTip",
    businessId = 2,
    apiVersion = "10054",
    apiName = "order_update_zb_dispatch_tip",
    needAuth = true
)
public class OrderUpdateZbDispatchTipRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单号</font></span></p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">小费</font></span></p>
    */
    @NotNull(message = "tipAmount不能为空")
    @SerializedName("tipAmount")
    private Double tipAmount;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Double getTipAmount() {
        return tipAmount;
    }
    public void setTipAmount(Double tipAmount) {
        this.tipAmount = tipAmount;
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
        return "OrderUpdateZbDispatchTipRequest{" + "orderId=" + orderId + "," + "tipAmount=" + tipAmount + "}";
    }
}
