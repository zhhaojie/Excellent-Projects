package com.meituan.sdk.model.waimaiNg.order.deliveryNoteAddTip;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 配送单加小费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/deliveryNoteAddTip",
    businessId = 2,
    apiVersion = "10019",
    apiName = "delivery_note_add_tip",
    needAuth = true
)
public class DeliveryNoteAddTipRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">订单ID</font></span></p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">小费金额</font></span></p>
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
        return "DeliveryNoteAddTipRequest{" + "orderId=" + orderId + "," + "tipAmount=" + tipAmount + "}";
    }
}
