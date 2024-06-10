package com.meituan.sdk.model.wmoperNg.order.wmoperngQueryOrderDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询订单详情(展示费率相关字段)
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/queryDetail",
    businessId = 16,
    apiVersion = "10054",
    apiName = "wmoperng_query_order_detail",
    needAuth = true
)
public class WmoperngQueryOrderDetailRequest implements MeituanRequest<WmoperngQueryOrderDetailResponse> {
    /**
    * <p>订单id</p>
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
    public MeituanResponse<WmoperngQueryOrderDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperngQueryOrderDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperngQueryOrderDetailRequest{" + "orderId=" + orderId + "}";
    }
}
