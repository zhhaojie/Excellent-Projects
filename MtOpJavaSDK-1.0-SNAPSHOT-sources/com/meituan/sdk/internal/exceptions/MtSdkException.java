package com.meituan.sdk.internal.exceptions;

import com.meituan.sdk.internal.enums.SdkError;

/**
 * <p>
 * MtSdkException
 * </p>
 */
public class MtSdkException extends Exception {

    private String errCode;
    private String errMsg;

    public MtSdkException(SdkError sdkError, Throwable e) {
        super(e);
        this.errCode = sdkError.getCode();
        this.errMsg = e.getMessage();
    }

    public MtSdkException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public MtSdkException(SdkError sdkError) {
        super(sdkError.getCode() + ":" + sdkError.getMsg());
        this.errCode = sdkError.getCode();
        this.errMsg = sdkError.getMsg();
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }


}
