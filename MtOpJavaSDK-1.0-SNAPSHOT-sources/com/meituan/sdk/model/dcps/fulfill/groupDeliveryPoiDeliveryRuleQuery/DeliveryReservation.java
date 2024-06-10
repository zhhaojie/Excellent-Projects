package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleQuery;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class DeliveryReservation {
    @SerializedName("reservationSwitch")
    private Boolean reservationSwitch;
    @SerializedName("reservationRemind")
    private Integer reservationRemind;
    @SerializedName("beyondDeliveryTimeOrder")
    private Boolean beyondDeliveryTimeOrder;
    @SerializedName("availableDays")
    private List<Integer> availableDays;

    public Boolean getReservationSwitch() {
        return reservationSwitch;
    }
    public void setReservationSwitch(Boolean reservationSwitch) {
        this.reservationSwitch = reservationSwitch;
    }
    public Integer getReservationRemind() {
        return reservationRemind;
    }
    public void setReservationRemind(Integer reservationRemind) {
        this.reservationRemind = reservationRemind;
    }
    public Boolean getBeyondDeliveryTimeOrder() {
        return beyondDeliveryTimeOrder;
    }
    public void setBeyondDeliveryTimeOrder(Boolean beyondDeliveryTimeOrder) {
        this.beyondDeliveryTimeOrder = beyondDeliveryTimeOrder;
    }
    public List<Integer> getAvailableDays() {
        return availableDays;
    }
    public void setAvailableDays(List<Integer> availableDays) {
        this.availableDays = availableDays;
    }




    @Override
    public String toString() {
        return "DeliveryReservation{" + "reservationSwitch=" + reservationSwitch + "," + "reservationRemind=" + reservationRemind + "," + "beyondDeliveryTimeOrder=" + beyondDeliveryTimeOrder + "," + "availableDays=" + availableDays + "}";
    }
}
