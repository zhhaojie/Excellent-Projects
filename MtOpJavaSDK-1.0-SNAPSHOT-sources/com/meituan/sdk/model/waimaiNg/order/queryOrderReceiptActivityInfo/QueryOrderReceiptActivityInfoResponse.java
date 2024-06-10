package com.meituan.sdk.model.waimaiNg.order.queryOrderReceiptActivityInfo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询活动分摊接口
* This file was automatically generated.
*/
public class QueryOrderReceiptActivityInfoResponse {
    /**
    * 商品优惠分摊信息
    */
    @SerializedName("orderDetailActInfoList")
    private List<OrderDetailActInfoList> orderDetailActInfoList;
    /**
    * 原始配送费
    */
    @SerializedName("original_shipping_fee")
    private Double originalShippingFee;
    /**
    * 配送费活动详情
    */
    @SerializedName("shipping_fee_activities")
    private List<ShippingFeeActivities> shippingFeeActivities;

    public List<OrderDetailActInfoList> getOrderDetailActInfoList() {
        return orderDetailActInfoList;
    }
    public void setOrderDetailActInfoList(List<OrderDetailActInfoList> orderDetailActInfoList) {
        this.orderDetailActInfoList = orderDetailActInfoList;
    }
    public Double getOriginalShippingFee() {
        return originalShippingFee;
    }
    public void setOriginalShippingFee(Double originalShippingFee) {
        this.originalShippingFee = originalShippingFee;
    }
    public List<ShippingFeeActivities> getShippingFeeActivities() {
        return shippingFeeActivities;
    }
    public void setShippingFeeActivities(List<ShippingFeeActivities> shippingFeeActivities) {
        this.shippingFeeActivities = shippingFeeActivities;
    }




    @Override
    public String toString() {
        return "QueryOrderReceiptActivityInfoResponse{" + "orderDetailActInfoList=" + orderDetailActInfoList + "," + "originalShippingFee=" + originalShippingFee + "," + "shippingFeeActivities=" + shippingFeeActivities + "}";
    }
}
