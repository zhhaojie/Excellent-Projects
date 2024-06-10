package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleReservationUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则更新预约规则
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/reservation/update",
    businessId = 46,
    apiVersion = "10004",
    apiName = "group_delivery_poi_delivery_rule_reservation_update",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleReservationUpdateRequest implements MeituanRequest<Boolean> {
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
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupDeliveryPoiDeliveryRuleReservationUpdateRequest{" + "availableDays=" + availableDays + "," + "beyondDeliveryTimeOrder=" + beyondDeliveryTimeOrder + "," + "reservationRemind=" + reservationRemind + "," + "reservationSwitch=" + reservationSwitch + "}";
    }
}
