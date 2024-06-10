package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 门店配送规则查询
* This file was automatically generated.
*/
public class GroupDeliveryPoiDeliveryRuleQueryResponse {
    @SerializedName("deliverable")
    private Integer deliverable;
    @SerializedName("status")
    private Integer status;
    @SerializedName("serviceDeliveryRangeDetails")
    private List<ServiceDeliveryRangeDetails> serviceDeliveryRangeDetails;
    @SerializedName("deliveryHours")
    private List<DeliveryHours> deliveryHours;
    @SerializedName("deliveryFeeDiscount")
    private DeliveryFeeDiscount deliveryFeeDiscount;
    @SerializedName("deliveryReservation")
    private DeliveryReservation deliveryReservation;

    public Integer getDeliverable() {
        return deliverable;
    }
    public void setDeliverable(Integer deliverable) {
        this.deliverable = deliverable;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public List<ServiceDeliveryRangeDetails> getServiceDeliveryRangeDetails() {
        return serviceDeliveryRangeDetails;
    }
    public void setServiceDeliveryRangeDetails(List<ServiceDeliveryRangeDetails> serviceDeliveryRangeDetails) {
        this.serviceDeliveryRangeDetails = serviceDeliveryRangeDetails;
    }
    public List<DeliveryHours> getDeliveryHours() {
        return deliveryHours;
    }
    public void setDeliveryHours(List<DeliveryHours> deliveryHours) {
        this.deliveryHours = deliveryHours;
    }
    public DeliveryFeeDiscount getDeliveryFeeDiscount() {
        return deliveryFeeDiscount;
    }
    public void setDeliveryFeeDiscount(DeliveryFeeDiscount deliveryFeeDiscount) {
        this.deliveryFeeDiscount = deliveryFeeDiscount;
    }
    public DeliveryReservation getDeliveryReservation() {
        return deliveryReservation;
    }
    public void setDeliveryReservation(DeliveryReservation deliveryReservation) {
        this.deliveryReservation = deliveryReservation;
    }




    @Override
    public String toString() {
        return "GroupDeliveryPoiDeliveryRuleQueryResponse{" + "deliverable=" + deliverable + "," + "status=" + status + "," + "serviceDeliveryRangeDetails=" + serviceDeliveryRangeDetails + "," + "deliveryHours=" + deliveryHours + "," + "deliveryFeeDiscount=" + deliveryFeeDiscount + "," + "deliveryReservation=" + deliveryReservation + "}";
    }
}
