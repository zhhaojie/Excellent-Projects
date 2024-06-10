package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleBaseUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class PhoneDTO {
    @SerializedName("phoneNumber")
    private String phoneNumber;
    @SerializedName("phoneType")
    private Integer phoneType;

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Integer getPhoneType() {
        return phoneType;
    }
    public void setPhoneType(Integer phoneType) {
        this.phoneType = phoneType;
    }




    @Override
    public String toString() {
        return "PhoneDTO{" + "phoneNumber=" + phoneNumber + "," + "phoneType=" + phoneType + "}";
    }
}
