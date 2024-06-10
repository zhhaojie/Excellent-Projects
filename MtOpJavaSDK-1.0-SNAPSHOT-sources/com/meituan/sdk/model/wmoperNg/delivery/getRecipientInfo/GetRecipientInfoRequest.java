package com.meituan.sdk.model.wmoperNg.delivery.getRecipientInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 配送类服务商提供收货人的信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/delivery/getRecipientInfo",
    businessId = 16,
    apiVersion = "10004",
    apiName = "get_recipient_info",
    needAuth = true
)
public class GetRecipientInfoRequest implements MeituanRequest<GetRecipientInfoResponse> {
    /**
    * <p>订单号</p>
    */
    @NotBlank(message = "orderId不能为空")
    @SerializedName("orderId")
    private String orderId;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    @Override
    public MeituanResponse<GetRecipientInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<GetRecipientInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "GetRecipientInfoRequest{" + "orderId=" + orderId + "}";
    }
}
