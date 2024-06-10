package com.meituan.sdk.model.waimaiNg.im.waimaiImGetReadTime;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询会话最新已读时间戳
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/im/userReadTime",
    businessId = 2,
    apiVersion = "10008",
    apiName = "waimai_im_get_read_time",
    needAuth = true
)
public class WaimaiImGetReadTimeRequest implements MeituanRequest<WaimaiImGetReadTimeResponse> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<WaimaiImGetReadTimeResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WaimaiImGetReadTimeResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "WaimaiImGetReadTimeRequest{" + "data=" + data + "}";
    }
}
