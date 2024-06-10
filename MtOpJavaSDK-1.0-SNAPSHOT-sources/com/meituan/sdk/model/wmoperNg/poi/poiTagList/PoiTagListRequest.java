package com.meituan.sdk.model.wmoperNg.poi.poiTagList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取门店品类列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poi/poiTag/list",
    businessId = 16,
    apiVersion = "10002",
    apiName = "poi_tag_list",
    needAuth = true
)
public class PoiTagListRequest implements MeituanRequest<List<Data>> {



    @Override
    public MeituanResponse<List<Data>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Data>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
