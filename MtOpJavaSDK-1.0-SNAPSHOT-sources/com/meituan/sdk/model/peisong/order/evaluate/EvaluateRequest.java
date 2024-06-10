package com.meituan.sdk.model.peisong.order.evaluate;

import com.meituan.sdk.annotations.ApiMeta;
import com.google.gson.reflect.TypeToken;
import javax.validation.constraints.NotBlank;
import java.lang.reflect.Type;
import com.meituan.sdk.internal.utils.JsonUtil;
import com.google.gson.annotations.SerializedName;
import javax.validation.constraints.NotNull;
import com.meituan.sdk.MeituanResponse;
import com.meituan.sdk.MeituanRequest;

/**
* 评价骑手
* This file was automatically generated.
*/
@ApiMeta(
    path = "/peisong/order/evaluate",
    businessId = 19,
    apiVersion = "10010",
    apiName = "evaluate",
    needAuth = false
)
public class EvaluateRequest implements MeituanRequest<EvaluateResponse> {
    /**
    * 配送活动标识
    */
    @NotNull(message = "deliveryId不能为空")
    @SerializedName("delivery_id")
    private Long deliveryId;
    /**
    * 美团配送内部订单id，最长不超过32个字符
    */
    @NotBlank(message = "mtPeisongId不能为空")
    @SerializedName("mt_peisong_id")
    private String mtPeisongId;
    /**
    * 评分（5分制）  预留参数，不作为骑手反馈参考  合作方需传入0-5之间分数或者不传，否则报错
    */
    @SerializedName("score")
    private Integer score;
    /**
    * 评论内容（评论的字符长度需小于1024）
    */
    @NotBlank(message = "commentContent不能为空")
    @SerializedName("comment_content")
    private String commentContent;

    public Long getDeliveryId() {
        return deliveryId;
    }
    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
    }
    public String getMtPeisongId() {
        return mtPeisongId;
    }
    public void setMtPeisongId(String mtPeisongId) {
        this.mtPeisongId = mtPeisongId;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }
    public String getCommentContent() {
        return commentContent;
    }
    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }


    @Override
    public MeituanResponse<EvaluateResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<EvaluateResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "EvaluateRequest{" + "deliveryId=" + deliveryId + "," + "mtPeisongId=" + mtPeisongId + "," + "score=" + score + "," + "commentContent=" + commentContent + "}";
    }
}
