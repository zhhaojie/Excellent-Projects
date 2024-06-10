package com.meituan.sdk.model.foodmop.sku.batchQuerySkuPrice;

import com.google.gson.annotations.SerializedName;

/**
* SKU 价格维度
* This file was automatically generated.
*/
public class VendorSkuPriceDTO {
    /**
    * sku 价格维度
    */
    @SerializedName("priceBusinessDimensionDTO")
    private PriceBusinessDimensionDTO priceBusinessDimensionDTO;
    /**
    * sku 价格，单位分
    */
    @SerializedName("price")
    private Long price;

    public PriceBusinessDimensionDTO getPriceBusinessDimensionDTO() {
        return priceBusinessDimensionDTO;
    }
    public void setPriceBusinessDimensionDTO(PriceBusinessDimensionDTO priceBusinessDimensionDTO) {
        this.priceBusinessDimensionDTO = priceBusinessDimensionDTO;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "VendorSkuPriceDTO{" + "priceBusinessDimensionDTO=" + priceBusinessDimensionDTO + "," + "price=" + price + "}";
    }
}
