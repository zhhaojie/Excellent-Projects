package com.meituan.sdk.model.waimaiNg.order.queryZbCancelDeliveryReason;

import com.google.gson.annotations.SerializedName;

/**
* 原因列表
* This file was automatically generated.
*/
public class ReasonList {
    /**
    * 原因代码
    */
    @SerializedName("code")
    private Integer code;
    /**
    * 具体原因
    */
    @SerializedName("content")
    private String content;
    /**
    * 预取消code
    */
    @SerializedName("preCancelCode")
    private String preCancelCode;

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getPreCancelCode() {
        return preCancelCode;
    }
    public void setPreCancelCode(String preCancelCode) {
        this.preCancelCode = preCancelCode;
    }




    @Override
    public String toString() {
        return "ReasonList{" + "code=" + code + "," + "content=" + content + "," + "preCancelCode=" + preCancelCode + "}";
    }
}
