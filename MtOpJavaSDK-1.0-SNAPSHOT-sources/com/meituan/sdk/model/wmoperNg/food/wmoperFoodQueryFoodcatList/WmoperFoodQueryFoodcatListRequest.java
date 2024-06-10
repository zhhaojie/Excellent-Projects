package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryFoodcatList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店菜品分类列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/queryFoodCatList",
    businessId = 16,
    apiVersion = "10007",
    apiName = "wmoper_food_query_foodcat_list",
    needAuth = false
)
public class WmoperFoodQueryFoodcatListRequest implements MeituanRequest<List<Data>> {



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
