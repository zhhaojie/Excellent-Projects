package com.meituan.sdk.model.wmoperNg.order.wmoperngGetOrderDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询订单详情
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/detail",
    businessId = 16,
    apiVersion = "10023",
    apiName = "wmoperng_get_order_detail",
    needAuth = true
)
public class WmoperngGetOrderDetailRequest implements MeituanRequest<WmoperngGetOrderDetailResponse> {
    /**
    * 订单id
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
    public MeituanResponse<WmoperngGetOrderDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperngGetOrderDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperngGetOrderDetailRequest{" + "orderId=" + orderId + "}";
    }
}
