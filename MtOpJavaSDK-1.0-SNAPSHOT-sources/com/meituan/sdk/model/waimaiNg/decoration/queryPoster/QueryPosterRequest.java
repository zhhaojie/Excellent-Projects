package com.meituan.sdk.model.waimaiNg.decoration.queryPoster;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 商家开放平台海报查询
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/decoration/queryPoster",
    businessId = 2,
    apiVersion = "10001",
    apiName = "query_poster",
    needAuth = false
)
public class QueryPosterRequest implements MeituanRequest<QueryPosterResponse> {
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<QueryPosterResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryPosterResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "QueryPosterRequest{" + "data=" + data + "}";
    }
}
