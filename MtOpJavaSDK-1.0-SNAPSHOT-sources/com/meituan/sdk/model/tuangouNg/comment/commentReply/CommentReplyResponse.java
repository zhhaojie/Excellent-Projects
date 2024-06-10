package com.meituan.sdk.model.tuangouNg.comment.commentReply;

import com.google.gson.annotations.SerializedName;

/**
* 商家回复评论
* This file was automatically generated.
*/
public class CommentReplyResponse {
    /**
    * 商家回复内容
    */
    @SerializedName("bizReply")
    private String bizReply;
    /**
    * 回复时间
    */
    @SerializedName("replyTime")
    private String replyTime;

    public String getBizReply() {
        return bizReply;
    }
    public void setBizReply(String bizReply) {
        this.bizReply = bizReply;
    }
    public String getReplyTime() {
        return replyTime;
    }
    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }




    @Override
    public String toString() {
        return "CommentReplyResponse{" + "bizReply=" + bizReply + "," + "replyTime=" + replyTime + "}";
    }
}
