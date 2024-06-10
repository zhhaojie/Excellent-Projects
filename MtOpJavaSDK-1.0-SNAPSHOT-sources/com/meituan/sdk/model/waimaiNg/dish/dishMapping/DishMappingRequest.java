package com.meituan.sdk.model.waimaiNg.dish.dishMapping;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 建立菜品映射
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/mapping",
    businessId = 2,
    apiVersion = "10074",
    apiName = "dish_mapping",
    needAuth = true
)
public class DishMappingRequest implements MeituanRequest<String> {
    @NotBlank(message = "dishMappings不能为空")
    @SerializedName("dishMappings")
    private String dishMappings;
    @SerializedName("orderEntranceType")
    private Integer orderEntranceType;

    public String getDishMappings() {
        return dishMappings;
    }
    public void setDishMappings(String dishMappings) {
        this.dishMappings = dishMappings;
    }
    public Integer getOrderEntranceType() {
        return orderEntranceType;
    }
    public void setOrderEntranceType(Integer orderEntranceType) {
        this.orderEntranceType = orderEntranceType;
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
        return "DishMappingRequest{" + "dishMappings=" + dishMappings + "," + "orderEntranceType=" + orderEntranceType + "}";
    }
}
