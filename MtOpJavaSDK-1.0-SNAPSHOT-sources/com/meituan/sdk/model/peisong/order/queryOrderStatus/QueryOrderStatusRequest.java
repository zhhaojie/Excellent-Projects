package com.meituan.sdk.model.peisong.order.queryOrderStatus;

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
* 订单状态查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/queryStatus",
    businessId = 19,
    apiVersion = "10024",
    apiName = "query_order_status",
    needAuth = false
)
public class QueryOrderStatusRequest implements MeituanRequest<QueryOrderStatusResponse> {
    /**
    * 配送活动标识
    */
    @NotNull(message = "deliveryId不能为空")
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 美团配送内部订单id，最长不超过32个字符
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
    public MeituanResponse<QueryOrderStatusResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryOrderStatusResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryOrderStatusRequest{" + "deliveryId=" + deliveryId + "," + "mtPeisongId=" + mtPeisongId + "}";
    }
}
