package com.meituan.sdk.model.wmoperNg.order.getOrderRecipientPrivacyInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询订单收餐人隐私信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/getOrderRecipientPrivacyInfo",
    businessId = 16,
    apiVersion = "10031",
    apiName = "get_order_recipient_privacy_info",
    needAuth = true
)
public class GetOrderRecipientPrivacyInfoRequest implements MeituanRequest<GetOrderRecipientPrivacyInfoResponse> {
    /**
    * <p>订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p>查询类型。</p><p>1仅查询收餐人电话（含脱敏真实号），</p><p>2仅查询收餐人脱敏地址，</p><p>3同时查询。</p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">原因类型。</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">1接单前联系用户-核对订单信息，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">2接单前联系用户-商品缺货协商更换或退款，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">3接单前联系用户-协商发货时间，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">4接单后联系用户-商品缺货协商更换或退款，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">5接单后联系用户-协商发货时间，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">6接单后联系用户-告知出餐或发货进度，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">7订单完成后联系用户-补发商品，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">8订单完成后联系用户-售后回访，</font></span></p><p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">9配送过程联系用户。</font></span></p>
    */
    @NotNull(message = "reasonType不能为空")
    @SerializedName("reasonType")
    private Integer reasonType;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public Integer getReasonType() {
        return reasonType;
    }
    public void setReasonType(Integer reasonType) {
        this.reasonType = reasonType;
    }


    @Override
    public MeituanResponse<GetOrderRecipientPrivacyInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetOrderRecipientPrivacyInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetOrderRecipientPrivacyInfoRequest{" + "orderId=" + orderId + "," + "type=" + type + "," + "reasonType=" + reasonType + "}";
    }
}
