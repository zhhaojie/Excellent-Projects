package com.meituan.sdk.model.waimaiNg.order.orderQueryByDaySeq;

import com.google.gson.annotations.SerializedName;

/**
* 口袋打包费明细
* This file was automatically generated.
*/
public class PackageBagCartDetail {
    /**
    * 口袋id
    */
    @SerializedName("cart_id")
    private Integer cartId;
    /**
    * 原打包费
    */
    @SerializedName("original_package_bag_fee")
    private Double originalPackageBagFee;

    public Integer getCartId() {
        return cartId;
    }
    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }
    public Double getOriginalPackageBagFee() {
        return originalPackageBagFee;
    }
    public void setOriginalPackageBagFee(Double originalPackageBagFee) {
        this.originalPackageBagFee = originalPackageBagFee;
    }




    @Override
    public String toString() {
        return "PackageBagCartDetail{" + "cartId=" + cartId + "," + "originalPackageBagFee=" + originalPackageBagFee + "}";
    }
}
