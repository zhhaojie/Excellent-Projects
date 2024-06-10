package com.meituan.sdk.model.wmoperNg.special.specialFoodBatchQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Skus {
    @SerializedName("mt_sku_id")
    private Long mtSkuId;
    @SerializedName("sku_id")
    private String skuId;
    @SerializedName("spec")
    private String spec;
    @SerializedName("price")
    private Double price;
    /**
    * sku库存数量，不能为负数或小数，传'*'表示库存无限
    */
    @SerializedName("stock")
    private String stock;
    @SerializedName("max_stock")
    private Long maxStock;

    public Long getMtSkuId() {
        return mtSkuId;
    }
    public void setMtSkuId(Long mtSkuId) {
        this.mtSkuId = mtSkuId;
    }
    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public String getSpec() {
        return spec;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getStock() {
        return stock;
    }
    public void setStock(String stock) {
        this.stock = stock;
    }
    public Long getMaxStock() {
        return maxStock;
    }
    public void setMaxStock(Long maxStock) {
        this.maxStock = maxStock;
    }




    @Override
    public String toString() {
        return "Skus{" + "mtSkuId=" + mtSkuId + "," + "skuId=" + skuId + "," + "spec=" + spec + "," + "price=" + price + "," + "stock=" + stock + "," + "maxStock=" + maxStock + "}";
    }
}
