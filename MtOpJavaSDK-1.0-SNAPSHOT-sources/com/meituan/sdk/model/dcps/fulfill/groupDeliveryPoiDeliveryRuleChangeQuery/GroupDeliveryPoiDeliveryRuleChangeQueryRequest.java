package com.meituan.sdk.model.dcps.fulfill.groupDeliveryPoiDeliveryRuleChangeQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店配送规则变更详情查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/dcps/fulfill/poi/deliveryRule/change/query",
    businessId = 46,
    apiVersion = "10006",
    apiName = "group_delivery_poi_delivery_rule_change_query",
    needAuth = true
)
public class GroupDeliveryPoiDeliveryRuleChangeQueryRequest implements MeituanRequest<GroupDeliveryPoiDeliveryRuleChangeQueryResponse> {



    @Override
    public MeituanResponse<GroupDeliveryPoiDeliveryRuleChangeQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupDeliveryPoiDeliveryRuleChangeQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
