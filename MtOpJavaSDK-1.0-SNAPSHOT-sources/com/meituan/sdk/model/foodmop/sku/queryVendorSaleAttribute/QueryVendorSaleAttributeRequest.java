package com.meituan.sdk.model.foodmop.sku.queryVendorSaleAttribute;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询售卖属性信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/saleattr/query",
    businessId = 51,
    apiVersion = "10011",
    apiName = "query_vendor_sale_attribute",
    needAuth = true
)
public class QueryVendorSaleAttributeRequest implements MeituanRequest<QueryVendorSaleAttributeResponse> {
    /**
    * <p data-diff-id="ct-diff-id-e438df49-4e5c-47d0-835a-a2e69607a1f0">售卖属性编码</p>
    */
    @NotBlank(message = "saleAttributeCode不能为空")
    @SerializedName("saleAttributeCode")
    private String saleAttributeCode;

    public String getSaleAttributeCode() {
        return saleAttributeCode;
    }
    public void setSaleAttributeCode(String saleAttributeCode) {
        this.saleAttributeCode = saleAttributeCode;
    }


    @Override
    public MeituanResponse<QueryVendorSaleAttributeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryVendorSaleAttributeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryVendorSaleAttributeRequest{" + "saleAttributeCode=" + saleAttributeCode + "}";
    }
}
