package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleRangeUpdate;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ServiceDeliveryRangeDetails {
    @SerializedName("deliveryRanges")
    private List<DeliveryRange> deliveryRanges;
    @SerializedName("serviceCode")
    private String serviceCode;

    public List<DeliveryRange> getDeliveryRanges() {
        return deliveryRanges;
    }
    public void setDeliveryRanges(List<DeliveryRange> deliveryRanges) {
        this.deliveryRanges = deliveryRanges;
    }
    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }




    @Override
    public String toString() {
        return "ServiceDeliveryRangeDetails{" + "deliveryRanges=" + deliveryRanges + "," + "serviceCode=" + serviceCode + "}";
    }
}
