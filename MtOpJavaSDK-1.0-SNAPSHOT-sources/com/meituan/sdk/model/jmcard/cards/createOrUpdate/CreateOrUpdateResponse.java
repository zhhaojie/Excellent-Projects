package com.meituan.sdk.model.jmcard.cards.createOrUpdate;

import com.google.gson.annotations.SerializedName;

/**
* 创建/更新会员卡模板数据
* This file was automatically generated.
*/
public class CreateOrUpdateResponse {
    /**
    * 业务状态码
    */
    @SerializedName("status")
    private String status;
    /**
    * 业务发生异常时的描述信息
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
        return "CreateOrUpdateResponse{" + "status=" + status + "," + "errMsg=" + errMsg + "}";
    }
}
