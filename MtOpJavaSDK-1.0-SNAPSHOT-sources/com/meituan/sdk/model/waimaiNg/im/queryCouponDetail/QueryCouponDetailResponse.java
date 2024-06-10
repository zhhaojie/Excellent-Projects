package com.meituan.sdk.model.waimaiNg.im.queryCouponDetail;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询发券的活动效果
* This file was automatically generated.
*/
public class QueryCouponDetailResponse {
    /**
    * 发送成功数量
    */
    @SerializedName("sendNum")
    private Integer sendNum;
    /**
    * 已使用
    */
    @SerializedName("useNum")
    private Integer useNum;
    /**
    * 未使用的
    */
    @SerializedName("unUseNum")
    private Integer unUseNum;
    /**
    * 已过期的数量
    */
    @SerializedName("expireNum")
    private Integer expireNum;
    /**
    * 已使用用户列表
    */
    @SerializedName("used")
    private List<Long> used;
    /**
    * 未使用用户列表
    */
    @SerializedName("unUsed")
    private List<Long> unUsed;
    /**
    * 已过期用户列表
    */
    @SerializedName("expire")
    private List<Long> expire;

    public Integer getSendNum() {
        return sendNum;
    }
    public void setSendNum(Integer sendNum) {
        this.sendNum = sendNum;
    }
    public Integer getUseNum() {
        return useNum;
    }
    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }
    public Integer getUnUseNum() {
        return unUseNum;
    }
    public void setUnUseNum(Integer unUseNum) {
        this.unUseNum = unUseNum;
    }
    public Integer getExpireNum() {
        return expireNum;
    }
    public void setExpireNum(Integer expireNum) {
        this.expireNum = expireNum;
    }
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




    @Override
    public String toString() {
        return "QueryCouponDetailResponse{" + "sendNum=" + sendNum + "," + "useNum=" + useNum + "," + "unUseNum=" + unUseNum + "," + "expireNum=" + expireNum + "," + "used=" + used + "," + "unUsed=" + unUsed + "," + "expire=" + expire + "}";
    }
}
