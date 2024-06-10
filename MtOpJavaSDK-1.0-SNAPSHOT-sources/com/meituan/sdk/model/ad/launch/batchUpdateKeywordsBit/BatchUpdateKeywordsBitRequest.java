package com.meituan.sdk.model.ad.launch.batchUpdateKeywordsBit;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 更新关键词出价
* This file was automatically generated.
*/
@ApiMeta(
    path = "/ad/launch/batchUpdateKeywordBidPrice",
    businessId = 22,
    apiVersion = "10024",
    apiName = "batch_update_keywords_bit",
    needAuth = true
)
public class BatchUpdateKeywordsBitRequest implements MeituanRequest<BatchUpdateKeywordsBitResponse> {
    /**
    * <p data-diff-id="ct-diff-id-fd502029-b735-4e85-a9e9-845ba076555e">launchPremiumId：溢价关键词定向ID</p><p data-diff-id="ct-diff-id-e973c7cf-ccca-4248-9720-c0e63693d7e5">dpBidPrice：点评出价（单位分）</p><p data-diff-id="ct-diff-id-ce32a2c3-09ca-417c-bad6-88571f2888b8">mtBidPrice：美团出价（单位分）</p>
    */
    @NotBlank(message = "keywordPremiumPrice不能为空")
    @SerializedName("keywordPremiumPrice")
    private String keywordPremiumPrice;

    public String getKeywordPremiumPrice() {
        return keywordPremiumPrice;
    }
    public void setKeywordPremiumPrice(String keywordPremiumPrice) {
        this.keywordPremiumPrice = keywordPremiumPrice;
    }


    @Override
    public MeituanResponse<BatchUpdateKeywordsBitResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<BatchUpdateKeywordsBitResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "BatchUpdateKeywordsBitRequest{" + "keywordPremiumPrice=" + keywordPremiumPrice + "}";
    }
}
