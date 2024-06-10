package com.meituan.sdk.model.foodmop.sku.batchUpdateShopSkuStock;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-b54c6998-acd0-4c94-906f-0cf433c467aa">SKU 库存</p><p data-diff-id="ct-diff-id-3cdfcb79-4f55-4550-9b41-bf11d32a7900"><span style="color: ">最多传 50 个，要求所有 vendorShopId 都在美团侧存在映射，若存在无映射 vendorShopId，失败并在错误信息中返回无映射 vendorShopId</span></p>
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
    * <ul data-diff-id="ct-diff-id-84ede7cc-4f41-4a89-84f6-ace7010747a0"><li data-list-item-diff-id="ct-list-item-diff-id-29aad3f3-ec3b-47fb-ab3d-46d6738a01e5"><p data-diff-id="ct-diff-id-0409e978-a175-4907-9af3-1888d2e58284">0：品牌商品</p></li><li data-list-item-diff-id="ct-list-item-diff-id-0fd1b095-ab24-42b9-bb3e-b5eae4d00e81"><p data-diff-id="ct-diff-id-79c8fdf3-bb5a-4467-8b91-dafa6ca9ba26">1：门店商品</p></li><li data-list-item-diff-id="ct-list-item-diff-id-f6b66a1f-5308-4858-9a87-33751d5dfc0d"><p data-diff-id="ct-diff-id-4b94a494-d7b9-4ba8-8491-b051d493309c"><span style="color: ">默认品牌商品</span></p></li></ul>
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
