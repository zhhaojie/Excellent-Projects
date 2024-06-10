package com.meituan.sdk.model.wmoperNg.order.wmoperOrderQueryOrderDetail;

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
    path = "/wmoper/order/queryOrderDetail",
    businessId = 16,
    apiVersion = "10033",
    apiName = "wmoper_order_query_order_detail",
    needAuth = true
)
public class WmoperOrderQueryOrderDetailRequest implements MeituanRequest<WmoperOrderQueryOrderDetailResponse> {
    /**
    * <p>订单ID（订单展示Id。用户下单时看到的订单号）</p>
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
    public MeituanResponse<WmoperOrderQueryOrderDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperOrderQueryOrderDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperOrderQueryOrderDetailRequest{" + "orderId=" + orderId + "}";
    }
}
