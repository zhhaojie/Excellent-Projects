package com.meituan.sdk.model.tuangouNg.coupon.couponQueryLocalListByDate;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* ERP订单数组
* This file was automatically generated.
*/
public class EOrders {
    /**
    * couponCodes中券码个数
    */
    @SerializedName("count")
    private String count;
    /**
    * 券码数组
    */
    @SerializedName("couponCodes")
    private List<Long> couponCodes;
    /**
    * 验券时间
    */
    @SerializedName("couponUseTime")
    private String couponUseTime;
    /**
    * 项目名称
    */
    @SerializedName("dealTitle")
    private String dealTitle;
    /**
    * 第三方ERP订单号
    */
    @SerializedName("eOrderId")
    private String eOrderId;
    @NotNull(message = "isVerifyPay不能为空")
    @SerializedName("isVerifyPay")
    private Long isVerifyPay;

    public String getCount() {
        return count;
    }
    public void setCount(String count) {
        this.count = count;
    }
    public List<Long> getCouponCodes() {
        return couponCodes;
    }
    public void setCouponCodes(List<Long> couponCodes) {
        this.couponCodes = couponCodes;
    }
    public String getCouponUseTime() {
        return couponUseTime;
    }
    public void setCouponUseTime(String couponUseTime) {
        this.couponUseTime = couponUseTime;
    }
    public String getDealTitle() {
        return dealTitle;
    }
    public void setDealTitle(String dealTitle) {
        this.dealTitle = dealTitle;
    }
    public String getEOrderId() {
        return eOrderId;
    }
    public void setEOrderId(String eOrderId) {
        this.eOrderId = eOrderId;
    }
    public Long getIsVerifyPay() {
        return isVerifyPay;
    }
    public void setIsVerifyPay(Long isVerifyPay) {
        this.isVerifyPay = isVerifyPay;
    }




    @Override
    public String toString() {
        return "EOrders{" + "count=" + count + "," + "couponCodes=" + couponCodes + "," + "couponUseTime=" + couponUseTime + "," + "dealTitle=" + dealTitle + "," + "eOrderId=" + eOrderId + "," + "isVerifyPay=" + isVerifyPay + "}";
    }
}
