package com.meituan.sdk.model.peisong.order.riderLocation;

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
* 获取骑手当前位置
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/rider/location",
    businessId = 19,
    apiVersion = "10009",
    apiName = "rider_location",
    needAuth = false
)
public class RiderLocationRequest implements MeituanRequest<RiderLocationResponse> {
    /**
    * 配送活动标识
    */
    @NotNull(message = "deliveryId不能为空")
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 美团配送内部订单 id，最长不超过 32 个字符
    */
    @NotBlank(message = "mtPeisongId不能为空")
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;

    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }


    @Override
    public MeituanResponse<RiderLocationResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<RiderLocationResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "RiderLocationRequest{" + "deliveryId=" + deliveryId + "," + "mtPeisongId=" + mtPeisongId + "}";
    }
}
