package com.meituan.sdk.model.wmoperNg.waimaiad.authAntiForceTry;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 增值平台接口校验
* This file was automatically generated.
*/
public class AuthAntiForceTryResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Long status;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public Long getStatus() {
        return status;
    }
    public void setStatus(Long status) {
        this.status = status;
    }




    @Override
    public String toString() {
        return "AuthAntiForceTryResponse{" + "result=" + result + "," + "status=" + status + "}";
    }
}
