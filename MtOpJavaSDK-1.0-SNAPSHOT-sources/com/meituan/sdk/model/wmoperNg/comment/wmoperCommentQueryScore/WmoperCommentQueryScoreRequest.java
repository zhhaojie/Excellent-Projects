package com.meituan.sdk.model.wmoperNg.comment.wmoperCommentQueryScore;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 获取门店评分
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/comment/queryScore",
    businessId = 16,
    apiVersion = "10013",
    apiName = "wmoper_comment_query_score",
    needAuth = false
)
public class WmoperCommentQueryScoreRequest implements MeituanRequest<WmoperCommentQueryScoreResponse> {
    /**
    * <p data-diff-id="ct-diff-id-a61a53f5-6409-440e-a731-e6518b72b476">业务标识</p><p data-diff-id="ct-diff-id-33a05cdc-dfcf-4e88-a658-0d2527d81c4d">传“B_API”只返回外卖评价分数，不传或者传其他返回所有</p>
    */
    @SerializedName("bizKey")
    private String bizKey;

    public String getBizKey() {
        return bizKey;
    }
    public void setBizKey(String bizKey) {
        this.bizKey = bizKey;
    }


    @Override
    public MeituanResponse<WmoperCommentQueryScoreResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<WmoperCommentQueryScoreResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "WmoperCommentQueryScoreRequest{" + "bizKey=" + bizKey + "}";
    }
}
