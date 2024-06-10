package com.meituan.sdk.model.waimaiNg.dish.dishDeleteSku;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 删除菜品sku
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/dish/deleteSku",
    businessId = 2,
    apiVersion = "10059",
    apiName = "dish_delete_sku",
    needAuth = true
)
public class DishDeleteSkuRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">ERP方skuId</font></span></p>
    */
    @NotBlank(message = "eDishSkuCode不能为空")
    @SerializedName("eDishSkuCode")
    private String eDishSkuCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">ERP方菜品id</font></span></p>
    */
    @NotBlank(message = "eDishCode不能为空")
    @SerializedName("eDishCode")
    private String eDishCode;

    public String getEDishSkuCode() {
        return eDishSkuCode;
    }
    public void setEDishSkuCode(String eDishSkuCode) {
        this.eDishSkuCode = eDishSkuCode;
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
        return "DishDeleteSkuRequest{" + "eDishSkuCode=" + eDishSkuCode + "," + "eDishCode=" + eDishCode + "}";
    }
}
