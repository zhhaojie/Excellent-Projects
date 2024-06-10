package com.meituan.sdk.model.wmoperNg.order.wmoperOrderQueryOrders;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询订单列表
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/order/queryOrders",
    businessId = 16,
    apiVersion = "10032",
    apiName = "wmoper_order_query_orders",
    needAuth = true
)
public class WmoperOrderQueryOrdersRequest implements MeituanRequest<WmoperOrderQueryOrdersResponse> {
    /**
    * <p>日期格式，yyyy-MM-dd</p>
    */
    @NotBlank(message = "date不能为空")
    @SerializedName("date")
    private String date;
    /**
    * <p>订单状态 -1代表全部 2代表新订单 4 代表已确认订单 8订单完成 9 订单取消</p>
    */
    @NotNull(message = "orderStatus不能为空")
    @SerializedName("orderStatus")
    private Integer orderStatus;
    /**
    * <p>页码</p>
    */
    @NotNull(message = "pageNo不能为空")
    @SerializedName("pageNo")
    private Integer pageNo;
    /**
    * <p>分页条数 ，最大20</p>
    */
    @NotBlank(message = "pageSize不能为空")
    @SerializedName("pageSize")
    private String pageSize;

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public Integer getOrderStatus() {
        return orderStatus;
    }
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Integer getPageNo() {
        return pageNo;
    }
    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }
    public String getPageSize() {
        return pageSize;
    }
    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public MeituanResponse<WmoperOrderQueryOrdersResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperOrderQueryOrdersResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperOrderQueryOrdersRequest{" + "date=" + date + "," + "orderStatus=" + orderStatus + "," + "pageNo=" + pageNo + "," + "pageSize=" + pageSize + "}";
    }
}
