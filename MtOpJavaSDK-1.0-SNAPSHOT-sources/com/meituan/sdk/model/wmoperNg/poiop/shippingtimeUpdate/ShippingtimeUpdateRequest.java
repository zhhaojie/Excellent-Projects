package com.meituan.sdk.model.wmoperNg.poiop.shippingtimeUpdate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 更新门店营业时间
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/poiop/shippingtime/update",
    businessId = 16,
    apiVersion = "10002",
    apiName = "shippingtime_update",
    needAuth = true
)
public class ShippingtimeUpdateRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">门店营业时间</font></span><font style="font-size:14px;line-height:22px" data-size="14"><br></font><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">（注意格式，且保证不同时间段之间不存在交集）</font></span></p>
    */
    @NotBlank(message = "shippingTime不能为空")
    @SerializedName("shipping_time")
    private String shippingTime;

    public String getShippingTime() {
        return shippingTime;
    }
    public void setShippingTime(String shippingTime) {
        this.shippingTime = shippingTime;
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
        return "ShippingtimeUpdateRequest{" + "shippingTime=" + shippingTime + "}";
    }
}
