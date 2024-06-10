package com.meituan.sdk.model.wmoperNg.im.getConnectionTokenWithCount;

import java.util.List;
import com.google.gson.annotations.SerializedName;

/**
* 获取多个长连接
* This file was automatically generated.
*/
public class GetConnectionTokenWithCountResponse {
    /**
    * 建立长连接的token
    */
    @SerializedName("token_infos")
    private List<TokenInfos> tokenInfos;
    @SerializedName("appkey")
    private Long appkey;
    /**
    * 消息加解密密钥
    */
    @SerializedName("imSecret")
    private String imSecret;

    public List<TokenInfos> getTokenInfos() {
        return tokenInfos;
    }
    public void setTokenInfos(List<TokenInfos> tokenInfos) {
        this.tokenInfos = tokenInfos;
    }
    public Long getAppkey() {
        return appkey;
    }
    public void setAppkey(Long appkey) {
        this.appkey = appkey;
    }
    public String getImSecret() {
        return imSecret;
    }
    public void setImSecret(String imSecret) {
        this.imSecret = imSecret;
    }




    @Override
    public String toString() {
        return "GetConnectionTokenWithCountResponse{" + "tokenInfos=" + tokenInfos + "," + "appkey=" + appkey + "," + "imSecret=" + imSecret + "}";
    }
}
