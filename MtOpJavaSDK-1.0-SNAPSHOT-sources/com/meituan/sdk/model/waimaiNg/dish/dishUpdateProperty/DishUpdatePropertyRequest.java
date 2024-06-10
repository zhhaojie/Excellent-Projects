package com.meituan.sdk.model.waimaiNg.dish.dishUpdateProperty;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量创建/更新菜品属性
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/updateProperty",
    businessId = 2,
    apiVersion = "10090",
    apiName = "dish_update_property",
    needAuth = true
)
public class DishUpdatePropertyRequest implements MeituanRequest<String> {
    @NotBlank(message = "dishProperty不能为空")
    @SerializedName("dishProperty")
    private String dishProperty;

    public String getDishProperty() {
        return dishProperty;
    }
    public void setDishProperty(String dishProperty) {
        this.dishProperty = dishProperty;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DishUpdatePropertyRequest{" + "dishProperty=" + dishProperty + "}";
    }
}
