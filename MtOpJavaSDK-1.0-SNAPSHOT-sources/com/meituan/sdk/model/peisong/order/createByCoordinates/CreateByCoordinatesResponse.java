package com.meituan.sdk.model.peisong.order.createByCoordinates;

import com.google.gson.annotations.SerializedName;

/**
* 订单创建(送货分拣方式)
* This file was automatically generated.
*/
public class CreateByCoordinatesResponse {
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
    /**
    * 路区信息
    */
    @SerializedName("road_area")
    private String roadArea;
    /**
    * 目的地信息
    */
    @SerializedName("destination_id")
    private String destinationId;
    /**
    * 订单配送距离，单位为米，当前订单计算的配送距离
    */
    @SerializedName("delivery_distance")
    private Integer deliveryDistance;
    /**
    * 订单配送价格，单位为元，价格受距离、发单时间、配送高峰、特殊天气等不同计费因素影响
    */
    @SerializedName("delivery_fee")
    private Double deliveryFee;

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
    public String getRoadArea() {
        return roadArea;
    }
    public void setRoadArea(String roadArea) {
        this.roadArea = roadArea;
    }
    public String getDestinationId() {
        return destinationId;
    }
    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }
    public Integer getDeliveryDistance() {
        return deliveryDistance;
    }
    public void setDeliveryDistance(Integer deliveryDistance) {
        this.deliveryDistance = deliveryDistance;
    }
    public Double getDeliveryFee() {
        return deliveryFee;
    }
    public void setDeliveryFee(Double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }




    @Override
    public String toString() {
        return "CreateByCoordinatesResponse{" + "mtPeisongId=" + mtPeisongId + "," + "deliveryId=" + deliveryId + "," + "orderId=" + orderId + "," + "roadArea=" + roadArea + "," + "destinationId=" + destinationId + "," + "deliveryDistance=" + deliveryDistance + "," + "deliveryFee=" + deliveryFee + "}";
    }
}
