package com.meituan.sdk.internal.utils;

import com.meituan.sdk.MeituanRequest;
import com.meituan.sdk.annotations.ApiMeta;
import com.meituan.sdk.domain.ApiMetaInfo;
import com.meituan.sdk.internal.exceptions.MtSdkException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 注解处理器
 * </p>
 */
public class AnnotationUtil {

    private static final Logger logger = LoggerFactory.getLogger(AnnotationUtil.class);

    public static <T> ApiMetaInfo getApiMeta(MeituanRequest<T> req) throws MtSdkException {
        ApiMetaInfo metaDO = new ApiMetaInfo();
        Class clazz = req.getClass();
        if (clazz.isAnnotationPresent(ApiMeta.class)) {
            ApiMeta apiMeta = (ApiMeta) clazz.getDeclaredAnnotation(ApiMeta.class);
            metaDO.setApiName(apiMeta.apiName());
            metaDO.setApiVersion(apiMeta.apiVersion());
            metaDO.setBusinessId(apiMeta.businessId());
            metaDO.setNeedAuth(apiMeta.needAuth());
            metaDO.setPath(apiMeta.path());
        } else {
            logger.error("获取request元数据失败，request:{}", JsonUtil.toJson(req));
            throw new MtSdkException("SDK_GET_APIMETA_ERROR", "获取request元数据异常");
        }
        return metaDO;
    }
}
