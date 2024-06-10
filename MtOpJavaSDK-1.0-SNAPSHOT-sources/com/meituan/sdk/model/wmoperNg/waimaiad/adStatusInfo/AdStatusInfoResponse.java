package com.meituan.sdk.model.wmoperNg.waimaiad.adStatusInfo;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 获取广告计划状态，包括是否开启、预算、出价
* This file was automatically generated.
*/
public class AdStatusInfoResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "channel不能为空")
    @SerializedName("channel")
    private Long channel;
    @NotNull(message = "status不能为空")
    @SerializedName("status")
    private Long status;
    @NotNull(message = "budget不能为空")
    @SerializedName("budget")
    private Long budget;
    @NotNull(message = "bid不能为空")
    @SerializedName("bid")
    private Long bid;
    @NotBlank(message = "budgetUsed不能为空")
    @SerializedName("budgetUsed")
    private String budgetUsed;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public Long getChannel() {
        return channel;
    }
    public void setChannel(Long channel) {
        this.channel = channel;
    }
    public Long getStatus() {
        return status;
    }
    public void setStatus(Long status) {
        this.status = status;
    }
    public Long getBudget() {
        return budget;
    }
    public void setBudget(Long budget) {
        this.budget = budget;
    }
    public Long getBid() {
        return bid;
    }
    public void setBid(Long bid) {
        this.bid = bid;
    }
    public String getBudgetUsed() {
        return budgetUsed;
    }
    public void setBudgetUsed(String budgetUsed) {
        this.budgetUsed = budgetUsed;
    }




    @Override
    public String toString() {
        return "AdStatusInfoResponse{" + "result=" + result + "," + "channel=" + channel + "," + "status=" + status + "," + "budget=" + budget + "," + "bid=" + bid + "," + "budgetUsed=" + budgetUsed + "}";
    }
}
