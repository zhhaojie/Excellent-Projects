package com.meituan.sdk.model.waimaiNg.poi.waimaiPoiUpdateDelayDispatch;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 设置延迟发配送时间
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/poi/updateDelayDispatch",
    businessId = 2,
    apiVersion = "10000",
    apiName = "waimai_poi_update_delay_dispatch",
    needAuth = false
)
public class WaimaiPoiUpdateDelayDispatchRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">延迟发配送时间单位秒，该参数需在300-600秒之间</font></span></p>
    */
    @NotNull(message = "delaySeconds不能为空")
    @SerializedName("delaySeconds")
    private Integer delaySeconds;

    public Integer getDelaySeconds() {
        return delaySeconds;
    }
    public void setDelaySeconds(Integer delaySeconds) {
        this.delaySeconds = delaySeconds;
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
        return "WaimaiPoiUpdateDelayDispatchRequest{" + "delaySeconds=" + delaySeconds + "}";
    }
}
