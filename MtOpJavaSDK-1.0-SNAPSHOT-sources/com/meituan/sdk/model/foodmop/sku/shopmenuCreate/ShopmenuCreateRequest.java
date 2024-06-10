package com.meituan.sdk.model.foodmop.sku.shopmenuCreate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建或更新门店菜谱（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/shopmenu/create",
    businessId = 51,
    apiVersion = "10003",
    apiName = "shopmenu_create",
    needAuth = true
)
public class ShopmenuCreateRequest implements MeituanRequest<Boolean> {
    /**
    * <p data-diff-id="ct-diff-id-651935d1-f9d7-4ba6-8f36-fc3f0cbd46ec">门店菜谱</p>
    */
    @NotNull(message = "vendorShopMenu不能为空")
    @SerializedName("vendorShopMenu")
    private VendorShopMenuDTO vendorShopMenu;

    public VendorShopMenuDTO getVendorShopMenu() {
        return vendorShopMenu;
    }
    public void setVendorShopMenu(VendorShopMenuDTO vendorShopMenu) {
        this.vendorShopMenu = vendorShopMenu;
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
        return "ShopmenuCreateRequest{" + "vendorShopMenu=" + vendorShopMenu + "}";
    }
}
