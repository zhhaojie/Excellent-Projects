package com.meituan.sdk.model.waimaiNg.order.cancelZbLogisticsByWmOrderId;

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
    path = "/waimai/order/cancelZbLogisticsByWmOrderId",
    businessId = 2,
    apiVersion = "10042",
    apiName = "cancel_zb_logistics_by_wm_order_id",
    needAuth = true
)
public class CancelZbLogisticsByWmOrderIdRequest implements MeituanRequest<String> {
    /**
    * <p>具体原因</p>
    */
    @NotBlank(message = "detailContent不能为空")
    @SerializedName("detailContent")
    private String detailContent;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单号</font></span></p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;
    /**
    * <p>原因代码</p>
    */
    @NotBlank(message = "reasonCode不能为空")
    @SerializedName("reasonCode")
    private String reasonCode;

    public String getDetailContent() {
        return detailContent;
    }
    public void setDetailContent(String detailContent) {
        this.detailContent = detailContent;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
        return "CancelZbLogisticsByWmOrderIdRequest{" + "detailContent=" + detailContent + "," + "orderId=" + orderId + "," + "reasonCode=" + reasonCode + "}";
    }
}
