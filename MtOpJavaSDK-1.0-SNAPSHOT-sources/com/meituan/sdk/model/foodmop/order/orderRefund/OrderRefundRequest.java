package com.meituan.sdk.model.foodmop.order.orderRefund;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家发起退款
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/order/refund",
    businessId = 51,
    apiVersion = "10001",
    apiName = "order_refund",
    needAuth = true
)
public class OrderRefundRequest implements MeituanRequest<Void> {
    /**
    * <p data-diff-id="ct-diff-id-91b89099-5e50-4252-a944-2ae0bd7910e3">美团平台订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p data-diff-id="ct-diff-id-5eaa4a27-5a59-4f37-9a29-154d9e4dcf9e">商户订单号</p>
    */
    @NotBlank(message = "vendorOrderId不能为空")
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * <p data-diff-id="ct-diff-id-89d49c7c-2794-4fe3-87fd-5a8f52d4658d">请求时间戳</p>
    */
    @NotNull(message = "timestamp不能为空")
    @SerializedName("timestamp")
    private Long timestamp;
    /**
    * <p data-diff-id="ct-diff-id-4717d458-d319-4f75-95c5-bef9dd2b42a7">商家退款原因：</p><p data-diff-id="ct-diff-id-9c81ae14-3ac8-429d-8eb2-1fa91c49d459">MERCHANT_REFUND(1, "商家原因退款"),<br>OTHER_REASON_REFUND(2, "其他原因退款");</p>
    */
    @NotNull(message = "vendorDirectRefundType不能为空")
    @SerializedName("vendorDirectRefundType")
    private Integer vendorDirectRefundType;
    /**
    * <p data-diff-id="ct-diff-id-1a7650cc-9964-474d-b395-ad0e630b4a7a">是否已取餐</p>
    */
    @NotNull(message = "consumed不能为空")
    @SerializedName("consumed")
    private Boolean consumed;
    /**
    * <p data-diff-id="ct-diff-id-32573df0-1e08-4959-9ef0-03daa0dc9a2c">操作者名称</p>
    */
    @NotBlank(message = "operatorName不能为空")
    @SerializedName("operatorName")
    private String operatorName;
    /**
    * <p data-diff-id="ct-diff-id-16daba7a-471d-4449-a257-d83ec4aa5b1b">操作者Id</p>
    */
    @NotBlank(message = "operatorId不能为空")
    @SerializedName("operatorId")
    private String operatorId;
    /**
    * <p data-diff-id="ct-diff-id-ce7aa14a-b8b5-4fb5-979d-ec60b3004ca9">申请退款原因</p>
    */
    @NotBlank(message = "refundReason不能为空")
    @SerializedName("refundReason")
    private String refundReason;
    /**
    * <p data-diff-id="ct-diff-id-e61ca381-ea60-42c6-9b81-16d8a6d1bf0b">处理时间</p>
    */
    @NotNull(message = "handleTime不能为空")
    @SerializedName("handleTime")
    private Long handleTime;
    /**
    * <p data-diff-id="ct-diff-id-2e0595d8-fe5b-4f1e-9963-451796fa196b">业务类型 10-MOP</p>
    */
    @NotNull(message = "bizType不能为空")
    @SerializedName("bizType")
    private Integer bizType;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getVendorOrderId() {
        return vendorOrderId;
    }
    public void setVendorOrderId(String vendorOrderId) {
        this.vendorOrderId = vendorOrderId;
    }
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public Integer getVendorDirectRefundType() {
        return vendorDirectRefundType;
    }
    public void setVendorDirectRefundType(Integer vendorDirectRefundType) {
        this.vendorDirectRefundType = vendorDirectRefundType;
    }
    public Boolean getConsumed() {
        return consumed;
    }
    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }
    public String getOperatorName() {
        return operatorName;
    }
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
    public String getOperatorId() {
        return operatorId;
    }
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    public String getRefundReason() {
        return refundReason;
    }
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
    public Long getHandleTime() {
        return handleTime;
    }
    public void setHandleTime(Long handleTime) {
        this.handleTime = handleTime;
    }
    public Integer getBizType() {
        return bizType;
    }
    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderRefundRequest{" + "orderId=" + orderId + "," + "vendorOrderId=" + vendorOrderId + "," + "timestamp=" + timestamp + "," + "vendorDirectRefundType=" + vendorDirectRefundType + "," + "consumed=" + consumed + "," + "operatorName=" + operatorName + "," + "operatorId=" + operatorId + "," + "refundReason=" + refundReason + "," + "handleTime=" + handleTime + "," + "bizType=" + bizType + "}";
    }
}
