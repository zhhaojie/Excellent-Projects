package com.meituan.sdk.model.waimaiNg.order.getOrderMealStatus;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询出餐超时的订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/getOrderMealStatus",
    businessId = 2,
    apiVersion = "10090",
    apiName = "get_order_meal_status",
    needAuth = true
)
public class GetOrderMealStatusRequest implements MeituanRequest<GetOrderMealStatusResponse> {
    @SerializedName("orderTimeStart")
    private Integer orderTimeStart;
    @SerializedName("orderTimeEnd")
    private Integer orderTimeEnd;
    /**
    * <p data-diff-id="ct-diff-id-f97d7879-1884-4dd1-9d6d-34a1ae9a0b68">页数</p>
    */
    @SerializedName("pageNum")
    private Integer pageNum;
    /**
    * <p data-diff-id="ct-diff-id-2c89ca99-5e4c-41bb-9668-e062399854dc">每页数量</p>
    */
    @SerializedName("pageSize")
    private Integer pageSize;

    public Integer getOrderTimeStart() {
        return orderTimeStart;
    }
    public void setOrderTimeStart(Integer orderTimeStart) {
        this.orderTimeStart = orderTimeStart;
    }
    public Integer getOrderTimeEnd() {
        return orderTimeEnd;
    }
    public void setOrderTimeEnd(Integer orderTimeEnd) {
        this.orderTimeEnd = orderTimeEnd;
    }
    public Integer getPageNum() {
        return pageNum;
    }
    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
    public Integer getPageSize() {
        return pageSize;
    }
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }


    @Override
    public MeituanResponse<GetOrderMealStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetOrderMealStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetOrderMealStatusRequest{" + "orderTimeStart=" + orderTimeStart + "," + "orderTimeEnd=" + orderTimeEnd + "," + "pageNum=" + pageNum + "," + "pageSize=" + pageSize + "}";
    }
}
