package com.meituan.sdk.model.dcps.fulfill.groupbuyOrderLogs;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 套餐配送-查询轨迹
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/order/logs",
    businessId = 46,
    apiVersion = "10027",
    apiName = "groupbuy_order_logs",
    needAuth = true
)
public class GroupbuyOrderLogsRequest implements MeituanRequest<GroupbuyOrderLogsResponse> {
    @NotBlank(message = "bookingOrderId不能为空")
    @SerializedName("bookingOrderId")
    private String bookingOrderId;
    @SerializedName("opIp")
    private String opIp;
    @SerializedName("opPlatform")
    private String opPlatform;
    @SerializedName("opUuid")
    private String opUuid;

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


    @Override
    public MeituanResponse<GroupbuyOrderLogsResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupbuyOrderLogsResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupbuyOrderLogsRequest{" + "bookingOrderId=" + bookingOrderId + "," + "opIp=" + opIp + "," + "opPlatform=" + opPlatform + "," + "opUuid=" + opUuid + "}";
    }
}
