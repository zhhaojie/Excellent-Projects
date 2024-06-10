package com.meituan.sdk.model.jmcard.members.memberQuery;

import com.google.gson.annotations.SerializedName;

/**
* 查询用户会员卡信息
* This file was automatically generated.
*/
public class MemberQueryResponse {
    /**
    * 业务状态
    */
    @SerializedName("status")
    private String status;
    @SerializedName("result")
    private CardResult result;
    /**
    * 业务异常时的描述消息
    */
    @SerializedName("errMsg")
    private String errMsg;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public CardResult getResult() {
        return result;
    }
    public void setResult(CardResult result) {
        this.result = result;
    }
    public String getErrMsg() {
        return errMsg;
    }
    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }




    @Override
    public String toString() {
        return "MemberQueryResponse{" + "status=" + status + "," + "result=" + result + "," + "errMsg=" + errMsg + "}";
    }
}
