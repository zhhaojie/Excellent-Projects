package com.meituan.sdk.model.peisong.order.evaluate;

import com.google.gson.annotations.SerializedName;

/**
* 评价骑手
* This file was automatically generated.
*/
public class EvaluateResponse {
    /**
    * 配送活动标识
    */
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 美团配送内部订单id，最长不超过32个字符
    */
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 外部订单号，最长不超过32个字符
    */
    @SerializedName("order_id")
    private String orderId;

    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }




    @Override
    public String toString() {
        return "EvaluateResponse{" + "deliveryId=" + deliveryId + "," + "mtPeisongId=" + mtPeisongId + "," + "orderId=" + orderId + "}";
    }
}
