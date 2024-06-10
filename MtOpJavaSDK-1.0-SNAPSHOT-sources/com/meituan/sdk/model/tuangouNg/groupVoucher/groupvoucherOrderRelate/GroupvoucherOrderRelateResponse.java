package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderRelate;

import com.google.gson.annotations.SerializedName;

/**
* 代金券买单信息与厂商收银订单（或者收银键位）关联
* This file was automatically generated.
*/
public class GroupvoucherOrderRelateResponse {
    @SerializedName("code")
    private String code;
    @SerializedName("data")
    private Data data;
    @SerializedName("success")
    private Boolean success;
    @SerializedName("message")
    private String message;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }
    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }




    @Override
    public String toString() {
        return "GroupvoucherOrderRelateResponse{" + "code=" + code + "," + "data=" + data + "," + "success=" + success + "," + "message=" + message + "}";
    }
}
