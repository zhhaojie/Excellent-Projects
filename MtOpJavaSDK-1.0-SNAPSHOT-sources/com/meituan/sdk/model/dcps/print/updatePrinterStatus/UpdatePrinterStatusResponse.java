package com.meituan.sdk.model.dcps.print.updatePrinterStatus;

import com.google.gson.annotations.SerializedName;

/**
* 4.1.1.三方云打印机状态（绑定解绑）回传
* This file was automatically generated.
*/
public class UpdatePrinterStatusResponse {
    @SerializedName("resp")
    private ResponseResult resp;

    public ResponseResult getResp() {
        return resp;
    }
    public void setResp(ResponseResult resp) {
        this.resp = resp;
    }




    @Override
    public String toString() {
        return "UpdatePrinterStatusResponse{" + "resp=" + resp + "}";
    }
}
