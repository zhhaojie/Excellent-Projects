package com.meituan.sdk.model.foodmop.order.orderFinish;

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
* 品牌订单完成通知
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/order/diancannew/order/finish",
    businessId = 51,
    apiVersion = "10001",
    apiName = "order_finish",
    needAuth = true
)
public class OrderFinishRequest implements MeituanRequest<Void> {
    /**
    * <p data-diff-id="ct-diff-id-f629edaa-1cf8-4cef-8bfc-81830e159e02">美团平台订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p data-diff-id="ct-diff-id-323a398e-542d-4ccb-b2d4-371d819fd438">商户订单号</p>
    */
    @NotBlank(message = "vendorOrderId不能为空")
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * <p data-diff-id="ct-diff-id-a16c093b-3a26-4fd2-9cd1-71d5d0a20329">操作者Id</p>
    */
    @NotBlank(message = "operatorId不能为空")
    @SerializedName("operatorId")
    private String operatorId;
    /**
    * <p data-diff-id="ct-diff-id-5ccdee9f-16d5-4c07-a430-c3920c037ed0">操作者名称</p>
    */
    @NotBlank(message = "operatorName不能为空")
    @SerializedName("operatorName")
    private String operatorName;
    /**
    * <p data-diff-id="ct-diff-id-8f167f86-3bf5-4db6-87c9-0a3cecdecd13">处理时间</p>
    */
    @NotNull(message = "handleTime不能为空")
    @SerializedName("handleTime")
    private Long handleTime;
    /**
    * <p data-diff-id="ct-diff-id-0e02d659-4593-4073-8e75-f4ee62116604">请求时间戳</p>
    */
    @SerializedName("timestamp")
    private Long timestamp;
    /**
    * <p data-diff-id="ct-diff-id-da539c5e-60af-4959-8ddb-27867470fbcf">业务类型 10-MOP</p>
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
    public Long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
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
        return "OrderFinishRequest{" + "orderId=" + orderId + "," + "vendorOrderId=" + vendorOrderId + "," + "operatorId=" + operatorId + "," + "operatorName=" + operatorName + "," + "handleTime=" + handleTime + "," + "timestamp=" + timestamp + "," + "bizType=" + bizType + "}";
    }
}
