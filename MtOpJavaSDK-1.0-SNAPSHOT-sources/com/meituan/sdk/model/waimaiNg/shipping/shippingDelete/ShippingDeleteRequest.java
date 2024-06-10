package com.meituan.sdk.model.waimaiNg.shipping.shippingDelete;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 删除门店配送范围（自配）
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/shipping/delete",
    businessId = 2,
    apiVersion = "10000",
    apiName = "shipping_delete",
    needAuth = true
)
public class ShippingDeleteRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">服务商方提供的配送范围id</font></span></p>
    */
    @NotBlank(message = "appShippingCode不能为空")
    @SerializedName("app_shipping_code")
    private String appShippingCode;

    public String getAppShippingCode() {
        return appShippingCode;
    }
    public void setAppShippingCode(String appShippingCode) {
        this.appShippingCode = appShippingCode;
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
        return "ShippingDeleteRequest{" + "appShippingCode=" + appShippingCode + "}";
    }
}
