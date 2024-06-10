package com.meituan.sdk.model.wmoperNg.im.getReversionRateAndRightsList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 回复率及权益查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/getReversionRateAndRightsList",
    businessId = 16,
    apiVersion = "10016",
    apiName = "get_reversion_rate_and_rights_list",
    needAuth = true
)
public class GetReversionRateAndRightsListRequest implements MeituanRequest<GetReversionRateAndRightsListResponse> {



    @Override
    public MeituanResponse<GetReversionRateAndRightsListResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetReversionRateAndRightsListResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
