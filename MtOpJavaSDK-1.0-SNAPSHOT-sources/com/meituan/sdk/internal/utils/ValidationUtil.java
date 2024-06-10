package com.meituan.sdk.internal.utils;

import com.meituan.sdk.internal.exceptions.MtSdkException;
import com.meituan.sdk.internal.enums.SdkError;
import org.hibernate.validator.HibernateValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Objects;
import java.util.Set;

/**
 * <p>
 * 用于参数校验的工具类
 * </p>
 */
public class ValidationUtil {
    private static final Logger logger = LoggerFactory.getLogger(ValidationUtil.class);

    private static final Validator validator = Validation.byProvider(HibernateValidator.class)
            .configure()
            .failFast(false)
            .buildValidatorFactory()
            .getValidator();

    public static <T> void validate(T obj) throws MtSdkException {
        Set<ConstraintViolation<T>> validateSet = validator.validate(obj);
        if (Objects.nonNull(validateSet) && !validateSet.isEmpty()) {
            logger.error("请求参数校验失败，request:{}", JsonUtil.toJson(obj));
            String messages = validateSet.stream()
                    .map(ConstraintViolation::getMessage)
                    .reduce((m1, m2) -> m1 + "," + m2)
                    .orElse("参数输入有误！");
            throw new MtSdkException(SdkError.VERIFY_PARAM_ERROR.getCode(), SdkError.VERIFY_PARAM_ERROR.getMsg() + messages);
        }
    }
}
