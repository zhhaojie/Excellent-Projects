package com.meituan.sdk.model.waimaiNg.order.orderRefundIssueAppeal;

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
* 商家申诉接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/refund/issue/appeal",
    businessId = 2,
    apiVersion = "10031",
    apiName = "order_refund_issue_appeal",
    needAuth = true
)
public class OrderRefundIssueAppealRequest implements MeituanRequest<String> {
    /**
    * <p>订单Id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p>退款单Id</p>
    */
    @NotNull(message = "afterSaleId不能为空")
    @SerializedName("afterSaleId")
    private Long afterSaleId;
    /**
    * <p>申诉原因</p>
    */
    @NotBlank(message = "reason不能为空")
    @SerializedName("reason")
    private String reason;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">申诉图片（多张图片逗号分隔）,最多5张</font></span></p>
    */
    @SerializedName("appealPictures")
    private String appealPictures;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getAfterSaleId() {
        return afterSaleId;
    }
    public void setAfterSaleId(Long afterSaleId) {
        this.afterSaleId = afterSaleId;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getAppealPictures() {
        return appealPictures;
    }
    public void setAppealPictures(String appealPictures) {
        this.appealPictures = appealPictures;
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
        return "OrderRefundIssueAppealRequest{" + "orderId=" + orderId + "," + "afterSaleId=" + afterSaleId + "," + "reason=" + reason + "," + "appealPictures=" + appealPictures + "}";
    }
}
