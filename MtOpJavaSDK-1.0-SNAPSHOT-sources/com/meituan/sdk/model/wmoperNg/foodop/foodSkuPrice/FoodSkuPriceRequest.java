package com.meituan.sdk.model.wmoperNg.foodop.foodSkuPrice;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 更新SKU价格
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/food/sku/price",
    businessId = 16,
    apiVersion = "10004",
    apiName = "food_sku_price",
    needAuth = true
)
public class FoodSkuPriceRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品sku价格集合</font></span></p>
    */
    @NotEmpty(message = "foodData不能为空")
    @SerializedName("food_data")
    private List<FoodData> foodData;

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
        return "FoodSkuPriceRequest{" + "foodData=" + foodData + "}";
    }
}
