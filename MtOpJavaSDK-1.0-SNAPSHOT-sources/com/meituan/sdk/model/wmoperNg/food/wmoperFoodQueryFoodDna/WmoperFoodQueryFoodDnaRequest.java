package com.meituan.sdk.model.wmoperNg.food.wmoperFoodQueryFoodDna;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询商品DNA
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/food/queryFoodDna",
    businessId = 16,
    apiVersion = "10001",
    apiName = "wmoper_food_query_food_dna",
    needAuth = false
)
public class WmoperFoodQueryFoodDnaRequest implements MeituanRequest<WmoperFoodQueryFoodDnaResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">菜品id</font></span></p>
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;

    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }


    @Override
    public MeituanResponse<WmoperFoodQueryFoodDnaResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperFoodQueryFoodDnaResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperFoodQueryFoodDnaRequest{" + "appFoodCode=" + appFoodCode + "}";
    }
}
