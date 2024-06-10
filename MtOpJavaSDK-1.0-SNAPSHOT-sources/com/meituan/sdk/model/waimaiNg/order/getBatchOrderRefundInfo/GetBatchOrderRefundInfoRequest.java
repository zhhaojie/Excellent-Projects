package com.meituan.sdk.model.waimaiNg.order.getBatchOrderRefundInfo;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;
import javax.validation.constraints.NotEmpty;

/**
* 批量查询退款订单信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/getBatchOrderRefundInfo",
    businessId = 2,
    apiVersion = "10072",
    apiName = "get_batch_order_refund_info",
    needAuth = true
)
public class GetBatchOrderRefundInfoRequest implements MeituanRequest<GetBatchOrderRefundInfoResponse> {
    /**
    * <p data-diff-id="ct-diff-id-9d3a5e9c-c95c-40d3-af93-cad88d4527c6">订单id列表</p>
    */
    @NotEmpty(message = "orderIds不能为空")
    @SerializedName("orderIds")
    private List<String> orderIds;

    public List<String> getOrderIds() {
        return orderIds;
    }
    public void setOrderIds(List<String> orderIds) {
        this.orderIds = orderIds;
    }


    @Override
    public MeituanResponse<GetBatchOrderRefundInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetBatchOrderRefundInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetBatchOrderRefundInfoRequest{" + "orderIds=" + orderIds + "}";
    }
}
