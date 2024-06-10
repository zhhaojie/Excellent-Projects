package com.meituan.sdk.model.wmoperNg.waimaiad.decrypt;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 针对加密字段解密
* This file was automatically generated.
*/
public class DecryptResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotBlank(message = "value不能为空")
    @SerializedName("value")
    private String value;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }




    @Override
    public String toString() {
        return "DecryptResponse{" + "result=" + result + "," + "value=" + value + "}";
    }
}
