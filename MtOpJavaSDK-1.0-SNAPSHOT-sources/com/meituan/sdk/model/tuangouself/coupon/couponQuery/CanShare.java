package com.meituan.sdk.model.tuangouself.coupon.couponQuery;

import com.google.gson.annotations.SerializedName;

/**
* 是否可以和其他优惠同享
* This file was automatically generated.
*/
public class CanShare {
    /**
    * 是否可同享优惠
    */
    @SerializedName("canShare")
    private Boolean canShare;
    /**
    * 能享受的优惠限制
    */
    @SerializedName("limitPromotion")
    private String limitPromotion;

    public Boolean getCanShare() {
        return canShare;
    }
    public void setCanShare(Boolean canShare) {
        this.canShare = canShare;
    }
    public String getLimitPromotion() {
        return limitPromotion;
    }
    public void setLimitPromotion(String limitPromotion) {
        this.limitPromotion = limitPromotion;
    }




    @Override
    public String toString() {
        return "CanShare{" + "canShare=" + canShare + "," + "limitPromotion=" + limitPromotion + "}";
    }
}
