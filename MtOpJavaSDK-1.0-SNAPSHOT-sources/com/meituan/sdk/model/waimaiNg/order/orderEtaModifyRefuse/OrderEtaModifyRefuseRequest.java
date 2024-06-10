package com.meituan.sdk.model.waimaiNg.order.orderEtaModifyRefuse;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 拒绝ETA修改请求
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/eta/modify/refuse",
    businessId = 2,
    apiVersion = "10033",
    apiName = "order_eta_modify_refuse",
    needAuth = true
)
public class OrderEtaModifyRefuseRequest implements MeituanRequest<Boolean> {
    /**
    * <p>订单Id</p>
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
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderEtaModifyRefuseRequest{" + "orderId=" + orderId + "}";
    }
}
