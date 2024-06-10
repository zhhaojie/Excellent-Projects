/**
 * Meituan.com Inc.
 * Copyright (c) 2010-2024 All Rights Reserved.
 */
package com.meituan.sdk.auth;

/**
 * 获取授权token和刷新token返回的数据
 */
public class MeituanTokenData {
    //访问令牌, 用于访问接口
    private String accessToken;

    //accessToken的访问过期时间【单位秒】，还有多少秒后过期
    private int expireIn;

    //更新令牌，用于在accessToken过期前刷新token
    private String refreshToken;

    //授权范围
    private String scope;

    //授权实体的唯一标识
    private String opBizCode;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public int getExpireIn() {
        return expireIn;
    }

    public void setExpireIn(int expireIn) {
        this.expireIn = expireIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getOpBizCode() {
        return opBizCode;
    }

    public void setOpBizCode(String opBizCode) {
        this.opBizCode = opBizCode;
    }

    @Override
    public String toString() {
        return "MeituanTokenData{" +
                "accessToken='" + accessToken + '\'' +
                ", expireIn=" + expireIn +
                ", refreshToken='" + refreshToken + '\'' +
                ", scope='" + scope + '\'' +
                ", opBizCode='" + opBizCode + '\'' +
                '}';
    }
}