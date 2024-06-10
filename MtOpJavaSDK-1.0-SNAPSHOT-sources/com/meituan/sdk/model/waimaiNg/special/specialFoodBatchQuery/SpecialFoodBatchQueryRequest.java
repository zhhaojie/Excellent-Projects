package com.meituan.sdk.model.waimaiNg.special.specialFoodBatchQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询商品
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/special/food/batchQuery",
    businessId = 2,
    apiVersion = "10000",
    apiName = "special_food_batch_query",
    needAuth = true
)
public class SpecialFoodBatchQueryRequest implements MeituanRequest<SpecialFoodBatchQueryResponse> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<SpecialFoodBatchQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<SpecialFoodBatchQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "SpecialFoodBatchQueryRequest{" + "data=" + data + "}";
    }
}
