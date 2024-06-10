package com.meituan.sdk.model.tuangouNg.comment.commentReply;

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
* 商家回复评论
* This file was automatically generated.
*/
@ApiMeta(
    path = "/review/reply",
    businessId = 1,
    apiVersion = "10000",
    apiName = "comment_reply",
    needAuth = true
)
public class CommentReplyRequest implements MeituanRequest<CommentReplyResponse> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">评论id(由查询评价接口返回)</font></span></p>
    */
    @NotNull(message = "feedbackId不能为空")
    @SerializedName("feedbackId")
    private Long feedbackId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">评论内容，只支持文字，不支持图片等其他格式</font></span></p>
    */
    @NotBlank(message = "comment不能为空")
    @SerializedName("comment")
    private String comment;

    public Long getFeedbackId() {
        return feedbackId;
    }
    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public MeituanResponse<CommentReplyResponse> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<CommentReplyResponse>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "CommentReplyRequest{" + "feedbackId=" + feedbackId + "," + "comment=" + comment + "}";
    }
}
