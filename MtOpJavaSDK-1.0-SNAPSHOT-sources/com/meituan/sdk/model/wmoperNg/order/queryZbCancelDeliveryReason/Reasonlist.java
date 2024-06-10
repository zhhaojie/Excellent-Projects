package com.meituan.sdk.model.wmoperNg.order.queryZbCancelDeliveryReason;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class Reasonlist {
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
    /**
    * 预取消描述
    */
    @SerializedName("preCancelMsg")
    private String preCancelMsg;

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
    public String getPreCancelMsg() {
        return preCancelMsg;
    }
    public void setPreCancelMsg(String preCancelMsg) {
        this.preCancelMsg = preCancelMsg;
    }




    @Override
    public String toString() {
        return "Reasonlist{" + "code=" + code + "," + "content=" + content + "," + "preCancelCode=" + preCancelCode + "," + "preCancelMsg=" + preCancelMsg + "}";
    }
}
