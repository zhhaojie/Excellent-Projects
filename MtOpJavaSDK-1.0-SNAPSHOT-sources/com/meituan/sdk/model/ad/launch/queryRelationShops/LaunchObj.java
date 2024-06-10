package com.meituan.sdk.model.ad.launch.queryRelationShops;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LaunchObj {
    /**
    * 门店名称
    */
    @SerializedName("shopName")
    private String shopName;
    /**
    * 门店id
    */
    @SerializedName("shopId")
    private Long shopId;
    /**
    * 门店uuid
    */
    @SerializedName("shopUuid")
    private String shopUuid;
    /**
    * 分店名称
    */
    @SerializedName("shopBranchName")
    private String shopBranchName;

    public String getShopName() {
        return shopName;
    }
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }
    public Long getShopId() {
        return shopId;
    }
    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
    public String getShopUuid() {
        return shopUuid;
    }
    public void setShopUuid(String shopUuid) {
        this.shopUuid = shopUuid;
    }
    public String getShopBranchName() {
        return shopBranchName;
    }
    public void setShopBranchName(String shopBranchName) {
        this.shopBranchName = shopBranchName;
    }




    @Override
    public String toString() {
        return "LaunchObj{" + "shopName=" + shopName + "," + "shopId=" + shopId + "," + "shopUuid=" + shopUuid + "," + "shopBranchName=" + shopBranchName + "}";
    }
}
