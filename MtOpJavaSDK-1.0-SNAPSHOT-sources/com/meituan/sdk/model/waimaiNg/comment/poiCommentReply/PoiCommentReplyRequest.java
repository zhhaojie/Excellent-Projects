package com.meituan.sdk.model.waimaiNg.comment.poiCommentReply;

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
* 外卖评价回复
* This file was automatically generated.
*/
@ApiMeta(
    path = "/waimai/poi/addReply",
    businessId = 2,
    apiVersion = "10013",
    apiName = "poi_comment_reply",
    needAuth = true
)
public class PoiCommentReplyRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">外卖评价ID</font></span></p>
    */
    @NotNull(message = "commentId不能为空")
    @SerializedName("commentId")
    private Long commentId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">商家回复内容</font></span></p>
    */
    @NotBlank(message = "reply不能为空")
    @SerializedName("reply")
    private String reply;

    public Long getCommentId() {
        return commentId;
    }
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }
    public String getReply() {
        return reply;
    }
    public void setReply(String reply) {
        this.reply = reply;
    }


    @Override
    public MeituanResponse<String> deserializeResponse(String response) {
        Type type = new TypeToken<MeituanResponse<String>>(){}.getType();
        return JsonUtil.fromJson(response, type);
    }
    @Override
    public String serializeToJson() {
        return JsonUtil.toJson(this);
    }


    @Override
    public String toString() {
        return "PoiCommentReplyRequest{" + "commentId=" + commentId + "," + "reply=" + reply + "}";
    }
}
