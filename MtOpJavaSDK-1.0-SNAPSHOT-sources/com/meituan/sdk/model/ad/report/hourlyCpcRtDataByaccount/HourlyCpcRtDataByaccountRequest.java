package com.meituan.sdk.model.ad.report.hourlyCpcRtDataByaccount;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* cpc账户实时分时数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getHourlyCpcRtDataByAccount",
    businessId = 22,
    apiVersion = "10015",
    apiName = "hourly_cpc_rt_data_byaccount",
    needAuth = false
)
public class HourlyCpcRtDataByaccountRequest implements MeituanRequest<List<Data>> {
    /**
    * 子账号id
    */
    @SerializedName("accountId")
    private Integer accountId;

    public Integer getAccountId() {
        return accountId;
    }
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }


    @Override
    public MeituanResponse<List<Data>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<Data>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "HourlyCpcRtDataByaccountRequest{" + "accountId=" + accountId + "}";
    }
}
