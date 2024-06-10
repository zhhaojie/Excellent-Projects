package com.meituan.sdk.model.waimaiNg.dish.foodBatchQueryList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询外卖菜品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/batchQuery",
    businessId = 2,
    apiVersion = "10100",
    apiName = "food_batch_query_list",
    needAuth = true
)
public class FoodBatchQueryListRequest implements MeituanRequest<List<DishInfo>> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<List<DishInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<DishInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "FoodBatchQueryListRequest{" + "data=" + data + "}";
    }
}
