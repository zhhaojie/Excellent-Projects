package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleTypeUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则更新切换配送服务
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/type/update",
    businessId = 46,
    apiVersion = "10029",
    apiName = "group_delivery_poi_delivery_rule_type_update",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleTypeUpdateRequest implements MeituanRequest<Boolean> {
    @SerializedName("newDeliveryType")
    private Integer newDeliveryType;

    public Integer getNewDeliveryType() {
        return newDeliveryType;
    }
    public void setNewDeliveryType(Integer newDeliveryType) {
        this.newDeliveryType = newDeliveryType;
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
        return "GroupDeliveryPoiDeliveryRuleTypeUpdateRequest{" + "newDeliveryType=" + newDeliveryType + "}";
    }
}
