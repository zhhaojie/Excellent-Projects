package com.meituan.sdk.model.wmoperNg.im.setAutoSendConfigInfo;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 设置门店“智能回复机器人”的开关状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/autosend/setAutoSendConfigInfo",
    businessId = 16,
    apiVersion = "10051",
    apiName = "set_auto_send_config_info",
    needAuth = true
)
public class SetAutoSendConfigInfoRequest implements MeituanRequest<String> {
    @SerializedName("allStatus")
    private List<ImTypeSwitchStatusParam> allStatus;

    public List<ImTypeSwitchStatusParam> getAllStatus() {
        return allStatus;
    }
    public void setAllStatus(List<ImTypeSwitchStatusParam> allStatus) {
        this.allStatus = allStatus;
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
        return "SetAutoSendConfigInfoRequest{" + "allStatus=" + allStatus + "}";
    }
}
