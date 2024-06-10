package com.meituan.sdk.model.waimaiNg.im.queryStoreHaveBuild;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店是否有建群资格
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/queryStoreHaveBuild",
    businessId = 2,
    apiVersion = "10040",
    apiName = "query_store_have_build",
    needAuth = true
)
public class QueryStoreHaveBuildRequest implements MeituanRequest<QueryStoreHaveBuildResponse> {



    @Override
    public MeituanResponse<QueryStoreHaveBuildResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryStoreHaveBuildResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
