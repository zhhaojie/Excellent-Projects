package com.meituan.sdk.model.wmoperNg.order.getOrderBookerInformation;

import com.google.gson.annotations.SerializedName;

/**
* 查询订单预订人隐私信息
* This file was automatically generated.
*/
public class GetOrderBookerInformationResponse {
    /**
    * 订单Id
    */
    @SerializedName("wmOrderId")
    private Integer wmOrderId;
    /**
    * 预订人手机号
    */
    @SerializedName("reservationPhone")
    private String reservationPhone;

    public Integer getWmOrderId() {
        return wmOrderId;
    }
    public void setWmOrderId(Integer wmOrderId) {
        this.wmOrderId = wmOrderId;
    }
    public String getReservationPhone() {
        return reservationPhone;
    }
    public void setReservationPhone(String reservationPhone) {
        this.reservationPhone = reservationPhone;
    }




    @Override
    public String toString() {
        return "GetOrderBookerInformationResponse{" + "wmOrderId=" + wmOrderId + "," + "reservationPhone=" + reservationPhone + "}";
    }
}
