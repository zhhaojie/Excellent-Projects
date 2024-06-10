package com.meituan.sdk.model.wmoperNg.waimaiad.poipeerAdEffectdata;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 竞价推广-商圈与门店效果数据-新客进店
* This file was automatically generated.
*/
public class PoipeerAdEffectdataResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotEmpty(message = "newUserClickRate不能为空")
    @SerializedName("newUserClickRate")
    private List<NewUserClickRate> newUserClickRate;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public List<NewUserClickRate> getNewUserClickRate() {
        return newUserClickRate;
    }
    public void setNewUserClickRate(List<NewUserClickRate> newUserClickRate) {
        this.newUserClickRate = newUserClickRate;
    }




    @Override
    public String toString() {
        return "PoipeerAdEffectdataResponse{" + "result=" + result + "," + "newUserClickRate=" + newUserClickRate + "}";
    }
}
