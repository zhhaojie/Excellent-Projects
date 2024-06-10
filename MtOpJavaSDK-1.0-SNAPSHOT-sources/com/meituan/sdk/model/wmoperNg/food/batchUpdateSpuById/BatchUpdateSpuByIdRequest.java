package com.meituan.sdk.model.wmoperNg.food.batchUpdateSpuById;

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
    path = "/wmoper/ng/food/batchUpdateSpuById",
    businessId = 16,
    apiVersion = "10027",
    apiName = "batch_update_spu_by_id",
    needAuth = true
)
public class BatchUpdateSpuByIdRequest implements MeituanRequest<BatchUpdateSpuByIdResponse> {
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
    public MeituanResponse<BatchUpdateSpuByIdResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateSpuByIdResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateSpuByIdRequest{" + "foodData=" + foodData + "}";
    }
}
