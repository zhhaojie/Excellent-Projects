package com.meituan.sdk.model.foodmop.sku.batchQuerySkuPrice;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 批量查询商品价格
* This file was automatically generated.
*/
public class BatchQuerySkuPriceResponse {
    /**
    * SKU 价格维度
    */
    @SerializedName("vendorSkuPriceDTOList")
    private List<VendorSkuPriceDTO> vendorSkuPriceDTOList;

    public List<VendorSkuPriceDTO> getVendorSkuPriceDTOList() {
        return vendorSkuPriceDTOList;
    }
    public void setVendorSkuPriceDTOList(List<VendorSkuPriceDTO> vendorSkuPriceDTOList) {
        this.vendorSkuPriceDTOList = vendorSkuPriceDTOList;
    }




    @Override
    public String toString() {
        return "BatchQuerySkuPriceResponse{" + "vendorSkuPriceDTOList=" + vendorSkuPriceDTOList + "}";
    }
}
