package com.meituan.sdk.model.wmoperNg.waimaiad.appOrderList;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 应用购买记录
* This file was automatically generated.
*/
public class AppOrderListResponse {
    @NotNull(message = "result不能为空")
    @SerializedName("result")
    private Result result;
    @NotNull(message = "total不能为空")
    @SerializedName("total")
    private Long total;
    @NotEmpty(message = "order不能为空")
    @SerializedName("order")
    private List<Order> order;

    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(Long total) {
        this.total = total;
    }
    public List<Order> getOrder() {
        return order;
    }
    public void setOrder(List<Order> order) {
        this.order = order;
    }




    @Override
    public String toString() {
        return "AppOrderListResponse{" + "result=" + result + "," + "total=" + total + "," + "order=" + order + "}";
    }
}
