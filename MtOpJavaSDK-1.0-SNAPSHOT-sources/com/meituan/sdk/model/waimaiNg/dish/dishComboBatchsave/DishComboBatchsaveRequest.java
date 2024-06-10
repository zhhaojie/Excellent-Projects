package com.meituan.sdk.model.waimaiNg.dish.dishComboBatchsave;

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
    path = "/waimai/ng/dish/combo/batchsave",
    businessId = 2,
    apiVersion = "10100",
    apiName = "dish_combo_batchsave",
    needAuth = true
)
public class DishComboBatchsaveRequest implements MeituanRequest<DishComboBatchsaveResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">套餐商品。对于更新场景，只支持套餐全量更新，每次都是全量覆盖。</font></span></p>
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
    public MeituanResponse<DishComboBatchsaveResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<DishComboBatchsaveResponse>>(){}.getType();
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
