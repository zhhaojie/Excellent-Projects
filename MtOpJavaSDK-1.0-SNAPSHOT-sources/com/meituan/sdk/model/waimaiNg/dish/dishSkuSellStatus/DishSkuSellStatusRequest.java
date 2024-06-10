package com.meituan.sdk.model.waimaiNg.dish.dishSkuSellStatus;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 批量更新菜品售卖状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/sku/sellStatus",
    businessId = 2,
    apiVersion = "10037",
    apiName = "dish_sku_sell_status",
    needAuth = true
)
public class DishSkuSellStatusRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">售卖状态，1表下架，0表上架</font></span></p>
    */
    @NotNull(message = "sellStatus不能为空")
    @SerializedName("sell_status")
    private Integer sellStatus;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品sku集合</font></span></p>
    */
    @NotEmpty(message = "foodData不能为空")
    @SerializedName("food_data")
    private List<FoodData> foodData;

    public Integer getSellStatus() {
        return sellStatus;
    }
    public void setSellStatus(Integer sellStatus) {
        this.sellStatus = sellStatus;
    }
    public List<FoodData> getFoodData() {
        return foodData;
    }
    public void setFoodData(List<FoodData> foodData) {
        this.foodData = foodData;
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
        return "DishSkuSellStatusRequest{" + "sellStatus=" + sellStatus + "," + "foodData=" + foodData + "}";
    }
}
