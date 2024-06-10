package com.meituan.sdk.model.waimaiNg.dish.queryFoodDna;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询菜品DNA
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/queryFoodDna",
    businessId = 2,
    apiVersion = "10026",
    apiName = "query_food_dna",
    needAuth = false
)
public class QueryFoodDnaRequest implements MeituanRequest<QueryFoodDnaResponse> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<QueryFoodDnaResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryFoodDnaResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "QueryFoodDnaRequest{" + "data=" + data + "}";
    }
}
