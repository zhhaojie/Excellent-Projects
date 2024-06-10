package com.meituan.sdk.model.waimaiNg.im.getConnectionToken;

import com.google.gson.annotations.SerializedName;

/**
* 获取长连接的token【必接】
* This file was automatically generated.
*/
public class GetConnectionTokenResponse {
    /**
    * 建立长连接的token
    */
    @SerializedName("connectionToken")
    private String connectionToken;
    /**
    * 30分钟内，消息发送失败的用户数
    */
    @SerializedName("userCount")
    private Long userCount;
    /**
    * 长连接key，用于拼装websocket url
    */
    @SerializedName("connectionId")
    private String connectionId;
    /**
    * im消息加解秘钥
    */
    @SerializedName("imSecret")
    private String imSecret;

    public String getConnectionToken() {
        return connectionToken;
    }
    public void setConnectionToken(String connectionToken) {
        this.connectionToken = connectionToken;
    }
    public Long getUserCount() {
        return userCount;
    }
    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }
    public String getConnectionId() {
        return connectionId;
    }
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
    public String getImSecret() {
        return imSecret;
    }
    public void setImSecret(String imSecret) {
        this.imSecret = imSecret;
    }




    @Override
    public String toString() {
        return "GetConnectionTokenResponse{" + "connectionToken=" + connectionToken + "," + "userCount=" + userCount + "," + "connectionId=" + connectionId + "," + "imSecret=" + imSecret + "}";
    }
}
