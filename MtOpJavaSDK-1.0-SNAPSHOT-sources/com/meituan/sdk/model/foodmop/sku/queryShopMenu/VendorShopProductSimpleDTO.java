package com.meituan.sdk.model.foodmop.sku.queryShopMenu;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 商品 SPU 列表，必存在于商品池中
* This file was automatically generated.
*/
public class VendorShopProductSimpleDTO {
    /**
    * 商品 id
    */
    @NotBlank(message = "vendorProductId不能为空")
    @SerializedName("vendorProductId")
    private String vendorProductId;
    /**
    * 商品门店上下架状态  0 ：下架  1：上架
    */
    @NotNull(message = "shelfStatus不能为空")
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * 商品形式：  1：单品  2：套餐
    */
    @NotNull(message = "vendorProductForm不能为空")
    @SerializedName("vendorProductForm")
    private Integer vendorProductForm;

    public String getVendorProductId() {
        return vendorProductId;
    }
    public void setVendorProductId(String vendorProductId) {
        this.vendorProductId = vendorProductId;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public Integer getVendorProductForm() {
        return vendorProductForm;
    }
    public void setVendorProductForm(Integer vendorProductForm) {
        this.vendorProductForm = vendorProductForm;
    }




    @Override
    public String toString() {
        return "VendorShopProductSimpleDTO{" + "vendorProductId=" + vendorProductId + "," + "shelfStatus=" + shelfStatus + "," + "vendorProductForm=" + vendorProductForm + "}";
    }
}
