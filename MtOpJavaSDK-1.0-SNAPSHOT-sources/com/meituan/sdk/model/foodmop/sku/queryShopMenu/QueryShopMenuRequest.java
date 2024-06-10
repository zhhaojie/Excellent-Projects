package com.meituan.sdk.model.foodmop.sku.queryShopMenu;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店菜谱
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/queryShopMenu",
    businessId = 51,
    apiVersion = "10011",
    apiName = "query_shop_menu",
    needAuth = true
)
public class QueryShopMenuRequest implements MeituanRequest<QueryShopMenuResponse> {
    /**
    * <p data-diff-id="ct-diff-id-ce85314e-a4f0-4dec-a752-2c7029836c79">厂商门店id</p>
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }


    @Override
    public MeituanResponse<QueryShopMenuResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryShopMenuResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryShopMenuRequest{" + "vendorShopId=" + vendorShopId + "}";
    }
}
