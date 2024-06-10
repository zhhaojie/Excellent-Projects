package com.meituan.sdk.model.wmoperNg.waimaiad.adBalanceInfo;

import javax.validation.constraints.NotBlank;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 获取商家广告余额
* This file was automatically generated.
*/
public class AdBalanceInfoResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotBlank(message = "primaryBalance不能为空")
    @SerializedName("primaryBalance")
    private String primaryBalance;
    @NotBlank(message = "commonBalance不能为空")
    @SerializedName("commonBalance")
    private String commonBalance;
    @NotBlank(message = "debit不能为空")
    @SerializedName("debit")
    private String debit;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public String getPrimaryBalance() {
        return primaryBalance;
    }
    public void setPrimaryBalance(String primaryBalance) {
        this.primaryBalance = primaryBalance;
    }
    public String getCommonBalance() {
        return commonBalance;
    }
    public void setCommonBalance(String commonBalance) {
        this.commonBalance = commonBalance;
    }
    public String getDebit() {
        return debit;
    }
    public void setDebit(String debit) {
        this.debit = debit;
    }




    @Override
    public String toString() {
        return "AdBalanceInfoResponse{" + "result=" + result + "," + "primaryBalance=" + primaryBalance + "," + "commonBalance=" + commonBalance + "," + "debit=" + debit + "}";
    }
}
