package com.meituan.sdk.model.foodmop.order.orderFullFillNotice;

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
* 品牌订单状态变更通知
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/order/diancannew/order/fullFillNotice",
    businessId = 51,
    apiVersion = "10001",
    apiName = "order_full_fill_notice",
    needAuth = true
)
public class OrderFullFillNoticeRequest implements MeituanRequest<Void> {
    /**
    * <p data-diff-id="ct-diff-id-e7b636ff-6410-4ff4-9e64-b2696ebe055a">美团平台订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p data-diff-id="ct-diff-id-7e095dbb-ac06-4971-94c0-36daeb1e7db9">请求时间戳</p>
    */
    @NotNull(message = "timestamp不能为空")
    @SerializedName("timestamp")
    private Long timestamp;
    /**
    * <p data-diff-id="ct-diff-id-58a8fd7a-378c-4cf9-915e-cf9bd3184437">商户订单号</p>
    */
    @NotBlank(message = "vendorOrderId不能为空")
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * <p data-diff-id="ct-diff-id-11c70c87-43ad-4af8-9adb-5843877d2029">订单履约动作类型：</p><p data-diff-id="ct-diff-id-1af19dbc-0df4-41bc-bdeb-1900a3a44229">START_MAKING(1, "预约单开始制作（进入到制作中）"),&nbsp;实时单接单后就直接进入制作中<br>MAKE_COMPLETE(2, "制作完成（进入到待取餐）");</p>
    */
    @NotNull(message = "orderFulFillActionType不能为空")
    @SerializedName("orderFulFillActionType")
    private Integer orderFulFillActionType;
    /**
    * <p data-diff-id="ct-diff-id-d857f4e2-b7b6-46d2-aee8-9fae5da50095">操作者Id</p>
    */
    @NotBlank(message = "operatorId不能为空")
    @SerializedName("operatorId")
    private String operatorId;
    /**
    * <p data-diff-id="ct-diff-id-6751aa9d-01d3-429f-8347-01b5722e4581">操作者名称</p>
    */
    @NotBlank(message = "operatorName不能为空")
    @SerializedName("operatorName")
    private String operatorName;
    /**
    * <p data-diff-id="ct-diff-id-4db5bfcb-bfea-4f4f-ad72-5b4ebd375cfc">处理时间</p>
    */
    @NotNull(message = "handleTime不能为空")
    @SerializedName("handleTime")
    private Long handleTime;
    /**
    * <p data-diff-id="ct-diff-id-dff4a309-3cbf-4a58-b1bd-744e911cb5b5">业务类型 10-MOP</p>
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
    public Integer getOrderFulFillActionType() {
        return orderFulFillActionType;
    }
    public void setOrderFulFillActionType(Integer orderFulFillActionType) {
        this.orderFulFillActionType = orderFulFillActionType;
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
        return "OrderFullFillNoticeRequest{" + "orderId=" + orderId + "," + "timestamp=" + timestamp + "," + "vendorOrderId=" + vendorOrderId + "," + "orderFulFillActionType=" + orderFulFillActionType + "," + "operatorId=" + operatorId + "," + "operatorName=" + operatorName + "," + "handleTime=" + handleTime + "," + "bizType=" + bizType + "}";
    }
}
