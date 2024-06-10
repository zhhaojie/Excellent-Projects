package com.meituan.sdk.model.resv2.order.operateOrder;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * <p data-diff-id="ct-diff-id-b28bcbf6-0f63-4fb2-a159-4f7fd5ffbbb7"><span style="color: rgb(36, 41, 46)">订单ID</span></p>
    */
    @NotBlank(message = "orderSerializedId不能为空")
    @SerializedName("orderSerializedId")
    private String orderSerializedId;
    /**
    * <p data-diff-id="ct-diff-id-fa9510e4-2903-42ea-87d8-8b9c48e24939"><span style="color: rgb(36, 41, 46)">操作类型</span></p><p style="text-align: center;" data-diff-id="ct-diff-id-4b5c308c-74b2-4251-88f7-6117d26cae32"><span style="color: rgb(36, 41, 46)">1-接单</span><br><span style="color: rgb(36, 41, 46)">2-拒单</span><br><span style="color: rgb(36, 41, 46)">3-用户到店</span><br><span style="color: rgb(36, 41, 46)">4-用户未到店</span></p>
    */
    @NotNull(message = "operationType不能为空")
    @SerializedName("operationType")
    private Integer operationType;
    /**
    * <p data-diff-id="ct-diff-id-7567bf66-b062-416b-801a-e8bc6bb93db5"><span style="color: rgb(36, 41, 46)">桌位id operationType=1时必填</span></p>
    */
    @SerializedName("tableId")
    private String tableId;
    /**
    * <p data-diff-id="ct-diff-id-354429e6-1be8-425c-b1a9-d78a1443c9bc"><span style="color: rgb(36, 41, 46)">桌位名称&nbsp;</span><span style="color: rgba(0, 0, 0, 0.65)">operationType=1时必填</span></p>
    */
    @SerializedName("tableName")
    private String tableName;
    /**
    * <p data-diff-id="ct-diff-id-37ef6070-e34d-4ed1-b8c1-4f397bbf0823"><span style="color: rgb(36, 41, 46)">时段开始时间&nbsp;</span><span style="color: rgba(0, 0, 0, 0.65)">operationType=1时必填</span></p>
    */
    @SerializedName("startTime")
    private Integer startTime;
    /**
    * <p data-diff-id="ct-diff-id-9cbb453f-1051-48b8-8f83-f73fb94f1408"><span style="color: rgb(36, 41, 46)">时段结束时间&nbsp;</span><span style="color: rgba(0, 0, 0, 0.65)">operationType=1时必填</span></p>
    */
    @SerializedName("endTime")
    private Integer endTime;
    /**
    * <p data-diff-id="ct-diff-id-7c013440-f099-4d62-8d7b-1f78a8155202"><span style="color: rgb(36, 41, 46)">实收金额 operationType=3时必填</span></p>
    */
    @SerializedName("consume")
    private Double consume;
    /**
    * <p data-diff-id="ct-diff-id-ea55dff1-a07f-44ef-9bc3-4577a96b8b29"><span style="color: rgb(36, 41, 46)">应收金额&nbsp;</span><span style="color: rgba(0, 0, 0, 0.65)">operationType=3时必填</span></p>
    */
    @SerializedName("originPrice")
    private Double originPrice;
    /**
    * <p data-diff-id="ct-diff-id-1b7b00d3-5cba-4f68-bbdc-ed6cdeaf38b8"><span style="color: rgb(36, 41, 46)">拒单原因</span></p><p style="text-align: center;" data-diff-id="ct-diff-id-be787ae0-d85e-4b28-b6ae-71b1c9b89a19"><span style="color: rgb(36, 41, 46)">1 - 没有匹配的桌型</span><br><span style="color: rgb(36, 41, 46)">2 - 该桌型已订满</span><br><span style="color: rgb(36, 41, 46)">3 - 不在可预订时间内</span><br><span style="color: rgb(36, 41, 46)">4 - 备注无法满足</span><br><span style="color: rgb(36, 41, 46)">5 - 其他原因</span></p>
    */
    @SerializedName("rejectReason")
    private Integer rejectReason;
    /**
    * <p data-diff-id="ct-diff-id-4e81d632-8461-452d-9aa1-6628d527787d"><span style="color: rgb(36, 41, 46)">拒单其他原因说明</span></p>
    */
    @SerializedName("otherReason")
    private String otherReason;

    public String getOrderSerializedId() {
        return orderSerializedId;
    }
    public void setOrderSerializedId(String orderSerializedId) {
        this.orderSerializedId = orderSerializedId;
    }
    public Integer getOperationType() {
        return operationType;
    }
    public void setOperationType(Integer operationType) {
        this.operationType = operationType;
    }
    public String getTableId() {
        return tableId;
    }
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }
    public String getTableName() {
        return tableName;
    }
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    public Integer getStartTime() {
        return startTime;
    }
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }
    public Integer getEndTime() {
        return endTime;
    }
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }
    public Double getConsume() {
        return consume;
    }
    public void setConsume(Double consume) {
        this.consume = consume;
    }
    public Double getOriginPrice() {
        return originPrice;
    }
    public void setOriginPrice(Double originPrice) {
        this.originPrice = originPrice;
    }
    public Integer getRejectReason() {
        return rejectReason;
    }
    public void setRejectReason(Integer rejectReason) {
        this.rejectReason = rejectReason;
    }
    public String getOtherReason() {
        return otherReason;
    }
    public void setOtherReason(String otherReason) {
        this.otherReason = otherReason;
    }




    @Override
    public String toString() {
        return "Data{" + "orderSerializedId=" + orderSerializedId + "," + "operationType=" + operationType + "," + "tableId=" + tableId + "," + "tableName=" + tableName + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "consume=" + consume + "," + "originPrice=" + originPrice + "," + "rejectReason=" + rejectReason + "," + "otherReason=" + otherReason + "}";
    }
}
