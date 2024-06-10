package com.meituan.sdk.model.ad.launch.batchAddKeywords;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量新增关键词定向
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchAddKeywords",
    businessId = 22,
    apiVersion = "10026",
    apiName = "batch_add_keywords",
    needAuth = true
)
public class BatchAddKeywordsRequest implements MeituanRequest<BatchAddKeywordsResponse> {
    /**
    * <p data-diff-id="ct-diff-id-ac9104eb-8bce-4b4d-aa28-8d350fad7c03">premiumName：溢价关键词定向名</p><p data-diff-id="ct-diff-id-51023348-6e47-4761-a34c-d8eadd158932">keywords：词包列表，用于新增品类词包，地址词，多个词逗号隔开</p><p data-diff-id="ct-diff-id-148cc5f8-5516-4c9c-abf0-dd0329782e4f">words:用于新增推荐词，多个词逗号隔开</p><p data-diff-id="ct-diff-id-f858c000-1939-49b9-9759-176e4961ddb9">itemTypes：只在选择门店热搜词的情况下传固定值3</p><p data-diff-id="ct-diff-id-343fb3b3-e843-465c-819c-b80b51f0ddf1">dpBidPrice：点评出价（单位分）</p><p data-diff-id="ct-diff-id-37bf9df7-1f7d-44fd-b47c-a8cdc942134e">mtBidPrice：美团出价（单位分）</p>
    */
    @NotBlank(message = "keywordPremiumList不能为空")
    @SerializedName("keywordPremiumList")
    private String keywordPremiumList;

    public String getKeywordPremiumList() {
        return keywordPremiumList;
    }
    public void setKeywordPremiumList(String keywordPremiumList) {
        this.keywordPremiumList = keywordPremiumList;
    }


    @Override
    public MeituanResponse<BatchAddKeywordsResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchAddKeywordsResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchAddKeywordsRequest{" + "keywordPremiumList=" + keywordPremiumList + "}";
    }
}
