package com.meituan.sdk.model.wmoperNg.foodop.foodCatDelete;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 删除菜品分类
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/foodCat/delete",
    businessId = 16,
    apiVersion = "10004",
    apiName = "food_cat_delete",
    needAuth = true
)
public class FoodCatDeleteRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:13px;line-height:21px" data-size="13">菜品分类名称</font></span></p>
    */
    @NotBlank(message = "categoryName不能为空")
    @SerializedName("category_name")
    private String categoryName;

    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
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
        return "FoodCatDeleteRequest{" + "categoryName=" + categoryName + "}";
    }
}
