package com.meituan.sdk.model.foodmop.sku.batchUpdateShopSkuStock;

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
* 批量更新门店商品库存（非必接）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/batchUpdateSkuStock",
    businessId = 51,
    apiVersion = "10013",
    apiName = "batch_update_shop_sku_stock",
    needAuth = true
)
public class BatchUpdateShopSkuStockRequest implements MeituanRequest<BatchUpdateShopSkuStockResponse> {
    /**
    * <p data-diff-id="ct-diff-id-b54c6998-acd0-4c94-906f-0cf433c467aa">SKU 库存</p><p data-diff-id="ct-diff-id-3cdfcb79-4f55-4550-9b41-bf11d32a7900"><span style="color: ">最多传 50 个，要求所有 vendorShopId 都在美团侧存在映射，若存在无映射 vendorShopId，失败并在错误信息中返回无映射 vendorShopId</span></p>
    */
    @NotEmpty(message = "vendorSkuStockList不能为空")
    @SerializedName("vendorSkuStockList")
    private List<VendorSkuStockDTO> vendorSkuStockList;

    public List<VendorSkuStockDTO> getVendorSkuStockList() {
        return vendorSkuStockList;
    }
    public void setVendorSkuStockList(List<VendorSkuStockDTO> vendorSkuStockList) {
        this.vendorSkuStockList = vendorSkuStockList;
    }


    @Override
    public MeituanResponse<BatchUpdateShopSkuStockResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateShopSkuStockResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateShopSkuStockRequest{" + "vendorSkuStockList=" + vendorSkuStockList + "}";
    }
}
