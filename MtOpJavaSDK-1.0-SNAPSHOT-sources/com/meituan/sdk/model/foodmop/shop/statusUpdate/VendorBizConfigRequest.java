package com.meituan.sdk.model.foodmop.shop.statusUpdate;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 
* This file was automatically generated.
*/
public class VendorBizConfigRequest {
    /**
    * <p data-diff-id="ct-diff-id-abec6422-d3dc-4b11-a5be-f80bebf993f7">厂商门店ID</p>
    */
    @NotBlank(message = "vendorShopId不能为空")
    @SerializedName("vendorShopId")
    private String vendorShopId;
    /**
    * <p data-diff-id="ct-diff-id-b19b9841-f494-4b4c-af95-d8a3e58636b2">线上点业务开关，合同录入后，根据这个开关决定是否展示线上点入口<br>10: 开<br>20：关</p>
    */
    @NotNull(message = "vendorBizOpen不能为空")
    @SerializedName("vendorBizOpen")
    private Integer vendorBizOpen;
    /**
    * <p data-diff-id="ct-diff-id-4e0b32fa-8e34-4501-bfdc-e456aa53cb20">分店类型，品牌方自定义（默认是10-无含义），美团可用于区分C端门店样式展示的区分（具体有需求同美团PM沟通）</p>
    */
    @NotNull(message = "shopType不能为空")
    @SerializedName("shopType")
    private Integer shopType;

    public String getVendorShopId() {
        return vendorShopId;
    }
    public void setVendorShopId(String vendorShopId) {
        this.vendorShopId = vendorShopId;
    }
    public Integer getVendorBizOpen() {
        return vendorBizOpen;
    }
    public void setVendorBizOpen(Integer vendorBizOpen) {
        this.vendorBizOpen = vendorBizOpen;
    }
    public Integer getShopType() {
        return shopType;
    }
    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }




    @Override
    public String toString() {
        return "VendorBizConfigRequest{" + "vendorShopId=" + vendorShopId + "," + "vendorBizOpen=" + vendorBizOpen + "," + "shopType=" + shopType + "}";
    }
}
