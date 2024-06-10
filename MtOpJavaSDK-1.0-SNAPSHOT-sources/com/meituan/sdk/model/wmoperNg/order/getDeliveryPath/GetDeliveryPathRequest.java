package com.meituan.sdk.model.wmoperNg.order.getDeliveryPath;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询众包骑手坐标
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/getDeliveryPath",
    businessId = 16,
    apiVersion = "10004",
    apiName = "get_delivery_path",
    needAuth = true
)
public class GetDeliveryPathRequest implements MeituanRequest<List<GetDeliveryPathResponse>> {
    /**
    * <p>订单ID</p>
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
    public MeituanResponse<List<GetDeliveryPathResponse>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<GetDeliveryPathResponse>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetDeliveryPathRequest{" + "orderId=" + orderId + "}";
    }
}
