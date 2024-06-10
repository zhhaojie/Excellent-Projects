package com.meituan.sdk.model.wmoperNg.valueadded.queryCouponTotalResult;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 活动效果汇总查询接口
* This file was automatically generated.
*/
public class QueryCouponTotalResultResponse {
    @NotNull(message = "sendNum不能为空")
    @SerializedName("sendNum")
    private Long sendNum;
    @NotNull(message = "useNum不能为空")
    @SerializedName("useNum")
    private Long useNum;
    @NotNull(message = "unUseNum不能为空")
    @SerializedName("unUseNum")
    private Long unUseNum;
    @NotNull(message = "expireNum不能为空")
    @SerializedName("expireNum")
    private Long expireNum;

    public Long getSendNum() {
        return sendNum;
    }
    public void setSendNum(Long sendNum) {
        this.sendNum = sendNum;
    }
    public Long getUseNum() {
        return useNum;
    }
    public void setUseNum(Long useNum) {
        this.useNum = useNum;
    }
    public Long getUnUseNum() {
        return unUseNum;
    }
    public void setUnUseNum(Long unUseNum) {
        this.unUseNum = unUseNum;
    }
    public Long getExpireNum() {
        return expireNum;
    }
    public void setExpireNum(Long expireNum) {
        this.expireNum = expireNum;
    }




    @Override
    public String toString() {
        return "QueryCouponTotalResultResponse{" + "sendNum=" + sendNum + "," + "useNum=" + useNum + "," + "unUseNum=" + unUseNum + "," + "expireNum=" + expireNum + "}";
    }
}
