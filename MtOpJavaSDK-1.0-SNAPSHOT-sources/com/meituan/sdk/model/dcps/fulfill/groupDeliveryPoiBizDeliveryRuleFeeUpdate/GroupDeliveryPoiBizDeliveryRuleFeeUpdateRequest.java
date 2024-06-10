package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiBizDeliveryRuleFeeUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则更新自配配送费
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/biz/deliveryRule/fee/update",
    businessId = 46,
    apiVersion = "10030",
    apiName = "group_delivery_poi_biz_delivery_rule_fee_update",
    needAuth = true
)
public class GroupDeliveryPoiBizDeliveryRuleFeeUpdateRequest implements MeituanRequest<Boolean> {
    @SerializedName("deliveryFeeType")
    private Integer deliveryFeeType;
    @SerializedName("deliveryFee")
    private String deliveryFee;
    @SerializedName("tieredDeliveryFee")
    private List<TieredDeliveryFee> tieredDeliveryFee;
    @SerializedName("additionalDeliveryFeeHours")
    private List<AdditionalDeliveryFeeHours> additionalDeliveryFeeHours;

    public Integer getDeliveryFeeType() {
        return deliveryFeeType;
    }
    public void setDeliveryFeeType(Integer deliveryFeeType) {
        this.deliveryFeeType = deliveryFeeType;
    }
    public String getDeliveryFee() {
        return deliveryFee;
    }
    public void setDeliveryFee(String deliveryFee) {
        this.deliveryFee = deliveryFee;
    }
    public List<TieredDeliveryFee> getTieredDeliveryFee() {
        return tieredDeliveryFee;
    }
    public void setTieredDeliveryFee(List<TieredDeliveryFee> tieredDeliveryFee) {
        this.tieredDeliveryFee = tieredDeliveryFee;
    }
    public List<AdditionalDeliveryFeeHours> getAdditionalDeliveryFeeHours() {
        return additionalDeliveryFeeHours;
    }
    public void setAdditionalDeliveryFeeHours(List<AdditionalDeliveryFeeHours> additionalDeliveryFeeHours) {
        this.additionalDeliveryFeeHours = additionalDeliveryFeeHours;
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
        return "GroupDeliveryPoiBizDeliveryRuleFeeUpdateRequest{" + "deliveryFeeType=" + deliveryFeeType + "," + "deliveryFee=" + deliveryFee + "," + "tieredDeliveryFee=" + tieredDeliveryFee + "," + "additionalDeliveryFeeHours=" + additionalDeliveryFeeHours + "}";
    }
}
