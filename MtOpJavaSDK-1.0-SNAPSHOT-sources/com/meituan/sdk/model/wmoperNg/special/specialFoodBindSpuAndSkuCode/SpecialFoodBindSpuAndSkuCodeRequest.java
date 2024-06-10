package com.meituan.sdk.model.wmoperNg.special.specialFoodBindSpuAndSkuCode;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 建立拼好饭场景菜品映射
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/special/food/bindSpuAndSkuCode",
    businessId = 16,
    apiVersion = "10006",
    apiName = "special_food_bind_spu_and_sku_code",
    needAuth = true
)
public class SpecialFoodBindSpuAndSkuCodeRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">业务标识，1-拼好饭</font></span></p>
    */
    @SerializedName("businessIdentify")
    private Integer businessIdentify;
    /**
    * <p>三方菜品id，当eDishCode为default时，表示清空该值，当eDishCode为空字符串时，表示不处理该字段<span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">，对应外卖侧的app_food_code</font></span></p>
    */
    @SerializedName("eDishCode")
    private String eDishCode;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">美团SPUID</font></span></p>
    */
    @SerializedName("mtSpuId")
    private Long mtSpuId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">三方规格ID，当sku_id为default时，表示清空该值，当sku_id为空字符串时，表示不处理该字段</font></span></p>
    */
    @SerializedName("skuId")
    private String skuId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">美团SKUID</font></span></p>
    */
    @SerializedName("mtSkuId")
    private Long mtSkuId;

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
    public Long getMtSpuId() {
        return mtSpuId;
    }
    public void setMtSpuId(Long mtSpuId) {
        this.mtSpuId = mtSpuId;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public Long getMtSkuId() {
        return mtSkuId;
    }
    public void setMtSkuId(Long mtSkuId) {
        this.mtSkuId = mtSkuId;
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
        return "SpecialFoodBindSpuAndSkuCodeRequest{" + "businessIdentify=" + businessIdentify + "," + "eDishCode=" + eDishCode + "," + "mtSpuId=" + mtSpuId + "," + "skuId=" + skuId + "," + "mtSkuId=" + mtSkuId + "}";
    }
}
