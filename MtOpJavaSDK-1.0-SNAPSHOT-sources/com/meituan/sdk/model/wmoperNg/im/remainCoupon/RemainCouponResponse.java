package com.meituan.sdk.model.wmoperNg.im.remainCoupon;

import com.google.gson.annotations.SerializedName;

/**
* 查询门店剩余发券数
* This file was automatically generated.
*/
public class RemainCouponResponse {
    /**
    * 门店当月的剩余发券数量
    */
    @SerializedName("remainCouponNum")
    private Integer remainCouponNum;

    public Integer getRemainCouponNum() {
        return remainCouponNum;
    }
    public void setRemainCouponNum(Integer remainCouponNum) {
        this.remainCouponNum = remainCouponNum;
    }




    @Override
    public String toString() {
        return "RemainCouponResponse{" + "remainCouponNum=" + remainCouponNum + "}";
    }
}
