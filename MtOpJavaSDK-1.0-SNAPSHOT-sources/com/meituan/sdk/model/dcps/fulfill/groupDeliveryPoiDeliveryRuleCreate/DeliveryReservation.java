package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleCreate;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DeliveryReservation {
    @SerializedName("availableDays")
    private List<Integer> availableDays;
    @SerializedName("beyondDeliveryTimeOrder")
    private Boolean beyondDeliveryTimeOrder;
    @SerializedName("reservationRemind")
    private Integer reservationRemind;
    @SerializedName("reservationSwitch")
    private Boolean reservationSwitch;

    public List<Integer> getAvailableDays() {
        return availableDays;
    }
    public void setAvailableDays(List<Integer> availableDays) {
        this.availableDays = availableDays;
    }
    public Boolean getBeyondDeliveryTimeOrder() {
        return beyondDeliveryTimeOrder;
    }
    public void setBeyondDeliveryTimeOrder(Boolean beyondDeliveryTimeOrder) {
        this.beyondDeliveryTimeOrder = beyondDeliveryTimeOrder;
    }
    public Integer getReservationRemind() {
        return reservationRemind;
    }
    public void setReservationRemind(Integer reservationRemind) {
        this.reservationRemind = reservationRemind;
    }
    public Boolean getReservationSwitch() {
        return reservationSwitch;
    }
    public void setReservationSwitch(Boolean reservationSwitch) {
        this.reservationSwitch = reservationSwitch;
    }




    @Override
    public String toString() {
        return "DeliveryReservation{" + "availableDays=" + availableDays + "," + "beyondDeliveryTimeOrder=" + beyondDeliveryTimeOrder + "," + "reservationRemind=" + reservationRemind + "," + "reservationSwitch=" + reservationSwitch + "}";
    }
}
