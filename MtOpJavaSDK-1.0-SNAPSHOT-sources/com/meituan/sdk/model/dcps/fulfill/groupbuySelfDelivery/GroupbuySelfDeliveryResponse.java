package com.meituan.sdk.model.dcps.fulfill.groupbuySelfDelivery;

import com.google.gson.annotations.SerializedName;

/**
* 套餐配送-转自配
* This file was automatically generated.
*/
public class GroupbuySelfDeliveryResponse {
    @SerializedName("bookingOrderId")
    private String bookingOrderId;
    @SerializedName("opKey")
    private String opKey;

    public String getBookingOrderId() {
        return bookingOrderId;
    }
    public void setBookingOrderId(String bookingOrderId) {
        this.bookingOrderId = bookingOrderId;
    }
    public String getOpKey() {
        return opKey;
    }
    public void setOpKey(String opKey) {
        this.opKey = opKey;
    }




    @Override
    public String toString() {
        return "GroupbuySelfDeliveryResponse{" + "bookingOrderId=" + bookingOrderId + "," + "opKey=" + opKey + "}";
    }
}
