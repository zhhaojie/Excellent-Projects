package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherShopManage;

import com.google.gson.annotations.SerializedName;

/**
* 开通/关闭代金券买单
* This file was automatically generated.
*/
public class GroupvoucherShopManageResponse {
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
        return "GroupvoucherShopManageResponse{" + "code=" + code + "," + "data=" + data + "," + "success=" + success + "," + "message=" + message + "}";
    }
}
