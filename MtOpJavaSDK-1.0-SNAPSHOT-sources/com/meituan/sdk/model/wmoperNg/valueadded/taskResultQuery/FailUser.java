package com.meituan.sdk.model.wmoperNg.valueadded.taskResultQuery;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class FailUser {
    @SerializedName("userId")
    private Long userId;
    @SerializedName("reason")
    private String reason;

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }




    @Override
    public String toString() {
        return "FailUser{" + "userId=" + userId + "," + "reason=" + reason + "}";
    }
}
