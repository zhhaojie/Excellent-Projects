package com.meituan.sdk.model.klOpen.order.orderDetail;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询订单详细信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/kl/open/order/detail",
    businessId = 27,
    apiVersion = "10009",
    apiName = "order_detail",
    needAuth = true
)
public class OrderDetailRequest implements MeituanRequest<OrderDetailResponse> {
    /**
    * <p>快驴订单编号</p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;
    /**
    * <p data-diff-id="ct-diff-id-2e86dbbc-4b14-42c2-a4d4-091e0debf8bb">品牌标识，除华住外其他服务商必传</p>
    */
    @SerializedName("brandIdentify")
    private String brandIdentify;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getBrandIdentify() {
        return brandIdentify;
    }
    public void setBrandIdentify(String brandIdentify) {
        this.brandIdentify = brandIdentify;
    }


    @Override
    public MeituanResponse<OrderDetailResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<OrderDetailResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderDetailRequest{" + "orderId=" + orderId + "," + "brandIdentify=" + brandIdentify + "}";
    }
}
