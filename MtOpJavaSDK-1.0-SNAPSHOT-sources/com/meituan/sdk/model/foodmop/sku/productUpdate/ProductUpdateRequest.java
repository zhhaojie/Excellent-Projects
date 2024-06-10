package com.meituan.sdk.model.foodmop.sku.productUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 更新门店商品库存（必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/update",
    businessId = 51,
    apiVersion = "10013",
    apiName = "product_update",
    needAuth = true
)
public class ProductUpdateRequest implements MeituanRequest<ProductUpdateResponse> {
    /**
    * <p data-diff-id="ct-diff-id-85b4cf03-2aa0-4364-ab08-e1f5451fcb44">SKU 库存</p>
    */
    @NotNull(message = "vendorSkuStockDTO不能为空")
    @SerializedName("vendorSkuStockDTO")
    private VendorSkuStockDTO vendorSkuStockDTO;

    public VendorSkuStockDTO getVendorSkuStockDTO() {
        return vendorSkuStockDTO;
    }
    public void setVendorSkuStockDTO(VendorSkuStockDTO vendorSkuStockDTO) {
        this.vendorSkuStockDTO = vendorSkuStockDTO;
    }


    @Override
    public MeituanResponse<ProductUpdateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<ProductUpdateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "ProductUpdateRequest{" + "vendorSkuStockDTO=" + vendorSkuStockDTO + "}";
    }
}
