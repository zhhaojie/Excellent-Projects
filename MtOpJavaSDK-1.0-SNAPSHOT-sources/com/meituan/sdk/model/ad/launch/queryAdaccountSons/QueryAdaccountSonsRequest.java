package com.meituan.sdk.model.ad.launch.queryAdaccountSons;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询账号的子账号
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryAdAccountSons",
    businessId = 22,
    apiVersion = "10009",
    apiName = "query_adaccount_sons",
    needAuth = true
)
public class QueryAdaccountSonsRequest implements MeituanRequest<List<AdAccountInfo>> {
    @SerializedName("sonAdaccount")
    private Integer sonAdaccount;

    public Integer getSonAdaccount() {
        return sonAdaccount;
    }
    public void setSonAdaccount(Integer sonAdaccount) {
        this.sonAdaccount = sonAdaccount;
    }


    @Override
    public MeituanResponse<List<AdAccountInfo>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<AdAccountInfo>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryAdaccountSonsRequest{" + "sonAdaccount=" + sonAdaccount + "}";
    }
}
