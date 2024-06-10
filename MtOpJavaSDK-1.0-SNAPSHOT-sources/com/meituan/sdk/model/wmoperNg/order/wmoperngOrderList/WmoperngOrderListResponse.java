package com.meituan.sdk.model.wmoperNg.order.wmoperngOrderList;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.NotEmpty;

/**
* 查询订单列表
* This file was automatically generated.
*/
public class WmoperngOrderListResponse {
    @NotNull(message = "hashMore不能为空")
    @SerializedName("hashMore")
    private Boolean hashMore;
    @NotEmpty(message = "orderIds不能为空")
    @SerializedName("orderIds")
    private List<Long> orderIds;

    public Boolean getHashMore() {
        return hashMore;
    }
    public void setHashMore(Boolean hashMore) {
        this.hashMore = hashMore;
    }
    public List<Long> getOrderIds() {
        return orderIds;
    }
    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }




    @Override
    public String toString() {
        return "WmoperngOrderListResponse{" + "hashMore=" + hashMore + "," + "orderIds=" + orderIds + "}";
    }
}
