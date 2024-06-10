package com.meituan.sdk.model.wmoperNg.food.dishComboSave;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 单个创建/更新套餐商品（仅支持套餐商品）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/combo/save",
    businessId = 16,
    apiVersion = "10027",
    apiName = "dish_combo_save",
    needAuth = true
)
public class DishComboSaveRequest implements MeituanRequest<String> {
    /**
    * <p>套餐商品。对于更新场景，只支持套餐全量更新，每次都是全量覆盖。</p>
    */
    @NotNull(message = "comboData不能为空")
    @SerializedName("comboData")
    private ComboSpu comboData;

    public ComboSpu getComboData() {
        return comboData;
    }
    public void setComboData(ComboSpu comboData) {
        this.comboData = comboData;
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
        return "DishComboSaveRequest{" + "comboData=" + comboData + "}";
    }
}
