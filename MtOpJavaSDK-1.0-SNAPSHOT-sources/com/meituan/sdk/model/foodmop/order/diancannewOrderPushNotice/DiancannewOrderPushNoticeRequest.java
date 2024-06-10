package com.meituan.sdk.model.foodmop.order.diancannewOrderPushNotice;

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
* 订单确认接口
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/order/diancannew/order/pushNotice",
    businessId = 51,
    apiVersion = "10001",
    apiName = "diancannew_order_push_notice",
    needAuth = true
)
public class DiancannewOrderPushNoticeRequest implements MeituanRequest<Void> {
    /**
    * <p data-diff-id="ct-diff-id-58a2712e-a8bd-443b-8832-d7e5f56b5516">美团订单号</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p data-diff-id="ct-diff-id-885b3998-fa2a-4850-835f-bfb099feaad9">请求时间戳</p>
    */
    @NotNull(message = "timestamp不能为空")
    @SerializedName("timestamp")
    private Long timestamp;
    /**
    * <p data-diff-id="ct-diff-id-277f4de4-b571-4505-985e-c69317d4c2de">商户订单号，接单时必传</p>
    */
    @SerializedName("vendorOrderId")
    private String vendorOrderId;
    /**
    * <p data-diff-id="ct-diff-id-d1be4c60-1192-4384-83ef-59bb06bcbc41">取餐码，仅以二维码形式展示给用户，非必传</p>
    */
    @SerializedName("takeMark")
    private String takeMark;
    /**
    * <p data-diff-id="ct-diff-id-b3623751-7ce3-4295-9247-3c0aa6c3c8e0">取餐口令</p><ul data-diff-id="ct-diff-id-65e785bb-7536-4236-9aad-ead89540a46d"><li data-list-item-diff-id="ct-list-item-diff-id-5fcf8d2a-e87c-4751-9ed1-387da2870e3f"><p data-diff-id="ct-diff-id-3068de62-97a9-4573-bcd6-74feba27d651">如品牌自己生成取餐口令，则接单时必传（需审核）</p></li><li data-list-item-diff-id="ct-list-item-diff-id-5da3feb7-28fc-4cc1-9dd1-9667b9005df1"><p data-diff-id="ct-diff-id-37629579-10bb-4959-afbc-bc4b889b2f47">可以二维码/字符串形式展示，以二维码展示时，takeMark优先级高于takeCode（两者最多仅有一个会转换为二维码）</p></li></ul>
    */
    @SerializedName("takeCode")
    private String takeCode;
    /**
    * <p data-diff-id="ct-diff-id-53faaf4e-7b20-4b5a-96f2-82e5e0c44af9">确认订单结果：</p><ul data-diff-id="ct-diff-id-89d98f23-c48d-4a64-874f-3e2ee0ccc503"><li data-list-item-diff-id="ct-list-item-diff-id-76109c2c-d1b8-4842-959f-5646f1719d36"><p data-diff-id="ct-diff-id-51f93749-fbbe-4821-ae5d-eee2b1b03cd6">SUCCESS(0, "接单")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-d1190fbe-bc09-4c59-a9b4-dbdcfca91363"><p data-diff-id="ct-diff-id-7d5ad622-ab23-412e-96e5-736515ee55ff">FAIL(1, "拒单")</p></li></ul>
    */
    @NotNull(message = "orderConfirmStatus不能为空")
    @SerializedName("orderConfirmStatus")
    private Integer orderConfirmStatus;
    /**
    * <p data-diff-id="ct-diff-id-a73664e9-c5da-49e7-932e-594aaf9240cd">预计取餐时间，普通单必传，接单到时间加上max预计取餐时间的时间戳</p>
    */
    @SerializedName("takeTime")
    private Long takeTime;
    /**
    * <p data-diff-id="ct-diff-id-239faa5c-dcf5-4fa3-9d58-5b2d35a695be">预约单会给预计开始制作时间，时间戳（预约单必传）</p>
    */
    @SerializedName("makeTime")
    private Long makeTime;
    /**
    * <p data-diff-id="ct-diff-id-147f10c8-f106-4ab5-8f05-4e96df4009e2">处理时间</p>
    */
    @NotNull(message = "handleTime不能为空")
    @SerializedName("handleTime")
    private Long handleTime;
    /**
    * <p data-diff-id="ct-diff-id-1f4b3aea-8a36-46f4-9f54-9b177fa232f0">发票子渠道，发票需要用到（需要确认开票方式）</p>
    */
    @SerializedName("ocOrderType")
    private Integer ocOrderType;
    /**
    * <p data-diff-id="ct-diff-id-65137abd-6946-4fb6-a879-41abe47081a9">发表主渠道，发票需要用到（需要确认开票方式）</p>
    */
    @SerializedName("serviceType")
    private Integer serviceType;
    /**
    * <p data-diff-id="ct-diff-id-83c88ed7-0e53-4f4f-bf96-960be2198a9f">操作者Id</p>
    */
    @NotBlank(message = "operatorId不能为空")
    @SerializedName("operatorId")
    private String operatorId;
    /**
    * <p data-diff-id="ct-diff-id-86e1dbb7-f6f0-4d2d-a744-98404a91df8e">操作者名称</p>
    */
    @NotBlank(message = "operatorName不能为空")
    @SerializedName("operatorName")
    private String operatorName;
    /**
    * <p data-diff-id="ct-diff-id-64174bc8-d6f9-4499-8638-743ed2d18f5b">拒单原因，拒单时必填：</p><ul data-diff-id="ct-diff-id-f54dbd67-b619-43fa-ac3b-1fc1d1d4064b"><li data-list-item-diff-id="ct-list-item-diff-id-408994ff-ef23-4c0e-bd18-2c03232e9e15"><p data-diff-id="ct-diff-id-920826a2-d0db-4902-a048-c88f3060b566">DUPLICATE_ORDER(1, "重复订单")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-e6a14891-4c30-4fe7-9333-51f97745e606"><p data-diff-id="ct-diff-id-ba135212-87b7-4fba-bb6d-1676725dbb15">SHOP_CLOSE(2, "店铺已打烊")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-fa13580c-daf5-4793-b240-38359f6fe3ed"><p data-diff-id="ct-diff-id-1ed5d840-c7c2-4b9b-b9fb-2b5f72916f78">PROMOTION_ERROR(3, "营销信息错误")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-6ba5fb79-8e7f-4cf1-b145-d66921612140"><p data-diff-id="ct-diff-id-63db7b78-51ae-424e-962e-7a1b2ed8741a">SHOP_TIME_NOT_SUPPORT(4, "该时段不支持（预约单）")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-9e1ebdfb-29cc-43e6-bf7b-73af20a57ee5"><p data-diff-id="ct-diff-id-302fbdc1-08c2-45ab-83a2-a28f64d1ee3c">SELL_OUT(5, "菜品售完")</p></li><li data-list-item-diff-id="ct-list-item-diff-id-0d6f71b9-e976-4d1e-bf8b-a613f5eb3806"><p data-diff-id="ct-diff-id-f4fc5758-43b1-4a0b-9162-170767135e8b">ORDER_ERROR(6, "其他原因")</p></li></ul>
    */
    @SerializedName("vendorConfirmReject")
    private Integer vendorConfirmReject;
    /**
    * <p data-diff-id="ct-diff-id-d55da5bd-8ffb-4ccf-8768-bb76b532d524">拒单描述，拒单时必填</p>
    */
    @SerializedName("rejectMessage")
    private String rejectMessage;
    /**
    * <p data-diff-id="ct-diff-id-aaca369d-cfc8-416b-a095-38e35da57d76">业务类型 10-MOP</p>
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
    public String getTakeMark() {
        return takeMark;
    }
    public void setTakeMark(String takeMark) {
        this.takeMark = takeMark;
    }
    public String getTakeCode() {
        return takeCode;
    }
    public void setTakeCode(String takeCode) {
        this.takeCode = takeCode;
    }
    public Integer getOrderConfirmStatus() {
        return orderConfirmStatus;
    }
    public void setOrderConfirmStatus(Integer orderConfirmStatus) {
        this.orderConfirmStatus = orderConfirmStatus;
    }
    public Long getTakeTime() {
        return takeTime;
    }
    public void setTakeTime(Long takeTime) {
        this.takeTime = takeTime;
    }
    public Long getMakeTime() {
        return makeTime;
    }
    public void setMakeTime(Long makeTime) {
        this.makeTime = makeTime;
    }
    public Long getHandleTime() {
        return handleTime;
    }
    public void setHandleTime(Long handleTime) {
        this.handleTime = handleTime;
    }
    public Integer getOcOrderType() {
        return ocOrderType;
    }
    public void setOcOrderType(Integer ocOrderType) {
        this.ocOrderType = ocOrderType;
    }
    public Integer getServiceType() {
        return serviceType;
    }
    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
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
    public Integer getVendorConfirmReject() {
        return vendorConfirmReject;
    }
    public void setVendorConfirmReject(Integer vendorConfirmReject) {
        this.vendorConfirmReject = vendorConfirmReject;
    }
    public String getRejectMessage() {
        return rejectMessage;
    }
    public void setRejectMessage(String rejectMessage) {
        this.rejectMessage = rejectMessage;
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
        return "DiancannewOrderPushNoticeRequest{" + "orderId=" + orderId + "," + "timestamp=" + timestamp + "," + "vendorOrderId=" + vendorOrderId + "," + "takeMark=" + takeMark + "," + "takeCode=" + takeCode + "," + "orderConfirmStatus=" + orderConfirmStatus + "," + "takeTime=" + takeTime + "," + "makeTime=" + makeTime + "," + "handleTime=" + handleTime + "," + "ocOrderType=" + ocOrderType + "," + "serviceType=" + serviceType + "," + "operatorId=" + operatorId + "," + "operatorName=" + operatorName + "," + "vendorConfirmReject=" + vendorConfirmReject + "," + "rejectMessage=" + rejectMessage + "," + "bizType=" + bizType + "}";
    }
}
