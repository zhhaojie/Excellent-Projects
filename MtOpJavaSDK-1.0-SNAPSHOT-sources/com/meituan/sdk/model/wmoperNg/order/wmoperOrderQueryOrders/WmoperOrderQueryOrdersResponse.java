package com.meituan.sdk.model.wmoperNg.order.wmoperOrderQueryOrders;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 查询订单列表
* This file was automatically generated.
*/
public class WmoperOrderQueryOrdersResponse {
    /**
    * 是否还有数据
    */
    @SerializedName("hasMore")
    private Boolean hasMore;
    /**
    * 订单ID列表
    */
    @SerializedName("orderIds")
    private List<Long> orderIds;

    public Boolean getHasMore() {
        return hasMore;
    }
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }
    public List<Long> getOrderIds() {
        return orderIds;
    }
    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }




    @Override
    public String toString() {
        return "WmoperOrderQueryOrdersResponse{" + "hasMore=" + hasMore + "," + "orderIds=" + orderIds + "}";
    }
}
