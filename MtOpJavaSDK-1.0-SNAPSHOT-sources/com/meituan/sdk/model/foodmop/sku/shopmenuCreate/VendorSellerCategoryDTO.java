package com.meituan.sdk.model.foodmop.sku.shopmenuCreate;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* <p data-diff-id="ct-diff-id-b0b37f43-b0d5-4cf8-b4cd-8e9dc9067ecc"><span style="color: ">门店前台类目列表</span></p><p data-diff-id="ct-diff-id-70e3bf09-ab33-44ea-bcfe-77fb5c9ee196"><span style="color: ">最多 50 个</span></p>
* This file was automatically generated.
*/
public class VendorSellerCategoryDTO {
    /**
    * <p data-diff-id="ct-diff-id-7dc275cf-05b6-4b32-89a5-e0a191a8c316">前台类目基本信息</p>
    */
    @NotNull(message = "sellerCategoryBasic不能为空")
    @SerializedName("sellerCategoryBasic")
    private SellerCategoryBasicDTO sellerCategoryBasic;
    /**
    * <p data-diff-id="ct-diff-id-2c2383e3-d2e3-47c7-98bb-3d88fc49fcd7">商品 SPU 列表，必存在于商品池中</p><p data-diff-id="ct-diff-id-f488cf4f-4a7b-4536-a225-734289bef438">SellerCategoryBasicDTO<strong>.</strong>level == 2 时必填</p><p data-diff-id="ct-diff-id-1cd9d538-0bef-45a9-bc2a-aeb5bc10ec03">最多 50 个</p>
    */
    @SerializedName("vendorShopProductSimpleList")
    private List<VendorShopProductSimpleDTO> vendorShopProductSimpleList;

    public SellerCategoryBasicDTO getSellerCategoryBasic() {
        return sellerCategoryBasic;
    }
    public void setSellerCategoryBasic(SellerCategoryBasicDTO sellerCategoryBasic) {
        this.sellerCategoryBasic = sellerCategoryBasic;
    }
    public List<VendorShopProductSimpleDTO> getVendorShopProductSimpleList() {
        return vendorShopProductSimpleList;
    }
    public void setVendorShopProductSimpleList(List<VendorShopProductSimpleDTO> vendorShopProductSimpleList) {
        this.vendorShopProductSimpleList = vendorShopProductSimpleList;
    }




    @Override
    public String toString() {
        return "VendorSellerCategoryDTO{" + "sellerCategoryBasic=" + sellerCategoryBasic + "," + "vendorShopProductSimpleList=" + vendorShopProductSimpleList + "}";
    }
}
