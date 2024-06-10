package com.meituan.sdk.model.ad.launch.queryValidShops;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 判断门店是否可以投放广告
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryValidShops",
    businessId = 22,
    apiVersion = "10012",
    apiName = "query_valid_shops",
    needAuth = true
)
public class QueryValidShopsRequest implements MeituanRequest<QueryValidShopsResponse> {
    /**
    * <p>校验门店id列表</p>
    */
    @SerializedName("shopList")
    private List<Long> shopList;

    public List<Long> getShopList() {
        return shopList;
    }
    public void setShopList(List<Long> shopList) {
        this.shopList = shopList;
    }


    @Override
    public MeituanResponse<QueryValidShopsResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryValidShopsResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryValidShopsRequest{" + "shopList=" + shopList + "}";
    }
}
