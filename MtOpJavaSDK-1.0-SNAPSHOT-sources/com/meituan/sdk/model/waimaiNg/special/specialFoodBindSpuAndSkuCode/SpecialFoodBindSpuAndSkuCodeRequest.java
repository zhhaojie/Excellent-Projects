package com.meituan.sdk.model.waimaiNg.special.specialFoodBindSpuAndSkuCode;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 绑定SPUcode以及SKUcode
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/special/food/bindSpuAndSkuCode",
    businessId = 2,
    apiVersion = "10000",
    apiName = "special_food_bind_spu_and_sku_code",
    needAuth = true
)
public class SpecialFoodBindSpuAndSkuCodeRequest implements MeituanRequest<String> {
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
    * 方菜品id，当eDishCode为default时，表示清空该值，当eDishCode为空字符串时，表示不处理该字段
    */
    @SerializedName("eDishCode")
    private String eDishCode;
    /**
    *  美团SPUID
    */
    @NotNull(message = "mtSpuId不能为空")
    @SerializedName("mtSpuId")
    private Long mtSpuId;
    /**
    * 三方规格ID，当sku_id为default时，表示清空该值，当sku_id为空字符串时，表示不处理该字段
    */
    @SerializedName("skuId")
    private String skuId;
    /**
    * 美团SKUID
    */
    @SerializedName("mtSkuId")
    private Long mtSkuId;

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
        return "SpecialFoodBindSpuAndSkuCodeRequest{" + "epoiId=" + epoiId + "," + "businessIdentify=" + businessIdentify + "," + "eDishCode=" + eDishCode + "," + "mtSpuId=" + mtSpuId + "," + "skuId=" + skuId + "," + "mtSkuId=" + mtSkuId + "}";
    }
}
