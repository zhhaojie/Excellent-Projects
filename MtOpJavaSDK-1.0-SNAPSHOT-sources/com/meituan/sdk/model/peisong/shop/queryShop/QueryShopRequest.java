package com.meituan.sdk.model.peisong.shop.queryShop;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店信息
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/shop/query",
    businessId = 19,
    apiVersion = "10009",
    apiName = "query_shop",
    needAuth = false
)
public class QueryShopRequest implements MeituanRequest<QueryShopResponse> {
    /**
    * 取货门店id，即合作方向美团提供的门店id
    */
    @NotBlank(message = "shopId不能为空")
    @SerializedName("shop_id")
    private String shopId;

    public String getShopId() {
        return shopId;
    }
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }


    @Override
    public MeituanResponse<QueryShopResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<QueryShopResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryShopRequest{" + "shopId=" + shopId + "}";
    }
}
