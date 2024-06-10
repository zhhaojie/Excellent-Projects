package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/query",
    businessId = 46,
    apiVersion = "10007",
    apiName = "group_delivery_poi_delivery_rule_query",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleQueryRequest implements MeituanRequest<GroupDeliveryPoiDeliveryRuleQueryResponse> {



    @Override
    public MeituanResponse<GroupDeliveryPoiDeliveryRuleQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupDeliveryPoiDeliveryRuleQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
