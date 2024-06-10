package com.meituan.sdk.model.wmoperNg.foodop.foodUpdateAppFoodCodeByOrigin;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据原商品编码更换新商品编码
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/food/updateAppFoodCodeByOrigin",
    businessId = 16,
    apiVersion = "10003",
    apiName = "food_update_app_food_code_by_origin",
    needAuth = true
)
public class FoodUpdateAppFoodCodeByOriginRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">原app_food_code，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">为商品的服务商方的商品id</font></span></p>
    */
    @NotBlank(message = "appFoodCodeOrigin不能为空")
    @SerializedName("app_food_code_origin")
    private String appFoodCodeOrigin;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">新app_food_code，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">为商品的服务商方的商品id，不同门店可以重复，同一门店内不能重复，最大长度128</font></span></p>
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">原sku_id，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">为商品sku的唯一标示,如变更则必须</font></span></p>
    */
    @SerializedName("sku_id_origin")
    private String skuIdOrigin;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">新sku_id，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">为商品sku的唯一标示，如变更则必须</font></span></p>
    */
    @SerializedName("sku_id")
    private String skuId;

    public String getAppFoodCodeOrigin() {
        return appFoodCodeOrigin;
    }
    public void setAppFoodCodeOrigin(String appFoodCodeOrigin) {
        this.appFoodCodeOrigin = appFoodCodeOrigin;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
    }
    public String getSkuIdOrigin() {
        return skuIdOrigin;
    }
    public void setSkuIdOrigin(String skuIdOrigin) {
        this.skuIdOrigin = skuIdOrigin;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
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
        return "FoodUpdateAppFoodCodeByOriginRequest{" + "appFoodCodeOrigin=" + appFoodCodeOrigin + "," + "appFoodCode=" + appFoodCode + "," + "skuIdOrigin=" + skuIdOrigin + "," + "skuId=" + skuId + "}";
    }
}
