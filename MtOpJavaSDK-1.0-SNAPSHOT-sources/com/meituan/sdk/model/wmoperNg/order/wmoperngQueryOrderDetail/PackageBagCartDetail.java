package com.meituan.sdk.model.wmoperNg.order.wmoperngQueryOrderDetail;

import com.google.gson.annotations.SerializedName;

/**
* 口袋打包费明细
* This file was automatically generated.
*/
public class PackageBagCartDetail {
    /**
    * 口袋Id
    */
    @SerializedName("cart_id")
    private Integer cartId;
    /**
    * 原打包费
    */
    @SerializedName("original_package_bag_fee")
    private Double originalPackageBagFee;
    /**
    * 活动打包费
    */
    @SerializedName("activity_package_bag_fee")
    private Double activityPackageBagFee;

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
    public Double getActivityPackageBagFee() {
        return activityPackageBagFee;
    }
    public void setActivityPackageBagFee(Double activityPackageBagFee) {
        this.activityPackageBagFee = activityPackageBagFee;
    }




    @Override
    public String toString() {
        return "PackageBagCartDetail{" + "cartId=" + cartId + "," + "originalPackageBagFee=" + originalPackageBagFee + "," + "activityPackageBagFee=" + activityPackageBagFee + "}";
    }
}
