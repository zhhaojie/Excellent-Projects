package com.meituan.sdk.model.mlive.immsg.search;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取im消息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/mlive/immsg/search",
    businessId = 50,
    apiVersion = "10000",
    apiName = "search",
    needAuth = false
)
public class SearchRequest implements MeituanRequest<String> {
    @NotBlank(message = "biz不能为空")
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
        return "SearchRequest{" + "data=" + data + "}";
    }
}
