package com.meituan.sdk.model.wmoperNg.special.specialFoodUpdateStock;

import com.meituan.sdk.annotations.ApiMeta;
import java.lang.Void;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 修改商品库存(拼好饭)
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/special/food/updateStock",
    businessId = 16,
    apiVersion = "10005",
    apiName = "special_food_update_stock",
    needAuth = true
)
public class SpecialFoodUpdateStockRequest implements MeituanRequest<Void> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">业务标识，1-拼好饭</font></span></p>
    */
    @SerializedName("businessIdentify")
    private Integer businessIdentify;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">菜品规格id</font></span></p>
    */
    @SerializedName("skuId")
    private String skuId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">三方菜品id，当eDishCode为default时，表示清空该值，当eDishCode为空字符串时，表示不处理该字段，对应外卖侧的app_food_code</font></span></p>
    */
    @SerializedName("eDishCode")
    private String eDishCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">当前库存值</font></span></p>
    */
    @SerializedName("stock")
    private String stock;

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
        return "SpecialFoodUpdateStockRequest{" + "businessIdentify=" + businessIdentify + "," + "skuId=" + skuId + "," + "eDishCode=" + eDishCode + "," + "stock=" + stock + "}";
    }
}
