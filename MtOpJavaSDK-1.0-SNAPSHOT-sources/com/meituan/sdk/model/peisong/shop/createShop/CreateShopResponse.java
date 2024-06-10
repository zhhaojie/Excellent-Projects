package com.meituan.sdk.model.peisong.shop.createShop;

import com.google.gson.annotations.SerializedName;

/**
* 创建配送门店
* This file was automatically generated.
*/
public class CreateShopResponse {
    /**
    * 取货门店id
    */
    @SerializedName("shop_id")
    private String shopId;
    /**
    * 状态码
    */
    @SerializedName("status")
    private Integer status;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "CreateShopResponse{" + "shopId=" + shopId + "," + "status=" + status + "}";
    }
}
