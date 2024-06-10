package com.meituan.sdk.model.wmoperNg.foodop.foodSkuIncStock;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">skus</font></span></p>
* This file was automatically generated.
*/
public class Skus {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">sku码</font></span></p>
    */
    @NotBlank(message = "skuId不能为空")
    @SerializedName("sku_id")
    private String skuId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">此处为sku库存的增加值，不能为负数或小数</font></span></p>
    */
    @NotBlank(message = "stock不能为空")
    @SerializedName("stock")
    private String stock;

    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public String getStock() {
        return stock;
    }
    public void setStock(String stock) {
        this.stock = stock;
    }




    @Override
    public String toString() {
        return "Skus{" + "skuId=" + skuId + "," + "stock=" + stock + "}";
    }
}
