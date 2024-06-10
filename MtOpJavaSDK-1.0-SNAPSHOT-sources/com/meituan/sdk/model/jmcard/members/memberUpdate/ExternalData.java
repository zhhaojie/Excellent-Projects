package com.meituan.sdk.model.jmcard.members.memberUpdate;

import com.google.gson.annotations.SerializedName;

/**
* <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员卡更新内容</font></span></p>
* This file was automatically generated.
*/
public class ExternalData {
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">商户外部会员卡卡号</font></span></p>
    */
    @SerializedName("externalCardNo")
    private String externalCardNo;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）</font></span></p>
    */
    @SerializedName("point")
    private String point;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">资金卡余额，单位：元，精确到小数点后两位</font></span></p>
    */
    @SerializedName("balance")
    private String balance;
    /**
    * <p><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">优惠券建议展示X张</font></span></p>
    */
    @SerializedName("coupon")
    private String coupon;

    public String getExternalCardNo() {
        return externalCardNo;
    }
    public void setExternalCardNo(String externalCardNo) {
        this.externalCardNo = externalCardNo;
    }
    public String getPoint() {
        return point;
    }
    public void setPoint(String point) {
        this.point = point;
    }
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    public String getCoupon() {
        return coupon;
    }
    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }




    @Override
    public String toString() {
        return "ExternalData{" + "externalCardNo=" + externalCardNo + "," + "point=" + point + "," + "balance=" + balance + "," + "coupon=" + coupon + "}";
    }
}
