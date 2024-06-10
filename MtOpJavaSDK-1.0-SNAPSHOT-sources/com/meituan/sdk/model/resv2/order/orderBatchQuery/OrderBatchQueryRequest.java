package com.meituan.sdk.model.resv2.order.orderBatchQuery;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 订单批量查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/resv2/order/batchQuery",
    businessId = 7,
    apiVersion = "10002",
    apiName = "order_batch_query",
    needAuth = true
)
public class OrderBatchQueryRequest implements MeituanRequest<String> {
    @SerializedName("pageNo")
    private Integer pageNo;
    @SerializedName("pageSize")
    private Integer pageSize;
    @SerializedName("bookingTimeGe")
    private Long bookingTimeGe;
    @SerializedName("bookingTimeLe")
    private Long bookingTimeLe;
    @SerializedName("updateTimeGe")
    private Long updateTimeGe;
    @SerializedName("updateTimeLe")
    private Long updateTimeLe;

    public Integer getPageNo() {
        return pageNo;
    }
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
    public Long getBookingTimeGe() {
        return bookingTimeGe;
    }
    public void setBookingTimeGe(Long bookingTimeGe) {
        this.bookingTimeGe = bookingTimeGe;
    }
    public Long getBookingTimeLe() {
        return bookingTimeLe;
    }
    public void setBookingTimeLe(Long bookingTimeLe) {
        this.bookingTimeLe = bookingTimeLe;
    }
    public Long getUpdateTimeGe() {
        return updateTimeGe;
    }
    public void setUpdateTimeGe(Long updateTimeGe) {
        this.updateTimeGe = updateTimeGe;
    }
    public Long getUpdateTimeLe() {
        return updateTimeLe;
    }
    public void setUpdateTimeLe(Long updateTimeLe) {
        this.updateTimeLe = updateTimeLe;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderBatchQueryRequest{" + "pageNo=" + pageNo + "," + "pageSize=" + pageSize + "," + "bookingTimeGe=" + bookingTimeGe + "," + "bookingTimeLe=" + bookingTimeLe + "," + "updateTimeGe=" + updateTimeGe + "," + "updateTimeLe=" + updateTimeLe + "}";
    }
}
