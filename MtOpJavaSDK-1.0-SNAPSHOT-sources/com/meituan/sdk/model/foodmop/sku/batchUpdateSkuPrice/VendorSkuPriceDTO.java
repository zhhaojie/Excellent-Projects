package com.meituan.sdk.model.foodmop.sku.batchUpdateSkuPrice;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-66f45bc7-3820-472e-aa30-702417b25193">SKU 价格</p><p data-diff-id="ct-diff-id-edab3f3c-e2e7-42b8-b306-c81450ab1328">最多传 100 个，要求所有vendorShopId都在美团侧存在映射，若存在无映射vendorShopId,失败并在错误信息中返回无映射vendorShopId</p>
* This file was automatically generated.
*/
public class VendorSkuPriceDTO {
    /**
    * <p data-diff-id="ct-diff-id-1e6ac31b-9c2e-4db2-9e3b-4663fde47a45">sku 价格维度</p>
    */
    @NotNull(message = "priceBusinessDimensionDTO不能为空")
    @SerializedName("priceBusinessDimensionDTO")
    private PriceBusinessDimensionDTO priceBusinessDimensionDTO;
    /**
    * <p data-diff-id="ct-diff-id-67dbd44a-d814-42d9-b2a6-8dda562c9c98"><span style="color: rgba(0, 0, 0, 0.65)">sku 价格，单位分</span><br><span style="color: rgba(0, 0, 0, 0.65)">单位分，非负数</span></p>
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
