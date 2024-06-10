package com.meituan.sdk.model.foodmop.sku.create;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-0ee2d1fc-af5e-4785-8a1f-04cdc0723fb0"><span style="color: rgba(0, 0, 0, 0.65)">商品 SKU 列表</span></p>
* This file was automatically generated.
*/
public class VendorSkuDTO {
    /**
    * <p data-diff-id="ct-diff-id-5970d370-6a18-421b-aa3a-0663e961c227">商品 SKU 基本信息</p>
    */
    @NotNull(message = "skuBasic不能为空")
    @SerializedName("skuBasic")
    private SkuBasicDTO skuBasic;
    /**
    * <p data-diff-id="ct-diff-id-96a8d3d6-6468-4d90-b9fc-4b571206f9df">组成该 SKU 的售卖属性列表</p>
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
