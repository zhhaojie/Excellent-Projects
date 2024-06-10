package com.meituan.sdk.model.ad.launch.queryRelationShops;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询账号关联门店
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryRelationShops",
    businessId = 22,
    apiVersion = "10004",
    apiName = "query_relation_shops",
    needAuth = true
)
public class QueryRelationShopsRequest implements MeituanRequest<List<LaunchObj>> {
    /**
    * <p>子账号商家id</p>
    */
    @SerializedName("sonAccountId")
    private Integer sonAccountId;

    public Integer getSonAccountId() {
        return sonAccountId;
    }
    public void setSonAccountId(Integer sonAccountId) {
        this.sonAccountId = sonAccountId;
    }


    @Override
    public MeituanResponse<List<LaunchObj>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<LaunchObj>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryRelationShopsRequest{" + "sonAccountId=" + sonAccountId + "}";
    }
}
