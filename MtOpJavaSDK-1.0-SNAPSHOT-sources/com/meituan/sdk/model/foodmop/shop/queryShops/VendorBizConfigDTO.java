package com.meituan.sdk.model.foodmop.shop.queryShops;

import com.google.gson.annotations.SerializedName;

/**
* 业务配置
* This file was automatically generated.
*/
public class VendorBizConfigDTO {
    /**
    * 门店业务开通状态，参数值范例：  {\"timestamp\":1675241667962,\"turnOn\":true}
    */
    @SerializedName("vendorBizOpenStatus")
    private String vendorBizOpenStatus;
    /**
    * 门店类型Code值
    */
    @SerializedName("shopType")
    private String shopType;
    /**
    * 是否交通枢纽，默认false，暂无意义。
    */
    @SerializedName("transportationHub")
    private String transportationHub;

    public String getVendorBizOpenStatus() {
        return vendorBizOpenStatus;
    }
    public void setVendorBizOpenStatus(String vendorBizOpenStatus) {
        this.vendorBizOpenStatus = vendorBizOpenStatus;
    }
    public String getShopType() {
        return shopType;
    }
    public void setShopType(String shopType) {
        this.shopType = shopType;
    }
    public String getTransportationHub() {
        return transportationHub;
    }
    public void setTransportationHub(String transportationHub) {
        this.transportationHub = transportationHub;
    }




    @Override
    public String toString() {
        return "VendorBizConfigDTO{" + "vendorBizOpenStatus=" + vendorBizOpenStatus + "," + "shopType=" + shopType + "," + "transportationHub=" + transportationHub + "}";
    }
}
