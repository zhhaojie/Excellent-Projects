package com.meituan.sdk.model.waimaiNg.dish.queryCategoryProperties;

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
    path = "/waimai/ng/dish/queryCategoryProperties",
    businessId = 2,
    apiVersion = "10018",
    apiName = "query_category_properties",
    needAuth = false
)
public class QueryCategoryPropertiesRequest implements MeituanRequest<QueryCategoryPropertiesResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">分类id</font></span></p>
    */
    @NotNull(message = "categoryId不能为空")
    @SerializedName("categoryId")
    private Long categoryId;

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }


    @Override
    public MeituanResponse<QueryCategoryPropertiesResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryCategoryPropertiesResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryCategoryPropertiesRequest{" + "categoryId=" + categoryId + "}";
    }
}
