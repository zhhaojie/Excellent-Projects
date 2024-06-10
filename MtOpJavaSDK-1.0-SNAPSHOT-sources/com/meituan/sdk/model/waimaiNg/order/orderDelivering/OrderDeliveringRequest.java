package com.meituan.sdk.model.waimaiNg.order.orderDelivering;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 自配送－配送状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/delivering",
    businessId = 2,
    apiVersion = "10060",
    apiName = "order_delivering",
    needAuth = true
)
public class OrderDeliveringRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送人名称</font></span></p>
    */
    @SerializedName("courierName")
    private String courierName;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单号</font></span></p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">配送人电话</font></span></p>
    */
    @SerializedName("courierPhone")
    private String courierPhone;

    public String getCourierName() {
        return courierName;
    }
    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getCourierPhone() {
        return courierPhone;
    }
    public void setCourierPhone(String courierPhone) {
        this.courierPhone = courierPhone;
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
        return "OrderDeliveringRequest{" + "courierName=" + courierName + "," + "orderId=" + orderId + "," + "courierPhone=" + courierPhone + "}";
    }
}
