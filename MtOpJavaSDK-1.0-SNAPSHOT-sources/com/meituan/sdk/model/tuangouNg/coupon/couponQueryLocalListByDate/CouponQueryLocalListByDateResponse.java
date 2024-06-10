package com.meituan.sdk.model.tuangouNg.coupon.couponQueryLocalListByDate;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 门店本地验券历史
* This file was automatically generated.
*/
public class CouponQueryLocalListByDateResponse {
    /**
    * ERP订单数组
    */
    @SerializedName("eOrders")
    private List<EOrders> eOrders;
    /**
    * ERP订单条数总数
    */
    @SerializedName("total")
    private Integer total;

    public List<EOrders> getEOrders() {
        return eOrders;
    }
    public void setEOrders(List<EOrders> eOrders) {
        this.eOrders = eOrders;
    }
    public Integer getTotal() {
        return total;
    }
    public void setTotal(Integer total) {
        this.total = total;
    }




    @Override
    public String toString() {
        return "CouponQueryLocalListByDateResponse{" + "eOrders=" + eOrders + "," + "total=" + total + "}";
    }
}
