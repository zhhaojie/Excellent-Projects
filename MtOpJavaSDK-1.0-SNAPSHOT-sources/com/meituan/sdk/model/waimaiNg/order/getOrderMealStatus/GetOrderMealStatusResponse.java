package com.meituan.sdk.model.waimaiNg.order.getOrderMealStatus;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询出餐超时的订单
* This file was automatically generated.
*/
public class GetOrderMealStatusResponse {
    /**
    * 结果数量
    */
    @SerializedName("total")
    private Integer total;
    /**
    * 出餐超时订单明细
    */
    @SerializedName("orderFoodDoneAssessments")
    private List<OrderFoodDoneAssessments> orderFoodDoneAssessments;

    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }
    public List<OrderFoodDoneAssessments> getOrderFoodDoneAssessments() {
        return orderFoodDoneAssessments;
    }
    public void setOrderFoodDoneAssessments(List<OrderFoodDoneAssessments> orderFoodDoneAssessments) {
        this.orderFoodDoneAssessments = orderFoodDoneAssessments;
    }




    @Override
    public String toString() {
        return "GetOrderMealStatusResponse{" + "total=" + total + "," + "orderFoodDoneAssessments=" + orderFoodDoneAssessments + "}";
    }
}
