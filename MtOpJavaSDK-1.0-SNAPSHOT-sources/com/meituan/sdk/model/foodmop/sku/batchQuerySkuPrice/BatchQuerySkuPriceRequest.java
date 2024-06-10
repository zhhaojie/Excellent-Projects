package com.meituan.sdk.model.foodmop.sku.batchQuerySkuPrice;

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
* 批量查询商品价格
* This file was automatically generated.
*/
@ApiMeta(
    path = "/foodmop/sku/batchQuerySkuPrice",
    businessId = 51,
    apiVersion = "10013",
    apiName = "batch_query_sku_price",
    needAuth = true
)
public class BatchQuerySkuPriceRequest implements MeituanRequest<BatchQuerySkuPriceResponse> {
    /**
    * <p data-diff-id="ct-diff-id-33336438-95de-44bd-a4cb-8ea0cc21a22b">SKU 价格维度</p>
    */
    @NotEmpty(message = "priceBusinessDimensionDTOList不能为空")
    @SerializedName("priceBusinessDimensionDTOList")
    private List<PriceBusinessDimensionDTO> priceBusinessDimensionDTOList;

    public List<PriceBusinessDimensionDTO> getPriceBusinessDimensionDTOList() {
        return priceBusinessDimensionDTOList;
    }
    public void setPriceBusinessDimensionDTOList(List<PriceBusinessDimensionDTO> priceBusinessDimensionDTOList) {
        this.priceBusinessDimensionDTOList = priceBusinessDimensionDTOList;
    }


    @Override
    public MeituanResponse<BatchQuerySkuPriceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchQuerySkuPriceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchQuerySkuPriceRequest{" + "priceBusinessDimensionDTOList=" + priceBusinessDimensionDTOList + "}";
    }
}
