package com.meituan.sdk.model.foodmop.sku.queryVendorSpu;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询门店商品信息
* This file was automatically generated.
*/
public class QueryVendorSpuResponse {
    /**
    * 商品信息
    */
    @SerializedName("vendorSpu")
    private VendorSpuDTO vendorSpu;
    /**
    * 类目列表
    */
    @SerializedName("vendorSellerCategoryNameList")
    private List<String> vendorSellerCategoryNameList;
    /**
    * 商品门店上下架状态
    */
    @SerializedName("shelfStatus")
    private Integer shelfStatus;
    /**
    * SKU 库存
    */
    @SerializedName("vendorSkuStockList")
    private List<VendorSkuStockDTO> vendorSkuStockList;

    public VendorSpuDTO getVendorSpu() {
        return vendorSpu;
    }
    public void setVendorSpu(VendorSpuDTO vendorSpu) {
        this.vendorSpu = vendorSpu;
    }
    public List<String> getVendorSellerCategoryNameList() {
        return vendorSellerCategoryNameList;
    }
    public void setVendorSellerCategoryNameList(List<String> vendorSellerCategoryNameList) {
        this.vendorSellerCategoryNameList = vendorSellerCategoryNameList;
    }
    public Integer getShelfStatus() {
        return shelfStatus;
    }
    public void setShelfStatus(Integer shelfStatus) {
        this.shelfStatus = shelfStatus;
    }
    public List<VendorSkuStockDTO> getVendorSkuStockList() {
        return vendorSkuStockList;
    }
    public void setVendorSkuStockList(List<VendorSkuStockDTO> vendorSkuStockList) {
        this.vendorSkuStockList = vendorSkuStockList;
    }




    @Override
    public String toString() {
        return "QueryVendorSpuResponse{" + "vendorSpu=" + vendorSpu + "," + "vendorSellerCategoryNameList=" + vendorSellerCategoryNameList + "," + "shelfStatus=" + shelfStatus + "," + "vendorSkuStockList=" + vendorSkuStockList + "}";
    }
}
