package com.meituan.sdk.model.tuangouNg.coupon.couponQueryListByDate;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 门店验券历史
* This file was automatically generated.
*/
public class CouponQueryListByDateResponse {
    @NotEmpty(message = "couponCodes不能为空")
    @SerializedName("couponCodes")
    private List<CouponCodes> couponCodes;
    @NotNull(message = "total不能为空")
    @SerializedName("total")
    private Long total;

    public List<CouponCodes> getCouponCodes() {
        return couponCodes;
    }
    public void setCouponCodes(List<CouponCodes> couponCodes) {
        this.couponCodes = couponCodes;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }




    @Override
    public String toString() {
        return "CouponQueryListByDateResponse{" + "couponCodes=" + couponCodes + "," + "total=" + total + "}";
    }
}
