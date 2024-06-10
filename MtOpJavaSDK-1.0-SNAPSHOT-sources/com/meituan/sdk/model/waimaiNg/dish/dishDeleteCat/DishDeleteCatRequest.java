package com.meituan.sdk.model.waimaiNg.dish.dishDeleteCat;

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
    path = "/waimai/dish/deleteCat",
    businessId = 2,
    apiVersion = "10059",
    apiName = "dish_delete_cat",
    needAuth = true
)
public class DishDeleteCatRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品分类名称</font></span></p>
    */
    @NotBlank(message = "catName不能为空")
    @SerializedName("catName")
    private String catName;

    public String getCatName() {
        return catName;
    }
    public void setCatName(String catName) {
        this.catName = catName;
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
        return "DishDeleteCatRequest{" + "catName=" + catName + "}";
    }
}
