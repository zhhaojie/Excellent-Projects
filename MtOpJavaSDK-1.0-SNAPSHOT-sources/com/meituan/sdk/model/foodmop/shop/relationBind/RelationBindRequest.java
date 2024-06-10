package com.meituan.sdk.model.foodmop.shop.relationBind;

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
* 绑定门店（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/relation/bind",
    businessId = 51,
    apiVersion = "10005",
    apiName = "relation_bind",
    needAuth = true
)
public class RelationBindRequest implements MeituanRequest<Boolean> {
    /**
    * <p data-diff-id="ct-diff-id-28a8cb5b-1b89-4488-a64f-6d9389ff388b">商家ERP上门店编码</p>
    */
    @NotBlank(message = "erpShopId不能为空")
    @SerializedName("erpShopId")
    private String erpShopId;
    /**
    * <p data-diff-id="ct-diff-id-95d036c5-0bfd-40a9-9fa5-2245a90918f0">商家POS上门店编码，如果没有则默认为ERP上门店编码</p>
    */
    @SerializedName("posShopId")
    private String posShopId;
    /**
    * <p data-diff-id="ct-diff-id-977b2bea-d217-4233-95ea-83a6063730d5">美团门店ID</p>
    */
    @NotNull(message = "poiId不能为空")
    @SerializedName("poiId")
    private Integer poiId;

    public String getErpShopId() {
        return erpShopId;
    }
    public void setErpShopId(String erpShopId) {
        this.erpShopId = erpShopId;
    }
    public String getPosShopId() {
        return posShopId;
    }
    public void setPosShopId(String posShopId) {
        this.posShopId = posShopId;
    }
    public Integer getPoiId() {
        return poiId;
    }
    public void setPoiId(Integer poiId) {
        this.poiId = poiId;
    }


    @Override
    public MeituanResponse<Boolean> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<Boolean>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "RelationBindRequest{" + "erpShopId=" + erpShopId + "," + "posShopId=" + posShopId + "," + "poiId=" + poiId + "}";
    }
}
