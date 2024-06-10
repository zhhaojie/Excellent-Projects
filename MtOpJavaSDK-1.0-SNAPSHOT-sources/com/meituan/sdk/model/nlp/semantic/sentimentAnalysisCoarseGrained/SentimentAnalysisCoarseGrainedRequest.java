package com.meituan.sdk.model.nlp.semantic.sentimentAnalysisCoarseGrained;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 粗粒度情感分析
* This file was automatically generated.
*/
@ApiMeta(
    path = "/nlp/semantic/api/sentiment_analysis/coarse_grained",
    businessId = 42,
    apiVersion = "10005",
    apiName = "sentiment_analysis_coarse_grained",
    needAuth = false
)
public class SentimentAnalysisCoarseGrainedRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.65)"><font style="font-size:14px;line-height:22px" data-size="14">输入的文本，通过情感分析模型得到文本对应的情感倾向（输入文本长度最好不超过512字）</font></span></p>
    */
    @NotBlank(message = "text不能为空")
    @SerializedName("data")
    private String data;

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this.data);
    }


    @Override
    public String toString() {
        return "SentimentAnalysisCoarseGrainedRequest{" + "data=" + data + "}";
    }
}
