package com.meituan.sdk.model.dcps.print.updatePrinterStatus;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class ResponseResult {
    /**
    * 200
    */
    @SerializedName("code")
    private Integer code;
    /**
    * 成功
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
        return "ResponseResult{" + "code=" + code + "," + "msg=" + msg + "}";
    }
}
