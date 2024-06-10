package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ServiceDeliveryRangeDetails {
    @SerializedName("serviceCode")
    private String serviceCode;
    @SerializedName("deliveryRanges")
    private List<DeliveryRanges> deliveryRanges;

    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    public List<DeliveryRanges> getDeliveryRanges() {
        return deliveryRanges;
    }
    public void setDeliveryRanges(List<DeliveryRanges> deliveryRanges) {
        this.deliveryRanges = deliveryRanges;
    }




    @Override
    public String toString() {
        return "ServiceDeliveryRangeDetails{" + "serviceCode=" + serviceCode + "," + "deliveryRanges=" + deliveryRanges + "}";
    }
}
