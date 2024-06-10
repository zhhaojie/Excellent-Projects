package com.meituan.sdk.model.wmoperNg.order.wmoperngOrderList;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
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
    path = "/wmoper/ng/order/queryOrders",
    businessId = 16,
    apiVersion = "10000",
    apiName = "wmoperng_order_list",
    needAuth = true
)
public class WmoperngOrderListRequest implements MeituanRequest<WmoperngOrderListResponse> {
    /**
    * <p><span style="color: "><font style="font-size:12.0pt;line-height:24px" data-size="12.0pt">日期不包含时分秒，格式为yyyyMMdd</font></span></p>
    */
    @NotNull(message = "dayInt不能为空")
    @SerializedName("dayInt")
    private Integer dayInt;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">订单状态 -1代表全部 2代表新订单 4 代表已确认订单 8订单完成 9 订单取消</font></span></p>
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
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">分页条数 ，最大20</font></span></p>
    */
    @NotNull(message = "pageSize不能为空")
    @SerializedName("pageSize")
    private Integer pageSize;

    public Integer getDayInt() {
        return dayInt;
    }
    public void setDayInt(Integer dayInt) {
        this.dayInt = dayInt;
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
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public MeituanResponse<WmoperngOrderListResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperngOrderListResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperngOrderListRequest{" + "dayInt=" + dayInt + "," + "orderStatus=" + orderStatus + "," + "pageNo=" + pageNo + "," + "pageSize=" + pageSize + "}";
    }
}
