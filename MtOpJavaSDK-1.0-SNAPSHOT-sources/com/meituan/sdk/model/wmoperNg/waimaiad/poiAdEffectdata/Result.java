package com.meituan.sdk.model.wmoperNg.waimaiad.poiAdEffectdata;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Result {
    @SerializedName("success")
    private Boolean success;
    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;

    public Boolean getSuccess() {
        return success;
    }
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }




    @Override
    public String toString() {
        return "Result{" + "success=" + success + "," + "code=" + code + "," + "message=" + message + "}";
    }
}
