package com.meituan.sdk.model.dcps.fulfill.groupbuyReceiveOrder;

import com.google.gson.annotations.SerializedName;

/**
* 套餐配送-接单
* This file was automatically generated.
*/
public class GroupbuyReceiveOrderResponse {
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
        return "GroupbuyReceiveOrderResponse{" + "bookingOrderId=" + bookingOrderId + "," + "opKey=" + opKey + "}";
    }
}
