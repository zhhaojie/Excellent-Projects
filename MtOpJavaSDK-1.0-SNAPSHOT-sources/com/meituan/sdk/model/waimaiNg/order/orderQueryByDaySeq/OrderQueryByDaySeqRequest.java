package com.meituan.sdk.model.waimaiNg.order.orderQueryByDaySeq;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 根据流水号查询订单
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/order/queryByDaySeq",
    businessId = 2,
    apiVersion = "10100",
    apiName = "order_query_by_day_seq",
    needAuth = true
)
public class OrderQueryByDaySeqRequest implements MeituanRequest<OrderQueryByDaySeqResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">门店下的当天订单流水号</font></span></p><p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">流水号从1开始递增，标识当天第几个订单</font></span></p>
    */
    @NotNull(message = "daySeq不能为空")
    @SerializedName("daySeq")
    private Integer daySeq;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">日期【yyyyMMdd】</font></span></p>
    */
    @SerializedName("date")
    private String date;

    public Integer getDaySeq() {
        return daySeq;
    }
    public void setDaySeq(Integer daySeq) {
        this.daySeq = daySeq;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public MeituanResponse<OrderQueryByDaySeqResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<OrderQueryByDaySeqResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "OrderQueryByDaySeqRequest{" + "daySeq=" + daySeq + "," + "date=" + date + "}";
    }
}
