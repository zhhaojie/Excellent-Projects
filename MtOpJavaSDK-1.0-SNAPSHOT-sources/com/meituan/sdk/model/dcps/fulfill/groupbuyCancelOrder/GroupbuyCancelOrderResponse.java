package com.meituan.sdk.model.dcps.fulfill.groupbuyCancelOrder;

import com.google.gson.annotations.SerializedName;

/**
* 套餐配送-取消订单
* This file was automatically generated.
*/
public class GroupbuyCancelOrderResponse {
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
        return "GroupbuyCancelOrderResponse{" + "bookingOrderId=" + bookingOrderId + "," + "opKey=" + opKey + "}";
    }
}
