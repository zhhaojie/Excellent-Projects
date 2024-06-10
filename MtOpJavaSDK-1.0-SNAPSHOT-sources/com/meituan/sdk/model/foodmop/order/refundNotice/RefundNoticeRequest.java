package com.meituan.sdk.model.foodmop.order.refundNotice;

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
* 品牌方对美团发起的退款审核确认
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/order/refundNotice",
    businessId = 51,
    apiVersion = "10001",
    apiName = "refund_notice",
    needAuth = true
)
public class RefundNoticeRequest implements MeituanRequest<RefundNoticeResponse> {
    /**
    * <p data-diff-id="ct-diff-id-d79856ef-e8f9-4e4e-9b87-86e1363a308f">MT订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p data-diff-id="ct-diff-id-674ba38b-0c63-40e7-bcff-71c9a7bb5325">退款流水，申请退款时会传给品牌</p>
    */
    @NotBlank(message = "refundNumber不能为空")
    @SerializedName("refundNumber")
    private String refundNumber;
    /**
    * <p data-diff-id="ct-diff-id-90f44090-0095-424a-ba0c-7b3cf03aea35">请求时间戳</p>
    */
    @NotNull(message = "timestap不能为空")
    @SerializedName("timestap")
    private Long timestap;
    /**
    * <p data-diff-id="ct-diff-id-10c21751-f76f-42b7-8329-3fc95a2d39bd">商户订单号， 商户查不到订单时为空</p>
    */
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * <p data-diff-id="ct-diff-id-084aa5a6-2cf1-417a-ad25-891faf75eb3a">退款申请确认结果：</p><ul data-diff-id="ct-diff-id-fbb421fa-061d-4036-8728-a70429ac1a87"><li data-list-item-diff-id="ct-list-item-diff-id-d2f36f2e-99a6-41a0-9ead-7fb8b2d83f38"><p data-diff-id="ct-diff-id-b906be13-8992-43c8-9f9f-0e0536a57266">AGREE(0, "同意")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-5d0996b2-5d12-4f00-8146-30f8faf8a6a6"><p data-diff-id="ct-diff-id-6b50acda-5316-4977-b589-d92986e398f3">REJECT(1, "拒绝")</p></li></ul>
    */
    @NotNull(message = "orderRefundStatus不能为空")
    @SerializedName("orderRefundStatus")
    private Integer orderRefundStatus;
    /**
    * <p data-diff-id="ct-diff-id-66c50cc2-e76e-42ed-9573-1cc216396150">拒绝退款原因：</p><ul data-diff-id="ct-diff-id-a3499928-a76a-4efc-8187-2cfa6e56e53a"><li data-list-item-diff-id="ct-list-item-diff-id-7bff3db6-1031-473f-ba07-3389f677ff26"><p data-diff-id="ct-diff-id-580bb8ed-3027-4238-ae6e-c564a81d29db">BEGIN_MAKE(1, "已开始制作")，</p></li><li data-list-item-diff-id="ct-list-item-diff-id-3bf1bca7-7287-48b4-8aab-192e9d67fd33"><p data-diff-id="ct-diff-id-3a33b997-7bb2-417a-8bcf-d1626fed322a">ORDER_NOT_FUND(2, "未查询到订单")，</p></li></ul>
    */
    @SerializedName("vendorRejectRefundType")
    private Integer vendorRejectRefundType;
    /**
    * <p data-diff-id="ct-diff-id-63eb055c-9ee1-4f45-9c60-b290319eb3f6">操作者Id</p>
    */
    @NotBlank(message = "operatorId不能为空")
    @SerializedName("operatorId")
    private String operatorId;
    /**
    * <p data-diff-id="ct-diff-id-33b224ae-93c3-4b41-a826-dad10a5e5629">操作者名称</p>
    */
    @NotBlank(message = "operatorName不能为空")
    @SerializedName("operatorName")
    private String operatorName;
    /**
    * <p data-diff-id="ct-diff-id-5af4f77f-2c4d-4478-9506-399a6afe02a3">失败的详细信息</p>
    */
    @SerializedName("message")
    private String message;
    /**
    * <p data-diff-id="ct-diff-id-85d3afff-5065-4dc1-95a8-3ed253d52cc3">处理时间</p>
    */
    @NotNull(message = "handleTime不能为空")
    @SerializedName("handleTime")
    private Long handleTime;
    /**
    * <p data-diff-id="ct-diff-id-82a0e013-ae16-4fed-aee3-8ace1b1d3794">业务类型 10-MOP</p>
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
    public String getRefundNumber() {
        return refundNumber;
    }
    public void setRefundNumber(String refundNumber) {
        this.refundNumber = refundNumber;
    }
    public Long getTimestap() {
        return timestap;
    }
    public void setTimestap(Long timestap) {
        this.timestap = timestap;
    }
    public String getVendorOrderId() {
        return vendorOrderId;
    }
    public void setVendorOrderId(String vendorOrderId) {
        this.vendorOrderId = vendorOrderId;
    }
    public Integer getOrderRefundStatus() {
        return orderRefundStatus;
    }
    public void setOrderRefundStatus(Integer orderRefundStatus) {
        this.orderRefundStatus = orderRefundStatus;
    }
    public Integer getVendorRejectRefundType() {
        return vendorRejectRefundType;
    }
    public void setVendorRejectRefundType(Integer vendorRejectRefundType) {
        this.vendorRejectRefundType = vendorRejectRefundType;
    }
    public String getOperatorId() {
        return operatorId;
    }
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }
    public String getOperatorName() {
        return operatorName;
    }
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
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
    public MeituanResponse<RefundNoticeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<RefundNoticeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "RefundNoticeRequest{" + "orderId=" + orderId + "," + "refundNumber=" + refundNumber + "," + "timestap=" + timestap + "," + "vendorOrderId=" + vendorOrderId + "," + "orderRefundStatus=" + orderRefundStatus + "," + "vendorRejectRefundType=" + vendorRejectRefundType + "," + "operatorId=" + operatorId + "," + "operatorName=" + operatorName + "," + "message=" + message + "," + "handleTime=" + handleTime + "," + "bizType=" + bizType + "}";
    }
}
