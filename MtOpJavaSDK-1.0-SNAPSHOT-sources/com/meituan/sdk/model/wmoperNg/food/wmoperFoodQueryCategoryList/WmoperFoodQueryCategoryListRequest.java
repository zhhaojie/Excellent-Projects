package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryCategoryList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询所有类目，对应商家后台标准分类
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/queryCategoryList",
    businessId = 16,
    apiVersion = "10001",
    apiName = "wmoper_food_query_category_list",
    needAuth = false
)
public class WmoperFoodQueryCategoryListRequest implements MeituanRequest<List<TargetObj>> {



    @Override
    public MeituanResponse<List<TargetObj>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<TargetObj>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
