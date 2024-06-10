package com.meituan.sdk.model.ad.launch.queryRecommendKeywords;

import com.meituan.sdk.annotations.ApiMeta;
import java.util.List;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店的推荐关键词
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/queryRecommendKeywords",
    businessId = 22,
    apiVersion = "10029",
    apiName = "query_recommend_keywords",
    needAuth = true
)
public class QueryRecommendKeywordsRequest implements MeituanRequest<List<RecomendKeywordDTO>> {
    /**
    * <p>需要查询的门店列表，多个门店所属类目必须一致</p>
    */
    @NotNull(message = "shopList不能为空")
    @SerializedName("shopList")
    private Long shopList;

    public Long getShopList() {
        return shopList;
    }
    public void setShopList(Long shopList) {
        this.shopList = shopList;
    }


    @Override
    public MeituanResponse<List<RecomendKeywordDTO>> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<List<RecomendKeywordDTO>>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "QueryRecommendKeywordsRequest{" + "shopList=" + shopList + "}";
    }
}
