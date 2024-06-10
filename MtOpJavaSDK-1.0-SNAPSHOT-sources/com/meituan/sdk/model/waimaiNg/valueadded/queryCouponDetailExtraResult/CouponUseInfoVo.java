package com.meituan.sdk.model.waimaiNg.valueadded.queryCouponDetailExtraResult;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class CouponUseInfoVo {
    /**
    * 	 用户id
    */
    @SerializedName("userId")
    private Long userId;
    /**
    * 	 订单号
    */
    @SerializedName("orderViewId")
    private Long orderViewId;
    /**
    * 使用时间
    */
    @SerializedName("usedTime")
    private Long usedTime;

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public Long getOrderViewId() {
        return orderViewId;
    }
    public void setOrderViewId(Long orderViewId) {
        this.orderViewId = orderViewId;
    }
    public Long getUsedTime() {
        return usedTime;
    }
    public void setUsedTime(Long usedTime) {
        this.usedTime = usedTime;
    }




    @Override
    public String toString() {
        return "CouponUseInfoVo{" + "userId=" + userId + "," + "orderViewId=" + orderViewId + "," + "usedTime=" + usedTime + "}";
    }
}
