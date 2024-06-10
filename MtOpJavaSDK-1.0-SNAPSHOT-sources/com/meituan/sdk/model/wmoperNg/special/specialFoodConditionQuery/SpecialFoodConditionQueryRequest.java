package com.meituan.sdk.model.wmoperNg.special.specialFoodConditionQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询单个商品(拼好饭)
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/special/food/conditionQuery",
    businessId = 16,
    apiVersion = "10003",
    apiName = "special_food_condition_query",
    needAuth = true
)
public class SpecialFoodConditionQueryRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">业务标识，1-拼好饭</font></span></p>
    */
    @SerializedName("businessIdentify")
    private Integer businessIdentify;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">三方菜品id，对应外卖侧的app_food_code</font></span></p>
    */
    @SerializedName("eDishCode")
    private String eDishCode;

    public Integer getBusinessIdentify() {
        return businessIdentify;
    }
    public void setBusinessIdentify(Integer businessIdentify) {
        this.businessIdentify = businessIdentify;
    }
    public String getEDishCode() {
        return eDishCode;
    }
    public void setEDishCode(String eDishCode) {
        this.eDishCode = eDishCode;
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
        return "SpecialFoodConditionQueryRequest{" + "businessIdentify=" + businessIdentify + "," + "eDishCode=" + eDishCode + "}";
    }
}
