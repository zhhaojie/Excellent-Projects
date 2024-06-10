package com.meituan.sdk.model.foodmop.sku.queryShopMenu;

import java.util.List;
import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotEmpty;

/**
* 查询门店菜谱
* This file was automatically generated.
*/
public class QueryShopMenuResponse {
    /**
    * 门店Id
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * 门店前台类目列表
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
        return "QueryShopMenuResponse{" + "vendorShopId=" + vendorShopId + "," + "vendorSellerCategoryList=" + vendorSellerCategoryList + "}";
    }
}
