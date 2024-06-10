package com.meituan.sdk.model.foodmop.sku.updateSkuPrice;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-9a6d1bc7-e578-490f-8fa1-954f935573fa">SKU 价格</p>
* This file was automatically generated.
*/
public class VendorSkuPriceDTO {
    /**
    * <p data-diff-id="ct-diff-id-9663d55b-1f3b-4437-a2d0-367b4033290b">sku 价格维度</p>
    */
    @NotNull(message = "priceBusinessDimensionDTO不能为空")
    @SerializedName("priceBusinessDimensionDTO")
    private PriceBusinessDimensionDTO priceBusinessDimensionDTO;
    /**
    * <p data-diff-id="ct-diff-id-366a6ebe-ce0e-40d1-a03b-e5a6a4972411">sku 价格，单位分<br>单位分，非负数</p>
    */
    @NotNull(message = "price不能为空")
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
