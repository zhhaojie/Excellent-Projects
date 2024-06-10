package com.meituan.sdk.model.klOpen.order.createOrderSync;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">订单商品列表</font></span></p>
* This file was automatically generated.
*/
public class GoodsList {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">sku编码</font></span></p>
    */
    @NotBlank(message = "skuCode不能为空")
    @SerializedName("skuCode")
    private String skuCode;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">sku名称</font></span></p>
    */
    @NotBlank(message = "skuName不能为空")
    @SerializedName("skuName")
    private String skuName;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">数量</font></span></p>
    */
    @NotNull(message = "quantity不能为空")
    @SerializedName("quantity")
    private Integer quantity;

    public String getSkuCode() {
        return skuCode;
    }
    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }
    public String getSkuName() {
        return skuName;
    }
    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }




    @Override
    public String toString() {
        return "GoodsList{" + "skuCode=" + skuCode + "," + "skuName=" + skuName + "," + "quantity=" + quantity + "}";
    }
}
