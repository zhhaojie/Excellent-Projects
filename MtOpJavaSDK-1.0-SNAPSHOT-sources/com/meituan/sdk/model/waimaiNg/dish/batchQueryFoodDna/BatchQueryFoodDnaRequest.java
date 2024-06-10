package com.meituan.sdk.model.waimaiNg.dish.batchQueryFoodDna;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量查询商品DNA
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/batchQueryFoodDna",
    businessId = 2,
    apiVersion = "10030",
    apiName = "batch_query_food_dna",
    needAuth = true
)
public class BatchQueryFoodDnaRequest implements MeituanRequest<List<FoodDna>> {
    /**
    * <p>菜品id列表，使用逗号隔开，最多200个。</p>
    */
    @NotBlank(message = "eDishCodes不能为空")
    @SerializedName("eDishCodes")
    private String eDishCodes;

    public String getEDishCodes() {
        return eDishCodes;
    }
    public void setEDishCodes(String eDishCodes) {
        this.eDishCodes = eDishCodes;
    }


    @Override
    public MeituanResponse<List<FoodDna>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<FoodDna>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchQueryFoodDnaRequest{" + "eDishCodes=" + eDishCodes + "}";
    }
}
