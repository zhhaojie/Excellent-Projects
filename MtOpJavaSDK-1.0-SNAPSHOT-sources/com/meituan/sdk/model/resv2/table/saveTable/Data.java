package com.meituan.sdk.model.resv2.table.saveTable;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * <p data-diff-id="ct-diff-id-d76e9a44-75f9-43ba-8f6d-7cfd7b91548e"><span style="color: rgb(36, 41, 46)">桌位id</span></p>
    */
    @NotBlank(message = "tableId不能为空")
    @SerializedName("tableId")
    private String tableId;
    /**
    * <p data-diff-id="ct-diff-id-3319dd73-0ee7-46c1-bf18-c8a40be8f19f"><span style="color: rgb(36, 41, 46)">桌位名称</span></p>
    */
    @NotBlank(message = "tableName不能为空")
    @SerializedName("tableName")
    private String tableName;
    /**
    * <p data-diff-id="ct-diff-id-05c702c2-587c-49fb-9c2e-00548d558954"><span style="color: rgb(36, 41, 46)">桌台类型</span></p><p data-diff-id="ct-diff-id-c5b7f1e8-c475-4885-81e2-e9c95defcd3f"><span style="color: rgb(36, 41, 46)">0:大厅</span><br><span style="color: rgb(36, 41, 46)">1:包间</span></p>
    */
    @NotNull(message = "tableType不能为空")
    @SerializedName("tableType")
    private Integer tableType;
    /**
    * <p data-diff-id="ct-diff-id-2e43cc1d-519d-4e14-9722-e03a4ff487c3"><span style="color: rgb(36, 41, 46)">最高可坐</span></p>
    */
    @NotNull(message = "maxPeople不能为空")
    @SerializedName("maxPeople")
    private Integer maxPeople;
    /**
    * <p data-diff-id="ct-diff-id-238db292-8030-466f-ad0d-feac7e490bcb"><span style="color: rgb(36, 41, 46)">最低可坐  默认为1</span></p>
    */
    @SerializedName("minPeople")
    private Integer minPeople;
    /**
    * <p data-diff-id="ct-diff-id-89c3b99e-c45d-436a-b356-716c4b11f87c"><span style="color: rgb(36, 41, 46)">楼层桌位描述</span></p>
    */
    @SerializedName("tableLocationDesc")
    private String tableLocationDesc;
    /**
    * <p data-diff-id="ct-diff-id-cf7c2dd7-df89-49ca-bab5-24897c27fd7d"><span style="color: rgb(36, 41, 46)">桌台特点</span></p><p data-diff-id="ct-diff-id-607ba12c-bc86-411b-a67a-595a000ef343"><span style="color: rgb(36, 41, 46)">0:大厅卡座</span><br><span style="color: rgb(36, 41, 46)">1:隔断</span><br><span style="color: rgb(36, 41, 46)">2:会场</span><br><span style="color: rgb(36, 41, 46)">3:普通包间</span><br><span style="color: rgb(36, 41, 46)">4:宴会大厅</span><br><span style="color: rgb(36, 41, 46)">5:大厅散台</span><br><span style="color: rgb(36, 41, 46)">6:多功能厅</span><br><span style="color: rgb(36, 41, 46)">7:豪华包间</span><br><span style="color: rgb(36, 41, 46)">8:多桌包间</span></p>
    */
    @SerializedName("tableLocationFeature")
    private Integer tableLocationFeature;
    /**
    * <p data-diff-id="ct-diff-id-d90b48cc-7118-4af9-a5bb-e7567410dc77"><span style="color: rgb(36, 41, 46)">包间特点</span></p><p data-diff-id="ct-diff-id-421745f4-8496-461a-89ba-e448684727c7"><span style="color: rgb(36, 41, 46)">0:靠窗</span><br><span style="color: rgb(36, 41, 46)">1:会客区</span><br><span style="color: rgb(36, 41, 46)">2:独立卫生间</span><br><span style="color: rgb(36, 41, 46)">3:小型厨房</span><br><span style="color: rgb(36, 41, 46)">4:卡拉ok</span><br><span style="color: rgb(36, 41, 46)">5:可棋牌</span><br><span style="color: rgb(36, 41, 46)">6:海景房</span><br><span style="color: rgb(36, 41, 46)">7:液晶电视</span></p>
    */
    @SerializedName("roomFeature")
    private Integer roomFeature;
    /**
    * <p data-diff-id="ct-diff-id-d1a0bfc2-c8c1-4e1d-8b43-3691eb070056"><span style="color: rgb(36, 41, 46)">服务费</span></p>
    */
    @SerializedName("serviceFee")
    private Integer serviceFee;
    /**
    * <p data-diff-id="ct-diff-id-2bdffbca-3485-4b40-8a20-a322ba879255"><span style="color: rgb(36, 41, 46)">包间费</span></p>
    */
    @SerializedName("roomFee")
    private Integer roomFee;
    /**
    * <p data-diff-id="ct-diff-id-104e79b1-d4b2-4799-b5d3-3e6a76af439f"><span style="color: rgb(36, 41, 46)">是否线上直销(满足条件的订单可以系统自动分配到这个桌位，不需要餐厅人员手动分配。即美大推单到ERP厂商后，能自动接单返回的桌位)</span></p><p data-diff-id="ct-diff-id-39b6ba31-965f-45f0-8adf-1c85e62676ed"><span style="color: rgb(36, 41, 46)">0: 否</span><br><span style="color: rgb(36, 41, 46)">1: 是</span></p>
    */
    @NotNull(message = "isOnlineSale不能为空")
    @SerializedName("isOnlineSale")
    private Integer isOnlineSale;

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
    public Integer getTableType() {
        return tableType;
    }
    public void setTableType(Integer tableType) {
        this.tableType = tableType;
    }
    public Integer getMaxPeople() {
        return maxPeople;
    }
    public void setMaxPeople(Integer maxPeople) {
        this.maxPeople = maxPeople;
    }
    public Integer getMinPeople() {
        return minPeople;
    }
    public void setMinPeople(Integer minPeople) {
        this.minPeople = minPeople;
    }
    public String getTableLocationDesc() {
        return tableLocationDesc;
    }
    public void setTableLocationDesc(String tableLocationDesc) {
        this.tableLocationDesc = tableLocationDesc;
    }
    public Integer getTableLocationFeature() {
        return tableLocationFeature;
    }
    public void setTableLocationFeature(Integer tableLocationFeature) {
        this.tableLocationFeature = tableLocationFeature;
    }
    public Integer getRoomFeature() {
        return roomFeature;
    }
    public void setRoomFeature(Integer roomFeature) {
        this.roomFeature = roomFeature;
    }
    public Integer getServiceFee() {
        return serviceFee;
    }
    public void setServiceFee(Integer serviceFee) {
        this.serviceFee = serviceFee;
    }
    public Integer getRoomFee() {
        return roomFee;
    }
    public void setRoomFee(Integer roomFee) {
        this.roomFee = roomFee;
    }
    public Integer getIsOnlineSale() {
        return isOnlineSale;
    }
    public void setIsOnlineSale(Integer isOnlineSale) {
        this.isOnlineSale = isOnlineSale;
    }




    @Override
    public String toString() {
        return "Data{" + "tableId=" + tableId + "," + "tableName=" + tableName + "," + "tableType=" + tableType + "," + "maxPeople=" + maxPeople + "," + "minPeople=" + minPeople + "," + "tableLocationDesc=" + tableLocationDesc + "," + "tableLocationFeature=" + tableLocationFeature + "," + "roomFeature=" + roomFeature + "," + "serviceFee=" + serviceFee + "," + "roomFee=" + roomFee + "," + "isOnlineSale=" + isOnlineSale + "}";
    }
}
