package com.meituan.sdk.model.wmoperNg.foodop.foodSkuPrice;

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
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">sku价格，只到小数点后两位</font></span></p>
    */
    @NotBlank(message = "price不能为空")
    @SerializedName("price")
    private String price;

    public String getSkuId() {
        return skuId;
    }
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }




    @Override
    public String toString() {
        return "Skus{" + "skuId=" + skuId + "," + "price=" + price + "}";
    }
}
