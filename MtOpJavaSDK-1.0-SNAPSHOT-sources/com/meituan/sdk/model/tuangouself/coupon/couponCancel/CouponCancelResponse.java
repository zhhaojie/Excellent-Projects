package com.meituan.sdk.model.tuangouself.coupon.couponCancel;

import com.google.gson.annotations.SerializedName;

/**
* 撤销验券
* This file was automatically generated.
*/
public class CouponCancelResponse {
    /**
    * 撤销验券结果
    */
    @SerializedName("result")
    private Boolean result;

    public Boolean getResult() {
        return result;
    }
    public void setResult(Boolean result) {
        this.result = result;
    }




    @Override
    public String toString() {
        return "CouponCancelResponse{" + "result=" + result + "}";
    }
}
