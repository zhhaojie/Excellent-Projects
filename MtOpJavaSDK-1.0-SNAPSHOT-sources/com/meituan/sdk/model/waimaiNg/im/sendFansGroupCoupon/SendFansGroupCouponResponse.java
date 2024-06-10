package com.meituan.sdk.model.waimaiNg.im.sendFansGroupCoupon;

import com.google.gson.annotations.SerializedName;

/**
* 在粉丝群内主动建券并发券
* This file was automatically generated.
*/
public class SendFansGroupCouponResponse {
    /**
    * 券配置ID
    */
    @SerializedName("couponConfigId")
    private String couponConfigId;

    public String getCouponConfigId() {
        return couponConfigId;
    }
    public void setCouponConfigId(String couponConfigId) {
        this.couponConfigId = couponConfigId;
    }




    @Override
    public String toString() {
        return "SendFansGroupCouponResponse{" + "couponConfigId=" + couponConfigId + "}";
    }
}
