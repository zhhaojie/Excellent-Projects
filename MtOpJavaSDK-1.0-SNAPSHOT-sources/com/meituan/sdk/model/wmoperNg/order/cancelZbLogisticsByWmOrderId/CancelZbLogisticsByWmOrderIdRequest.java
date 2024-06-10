package com.meituan.sdk.model.wmoperNg.order.cancelZbLogisticsByWmOrderId;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 提交取消跑腿
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/cancelZbLogisticsByWmOrderId",
    businessId = 16,
    apiVersion = "10013",
    apiName = "cancel_zb_logistics_by_wm_order_id",
    needAuth = true
)
public class CancelZbLogisticsByWmOrderIdRequest implements MeituanRequest<String> {
    /**
    * <p>订单号</p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;
    /**
    * <p>具体原因</p>
    */
    @NotBlank(message = "detailContent不能为空")
    @SerializedName("detailContent")
    private String detailContent;
    /**
    * <p>原因代码</p>
    */
    @SerializedName("reasonCode")
    private String reasonCode;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getDetailContent() {
        return detailContent;
    }
    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }
    public String getReasonCode() {
        return reasonCode;
    }
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
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
        return "CancelZbLogisticsByWmOrderIdRequest{" + "orderId=" + orderId + "," + "detailContent=" + detailContent + "," + "reasonCode=" + reasonCode + "}";
    }
}
