package com.meituan.sdk.model.wmoperNg.im.getAutoSendConfigInfo;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店“智能回复机器人”的开关状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/im/autosend/getAutoSendConfigInfo",
    businessId = 16,
    apiVersion = "10051",
    apiName = "get_auto_send_config_info",
    needAuth = true
)
public class GetAutoSendConfigInfoRequest implements MeituanRequest<List<AutoSendConfigInfo>> {



    @Override
    public MeituanResponse<List<AutoSendConfigInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<AutoSendConfigInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return null;
    }


}
