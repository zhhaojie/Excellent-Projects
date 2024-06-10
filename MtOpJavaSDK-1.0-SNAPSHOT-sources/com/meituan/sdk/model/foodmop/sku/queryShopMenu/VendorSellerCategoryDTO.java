package com.meituan.sdk.model.foodmop.sku.queryShopMenu;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 门店前台类目列表
* This file was automatically generated.
*/
public class VendorSellerCategoryDTO {
    /**
    * 前台类目基本信息
    */
    @NotNull(message = "sellerCategoryBasic不能为空")
    @SerializedName("sellerCategoryBasic")
    private SellerCategoryBasicDTO sellerCategoryBasic;
    /**
    * 商品 SPU 列表，必存在于商品池中
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
