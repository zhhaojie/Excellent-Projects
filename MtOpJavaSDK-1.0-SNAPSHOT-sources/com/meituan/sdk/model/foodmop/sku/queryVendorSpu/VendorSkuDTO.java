package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 商品 SKU 列表
* This file was automatically generated.
*/
public class VendorSkuDTO {
    /**
    * 商品 SKU 基本信息
    */
    @NotNull(message = "skuBasic不能为空")
    @SerializedName("skuBasic")
    private SkuBasicDTO skuBasic;
    /**
    * 组成该 SKU 的售卖属性列表
    */
    @SerializedName("skuSaleAttributeBasicList")
    private List<SkuSaleAttributeBasicDTO> skuSaleAttributeBasicList;

    public SkuBasicDTO getSkuBasic() {
        return skuBasic;
    }
    public void setSkuBasic(SkuBasicDTO skuBasic) {
        this.skuBasic = skuBasic;
    }
    public List<SkuSaleAttributeBasicDTO> getSkuSaleAttributeBasicList() {
        return skuSaleAttributeBasicList;
    }
    public void setSkuSaleAttributeBasicList(List<SkuSaleAttributeBasicDTO> skuSaleAttributeBasicList) {
        this.skuSaleAttributeBasicList = skuSaleAttributeBasicList;
    }




    @Override
    public String toString() {
        return "VendorSkuDTO{" + "skuBasic=" + skuBasic + "," + "skuSaleAttributeBasicList=" + skuSaleAttributeBasicList + "}";
    }
}
