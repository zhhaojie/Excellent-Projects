package com.meituan.sdk.model.foodmop.sku.shopmenuDeleteSpecial;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 删除门店特殊类目
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/shopmenu/deleteSpecial",
    businessId = 51,
    apiVersion = "10011",
    apiName = "shopmenu_delete_special",
    needAuth = true
)
public class ShopmenuDeleteSpecialRequest implements MeituanRequest<String> {
    /**
    * <p data-diff-id="ct-diff-id-103e9686-faf4-4f02-a1e9-48add512fae0">门店 id</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-c0f301ab-1267-4d89-974a-b9d9f5df36fc">类目 id 列表</p>
    */
    @SerializedName("vendorSellerCategoryIdList")
    private List<String> vendorSellerCategoryIdList;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public List<String> getVendorSellerCategoryIdList() {
        return vendorSellerCategoryIdList;
    }
    public void setVendorSellerCategoryIdList(List<String> vendorSellerCategoryIdList) {
        this.vendorSellerCategoryIdList = vendorSellerCategoryIdList;
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
        return "ShopmenuDeleteSpecialRequest{" + "vendorShopId=" + vendorShopId + "," + "vendorSellerCategoryIdList=" + vendorSellerCategoryIdList + "}";
    }
}
