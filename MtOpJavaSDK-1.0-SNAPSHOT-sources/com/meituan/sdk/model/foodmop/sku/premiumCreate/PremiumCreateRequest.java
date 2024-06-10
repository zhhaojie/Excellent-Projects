package com.meituan.sdk.model.foodmop.sku.premiumCreate;

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
* 创建或更新配料属性（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/premium/create",
    businessId = 51,
    apiVersion = "10018",
    apiName = "premium_create",
    needAuth = true
)
public class PremiumCreateRequest implements MeituanRequest<PremiumCreateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-02c889d9-fc84-424f-b7a2-4803efe89636">商品配料属性列表</p><p data-diff-id="ct-diff-id-5fd85904-5d17-4af4-b559-1e95a7995c75">不为空，每次最多传 25 个</p>
    */
    @NotEmpty(message = "vendorSpuPremiumList不能为空")
    @SerializedName("vendorSpuPremiumList")
    private List<VendorSpuPremiumDTO> vendorSpuPremiumList;

    public List<VendorSpuPremiumDTO> getVendorSpuPremiumList() {
        return vendorSpuPremiumList;
    }
    public void setVendorSpuPremiumList(List<VendorSpuPremiumDTO> vendorSpuPremiumList) {
        this.vendorSpuPremiumList = vendorSpuPremiumList;
    }


    @Override
    public MeituanResponse<PremiumCreateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<PremiumCreateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "PremiumCreateRequest{" + "vendorSpuPremiumList=" + vendorSpuPremiumList + "}";
    }
}
