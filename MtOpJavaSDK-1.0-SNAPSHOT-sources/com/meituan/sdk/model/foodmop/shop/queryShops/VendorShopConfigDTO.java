package com.meituan.sdk.model.foodmop.shop.queryShops;

import com.google.gson.annotations.SerializedName;

/**
* 门店详细配置
* This file was automatically generated.
*/
public class VendorShopConfigDTO {
    /**
    * 预约配置
    */
    @SerializedName("reserveConfig")
    private VendorReserveConfigDTO reserveConfig;
    /**
    * 服务配置
    */
    @SerializedName("serviceConfig")
    private VendorServiceConfigDTO serviceConfig;
    /**
    * 业务配置
    */
    @SerializedName("bizConfig")
    private VendorBizConfigDTO bizConfig;

    public VendorReserveConfigDTO getReserveConfig() {
        return reserveConfig;
    }
    public void setReserveConfig(VendorReserveConfigDTO reserveConfig) {
        this.reserveConfig = reserveConfig;
    }
    public VendorServiceConfigDTO getServiceConfig() {
        return serviceConfig;
    }
    public void setServiceConfig(VendorServiceConfigDTO serviceConfig) {
        this.serviceConfig = serviceConfig;
    }
    public VendorBizConfigDTO getBizConfig() {
        return bizConfig;
    }
    public void setBizConfig(VendorBizConfigDTO bizConfig) {
        this.bizConfig = bizConfig;
    }




    @Override
    public String toString() {
        return "VendorShopConfigDTO{" + "reserveConfig=" + reserveConfig + "," + "serviceConfig=" + serviceConfig + "," + "bizConfig=" + bizConfig + "}";
    }
}
