package com.meituan.sdk.model.foodmop.sku.customruleCreate;

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
* 创建或更改商品客制化规则（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/customrule/create",
    businessId = 51,
    apiVersion = "10013",
    apiName = "customrule_create",
    needAuth = true
)
public class CustomruleCreateRequest implements MeituanRequest<CustomruleCreateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-6ac84962-b3d2-4aad-8a5a-51537dfad08e"><span style="color: ">商品 SPU 客制化规则列表</span></p>
    */
    @NotEmpty(message = "vendorSkuCustomRuleList不能为空")
    @SerializedName("vendorSkuCustomRuleList")
    private List<VendorSkuCustomRuleDTO> vendorSkuCustomRuleList;

    public List<VendorSkuCustomRuleDTO> getVendorSkuCustomRuleList() {
        return vendorSkuCustomRuleList;
    }
    public void setVendorSkuCustomRuleList(List<VendorSkuCustomRuleDTO> vendorSkuCustomRuleList) {
        this.vendorSkuCustomRuleList = vendorSkuCustomRuleList;
    }


    @Override
    public MeituanResponse<CustomruleCreateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CustomruleCreateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CustomruleCreateRequest{" + "vendorSkuCustomRuleList=" + vendorSkuCustomRuleList + "}";
    }
}
