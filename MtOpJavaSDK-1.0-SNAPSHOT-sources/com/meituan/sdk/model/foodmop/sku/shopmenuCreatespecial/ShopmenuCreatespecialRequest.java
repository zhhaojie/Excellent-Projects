package com.meituan.sdk.model.foodmop.sku.shopmenuCreatespecial;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 创建或更新门店特殊类目（非必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/shopmenu/createSpecial",
    businessId = 51,
    apiVersion = "10011",
    apiName = "shopmenu_createspecial",
    needAuth = true
)
public class ShopmenuCreatespecialRequest implements MeituanRequest<Boolean> {
    /**
    * <p data-diff-id="ct-diff-id-651935d1-f9d7-4ba6-8f36-fc3f0cbd46ec">门店菜谱</p>
    */
    @NotNull(message = "vendorShopMenu不能为空")
    @SerializedName("vendorShopMenu")
    private VendorShopMenuDTO vendorShopMenu;
    /**
    * <p data-diff-id="ct-diff-id-a9be06cb-003e-4e1c-8896-c88f83e16685">同步模式</p><ul data-diff-id="ct-diff-id-991e47a6-f59d-45a7-b4fc-402481edeb41"><li data-list-item-diff-id="ct-list-item-diff-id-2fbf396a-0f50-49e0-aa1c-5415e7989d3a"><p data-diff-id="ct-diff-id-e46ff828-5d26-4856-87be-e4d67ef2a404">1：全量覆盖模式</p></li><li data-list-item-diff-id="ct-list-item-diff-id-75ae347a-37c6-4921-bd7f-4192bdd591c4"><p data-diff-id="ct-diff-id-d478d1e3-b6e1-492f-a119-665d58a4d63d">2：增量模式</p></li></ul><p data-diff-id="ct-diff-id-8274876a-7a31-4ac9-b7f6-42b10655808d">只针对特殊类目，特殊类目不影响正常类目</p>
    */
    @SerializedName("append")
    private Integer append;

    public VendorShopMenuDTO getVendorShopMenu() {
        return vendorShopMenu;
    }
    public void setVendorShopMenu(VendorShopMenuDTO vendorShopMenu) {
        this.vendorShopMenu = vendorShopMenu;
    }
    public Integer getAppend() {
        return append;
    }
    public void setAppend(Integer append) {
        this.append = append;
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
        return "ShopmenuCreatespecialRequest{" + "vendorShopMenu=" + vendorShopMenu + "," + "append=" + append + "}";
    }
}
