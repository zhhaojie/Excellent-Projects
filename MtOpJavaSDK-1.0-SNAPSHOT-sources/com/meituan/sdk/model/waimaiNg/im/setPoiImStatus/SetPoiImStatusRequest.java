package com.meituan.sdk.model.waimaiNg.im.setPoiImStatus;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 设置门店IM状态
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/setPoiIMStatus",
    businessId = 2,
    apiVersion = "10001",
    apiName = "set_poi_im_status",
    needAuth = false
)
public class SetPoiImStatusRequest implements MeituanRequest<String> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "SetPoiImStatusRequest{" + "data=" + data + "}";
    }
}
