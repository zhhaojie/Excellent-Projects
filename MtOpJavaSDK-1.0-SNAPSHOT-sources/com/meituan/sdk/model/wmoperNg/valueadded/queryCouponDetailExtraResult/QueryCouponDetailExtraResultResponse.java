package com.meituan.sdk.model.wmoperNg.valueadded.queryCouponDetailExtraResult;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 精准营销-活动效果汇总查询接口（含券使用时间）
* This file was automatically generated.
*/
public class QueryCouponDetailExtraResultResponse {
    /**
    * 已使用券的用户列表
    */
    @SerializedName("used")
    private List<Long> used;
    /**
    * 未使用券的用户列表
    */
    @SerializedName("unUsed")
    private List<Long> unUsed;
    /**
    * 过期的券的用户列表
    */
    @SerializedName("expire")
    private List<Long> expire;
    @SerializedName("usedInfo")
    private List<CouponUseInfoVo> usedInfo;

    public List<Long> getUsed() {
        return used;
    }
    public void setUsed(List<Long> used) {
        this.used = used;
    }
    public List<Long> getUnUsed() {
        return unUsed;
    }
    public void setUnUsed(List<Long> unUsed) {
        this.unUsed = unUsed;
    }
    public List<Long> getExpire() {
        return expire;
    }
    public void setExpire(List<Long> expire) {
        this.expire = expire;
    }
    public List<CouponUseInfoVo> getUsedInfo() {
        return usedInfo;
    }
    public void setUsedInfo(List<CouponUseInfoVo> usedInfo) {
        this.usedInfo = usedInfo;
    }




    @Override
    public String toString() {
        return "QueryCouponDetailExtraResultResponse{" + "used=" + used + "," + "unUsed=" + unUsed + "," + "expire=" + expire + "," + "usedInfo=" + usedInfo + "}";
    }
}
