package com.meituan.sdk.model.tuangouself.coupon.couponConsume;

import com.google.gson.annotations.SerializedName;

/**
* 执行验券
* This file was automatically generated.
*/
public class CouponConsumeResponse {
    /**
    * 验券结果
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
        return "CouponConsumeResponse{" + "result=" + result + "}";
    }
}
