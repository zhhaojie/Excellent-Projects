package com.meituan.sdk.model.waimaiNg.comment.commentQueryScore;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 查询门店评分
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/ng/comment/queryScore",
    businessId = 2,
    apiVersion = "10016",
    apiName = "comment_query_score",
    needAuth = false
)
public class CommentQueryScoreRequest implements MeituanRequest<CommentQueryScoreResponse> {
    /**
    * <p data-diff-id="ct-diff-id-64c384b0-f58d-459f-8823-d9a47bea5745">业务标识</p><p data-diff-id="ct-diff-id-ea587edd-6b1c-4f42-baab-2e0dc24997fa">传“B_API”只返回外卖评价分数，不传或者传其他返回所有</p>
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
    public MeituanResponse<CommentQueryScoreResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CommentQueryScoreResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CommentQueryScoreRequest{" + "bizKey=" + bizKey + "}";
    }
}
