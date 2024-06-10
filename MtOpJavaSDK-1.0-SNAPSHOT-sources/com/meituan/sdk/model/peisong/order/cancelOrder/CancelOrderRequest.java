package com.meituan.sdk.model.peisong.order.cancelOrder;

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
* 取消订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/cancel",
    businessId = 19,
    apiVersion = "10004",
    apiName = "cancel_order",
    needAuth = false
)
public class CancelOrderRequest implements MeituanRequest<CancelOrderResponse> {
    /**
    * 配送活动标识
    */
    @NotNull(message = "deliveryId不能为空")
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 美团配送内部订单id，最长不超过32个字符
    */
    @NotBlank(message = "mtPeisongId不能为空")
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 取消原因类别，默认为接入方原因 详情请参考 美团配送开放平台接口文档--门户页面-4.3.1，客户取消订单原因
    */
    @NotNull(message = "cancelReasonId不能为空")
    @SerializedName("cancel_reason_id")
    private Integer cancelReasonId;
    /**
    * 详细取消原因，最长不超过256个字符
    */
    @NotBlank(message = "cancelReason不能为空")
    @SerializedName("cancel_reason")
    private String cancelReason;

    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public Integer getCancelReasonId() {
        return cancelReasonId;
    }
    public void setCancelReasonId(Integer cancelReasonId) {
        this.cancelReasonId = cancelReasonId;
    }
    public String getCancelReason() {
        return cancelReason;
    }
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }


    @Override
    public MeituanResponse<CancelOrderResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CancelOrderResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CancelOrderRequest{" + "deliveryId=" + deliveryId + "," + "mtPeisongId=" + mtPeisongId + "," + "cancelReasonId=" + cancelReasonId + "," + "cancelReason=" + cancelReason + "}";
    }
}
