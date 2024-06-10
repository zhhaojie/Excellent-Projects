package com.meituan.sdk.model.waimaiNg.delivery.syncEstimateArrivalTime;

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
* 自配订单同步预计送达时间信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/delivery/medicine/syncEstimateArrivalTime",
    businessId = 2,
    apiVersion = "10002",
    apiName = "sync_estimate_arrival_time",
    needAuth = true
)
public class SyncEstimateArrivalTimeRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgb(88, 90, 110)"><font style="font-size:14px;line-height:22px" data-size="14">订单号（同订单展示ID）</font></span></p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p><span style="color: rgb(88, 90, 110)"><font style="font-size:14px;line-height:22px" data-size="14">订单预计送达时间，为10位秒级时间戳</font></span></p>
    */
    @NotBlank(message = "estimateArrivalTime不能为空")
    @SerializedName("estimateArrivalTime")
    private String estimateArrivalTime;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public String getEstimateArrivalTime() {
        return estimateArrivalTime;
    }
    public void setEstimateArrivalTime(String estimateArrivalTime) {
        this.estimateArrivalTime = estimateArrivalTime;
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
        return "SyncEstimateArrivalTimeRequest{" + "orderId=" + orderId + "," + "estimateArrivalTime=" + estimateArrivalTime + "}";
    }
}
