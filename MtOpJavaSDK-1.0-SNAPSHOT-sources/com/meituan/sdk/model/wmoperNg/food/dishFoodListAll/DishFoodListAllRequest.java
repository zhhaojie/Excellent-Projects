package com.meituan.sdk.model.wmoperNg.food.dishFoodListAll;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店菜品列表（包括套餐商品和普通商品）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/dish/food/listAll",
    businessId = 16,
    apiVersion = "10027",
    apiName = "dish_food_list_all",
    needAuth = true
)
public class DishFoodListAllRequest implements MeituanRequest<List<FoodInfo>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">分页查询偏移量</font></span></p>
    */
    @NotNull(message = "offset不能为空")
    @SerializedName("offset")
    private Integer offset;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">分页查询每页查询的数量,须小于200</font></span></p>
    */
    @NotNull(message = "limit不能为空")
    @SerializedName("limit")
    private Integer limit;

    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }


    @Override
    public MeituanResponse<List<FoodInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<FoodInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DishFoodListAllRequest{" + "offset=" + offset + "," + "limit=" + limit + "}";
    }
}
