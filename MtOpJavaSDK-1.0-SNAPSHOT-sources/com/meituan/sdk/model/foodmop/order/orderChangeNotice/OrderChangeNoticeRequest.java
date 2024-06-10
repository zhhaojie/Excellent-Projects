package com.meituan.sdk.model.foodmop.order.orderChangeNotice;

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
* 订单修改审核结果通知
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/order/orderChangeNotice",
    businessId = 51,
    apiVersion = "10001",
    apiName = "order_change_notice",
    needAuth = true
)
public class OrderChangeNoticeRequest implements MeituanRequest<Void> {
    /**
    * <p data-diff-id="ct-diff-id-8ab2e76a-ae50-489c-9c22-109f06dde0f6">MT订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p data-diff-id="ct-diff-id-616a0d91-e2df-4ec2-9bb7-5b0885581933">请求时间戳</p>
    */
    @NotNull(message = "timestamp不能为空")
    @SerializedName("timestamp")
    private Long timestamp;
    /**
    * <p data-diff-id="ct-diff-id-43c3a653-68fe-4601-bfc7-53bbfa019bf2">商户订单号</p>
    */
    @NotBlank(message = "vendorOrderId不能为空")
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * <p data-diff-id="ct-diff-id-fe8aeb3b-b002-47d5-affe-25c2a911b1f3">订单修改类型：</p><p data-diff-id="ct-diff-id-10c48c1c-c35e-49b1-bfff-949b73bc201d">TAKE_TIME(1, "取餐时间")</p><p data-diff-id="ct-diff-id-5fb23c22-15e3-49c0-aabc-4450e69506b7">ORDER_TYPE_FROM_BOOKING_TO_REAL(2, "预约单改成实时单")</p>
    */
    @NotNull(message = "orderModifyType不能为空")
    @SerializedName("orderModifyType")
    private Integer orderModifyType;
    /**
    * <p data-diff-id="ct-diff-id-9d3037c4-4f79-40f5-ba1c-eb1911347fc6">订单修改结果：</p><p data-diff-id="ct-diff-id-a96f5646-2cc2-4802-abdb-76a9dbc31bed">SUCCESS(0, "成功")</p><p data-diff-id="ct-diff-id-b6d5894a-94c8-4db5-8dcf-ca838d4a7988">FAIL(1, "失败")</p>
    */
    @NotNull(message = "orderModifyStatus不能为空")
    @SerializedName("orderModifyStatus")
    private Integer orderModifyStatus;
    /**
    * <p data-diff-id="ct-diff-id-29f791f2-707e-40b2-90ae-d3adc03e0791">预计取餐时间，普通单必传</p>
    */
    @SerializedName("takeTime")
    private Long takeTime;
    /**
    * <p data-diff-id="ct-diff-id-dbbde359-63c3-42dd-8d80-49841fcb646e">操作者Id</p>
    */
    @NotBlank(message = "operatorId不能为空")
    @SerializedName("operatorId")
    private String operatorId;
    /**
    * <p data-diff-id="ct-diff-id-3a8bb1d8-c5e3-4d1a-a42b-f291347a0a53">操作者名称</p>
    */
    @NotBlank(message = "operatorName不能为空")
    @SerializedName("operatorName")
    private String operatorName;
    /**
    * <p data-diff-id="ct-diff-id-2f1dc8d1-2e91-4c48-8acd-5ef3e2e0a574">预期制作时间，预约单必传</p>
    */
    @SerializedName("makeTime")
    private Long makeTime;
    /**
    * <p data-diff-id="ct-diff-id-04d78cca-595b-4e84-a345-c786c27af1c1">修改失败原因：</p><p data-diff-id="ct-diff-id-ab340537-1833-4f06-bbdf-0f98595e6075">ORDER_NOT_FUND(1, "未查询到订单"),</p><p data-diff-id="ct-diff-id-d2f4efb6-9281-4692-92c8-45a7910e97e2">NOT_BOOKING_ORDER(2, "非预约单"),</p><p data-diff-id="ct-diff-id-f62e988e-9676-4896-a97c-8f280cad0891">REPEAT_MODIFY(3, "不能重复修改")</p>
    */
    @SerializedName("rejectType")
    private Integer rejectType;
    /**
    * <p data-diff-id="ct-diff-id-1bb9606e-9257-4039-9f55-f66d72b0dfed">拒绝修改理由</p>
    */
    @SerializedName("rejectMessage")
    private String rejectMessage;
    /**
    * <p data-diff-id="ct-diff-id-baebe6ec-09e9-42ce-bea8-a588add61fa9">处理时间</p>
    */
    @NotNull(message = "handleTime不能为空")
    @SerializedName("handleTime")
    private Long handleTime;
    /**
    * <p data-diff-id="ct-diff-id-30df383d-e630-4e62-b64f-610cc329ee6b">业务类型 10-MOP</p>
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
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public String getVendorOrderId() {
        return vendorOrderId;
    }
    public void setVendorOrderId(String vendorOrderId) {
        this.vendorOrderId = vendorOrderId;
    }
    public Integer getOrderModifyType() {
        return orderModifyType;
    }
    public void setOrderModifyType(Integer orderModifyType) {
        this.orderModifyType = orderModifyType;
    }
    public Integer getOrderModifyStatus() {
        return orderModifyStatus;
    }
    public void setOrderModifyStatus(Integer orderModifyStatus) {
        this.orderModifyStatus = orderModifyStatus;
    }
    public Long getTakeTime() {
        return takeTime;
    }
    public void setTakeTime(Long takeTime) {
        this.takeTime = takeTime;
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
    public Long getMakeTime() {
        return makeTime;
    }
    public void setMakeTime(Long makeTime) {
        this.makeTime = makeTime;
    }
    public Integer getRejectType() {
        return rejectType;
    }
    public void setRejectType(Integer rejectType) {
        this.rejectType = rejectType;
    }
    public String getRejectMessage() {
        return rejectMessage;
    }
    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage;
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
        return "OrderChangeNoticeRequest{" + "orderId=" + orderId + "," + "timestamp=" + timestamp + "," + "vendorOrderId=" + vendorOrderId + "," + "orderModifyType=" + orderModifyType + "," + "orderModifyStatus=" + orderModifyStatus + "," + "takeTime=" + takeTime + "," + "operatorId=" + operatorId + "," + "operatorName=" + operatorName + "," + "makeTime=" + makeTime + "," + "rejectType=" + rejectType + "," + "rejectMessage=" + rejectMessage + "," + "handleTime=" + handleTime + "," + "bizType=" + bizType + "}";
    }
}
