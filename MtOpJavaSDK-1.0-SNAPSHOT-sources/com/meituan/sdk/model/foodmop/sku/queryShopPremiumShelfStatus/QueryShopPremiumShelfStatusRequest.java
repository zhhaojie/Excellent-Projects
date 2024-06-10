package com.meituan.sdk.model.foodmop.sku.queryShopPremiumShelfStatus;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店上架的配料
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/shelf/premium/query",
    businessId = 51,
    apiVersion = "10013",
    apiName = "query_shop_premium_shelf_status",
    needAuth = true
)
public class QueryShopPremiumShelfStatusRequest implements MeituanRequest<List<String>> {
    /**
    * <p data-diff-id="ct-diff-id-8bc076be-9301-4bcf-ac91-f14753378f2c">门店id</p>
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
        return "QueryShopPremiumShelfStatusRequest{" + "vendorShopId=" + vendorShopId + "}";
    }
}
