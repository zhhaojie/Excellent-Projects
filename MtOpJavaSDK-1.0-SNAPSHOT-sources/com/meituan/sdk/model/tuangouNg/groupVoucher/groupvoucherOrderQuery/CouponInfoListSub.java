package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderQuery;

import com.google.gson.annotations.SerializedName;

/**
* 优惠详情
* This file was automatically generated.
*/
public class CouponInfoListSub {
    @SerializedName("CouponInfoDTO")
    private CouponInfoDTO couponInfoDTO;

    public CouponInfoDTO getCouponInfoDTO() {
        return couponInfoDTO;
    }
    public void setCouponInfoDTO(CouponInfoDTO couponInfoDTO) {
        this.couponInfoDTO = couponInfoDTO;
    }




    @Override
    public String toString() {
        return "CouponInfoListSub{" + "couponInfoDTO=" + couponInfoDTO + "}";
    }
}
