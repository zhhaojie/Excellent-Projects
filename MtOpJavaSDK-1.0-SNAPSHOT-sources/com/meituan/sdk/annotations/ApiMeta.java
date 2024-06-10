package com.meituan.sdk.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ApiMeta {
    String path();

    int businessId();

    String apiVersion();

    String apiName();

    boolean needAuth();
}
