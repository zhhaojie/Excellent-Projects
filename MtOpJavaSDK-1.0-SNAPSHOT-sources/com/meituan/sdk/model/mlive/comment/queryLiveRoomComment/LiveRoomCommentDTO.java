package com.meituan.sdk.model.mlive.comment.queryLiveRoomComment;

import com.google.gson.annotations.SerializedName;

/**
* 
* This file was automatically generated.
*/
public class LiveRoomCommentDTO {
    /**
    * 游标，防止数据重复查询
    */
    @SerializedName("cursor")
    private Long cursor;
    /**
    * 昵称
    */
    @SerializedName("nickname")
    private String nickname;
    /**
    * 消息内容
    */
    @SerializedName("message")
    private String message;
    /**
    * 消息创建时间戳
    */
    @SerializedName("createTime")
    private Long createTime;

    public Long getCursor() {
        return cursor;
    }
    public void setCursor(Long cursor) {
        this.cursor = cursor;
    }
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Long getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }




    @Override
    public String toString() {
        return "LiveRoomCommentDTO{" + "cursor=" + cursor + "," + "nickname=" + nickname + "," + "message=" + message + "," + "createTime=" + createTime + "}";
    }
}
