package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryCategoryProperty;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据类目查询模板下所有属性
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/queryCategoryProperties",
    businessId = 16,
    apiVersion = "10001",
    apiName = "wmoper_food_query_category_property",
    needAuth = false
)
public class WmoperFoodQueryCategoryPropertyRequest implements MeituanRequest<WmoperFoodQueryCategoryPropertyResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">分类id</font></span></p>
    */
    @NotNull(message = "categoryId不能为空")
    @SerializedName("category_id")
    private Long categoryId;

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public MeituanResponse<WmoperFoodQueryCategoryPropertyResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperFoodQueryCategoryPropertyResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperFoodQueryCategoryPropertyRequest{" + "categoryId=" + categoryId + "}";
    }
}
