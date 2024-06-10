package com.meituan.sdk.model.waimaiNg.dish.foodUpdateAppFoodCodeByOrigin;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据原商品编码更换新商品编码
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/food/updateAppFoodCodeByOrigin",
    businessId = 2,
    apiVersion = "10022",
    apiName = "food_update_app_food_code_by_origin",
    needAuth = true
)
public class FoodUpdateAppFoodCodeByOriginRequest implements MeituanRequest<String> {
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
        return "FoodUpdateAppFoodCodeByOriginRequest{" + "data=" + data + "}";
    }
}
