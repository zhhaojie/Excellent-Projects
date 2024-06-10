package com.meituan.sdk.model.waimaiNg.dish.batchUpdateSpubyId;

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
* 批量通过美团spuid修改商品部分信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/dish/batchUpdateSpuById",
    businessId = 2,
    apiVersion = "10100",
    apiName = "batch_update_spuby_id",
    needAuth = true
)
public class BatchUpdateSpubyIdRequest implements MeituanRequest<BatchUpdateSpubyIdResponse> {
    @NotEmpty(message = "foodData不能为空")
    @SerializedName("food_data")
    private List<WmProductSpu> foodData;

    public List<WmProductSpu> getFoodData() {
        return foodData;
    }
    public void setFoodData(List<WmProductSpu> foodData) {
        this.foodData = foodData;
    }


    @Override
    public MeituanResponse<BatchUpdateSpubyIdResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateSpubyIdResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateSpubyIdRequest{" + "foodData=" + foodData + "}";
    }
}
