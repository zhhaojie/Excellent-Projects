package com.meituan.sdk.model.tuangouself.coupon.couponQuery;

import com.google.gson.annotations.SerializedName;

/**
* 券使用规则
* This file was automatically generated.
*/
public class UserRule {
    /**
    * 是否可以和其他优惠同享
    */
    @SerializedName("canShare")
    private CanShare canShare;
    /**
    * 美团券使用限制
    */
    @SerializedName("useLimit")
    private UseLimit useLimit;
    /**
    * 代金券可用张数，非代金券:null，不可叠加:1，可叠加不限制:-1，可叠加限制:n
    */
    @SerializedName("voucherOverlayNum")
    private Integer voucherOverlayNum;

    public CanShare getCanShare() {
        return canShare;
    }
    public void setCanShare(CanShare canShare) {
        this.canShare = canShare;
    }
    public UseLimit getUseLimit() {
        return useLimit;
    }
    public void setUseLimit(UseLimit useLimit) {
        this.useLimit = useLimit;
    }
    public Integer getVoucherOverlayNum() {
        return voucherOverlayNum;
    }
    public void setVoucherOverlayNum(Integer voucherOverlayNum) {
        this.voucherOverlayNum = voucherOverlayNum;
    }




    @Override
    public String toString() {
        return "UserRule{" + "canShare=" + canShare + "," + "useLimit=" + useLimit + "," + "voucherOverlayNum=" + voucherOverlayNum + "}";
    }
}
