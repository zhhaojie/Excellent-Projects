package com.meituan.sdk;

public interface MeituanRequest<T> {
    MeituanResponse<T> deserializeResponse(String response);

    String serializeToJson();
}
