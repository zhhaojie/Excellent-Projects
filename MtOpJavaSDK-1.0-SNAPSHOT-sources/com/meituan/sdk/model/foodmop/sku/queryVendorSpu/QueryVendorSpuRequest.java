package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店商品信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/queryVendorSpu",
    businessId = 51,
    apiVersion = "10011",
    apiName = "query_vendor_spu",
    needAuth = true
)
public class QueryVendorSpuRequest implements MeituanRequest<QueryVendorSpuResponse> {
    /**
    * <p data-diff-id="ct-diff-id-3aaac3da-cbfe-44e7-a381-4b77a6b4f532">SPU 编码</p>
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * <p data-diff-id="ct-diff-id-5494e027-6db3-4ec7-b678-d86d5b182d76">门店Id</p>
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;

    public String getVendorSpuId() {
        return vendorSpuId;
    }
    public void setVendorSpuId(String vendorSpuId) {
        this.vendorSpuId = vendorSpuId;
    }
    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }


    @Override
    public MeituanResponse<QueryVendorSpuResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryVendorSpuResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryVendorSpuRequest{" + "vendorSpuId=" + vendorSpuId + "," + "vendorShopId=" + vendorShopId + "}";
    }
}
