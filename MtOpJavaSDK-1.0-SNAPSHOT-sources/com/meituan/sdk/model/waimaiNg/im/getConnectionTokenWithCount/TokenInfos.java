package com.meituan.sdk.model.waimaiNg.im.getConnectionTokenWithCount;

import com.google.gson.annotations.SerializedName;

/**
* 建立长连接的token
* This file was automatically generated.
*/
public class TokenInfos {
    /**
    * 建立长连接的token
    */
    @SerializedName("connectionToken")
    private String connectionToken;
    /**
    * X分钟内，IM两方会话消息发送失败的用户数
    */
    @SerializedName("userSendFailCount")
    private Long userSendFailCount;
    /**
    * X分钟内，评价联系消息发送失败的评价数
    */
    @SerializedName("commentSendFailCount")
    private String commentSendFailCount;

    public String getConnectionToken() {
        return connectionToken;
    }
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }
    public Long getUserSendFailCount() {
        return userSendFailCount;
    }
    public void setUserSendFailCount(Long userSendFailCount) {
        this.userSendFailCount = userSendFailCount;
    }
    public String getCommentSendFailCount() {
        return commentSendFailCount;
    }
    public void setCommentSendFailCount(String commentSendFailCount) {
        this.commentSendFailCount = commentSendFailCount;
    }




    @Override
    public String toString() {
        return "TokenInfos{" + "connectionToken=" + connectionToken + "," + "userSendFailCount=" + userSendFailCount + "," + "commentSendFailCount=" + commentSendFailCount + "}";
    }
}
