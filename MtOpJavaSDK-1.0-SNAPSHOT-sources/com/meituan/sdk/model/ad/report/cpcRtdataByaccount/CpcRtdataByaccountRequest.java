package com.meituan.sdk.model.ad.report.cpcRtdataByaccount;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* cpc账户实时天数据
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/report/getCpcRtDataByAccount",
    businessId = 22,
    apiVersion = "10015",
    apiName = "cpc_rtdata_byaccount",
    needAuth = false
)
public class CpcRtdataByaccountRequest implements MeituanRequest<List<Data>> {
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
        return "CpcRtdataByaccountRequest{" + "accountId=" + accountId + "}";
    }
}
