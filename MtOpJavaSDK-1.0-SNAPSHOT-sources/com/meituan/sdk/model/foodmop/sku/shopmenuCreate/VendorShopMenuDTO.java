package com.meituan.sdk.model.foodmop.sku.shopmenuCreate;

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
    * <p data-diff-id="ct-diff-id-b0b37f43-b0d5-4cf8-b4cd-8e9dc9067ecc"><span style="color: ">门店前台类目列表</span></p><p data-diff-id="ct-diff-id-70e3bf09-ab33-44ea-bcfe-77fb5c9ee196"><span style="color: ">最多 50 个</span></p>
    */
    @NotEmpty(message = "vendorSellerCategoryList不能为空")
    @SerializedName("vendorSellerCategoryList")
    private List<VendorSellerCategoryDTO> vendorSellerCategoryList;
    /**
    * <p data-diff-id="ct-diff-id-45c868a1-6997-43bc-bc0b-58a93ade5012">是否更新商品的门店上下架状态</p><p data-diff-id="ct-diff-id-3ad3da6c-a5a5-4f4b-bcb9-e60352bcb4ee">默认为true</p>
    */
    @SerializedName("updateShelfStatus")
    private Boolean updateShelfStatus;

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
    public Boolean getUpdateShelfStatus() {
        return updateShelfStatus;
    }
    public void setUpdateShelfStatus(Boolean updateShelfStatus) {
        this.updateShelfStatus = updateShelfStatus;
    }




    @Override
    public String toString() {
        return "VendorShopMenuDTO{" + "vendorShopId=" + vendorShopId + "," + "vendorSellerCategoryList=" + vendorSellerCategoryList + "," + "updateShelfStatus=" + updateShelfStatus + "}";
    }
}
