package com.meituan.sdk.internal.enums;

/**
 * <p>
 * SDK本地错误码
 * </p>
 */
public enum SdkError {

    MISS_PARAM_ERROR("SDK_PARAM_ERROR", "缺少必要的请求参数。"),
    REQUEST_FAILED_ERROR("SDK_REQUEST_FAILED_ERROR", "SDK执行请求异常。"),
    PARSE_RESPONSE_ERROR("SDK_PARSE_RESPONSE_ERROR", "返回值解析异常。"),
    VERIFY_PARAM_ERROR("SDK_VERIFY_PARAM_ERROR", "参数校验异常。"),
    MISS_APPAUTHTOKEN_ERROR("SDK_MISS_APPAUTHTOKEN_ERROR","缺少appAuthToken。"),
    HTTPCLIENT_ERROR("SDK_HTTPCLIENT_ERROR","SDK网络请求工具内部错误。"),
    SIGNNER_UTIL_ERROR("SDK_SIGNNER_UTIL_ERROR","计算签名时发生异常。"),
    ;

    private final String code;
    private final String msg;

    SdkError(String errorCode, String errorMsg) {
        this.code = errorCode;
        this.msg = errorMsg;
    }

    public String getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

}
