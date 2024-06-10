package com.meituan.sdk.model.wmoperNg.waimaiad.adUpdatePlanStatus;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 修改广告投放计划状态（不能新建）
* This file was automatically generated.
*/
public class AdUpdatePlanStatusResponse {
    @NotNull(message = "success不能为空")
    @SerializedName("success")
    private Boolean success;
    @NotBlank(message = "code不能为空")
    @SerializedName("code")
    private String code;
    @NotBlank(message = "message不能为空")
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
        return "AdUpdatePlanStatusResponse{" + "success=" + success + "," + "code=" + code + "," + "message=" + message + "}";
    }
}
