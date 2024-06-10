package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderRefund;

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
* 代金券买单申请退款
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/ng/group_voucher/order/refund",
    businessId = 1,
    apiVersion = "10004",
    apiName = "groupvoucher_order_refund",
    needAuth = true
)
public class GroupvoucherOrderRefundRequest implements MeituanRequest<GroupvoucherOrderRefundResponse> {
    /**
    * <p data-diff-id="ct-diff-id-91bfe29d-2f31-4537-bfe9-72b0a9ca277f"><span style="color: #333">门店管理员账号id</span></p>
    */
    @NotBlank(message = "vendorShopAdminId不能为空")
    @SerializedName("vendorShopAdminId")
    private String vendorShopAdminId;
    /**
    * <p data-diff-id="ct-diff-id-d5d78f3e-2d7d-4ae0-95cc-29385b29a6eb"><span style="color: #333">厂商退款请求地址ip</span></p>
    */
    @NotBlank(message = "vendorIp不能为空")
    @SerializedName("vendorIp")
    private String vendorIp;
    /**
    * <p data-diff-id="ct-diff-id-cd5298fd-3768-40a1-84a1-c14ca647d5e7">退款类型，0:商家通过开店宝账号退款，1：系统直接退款</p>
    */
    @NotNull(message = "refundType不能为空")
    @SerializedName("refundType")
    private Long refundType;
    /**
    * <p data-diff-id="ct-diff-id-495982b0-010a-45ca-9573-711038e535a2"><span style="color: #333">退款原因</span></p>
    */
    @NotBlank(message = "refundReason不能为空")
    @SerializedName("refundReason")
    private String refundReason;
    /**
    * <p data-diff-id="ct-diff-id-d6fa644a-d441-45b8-b861-71acfd386e06"><span style="color: rgba(0, 0, 0, 0.65)">用户/开店宝展示的订单ID</span></p>
    */
    @NotBlank(message = "serialNumber不能为空")
    @SerializedName("serialNumber")
    private String serialNumber;
    /**
    * <p data-diff-id="ct-diff-id-ed0fd995-f1d1-46f7-9cf5-4ec718d2ccfd"><span style="color: rgba(0, 0, 0, 0.65)">订单ID</span></p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;

    public String getVendorShopAdminId() {
        return vendorShopAdminId;
    }
    public void setVendorShopAdminId(String vendorShopAdminId) {
        this.vendorShopAdminId = vendorShopAdminId;
    }
    public String getVendorIp() {
        return vendorIp;
    }
    public void setVendorIp(String vendorIp) {
        this.vendorIp = vendorIp;
    }
    public Long getRefundType() {
        return refundType;
    }
    public void setRefundType(Long refundType) {
        this.refundType = refundType;
    }
    public String getRefundReason() {
        return refundReason;
    }
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    @Override
    public MeituanResponse<GroupvoucherOrderRefundResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupvoucherOrderRefundResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupvoucherOrderRefundRequest{" + "vendorShopAdminId=" + vendorShopAdminId + "," + "vendorIp=" + vendorIp + "," + "refundType=" + refundType + "," + "refundReason=" + refundReason + "," + "serialNumber=" + serialNumber + "," + "orderId=" + orderId + "}";
    }
}
