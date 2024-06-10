package com.meituan.sdk.model.resv2.table.tableStatusPush;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Data {
    /**
    * <p data-diff-id="ct-diff-id-d1c1f200-9d69-4a05-88fd-f2dfa7e4ae2a"><span style="color: rgb(36, 41, 46)">桌位id</span></p>
    */
    @NotBlank(message = "tableId不能为空")
    @SerializedName("tableId")
    private String tableId;
    /**
    * <p data-diff-id="ct-diff-id-0257384d-28d5-4097-ba49-a91822c3aea5"><span style="color: rgb(36, 41, 46)">第三方订单id唯一标示，用于区分桌态订单</span></p>
    */
    @NotBlank(message = "bizOrderId不能为空")
    @SerializedName("bizOrderId")
    private String bizOrderId;
    /**
    * <p data-diff-id="ct-diff-id-55df4cfc-8f3b-4fd9-b539-1612cced6e88"><span style="color: rgb(36, 41, 46)">锁台开始时间 </span>unix时间戳<span style="color: rgb(36, 41, 46)"> </span></p>
    */
    @NotNull(message = "startTime不能为空")
    @SerializedName("startTime")
    private Integer startTime;
    /**
    * <p data-diff-id="ct-diff-id-5290aead-9a31-4412-8d8b-c8002bfcdaee">锁台结束时间 unix时间戳</p>
    */
    @NotNull(message = "endTime不能为空")
    @SerializedName("endTime")
    private Integer endTime;
    /**
    * <p data-diff-id="ct-diff-id-9aedbe4c-cc03-463b-afb6-a69d2e4e71e4"><span style="color: rgb(36, 41, 46)">桌位状态</span></p><p data-diff-id="ct-diff-id-1bd3166c-6511-4dca-9d8a-710c0fb4e9ba"><span style="color: rgb(36, 41, 46)">1：空台</span><br><span style="color: rgb(36, 41, 46)">2：已开台</span><br><span style="color: rgb(36, 41, 46)">3：已点菜</span><br><span style="color: rgb(36, 41, 46)">4：已结账</span><br><span style="color: rgb(36, 41, 46)">5：待清台</span><br><span style="color: rgb(36, 41, 46)">6: 已预结</span></p>
    */
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Integer status;
    /**
    * <p data-diff-id="ct-diff-id-ff6cc7a4-0e3d-420d-b5a6-8f531d1c7941"><span style="color: rgb(36, 41, 46)">桌台对应的点菜数据</span></p>
    */
    @SerializedName("dishes")
    private List<Dish> dishes;
    /**
    * <p data-diff-id="ct-diff-id-e9bb25e7-19e4-416f-8714-2b74fe5a1917"><span style="color: rgb(36, 41, 46)">订单支付金额</span></p>
    */
    @SerializedName("payment")
    private Double payment;

    public String getTableId() {
        return tableId;
    }
    public void setTableId(String tableId) {
        this.tableId = tableId;
    }
    public String getBizOrderId() {
        return bizOrderId;
    }
    public void setBizOrderId(String bizOrderId) {
        this.bizOrderId = bizOrderId;
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
    public List<Dish> getDishes() {
        return dishes;
    }
    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
    public Double getPayment() {
        return payment;
    }
    public void setPayment(Double payment) {
        this.payment = payment;
    }




    @Override
    public String toString() {
        return "Data{" + "tableId=" + tableId + "," + "bizOrderId=" + bizOrderId + "," + "startTime=" + startTime + "," + "endTime=" + endTime + "," + "status=" + status + "," + "dishes=" + dishes + "," + "payment=" + payment + "}";
    }
}
