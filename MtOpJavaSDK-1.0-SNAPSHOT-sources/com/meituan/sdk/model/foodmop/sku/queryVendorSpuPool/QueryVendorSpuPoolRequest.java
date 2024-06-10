package com.meituan.sdk.model.foodmop.sku.queryVendorSpuPool;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询品牌商品池
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/queryVendorSpuPool",
    businessId = 51,
    apiVersion = "10013",
    apiName = "query_vendor_spu_pool",
    needAuth = true
)
public class QueryVendorSpuPoolRequest implements MeituanRequest<List<String>> {
    /**
    * <p data-diff-id="ct-diff-id-d98be472-cb30-49da-9916-ec629e8aa551">门店id</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }


    @Override
    public MeituanResponse<List<String>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<String>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryVendorSpuPoolRequest{" + "vendorShopId=" + vendorShopId + "}";
    }
}
