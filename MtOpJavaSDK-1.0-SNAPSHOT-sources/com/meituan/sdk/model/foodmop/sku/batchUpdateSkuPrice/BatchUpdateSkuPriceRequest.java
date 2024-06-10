package com.meituan.sdk.model.foodmop.sku.batchUpdateSkuPrice;

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
* 批量更新门店维度 SKU 价格
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/batchUpdateSkuPrice",
    businessId = 51,
    apiVersion = "10012",
    apiName = "batch_update_sku_price",
    needAuth = true
)
public class BatchUpdateSkuPriceRequest implements MeituanRequest<BatchUpdateSkuPriceResponse> {
    /**
    * <p data-diff-id="ct-diff-id-66f45bc7-3820-472e-aa30-702417b25193">SKU 价格</p><p data-diff-id="ct-diff-id-edab3f3c-e2e7-42b8-b306-c81450ab1328">最多传 100 个，要求所有vendorShopId都在美团侧存在映射，若存在无映射vendorShopId,失败并在错误信息中返回无映射vendorShopId</p>
    */
    @NotEmpty(message = "vendorSkuPriceList不能为空")
    @SerializedName("vendorSkuPriceList")
    private List<VendorSkuPriceDTO> vendorSkuPriceList;

    public List<VendorSkuPriceDTO> getVendorSkuPriceList() {
        return vendorSkuPriceList;
    }
    public void setVendorSkuPriceList(List<VendorSkuPriceDTO> vendorSkuPriceList) {
        this.vendorSkuPriceList = vendorSkuPriceList;
    }


    @Override
    public MeituanResponse<BatchUpdateSkuPriceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateSkuPriceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateSkuPriceRequest{" + "vendorSkuPriceList=" + vendorSkuPriceList + "}";
    }
}
