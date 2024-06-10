package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderRefund;

import com.google.gson.annotations.SerializedName;

/**
* 代金券买单申请退款
* This file was automatically generated.
*/
public class GroupvoucherOrderRefundResponse {
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
        return "GroupvoucherOrderRefundResponse{" + "code=" + code + "," + "data=" + data + "," + "success=" + success + "," + "message=" + message + "}";
    }
}
