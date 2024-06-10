package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderQuery;

import com.google.gson.annotations.SerializedName;

/**
* 退款详情
* This file was automatically generated.
*/
public class RefundInfo {
    /**
    * 退款成功时间
    */
    @SerializedName("refundSuccessTime")
    private Long refundSuccessTime;
    /**
    * 退款原因
    */
    @SerializedName("refundReason")
    private String refundReason;
    /**
    * 操作者IP
    */
    @SerializedName("operatorIp")
    private String operatorIp;
    /**
    * 操作者
    */
    @SerializedName("operator")
    private String operator;
    /**
    * 退款来源
    */
    @SerializedName("platformSource")
    private Long platformSource;

    public Long getRefundSuccessTime() {
        return refundSuccessTime;
    }
    public void setRefundSuccessTime(Long refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
    }
    public String getRefundReason() {
        return refundReason;
    }
    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }
    public String getOperatorIp() {
        return operatorIp;
    }
    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp;
    }
    public String getOperator() {
        return operator;
    }
    public void setOperator(String operator) {
        this.operator = operator;
    }
    public Long getPlatformSource() {
        return platformSource;
    }
    public void setPlatformSource(Long platformSource) {
        this.platformSource = platformSource;
    }




    @Override
    public String toString() {
        return "RefundInfo{" + "refundSuccessTime=" + refundSuccessTime + "," + "refundReason=" + refundReason + "," + "operatorIp=" + operatorIp + "," + "operator=" + operator + "," + "platformSource=" + platformSource + "}";
    }
}
