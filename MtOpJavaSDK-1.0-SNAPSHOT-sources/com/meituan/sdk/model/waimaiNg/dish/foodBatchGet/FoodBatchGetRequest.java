package com.meituan.sdk.model.waimaiNg.dish.foodBatchGet;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询门店菜品（包括查询套餐商品和普通商品）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/food/batchGet",
    businessId = 2,
    apiVersion = "10044",
    apiName = "food_batch_get",
    needAuth = true
)
public class FoodBatchGetRequest implements MeituanRequest<FoodBatchGetResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">商品第三方code列表, </font></span><font style="font-size:14px;line-height:22px" data-size="14">不超过200个</font></p>
    */
    @SerializedName("app_food_codes")
    private String appFoodCodes;

    public String getAppFoodCodes() {
        return appFoodCodes;
    }
    public void setAppFoodCodes(String appFoodCodes) {
        this.appFoodCodes = appFoodCodes;
    }


    @Override
    public MeituanResponse<FoodBatchGetResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<FoodBatchGetResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "FoodBatchGetRequest{" + "appFoodCodes=" + appFoodCodes + "}";
    }
}
