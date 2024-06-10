package com.meituan.sdk.model.waimaiNg.order.orderGetRealRecipientAddress;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询真实地址接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/getRealRecipientAddress",
    businessId = 2,
    apiVersion = "10017",
    apiName = "order_get_real_recipient_address",
    needAuth = true
)
public class OrderGetRealRecipientAddressRequest implements MeituanRequest<OrderGetRealRecipientAddressResponse> {
    /**
    * <p>订单ID</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p>查询原因类型枚举值：</p><p>1：商家自有运力。</p><p>2：美团运力转商家自有运力。</p><p>0：其他。</p>
    */
    @NotNull(message = "queryReasonType不能为空")
    @SerializedName("queryReasonType")
    private Integer queryReasonType;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">查询原因补充说明：</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">当【查询原因类型=其他】时，必须填写原因，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">即query_reason_type=0时，必填。</font></span></p>
    */
    @SerializedName("addOtherReason")
    private String addOtherReason;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Integer getQueryReasonType() {
        return queryReasonType;
    }
    public void setQueryReasonType(Integer queryReasonType) {
        this.queryReasonType = queryReasonType;
    }
    public String getAddOtherReason() {
        return addOtherReason;
    }
    public void setAddOtherReason(String addOtherReason) {
        this.addOtherReason = addOtherReason;
    }


    @Override
    public MeituanResponse<OrderGetRealRecipientAddressResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<OrderGetRealRecipientAddressResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderGetRealRecipientAddressRequest{" + "orderId=" + orderId + "," + "queryReasonType=" + queryReasonType + "," + "addOtherReason=" + addOtherReason + "}";
    }
}
