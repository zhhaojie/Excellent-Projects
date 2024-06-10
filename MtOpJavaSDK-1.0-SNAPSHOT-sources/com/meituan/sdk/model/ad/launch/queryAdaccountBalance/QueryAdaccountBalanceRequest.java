package com.meituan.sdk.model.ad.launch.queryAdaccountBalance;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询账号余额
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryAdAccountBalance",
    businessId = 22,
    apiVersion = "10011",
    apiName = "query_adaccount_balance",
    needAuth = true
)
public class QueryAdaccountBalanceRequest implements MeituanRequest<QueryAdaccountBalanceResponse> {
    @SerializedName("sonAdaccount")
    private Integer sonAdaccount;

    public Integer getSonAdaccount() {
        return sonAdaccount;
    }
    public void setSonAdaccount(Integer sonAdaccount) {
        this.sonAdaccount = sonAdaccount;
    }


    @Override
    public MeituanResponse<QueryAdaccountBalanceResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryAdaccountBalanceResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryAdaccountBalanceRequest{" + "sonAdaccount=" + sonAdaccount + "}";
    }
}
