package com.meituan.sdk.model.waimaiNg.valueadded.queryCouponStock;

import com.google.gson.annotations.SerializedName;

/**
* 查询商家当前剩余可发券数量
* This file was automatically generated.
*/
public class QueryCouponStockResponse {
    @SerializedName("total")
    private Long total;
    @SerializedName("used")
    private Long used;

    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public Long getUsed() {
        return used;
    }
    public void setUsed(Long used) {
        this.used = used;
    }




    @Override
    public String toString() {
        return "QueryCouponStockResponse{" + "total=" + total + "," + "used=" + used + "}";
    }
}
