package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleCreate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则创建
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/create",
    businessId = 46,
    apiVersion = "10001",
    apiName = "group_delivery_poi_delivery_rule_create",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleCreateRequest implements MeituanRequest<Boolean> {
    @SerializedName("contactPhone")
    private String contactPhone;
    @SerializedName("deliverable")
    private Integer deliverable;
    @SerializedName("deliveryFeeDiscount")
    private DeliveryFeeDiscount deliveryFeeDiscount;
    @SerializedName("deliveryHours")
    private List<DeliveryHours> deliveryHours;
    @SerializedName("deliveryReservation")
    private DeliveryReservation deliveryReservation;

    public String getContactPhone() {
        return contactPhone;
    }
    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    public Integer getDeliverable() {
        return deliverable;
    }
    public void setDeliverable(Integer deliverable) {
        this.deliverable = deliverable;
    }
    public DeliveryFeeDiscount getDeliveryFeeDiscount() {
        return deliveryFeeDiscount;
    }
    public void setDeliveryFeeDiscount(DeliveryFeeDiscount deliveryFeeDiscount) {
        this.deliveryFeeDiscount = deliveryFeeDiscount;
    }
    public List<DeliveryHours> getDeliveryHours() {
        return deliveryHours;
    }
    public void setDeliveryHours(List<DeliveryHours> deliveryHours) {
        this.deliveryHours = deliveryHours;
    }
    public DeliveryReservation getDeliveryReservation() {
        return deliveryReservation;
    }
    public void setDeliveryReservation(DeliveryReservation deliveryReservation) {
        this.deliveryReservation = deliveryReservation;
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
        return "GroupDeliveryPoiDeliveryRuleCreateRequest{" + "contactPhone=" + contactPhone + "," + "deliverable=" + deliverable + "," + "deliveryFeeDiscount=" + deliveryFeeDiscount + "," + "deliveryHours=" + deliveryHours + "," + "deliveryReservation=" + deliveryReservation + "}";
    }
}
