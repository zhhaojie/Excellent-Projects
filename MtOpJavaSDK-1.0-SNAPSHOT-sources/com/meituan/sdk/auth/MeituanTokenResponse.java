/**
 * Meituan.com Inc.
 * Copyright (c) 2010-2024 All Rights Reserved.
 */
package com.meituan.sdk.auth;

/**
 * 获取和刷新授权token方法返回的结果类
 */
public class MeituanTokenResponse {
    private Integer code;

    private String msg;

    private MeituanTokenData data;

    public boolean isSuccess() {
        return code != null && code == 0;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MeituanTokenData getData() {
        return data;
    }

    public void setData(MeituanTokenData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MeituanTokenResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}