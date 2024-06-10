package com.meituan.sdk.model.waimaiNg.order.orderApplyPartRefund;

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
* 部分退款-申请部分退款
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/applyPartRefund",
    businessId = 2,
    apiVersion = "10036",
    apiName = "order_apply_part_refund",
    needAuth = true
)
public class OrderApplyPartRefundRequest implements MeituanRequest<String> {
    /**
    * <p>申请部分退款的具体原因</p>
    */
    @NotBlank(message = "reason不能为空")
    @SerializedName("reason")
    private String reason;
    /**
    * <p>订单号</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p>部分退款菜品详情</p>
    */
    @NotBlank(message = "foodData不能为空")
    @SerializedName("foodData")
    private String foodData;

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
    public String getFoodData() {
        return foodData;
    }
    public void setFoodData(String foodData) {
        this.foodData = foodData;
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
        return "OrderApplyPartRefundRequest{" + "reason=" + reason + "," + "orderId=" + orderId + "," + "foodData=" + foodData + "}";
    }
}
