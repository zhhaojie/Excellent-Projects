package com.meituan.sdk.model.waimaiNg.order.getOrderBookerInformation;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询订单预订人隐私信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/getOrderBookerInformation",
    businessId = 2,
    apiVersion = "10035",
    apiName = "get_order_booker_information",
    needAuth = true
)
public class GetOrderBookerInformationRequest implements MeituanRequest<GetOrderBookerInformationResponse> {
    /**
    * <p>订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;
    /**
    * <p>查询类型。1蛋糕品类，2其他。</p>
    */
    @NotNull(message = "type不能为空")
    @SerializedName("type")
    private Integer type;
    /**
    * <p>补充原因。当type=2时为必填项</p>
    */
    @SerializedName("supplementaryReasons")
    private String supplementaryReasons;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }
    public String getSupplementaryReasons() {
        return supplementaryReasons;
    }
    public void setSupplementaryReasons(String supplementaryReasons) {
        this.supplementaryReasons = supplementaryReasons;
    }


    @Override
    public MeituanResponse<GetOrderBookerInformationResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetOrderBookerInformationResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetOrderBookerInformationRequest{" + "orderId=" + orderId + "," + "type=" + type + "," + "supplementaryReasons=" + supplementaryReasons + "}";
    }
}
