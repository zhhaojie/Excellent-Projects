package com.meituan.sdk.model.wmoperNg.comment.wmoperCommentAddReply;

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
* 根据评价id添加商家回复
* This file was automatically generated.
*/
@ApiMeta(
    path = "/wmoper/ng/comment/addReply",
    businessId = 16,
    apiVersion = "10002",
    apiName = "wmoper_comment_add_reply",
    needAuth = false
)
public class WmoperCommentAddReplyRequest implements MeituanRequest<String> {
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">外卖评价ID</font></span></p>
    */
    @NotNull(message = "commentId不能为空")
    @SerializedName("commentId")
    private Long commentId;
    /**
    * <p><span style="color: rgba(0, 0, 0, 0.87)"><font style="font-size:14px;line-height:22px" data-size="14">ERP方门店id 最大长度100</font></span></p>
    */
    @NotBlank(message = "ePoiId不能为空")
    @SerializedName("ePoiId")
    private String ePoiId;
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
    public String getEPoiId() {
        return ePoiId;
    }
    public void setEPoiId(String ePoiId) {
        this.ePoiId = ePoiId;
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
        return "WmoperCommentAddReplyRequest{" + "commentId=" + commentId + "," + "ePoiId=" + ePoiId + "," + "reply=" + reply + "}";
    }
}
