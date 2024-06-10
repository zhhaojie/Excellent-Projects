package com.meituan.sdk.model.wmoperNg.order.getBatchOrderRefundInfo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 批量查询退款订单信息
* This file was automatically generated.
*/
public class GetBatchOrderRefundInfoResponse {
    /**
    * 订单id
    */
    @SerializedName("order_id")
    private Long orderId;
    /**
    * 全部或部分退款信息列表
    */
    @SerializedName("OrderRefundInfo")
    private List<OrderRefundInfo> orderRefundInfo;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public List<OrderRefundInfo> getOrderRefundInfo() {
        return orderRefundInfo;
    }
    public void setOrderRefundInfo(List<OrderRefundInfo> orderRefundInfo) {
        this.orderRefundInfo = orderRefundInfo;
    }




    @Override
    public String toString() {
        return "GetBatchOrderRefundInfoResponse{" + "orderId=" + orderId + "," + "orderRefundInfo=" + orderRefundInfo + "}";
    }
}
