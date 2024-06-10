package com.meituan.sdk.internal.http;

import com.meituan.sdk.internal.exceptions.MtSdkException;

import java.util.Map;

public interface HttpClient {

    String postWithUrlEncoded(String url, Map<String, String> requestParams, Map<String, String> headers, HttpConfig httpConfig) throws MtSdkException;

}
