package com.meituan.sdk.model.tuangouNg.coupon.couponCancel;

import com.google.gson.annotations.SerializedName;

/**
* 撤销验券
* This file was automatically generated.
*/
public class CouponCancelResponse {
    /**
    * 操作状态0表示成功，其余表示失败
    */
    @SerializedName("result")
    private Integer result;
    /**
    * 撤销结果描述信息
    */
    @SerializedName("message")
    private String message;

    public Integer getResult() {
        return result;
    }
    public void setResult(Integer result) {
        this.result = result;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }




    @Override
    public String toString() {
        return "CouponCancelResponse{" + "result=" + result + "," + "message=" + message + "}";
    }
}
