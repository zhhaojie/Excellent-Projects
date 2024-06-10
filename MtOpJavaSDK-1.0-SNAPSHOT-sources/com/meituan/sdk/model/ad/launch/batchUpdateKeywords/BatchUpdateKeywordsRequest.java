package com.meituan.sdk.model.ad.launch.batchUpdateKeywords;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 批量更新关键词定向
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchUpdateKeywords",
    businessId = 22,
    apiVersion = "10031",
    apiName = "batch_update_keywords",
    needAuth = true
)
public class BatchUpdateKeywordsRequest implements MeituanRequest<BatchUpdateKeywordsResponse> {
    /**
    * <p data-diff-id="ct-diff-id-fc241bcf-e283-4d8a-970a-ec269f61f116">premiumName：溢价关键词定向名</p><p data-diff-id="ct-diff-id-89990e00-7efb-443e-a03f-483ddf9b45bd">keywords：词包列表，用于新增品类词包，地址词，多个词逗号隔开</p><p data-diff-id="ct-diff-id-2ce7d1b7-d90f-4617-b68e-844b860edfc6">words:用于新增推荐词，多个词逗号隔开</p><p data-diff-id="ct-diff-id-b6f7c046-be3c-4915-96e9-4a2ad78e698c">itemTypes：只在选择门店热搜词的情况下传固定值3</p><p data-diff-id="ct-diff-id-3b037815-780d-4bd1-b8f3-39dc5c1c2fac">dpBidPrice：点评出价（单位分）</p><p data-diff-id="ct-diff-id-b2d3e7fe-a7af-40c3-b836-3b13378e3fc4">mtBidPrice：美团出价（单位分）</p>
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
    public MeituanResponse<BatchUpdateKeywordsResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateKeywordsResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateKeywordsRequest{" + "keywordPremiumList=" + keywordPremiumList + "}";
    }
}
