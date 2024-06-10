package com.meituan.sdk.model.wmoperNg.waimaiad.adUpdatePlanBudget;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 修改广告投放计划预算
* This file was automatically generated.
*/
public class AdUpdatePlanBudgetResponse {
    @NotNull(message = "success不能为空")
    @SerializedName("success")
    private Boolean success;
    @NotBlank(message = "code不能为空")
    @SerializedName("code")
    private String code;

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




    @Override
    public String toString() {
        return "AdUpdatePlanBudgetResponse{" + "success=" + success + "," + "code=" + code + "}";
    }
}
