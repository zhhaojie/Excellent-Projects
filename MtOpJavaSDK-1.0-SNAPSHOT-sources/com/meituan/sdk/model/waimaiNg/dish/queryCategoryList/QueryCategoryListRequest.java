package com.meituan.sdk.model.waimaiNg.dish.queryCategoryList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询所有类目
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/queryCategoryList",
    businessId = 2,
    apiVersion = "10016",
    apiName = "query_category_list",
    needAuth = false
)
public class QueryCategoryListRequest implements MeituanRequest<List<Category>> {



    @Override
    public MeituanResponse<List<Category>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Category>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
