package com.meituan.sdk.model.wmoperNg.foodop.foodUpdateAppfoodcodeByNameAndSpec;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据商品名称和规格名称更换新的商品编码
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/foodop/food/updateAppFoodCodeByNameAndSpec",
    businessId = 16,
    apiVersion = "10003",
    apiName = "food_update_appfoodcode_by_name_and_spec",
    needAuth = true
)
public class FoodUpdateAppfoodcodeByNameAndSpecRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">商品名称，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">如变更商品编码，商品名称需同线上完全一致，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">如不一致将无法匹配</font></span></p>
    */
    @NotBlank(message = "name不能为空")
    @SerializedName("name")
    private String name;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">分类名称，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">如变更商品编码，分类名称需同线上完全一致，如不一致将无法匹配</font></span></p>
    */
    @NotBlank(message = "categoryName不能为空")
    @SerializedName("category_name")
    private String categoryName;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">规格，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">如变更商品编码，规格需同线上完全一致，如不一致将无法匹配,如商品有规格，则必填</font></span></p>
    */
    @SerializedName("spec")
    private String spec;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">新app_food_code，</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">为商品的服务商方的商品id，不同门店可以重复，同一门店内不能重复，最大长度128</font></span></p>
    */
    @NotBlank(message = "appFoodCode不能为空")
    @SerializedName("app_food_code")
    private String appFoodCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">新sku_id，为商品sku的唯一标示,如商品有规格，则必填</font></span></p>
    */
    @SerializedName("sku_id")
    private String skuId;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getSpec() {
        return spec;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }
    public String getAppFoodCode() {
        return appFoodCode;
    }
    public void setAppFoodCode(String appFoodCode) {
        this.appFoodCode = appFoodCode;
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
        return "FoodUpdateAppfoodcodeByNameAndSpecRequest{" + "name=" + name + "," + "categoryName=" + categoryName + "," + "spec=" + spec + "," + "appFoodCode=" + appFoodCode + "," + "skuId=" + skuId + "}";
    }
}
