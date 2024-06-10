package com.meituan.sdk.model.tuangouNg.groupVoucher.groupvoucherOrderQuery;

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
* 查询代金券买单信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/tuangou/ng/group_voucher/order/query",
    businessId = 1,
    apiVersion = "10006",
    apiName = "groupvoucher_order_query",
    needAuth = true
)
public class GroupvoucherOrderQueryRequest implements MeituanRequest<GroupvoucherOrderQueryResponse> {
    /**
    * <p data-diff-id="ct-diff-id-256c2d92-0b54-40cc-ac51-5495629463d4">用户/开店宝展示的订单ID</p>
    */
    @NotBlank(message = "serialNumber不能为空")
    @SerializedName("serialNumber")
    private String serialNumber;
    /**
    * <p data-diff-id="ct-diff-id-311fdf78-f11a-4104-88f3-4bb5f6884258">订单ID</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    @Override
    public MeituanResponse<GroupvoucherOrderQueryResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GroupvoucherOrderQueryResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GroupvoucherOrderQueryRequest{" + "serialNumber=" + serialNumber + "," + "orderId=" + orderId + "}";
    }
}
