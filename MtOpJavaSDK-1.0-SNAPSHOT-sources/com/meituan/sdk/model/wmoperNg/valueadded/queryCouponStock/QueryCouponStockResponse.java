package com.meituan.sdk.model.wmoperNg.valueadded.queryCouponStock;

import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;

/**
* 查询商家当前剩余可发券数量
* This file was automatically generated.
*/
public class QueryCouponStockResponse {
    @NotNull(message = "total不能为空")
    @SerializedName("total")
    private Long total;
    @NotNull(message = "used不能为空")
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
