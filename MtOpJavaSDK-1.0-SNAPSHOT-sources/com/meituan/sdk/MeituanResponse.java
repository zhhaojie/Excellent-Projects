package com.meituan.sdk;

import com.meituan.sdk.internal.constants.CommonConstants;

import java.io.Serializable;

/**
 * <p>
 * API响应结果类
 * </p>
 */
public class MeituanResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;

    private String msg;

    private String traceId;

    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTraceId() {
        return traceId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return CommonConstants.OP_SUCCESS.equals(this.code);
    }

    @Override
    public String toString() {
        return "MeituanResponse{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", traceId='" + traceId + '\'' +
                ", data=" + data +
                '}';
    }
}
