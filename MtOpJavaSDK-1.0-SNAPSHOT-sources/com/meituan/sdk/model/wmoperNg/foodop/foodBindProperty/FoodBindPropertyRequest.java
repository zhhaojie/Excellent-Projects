package com.meituan.sdk.model.wmoperNg.foodop.foodBindProperty;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 绑定菜品属性
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/food/bind/property",
    businessId = 16,
    apiVersion = "10003",
    apiName = "food_bind_property",
    needAuth = true
)
public class FoodBindPropertyRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品属性的json数据</font></span></p>
    */
    @NotBlank(message = "foodProperty不能为空")
    @SerializedName("food_property")
    private String foodProperty;

    public String getFoodProperty() {
        return foodProperty;
    }
    public void setFoodProperty(String foodProperty) {
        this.foodProperty = foodProperty;
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
        return "FoodBindPropertyRequest{" + "foodProperty=" + foodProperty + "}";
    }
}
