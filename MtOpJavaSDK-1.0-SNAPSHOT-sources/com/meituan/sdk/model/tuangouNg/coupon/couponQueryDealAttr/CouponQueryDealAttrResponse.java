package com.meituan.sdk.model.tuangouNg.coupon.couponQueryDealAttr;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询团购项目限制条件接口
* This file was automatically generated.
*/
public class CouponQueryDealAttrResponse {
    @SerializedName("dealInfoList")
    private List<DealInfoList> dealInfoList;

    public List<DealInfoList> getDealInfoList() {
        return dealInfoList;
    }
    public void setDealInfoList(List<DealInfoList> dealInfoList) {
        this.dealInfoList = dealInfoList;
    }




    @Override
    public String toString() {
        return "CouponQueryDealAttrResponse{" + "dealInfoList=" + dealInfoList + "}";
    }
}
