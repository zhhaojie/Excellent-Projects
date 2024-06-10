package com.meituan.sdk.model.waimaiNg.dish.dishQueryCatList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询菜品分类
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/queryCatList",
    businessId = 2,
    apiVersion = "10068",
    apiName = "dish_query_cat_list",
    needAuth = true
)
public class DishQueryCatListRequest implements MeituanRequest<List<DishCategoryInfo>> {



    @Override
    public MeituanResponse<List<DishCategoryInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<DishCategoryInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
