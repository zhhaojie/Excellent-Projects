package com.meituan.sdk.model.waimaiNg.im.setAutoSendConfigInfo;

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
    path = "/waimai/ng/im/autosend/setAutoSendConfigInfo",
    businessId = 2,
    apiVersion = "10051",
    apiName = "set_auto_send_config_info",
    needAuth = true
)
public class SetAutoSendConfigInfoRequest implements MeituanRequest<String> {
    /**
    * <p><strong><font style="font-size:14px;line-height:22px" data-size="14">类型&amp;状态 </font></strong><span style="color: "><font style="font-size:14px;line-height:22px" data-size="14">列表</font></span></p>
    */
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
