package com.meituan.sdk.model.ad.launch.queryAdaccountInfo;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询账号基本信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryAdAccountInfo",
    businessId = 22,
    apiVersion = "10015",
    apiName = "query_adaccount_info",
    needAuth = true
)
public class QueryAdaccountInfoRequest implements MeituanRequest<QueryAdaccountInfoResponse> {
    @SerializedName("sonAdaccount")
    private Integer sonAdaccount;

    public Integer getSonAdaccount() {
        return sonAdaccount;
    }
    public void setSonAdaccount(Integer sonAdaccount) {
        this.sonAdaccount = sonAdaccount;
    }


    @Override
    public MeituanResponse<QueryAdaccountInfoResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryAdaccountInfoResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryAdaccountInfoRequest{" + "sonAdaccount=" + sonAdaccount + "}";
    }
}
