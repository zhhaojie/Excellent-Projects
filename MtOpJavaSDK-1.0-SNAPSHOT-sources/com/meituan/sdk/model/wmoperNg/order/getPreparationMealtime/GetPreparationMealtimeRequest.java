package com.meituan.sdk.model.wmoperNg.order.getPreparationMealtime;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家获取备餐时间
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/order/getPreparationMealTime",
    businessId = 16,
    apiVersion = "10035",
    apiName = "get_preparation_mealtime",
    needAuth = true
)
public class GetPreparationMealtimeRequest implements MeituanRequest<GetPreparationMealtimeResponse> {
    /**
    * <p data-diff-id="ct-diff-id-b8a87bc6-10c4-4db2-8aeb-796c6129d05a"><span style="color: rgba(0, 0, 0, 0.65)">订单id</span></p>
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
    public MeituanResponse<GetPreparationMealtimeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetPreparationMealtimeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetPreparationMealtimeRequest{" + "orderId=" + orderId + "}";
    }
}
