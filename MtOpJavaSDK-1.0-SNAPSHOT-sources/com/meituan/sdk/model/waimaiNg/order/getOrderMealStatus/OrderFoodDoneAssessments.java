package com.meituan.sdk.model.waimaiNg.order.getOrderMealStatus;

import com.google.gson.annotations.SerializedName;

/**
* 出餐超时订单明细
* This file was automatically generated.
*/
public class OrderFoodDoneAssessments {
    /**
    * 订单Id
    */
    @SerializedName("order_id")
    private Long orderId;
    /**
    * 出餐超时原因：1-未上报出餐  2-上报出餐行为被判定虚假  3-上报出餐且行为真实，但未在考核时间内上报  4-豁免
    */
    @SerializedName("status")
    private Integer status;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "OrderFoodDoneAssessments{" + "orderId=" + orderId + "," + "status=" + status + "}";
    }
}
