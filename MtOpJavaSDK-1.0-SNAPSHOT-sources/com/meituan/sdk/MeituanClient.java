package com.meituan.sdk;

import com.meituan.sdk.auth.MeituanTokenResponse;
import com.meituan.sdk.internal.exceptions.MtSdkException;

import java.lang.reflect.Type;

public interface MeituanClient {

    /**
     * 基于API模型的请求，无需appAuthToken鉴权的API
     *
     * @param request 基于API模型构造的请求参数
     * @return MeituanResponse
     * @throws MtSdkException
     */
    <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request) throws MtSdkException;

    /**
     * 基于API模型的请求
     *
     * @param request      基于API模型构造的请求参数
     * @param appAuthToken 接口鉴权token
     * @return MeituanResponse
     * @throws MtSdkException
     */
    <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request, String appAuthToken) throws MtSdkException;

    /**
     * 基于API模型的请求
     *
     * @param request        基于API模型构造的请求参数
     * @param connectTimeout 自定义连接超时时间
     * @param readTimeout    自定义读取超时时间
     * @return MeituanResponse
     * @throws MtSdkException
     */
    <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request, Integer connectTimeout, Integer readTimeout) throws MtSdkException;

    /**
     * 基于API模型的请求
     *
     * @param request        基于API模型构造的请求参数
     * @param appAuthToken   接口鉴权token
     * @param connectTimeout 自定义连接超时时间
     * @param readTimeout    自定义读取超时时间
     * @return MeituanResponse
     * @throws MtSdkException
     */
    <T> MeituanResponse<T> invokeApi(MeituanRequest<T> request, String appAuthToken, Integer connectTimeout, Integer readTimeout) throws MtSdkException;

    /**
     * 通用方式调用接口
     *
     * @param request      自行构造的请求参数
     * @param responseType 当前请求返回值类型的type. eg: Type type = new TypeToken< MeituanResponse< String>>(){}.getType();
     * @return MeituanResponse
     * @throws MtSdkException
     */
    <T> MeituanResponse<T> commonInvokeApi(CommonRequest request, Type responseType) throws MtSdkException;

    /***
     * 用授权码获取OAuth授权的Token
     * @param businessId 业务线ID
     * @param code 美团提供的授权码
     * @return MeituanTokenResponse
     * @throws MtSdkException
     */
    MeituanTokenResponse getOAuthToken(Integer businessId, String code) throws MtSdkException;

    /***
     * 刷新OAuath授权的token
     * @param businessId  业务线ID
     * @param refreshToken 获取token时得到的refreshToken
     * @return MeituanTokenResponse
     * @throws MtSdkException
     */
    MeituanTokenResponse refreshToken(Integer businessId, String refreshToken) throws MtSdkException;
}
