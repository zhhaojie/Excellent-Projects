package com.meituan.sdk.model.wmoperNg.poi.wmoperPoiWeightCanOpen;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 门店是否可开启加权
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poi/weight/canOpen",
    businessId = 16,
    apiVersion = "10002",
    apiName = "wmoper_poi_weight_can_open",
    needAuth = false
)
public class WmoperPoiWeightCanOpenRequest implements MeituanRequest<WmoperPoiWeightCanOpenResponse> {



    @Override
    public MeituanResponse<WmoperPoiWeightCanOpenResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperPoiWeightCanOpenResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
