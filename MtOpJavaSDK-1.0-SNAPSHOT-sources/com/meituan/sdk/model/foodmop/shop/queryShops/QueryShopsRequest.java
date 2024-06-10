package com.meituan.sdk.model.foodmop.shop.queryShops;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 门店配置查询（非必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/shop/queryShops",
    businessId = 51,
    apiVersion = "10005",
    apiName = "query_shops",
    needAuth = true
)
public class QueryShopsRequest implements MeituanRequest<List<ResultData>> {
    /**
    * <p data-diff-id="ct-diff-id-30b1c060-d95c-477f-bb78-504cd52a1137">厂商门店ID(批量限制20)</p>
    */
    @NotEmpty(message = "vendorShopIds不能为空")
    @SerializedName("vendorShopIds")
    private List<String> vendorShopIds;

    public List<String> getVendorShopIds() {
        return vendorShopIds;
    }
    public void setVendorShopIds(List<String> vendorShopIds) {
        this.vendorShopIds = vendorShopIds;
    }


    @Override
    public MeituanResponse<List<ResultData>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<ResultData>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryShopsRequest{" + "vendorShopIds=" + vendorShopIds + "}";
    }
}
