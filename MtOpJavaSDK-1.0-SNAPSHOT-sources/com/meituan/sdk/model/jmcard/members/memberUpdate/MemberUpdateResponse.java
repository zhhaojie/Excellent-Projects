package com.meituan.sdk.model.jmcard.members.memberUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 更新会员信息
* This file was automatically generated.
*/
public class MemberUpdateResponse {
    /**
    * 业务状态
    */
    @SerializedName("status")
    private String status;
    /**
    * 业务异常时的报错信息
    */
    @SerializedName("errMsg")
    private String errMsg;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }




    @Override
    public String toString() {
        return "MemberUpdateResponse{" + "status=" + status + "," + "errMsg=" + errMsg + "}";
    }
}
