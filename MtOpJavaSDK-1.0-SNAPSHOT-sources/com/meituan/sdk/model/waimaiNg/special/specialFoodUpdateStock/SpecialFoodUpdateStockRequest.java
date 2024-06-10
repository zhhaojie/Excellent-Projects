package com.meituan.sdk.model.waimaiNg.special.specialFoodUpdateStock;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改库存
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/special/food/updateStock",
    businessId = 2,
    apiVersion = "10000",
    apiName = "special_food_update_stock",
    needAuth = true
)
public class SpecialFoodUpdateStockRequest implements MeituanRequest<Void> {
    /**
    * 门店id 
    */
    @NotBlank(message = "epoiId不能为空")
    @SerializedName("epoiId")
    private String epoiId;
    /**
    * 业务标识，1-特价版
    */
    @NotNull(message = "businessIdentify不能为空")
    @SerializedName("businessIdentify")
    private Integer businessIdentify;
    /**
    * 菜品规格id
    */
    @NotBlank(message = "skuId不能为空")
    @SerializedName("skuId")
    private String skuId;
    /**
    * 菜品id
    */
    @NotBlank(message = "eDishCode不能为空")
    @SerializedName("eDishCode")
    private String eDishCode;
    /**
    * 当前库存值
    */
    @NotBlank(message = "stock不能为空")
    @SerializedName("stock")
    private String stock;

    public String getEpoiId() {
        return epoiId;
    }
    public void setEpoiId(String epoiId) {
        this.epoiId = epoiId;
    }
    public Integer getBusinessIdentify() {
        return businessIdentify;
    }
    public void setBusinessIdentify(Integer businessIdentify) {
        this.businessIdentify = businessIdentify;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public String getEDishCode() {
        return eDishCode;
    }
    public void setEDishCode(String eDishCode) {
        this.eDishCode = eDishCode;
    }
    public String getStock() {
        return stock;
    }
    public void setStock(String stock) {
        this.stock = stock;
    }


    @Override
    public MeituanResponse<Void> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Void>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "SpecialFoodUpdateStockRequest{" + "epoiId=" + epoiId + "," + "businessIdentify=" + businessIdentify + "," + "skuId=" + skuId + "," + "eDishCode=" + eDishCode + "," + "stock=" + stock + "}";
    }
}
