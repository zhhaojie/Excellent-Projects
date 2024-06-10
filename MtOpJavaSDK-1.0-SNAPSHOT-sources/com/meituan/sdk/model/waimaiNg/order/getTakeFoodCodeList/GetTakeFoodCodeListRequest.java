package com.meituan.sdk.model.waimaiNg.order.getTakeFoodCodeList;

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
* 获取取餐码标签
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/order/getTakeFoodCodeList",
    businessId = 2,
    apiVersion = "10014",
    apiName = "get_take_food_code_list",
    needAuth = true
)
public class GetTakeFoodCodeListRequest implements MeituanRequest<GetTakeFoodCodeListResponse> {
    /**
    * <p>订单id</p>
    */
    @NotNull(message = "orderId不能为空")
    @SerializedName("orderId")
    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }


    @Override
    public MeituanResponse<GetTakeFoodCodeListResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetTakeFoodCodeListResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetTakeFoodCodeListRequest{" + "orderId=" + orderId + "}";
    }
}
