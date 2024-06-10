package com.meituan.sdk.model.waimaiNg.dish.dishQueryPropertyList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询菜品属性
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/queryPropertyList",
    businessId = 2,
    apiVersion = "10081",
    apiName = "dish_query_property_list",
    needAuth = true
)
public class DishQueryPropertyListRequest implements MeituanRequest<List<DishPropertyInfo>> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">ERP方菜品id</font></span></p>
    */
    @NotBlank(message = "eDishCode不能为空")
    @SerializedName("eDishCode")
    private String eDishCode;

    public String getEDishCode() {
        return eDishCode;
    }
    public void setEDishCode(String eDishCode) {
        this.eDishCode = eDishCode;
    }


    @Override
    public MeituanResponse<List<DishPropertyInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<DishPropertyInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "DishQueryPropertyListRequest{" + "eDishCode=" + eDishCode + "}";
    }
}
