package com.meituan.sdk.model.wmoperNg.food.dishComboBatchsave;

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
* 批量创建/更新套餐商品（仅支持套餐商品）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/combo/batchsave",
    businessId = 16,
    apiVersion = "10027",
    apiName = "dish_combo_batchsave",
    needAuth = true
)
public class DishComboBatchsaveRequest implements MeituanRequest<String> {
    /**
    * <p>该接口只支持套餐全量更新，每次都是全量覆盖。</p>
    */
    @NotEmpty(message = "comboDatas不能为空")
    @SerializedName("comboDatas")
    private List<ComboSpu> comboDatas;

    public List<ComboSpu> getComboDatas() {
        return comboDatas;
    }
    public void setComboDatas(List<ComboSpu> comboDatas) {
        this.comboDatas = comboDatas;
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
        return "DishComboBatchsaveRequest{" + "comboDatas=" + comboDatas + "}";
    }
}
