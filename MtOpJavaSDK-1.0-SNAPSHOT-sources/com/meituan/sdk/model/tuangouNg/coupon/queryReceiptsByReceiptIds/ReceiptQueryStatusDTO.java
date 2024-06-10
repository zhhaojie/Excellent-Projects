package com.meituan.sdk.model.tuangouNg.coupon.queryReceiptsByReceiptIds;

import com.google.gson.annotations.SerializedName;

/**
* 团购券查询状态
* This file was automatically generated.
*/
public class ReceiptQueryStatusDTO {
    /**
    * 状态码
    */
    @SerializedName("code")
    private Integer code;
    /**
    * 状态描述
    */
    @SerializedName("msg")
    private String msg;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }




    @Override
    public String toString() {
        return "ReceiptQueryStatusDTO{" + "code=" + code + "," + "msg=" + msg + "}";
    }
}
