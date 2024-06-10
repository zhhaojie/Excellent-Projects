package com.meituan.sdk.model.waimaiNg.dish.saveFoodDna;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 保存商品DNA
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/saveFoodDna",
    businessId = 2,
    apiVersion = "10036",
    apiName = "save_food_dna",
    needAuth = false
)
public class SaveFoodDnaRequest implements MeituanRequest<String> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "SaveFoodDnaRequest{" + "data=" + data + "}";
    }
}
