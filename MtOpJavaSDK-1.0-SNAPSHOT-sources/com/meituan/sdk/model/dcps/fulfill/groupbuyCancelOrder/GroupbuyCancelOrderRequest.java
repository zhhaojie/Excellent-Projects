package com.meituan.sdk.model.dcps.fulfill.groupbuyCancelOrder;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 套餐配送-取消订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/cancel/order",
    businessId = 46,
    apiVersion = "10021",
    apiName = "groupbuy_cancel_order",
    needAuth = true
)
public class GroupbuyCancelOrderRequest implements MeituanRequest<GroupbuyCancelOrderResponse> {
    @NotBlank(message = "bookingOrderId不能为空")
    @SerializedName("bookingOrderId")
    private String bookingOrderId;
    @SerializedName("opIp")
    private String opIp;
    @SerializedName("opPlatform")
    private String opPlatform;
    @SerializedName("opUuid")
    private String opUuid;
    @NotBlank(message = "cancelReason不能为空")
    @SerializedName("cancelReason")
    private String cancelReason;

    public String getBookingOrderId() {
        return bookingOrderId;
    }
    public void setBookingOrderId(String bookingOrderId) {
        this.bookingOrderId = bookingOrderId;
    }
    public String getOpIp() {
        return opIp;
    }
    public void setOpIp(String opIp) {
        this.opIp = opIp;
    }
    public String getOpPlatform() {
        return opPlatform;
    }
    public void setOpPlatform(String opPlatform) {
        this.opPlatform = opPlatform;
    }
    public String getOpUuid() {
        return opUuid;
    }
    public void setOpUuid(String opUuid) {
        this.opUuid = opUuid;
    }
    public String getCancelReason() {
        return cancelReason;
    }
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }


    @Override
    public MeituanResponse<GroupbuyCancelOrderResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupbuyCancelOrderResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupbuyCancelOrderRequest{" + "bookingOrderId=" + bookingOrderId + "," + "opIp=" + opIp + "," + "opPlatform=" + opPlatform + "," + "opUuid=" + opUuid + "," + "cancelReason=" + cancelReason + "}";
    }
}
