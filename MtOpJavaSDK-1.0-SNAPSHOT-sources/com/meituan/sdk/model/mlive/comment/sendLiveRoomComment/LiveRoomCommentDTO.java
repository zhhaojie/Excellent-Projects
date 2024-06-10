package com.meituan.sdk.model.mlive.comment.sendLiveRoomComment;

import com.google.gson.annotations.SerializedName;

/**
* <p data-diff-id="ct-diff-id-8d0cbba9-7b56-4e2d-8ec1-cc017b7a4054">直播评论DTO</p>
* This file was automatically generated.
*/
public class LiveRoomCommentDTO {
    /**
    * <p data-diff-id="ct-diff-id-9fcc3abd-147a-4701-8c3d-d2df2afa2fc7">消息内容</p>
    */
    @SerializedName("message")
    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }




    @Override
    public String toString() {
        return "LiveRoomCommentDTO{" + "message=" + message + "}";
    }
}
