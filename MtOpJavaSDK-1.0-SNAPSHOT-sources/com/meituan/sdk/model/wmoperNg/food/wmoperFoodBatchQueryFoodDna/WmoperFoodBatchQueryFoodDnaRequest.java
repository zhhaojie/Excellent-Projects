package com.meituan.sdk.model.wmoperNg.food.wmoperFoodBatchQueryFoodDna;

import com.meituan.sdk.annotations.ApiMeta;
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
    path = "/wmoper/ng/food/batchQueryFoodDna",
    businessId = 16,
    apiVersion = "10008",
    apiName = "wmoper_food_batch_query_food_dna",
    needAuth = true
)
public class WmoperFoodBatchQueryFoodDnaRequest implements MeituanRequest<WmoperFoodBatchQueryFoodDnaResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">菜品id列表，使用逗号隔开，最多200个。</font></span></p>
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
    public MeituanResponse<WmoperFoodBatchQueryFoodDnaResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperFoodBatchQueryFoodDnaResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperFoodBatchQueryFoodDnaRequest{" + "eDishCodes=" + eDishCodes + "}";
    }
}
