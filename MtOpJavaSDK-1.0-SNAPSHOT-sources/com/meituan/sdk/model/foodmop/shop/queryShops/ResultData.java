package com.meituan.sdk.model.foodmop.shop.queryShops;

import com.google.gson.annotations.SerializedName;

/**
* 厂商门店配置信息列表，特殊说明：假设查询10个ID，9个能查到，List.size()==10, 返回9条VendorShopConfigDTO，1条返回failMsg
* This file was automatically generated.
*/
public class ResultData {
    /**
    * 厂商门店ID
    */
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * 门店详细配置
    */
    @SerializedName("shopConfig")
    private VendorShopConfigDTO shopConfig;
    /**
    * 门店查询失败，返回错误原因
    */
    @SerializedName("failMsg")
    private String failMsg;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public VendorShopConfigDTO getShopConfig() {
        return shopConfig;
    }
    public void setShopConfig(VendorShopConfigDTO shopConfig) {
        this.shopConfig = shopConfig;
    }
    public String getFailMsg() {
        return failMsg;
    }
    public void setFailMsg(String failMsg) {
        this.failMsg = failMsg;
    }




    @Override
    public String toString() {
        return "ResultData{" + "vendorShopId=" + vendorShopId + "," + "shopConfig=" + shopConfig + "," + "failMsg=" + failMsg + "}";
    }
}
