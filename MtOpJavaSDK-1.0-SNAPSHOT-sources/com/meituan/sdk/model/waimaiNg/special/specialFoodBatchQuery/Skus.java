package com.meituan.sdk.model.waimaiNg.special.specialFoodBatchQuery;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class Skus {
    @NotNull(message = "mtSkuId不能为空")
    @SerializedName("mt_sku_id")
    private Long mtSkuId;
    @NotBlank(message = "skuId不能为空")
    @SerializedName("sku_id")
    private String skuId;
    @NotBlank(message = "spec不能为空")
    @SerializedName("spec")
    private String spec;
    @NotNull(message = "price不能为空")
    @SerializedName("price")
    private Double price;
    @NotNull(message = "stock不能为空")
    @SerializedName("stock")
    private Long stock;
    @NotNull(message = "maxStock不能为空")
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
    public Long getStock() {
        return stock;
    }
    public void setStock(Long stock) {
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
