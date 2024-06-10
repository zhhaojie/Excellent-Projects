package com.meituan.sdk.model.foodmop.sku.shopmenuCreatespecial;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* <p data-diff-id="ct-diff-id-651935d1-f9d7-4ba6-8f36-fc3f0cbd46ec">门店菜谱</p>
* This file was automatically generated.
*/
public class VendorShopMenuDTO {
    /**
    * <p data-diff-id="ct-diff-id-767412ea-98b4-4d63-b385-20f683d78d01">门店Id</p>
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-76bdc275-bbf8-4fef-9a10-c8a38ced5938"><span style="color: ">门店前台类目列表</span></p><p data-diff-id="ct-diff-id-2fc04a20-19cf-4c67-b6c2-f67202d09d25"><span style="color: ">最多 50 个</span></p>
    */
    @NotEmpty(message = "vendorSellerCategoryList不能为空")
    @SerializedName("vendorSellerCategoryList")
    private List<VendorSellerCategoryDTO> vendorSellerCategoryList;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public List<VendorSellerCategoryDTO> getVendorSellerCategoryList() {
        return vendorSellerCategoryList;
    }
    public void setVendorSellerCategoryList(List<VendorSellerCategoryDTO> vendorSellerCategoryList) {
        this.vendorSellerCategoryList = vendorSellerCategoryList;
    }




    @Override
    public String toString() {
        return "VendorShopMenuDTO{" + "vendorShopId=" + vendorShopId + "," + "vendorSellerCategoryList=" + vendorSellerCategoryList + "}";
    }
}
