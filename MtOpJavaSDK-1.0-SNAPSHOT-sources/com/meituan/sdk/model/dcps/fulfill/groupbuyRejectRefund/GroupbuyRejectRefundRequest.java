package com.meituan.sdk.model.dcps.fulfill.groupbuyRejectRefund;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 套餐配送-拒绝退款
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/reject/refund",
    businessId = 46,
    apiVersion = "10024",
    apiName = "groupbuy_reject_refund",
    needAuth = true
)
public class GroupbuyRejectRefundRequest implements MeituanRequest<GroupbuyRejectRefundResponse> {
    @NotBlank(message = "bookingOrderId不能为空")
    @SerializedName("bookingOrderId")
    private String bookingOrderId;
    @SerializedName("opIp")
    private String opIp;
    @SerializedName("opPlatform")
    private String opPlatform;
    @SerializedName("opUuid")
    private String opUuid;
    @NotBlank(message = "refuseReason不能为空")
    @SerializedName("refuseReason")
    private String refuseReason;

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
    public String getRefuseReason() {
        return refuseReason;
    }
    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }


    @Override
    public MeituanResponse<GroupbuyRejectRefundResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupbuyRejectRefundResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupbuyRejectRefundRequest{" + "bookingOrderId=" + bookingOrderId + "," + "opIp=" + opIp + "," + "opPlatform=" + opPlatform + "," + "opUuid=" + opUuid + "," + "refuseReason=" + refuseReason + "}";
    }
}
