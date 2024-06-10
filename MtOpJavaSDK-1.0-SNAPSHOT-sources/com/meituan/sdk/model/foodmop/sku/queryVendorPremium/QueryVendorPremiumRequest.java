package com.meituan.sdk.model.foodmop.sku.queryVendorPremium;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询配料属性信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/premium/query",
    businessId = 51,
    apiVersion = "10011",
    apiName = "query_vendor_premium",
    needAuth = true
)
public class QueryVendorPremiumRequest implements MeituanRequest<QueryVendorPremiumResponse> {
    /**
    * <p data-diff-id="ct-diff-id-e39d81c7-e098-400c-b6e2-78f7400b8060">配料属性编码</p>
    */
    @NotBlank(message = "premiumCode不能为空")
    @SerializedName("premiumCode")
    private String premiumCode;

    public String getPremiumCode() {
        return premiumCode;
    }
    public void setPremiumCode(String premiumCode) {
        this.premiumCode = premiumCode;
    }


    @Override
    public MeituanResponse<QueryVendorPremiumResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryVendorPremiumResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryVendorPremiumRequest{" + "premiumCode=" + premiumCode + "}";
    }
}
