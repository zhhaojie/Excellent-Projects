package com.meituan.sdk.model.resv2.table.updateTableStatus;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * <p data-diff-id="ct-diff-id-49e8e593-1f7f-4309-9474-38266038db43"><span style="color: rgb(36, 41, 46)">桌位id</span></p>
    */
    @NotBlank(message = "tableId不能为空")
    @SerializedName("tableId")
    private String tableId;
    /**
    * <p data-diff-id="ct-diff-id-cbdf0fbd-0a68-4936-9e7e-e2559f2397de"><span style="color: rgb(36, 41, 46)">就餐时间  </span>unix时间戳</p>
    */
    @NotNull(message = "orderTime不能为空")
    @SerializedName("orderTime")
    private Integer orderTime;
    /**
    * <p data-diff-id="ct-diff-id-20df6dbe-324f-4aca-b8cf-afd744b96d66"><span style="color: rgb(36, 41, 46)">锁台开始时间</span>unix时间戳</p>
    */
    @NotNull(message = "startTime不能为空")
    @SerializedName("startTime")
    private Integer startTime;
    /**
    * <p data-diff-id="ct-diff-id-a0dd2771-d6a4-424d-b9a1-89b69d4e9c24"><span style="color: rgb(36, 41, 46)">锁台结束时间  </span>unix时间戳</p>
    */
    @NotNull(message = "endTime不能为空")
    @SerializedName("endTime")
    private Integer endTime;
    /**
    * <p data-diff-id="ct-diff-id-8bd2fec6-6186-4a38-9b75-3332fc6c77a3">桌位状态</p><p data-diff-id="ct-diff-id-3490d3e6-7c4d-4ac0-94cb-164963a795ce"><span style="color: rgb(36, 41, 46)">0：锁台</span><br><span style="color: rgb(36, 41, 46)">1：解锁</span></p>
    */
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Integer status;
    /**
    * <p data-diff-id="ct-diff-id-b0829708-1dbe-4b35-89a3-e8be05ea19f1"><span style="color: rgb(36, 41, 46)">餐段，与门店配置中餐段一致</span></p>
    */
    @NotNull(message = "timePeriod不能为空")
    @SerializedName("timePeriod")
    private Integer timePeriod;
    /**
    * <p data-diff-id="ct-diff-id-73eb712e-13a2-4b7c-8391-e014a9665e7b"><span style="color: rgb(36, 41, 46)">推送时间   当前时间戳</span></p>
    */
    @SerializedName("changeTime")
    private Integer changeTime;

    public String getTableId() {
        return tableId;
    }
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }
    public Integer getOrderTime() {
        return orderTime;
    }
    public void setOrderTime(Integer orderTime) {
        this.orderTime = orderTime;
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
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public Integer getTimePeriod() {
        return timePeriod;
    }
    public void setTimePeriod(Integer timePeriod) {
        this.timePeriod = timePeriod;
    }
    public Integer getChangeTime() {
        return changeTime;
    }
    public void setChangeTime(Integer changeTime) {
        this.changeTime = changeTime;
    }




    @Override
    public String toString() {
        return "Data{" + "tableId=" + tableId + "," + "orderTime=" + orderTime + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "status=" + status + "," + "timePeriod=" + timePeriod + "," + "changeTime=" + changeTime + "}";
    }
}
