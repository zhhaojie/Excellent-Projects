package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleRangeUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则更新配送范围
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/range/update",
    businessId = 46,
    apiVersion = "10005",
    apiName = "group_delivery_poi_delivery_rule_range_update",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleRangeUpdateRequest implements MeituanRequest<Boolean> {
    @SerializedName("needFix")
    private Boolean needFix;
    @SerializedName("serviceDeliveryRangeDetails")
    private List<ServiceDeliveryRangeDetails> serviceDeliveryRangeDetails;

    public Boolean getNeedFix() {
        return needFix;
    }
    public void setNeedFix(Boolean needFix) {
        this.needFix = needFix;
    }
    public List<ServiceDeliveryRangeDetails> getServiceDeliveryRangeDetails() {
        return serviceDeliveryRangeDetails;
    }
    public void setServiceDeliveryRangeDetails(List<ServiceDeliveryRangeDetails> serviceDeliveryRangeDetails) {
        this.serviceDeliveryRangeDetails = serviceDeliveryRangeDetails;
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
        return "GroupDeliveryPoiDeliveryRuleRangeUpdateRequest{" + "needFix=" + needFix + "," + "serviceDeliveryRangeDetails=" + serviceDeliveryRangeDetails + "}";
    }
}
