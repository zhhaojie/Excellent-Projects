package com.meituan.sdk.model.foodmop.sku.queryVendorSkuCustomrule;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询商品客制化规则
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/customrule/query",
    businessId = 51,
    apiVersion = "10010",
    apiName = "query_vendor_sku_customrule",
    needAuth = true
)
public class QueryVendorSkuCustomruleRequest implements MeituanRequest<QueryVendorSkuCustomruleResponse> {
    /**
    * <p data-diff-id="ct-diff-id-a897e334-bb73-434b-82c4-40a65174877b">spuId</p>
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * <p data-diff-id="ct-diff-id-453c0770-c1c8-4c6a-85f2-66844fea4536">skuId</p>
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;

    public String getVendorSkuId() {
        return vendorSkuId;
    }
    public void setVendorSkuId(String vendorSkuId) {
        this.vendorSkuId = vendorSkuId;
    }
    public String getVendorSpuId() {
        return vendorSpuId;
    }
    public void setVendorSpuId(String vendorSpuId) {
        this.vendorSpuId = vendorSpuId;
    }


    @Override
    public MeituanResponse<QueryVendorSkuCustomruleResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryVendorSkuCustomruleResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryVendorSkuCustomruleRequest{" + "vendorSkuId=" + vendorSkuId + "," + "vendorSpuId=" + vendorSpuId + "}";
    }
}
