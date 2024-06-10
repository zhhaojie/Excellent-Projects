package com.meituan.sdk.model.peisong.order.cancelOrder;

import com.google.gson.annotations.SerializedName;

/**
* 取消订单
* This file was automatically generated.
*/
public class CancelOrderResponse {
    /**
    * 美团配送内部订单id
    */
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 配送活动标识
    */
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 外部订单id
    */
    @SerializedName("order_id")
    private String orderId;

    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }




    @Override
    public String toString() {
        return "CancelOrderResponse{" + "mtPeisongId=" + mtPeisongId + "," + "deliveryId=" + deliveryId + "," + "orderId=" + orderId + "}";
    }
}
