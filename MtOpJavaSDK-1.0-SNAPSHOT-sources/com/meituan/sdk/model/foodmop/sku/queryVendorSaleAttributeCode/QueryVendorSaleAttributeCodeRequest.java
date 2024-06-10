package com.meituan.sdk.model.foodmop.sku.queryVendorSaleAttributeCode;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询品牌所有售卖属性编码
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/saleattr/queryAll",
    businessId = 51,
    apiVersion = "10013",
    apiName = "query_vendor_sale_attribute_code",
    needAuth = true
)
public class QueryVendorSaleAttributeCodeRequest implements MeituanRequest<QueryVendorSaleAttributeCodeResponse> {



    @Override
    public MeituanResponse<QueryVendorSaleAttributeCodeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryVendorSaleAttributeCodeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
