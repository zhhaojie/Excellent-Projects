package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* SKU 库存
* This file was automatically generated.
*/
public class VendorSkuStockDTO {
    /**
    * 门店 id
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * 商品 spuId
    */
    @NotBlank(message = "vendorSpuId不能为空")
    @SerializedName("vendorSpuId")
    private String vendorSpuId;
    /**
    * 商品 skuId
    */
    @NotBlank(message = "vendorSkuId不能为空")
    @SerializedName("vendorSkuId")
    private String vendorSkuId;
    /**
    * 库存数量
    */
    @NotNull(message = "stock不能为空")
    @SerializedName("stock")
    private Integer stock;
    /**
    * 0：品牌商品  1：门店商品  默认品牌商品
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
