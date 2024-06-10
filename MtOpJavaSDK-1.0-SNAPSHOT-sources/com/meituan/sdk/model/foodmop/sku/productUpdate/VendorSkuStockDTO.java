package com.meituan.sdk.model.foodmop.sku.productUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-85b4cf03-2aa0-4364-ab08-e1f5451fcb44">SKU 库存</p>
* This file was automatically generated.
*/
public class VendorSkuStockDTO {
    /**
    * <p data-diff-id="ct-diff-id-4598421d-2bdf-4b28-bdfe-975b33833d1e">门店 id</p>
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-c3f1d14a-747a-46dc-aa22-627b8765b544">商品 spuId</p>
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * <p data-diff-id="ct-diff-id-bb5e70e3-753d-47c0-8fe0-32638c4c51b9">商品 skuId</p>
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * <p data-diff-id="ct-diff-id-4c8159f7-5de0-4d3b-a4bc-a8858d8dc8d6">库存数量</p>
    */
    @NotNull(message = "stock不能为空")
    @SerializedName("stock")
    private Integer stock;
    /**
    * <p data-diff-id="ct-diff-id-d84ea490-4d5e-4006-9a97-98bd890ef3be">0：品牌商品</p><p data-diff-id="ct-diff-id-b95a62e5-c31d-4029-949f-de4d0864ba16">1：门店商品</p><p data-diff-id="ct-diff-id-31a18f4f-cb42-44aa-a3db-e5bc2c2f7d64">默认品牌商品</p>
    */
    @SerializedName("productScope")
    private Integer productScope;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public String getVendorSpuId() {
        return vendorSpuId;
    }
    public void setVendorSpuId(String vendorSpuId) {
        this.vendorSpuId = vendorSpuId;
    }
    public String getVendorSkuId() {
        return vendorSkuId;
    }
    public void setVendorSkuId(String vendorSkuId) {
        this.vendorSkuId = vendorSkuId;
    }
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }
    public Integer getProductScope() {
        return productScope;
    }
    public void setProductScope(Integer productScope) {
        this.productScope = productScope;
    }




    @Override
    public String toString() {
        return "VendorSkuStockDTO{" + "vendorShopId=" + vendorShopId + "," + "vendorSpuId=" + vendorSpuId + "," + "vendorSkuId=" + vendorSkuId + "," + "stock=" + stock + "," + "productScope=" + productScope + "}";
    }
}
