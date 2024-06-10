package com.meituan.sdk.internal.utils;

import com.meituan.sdk.internal.exceptions.MtSdkException;
import com.meituan.sdk.internal.enums.SdkError;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 * <p>
 * 签名相关实现
 * </p>
 */
public class SignerUtil {

    public static String getSign(String signKey, Map<String, String> params) throws MtSdkException {
        try {
            String sortedStr = getSortedParamStr(params);
            String paraStr = signKey + sortedStr;

            return createSign(paraStr);
        } catch (Exception e) {
            throw new MtSdkException(SdkError.SIGNNER_UTIL_ERROR, e);
        }

    }

    /**
     * 构造自然排序请求参数
     *
     * @param params 请求
     * @return 字符串
     */
    private static String getSortedParamStr(Map<String, String> params) {
        Set<String> sortedParams = new TreeSet<>(params.keySet());

        StringBuilder strB = new StringBuilder();
        // 排除sign和空值参数
        for (String key : sortedParams) {
            if ("sign".equalsIgnoreCase(key)) {
                continue;
            }

            String value = params.get(key);

            if (Objects.nonNull(value) && !value.isEmpty()) {
                strB.append(key).append(value);
            }
        }
        return strB.toString();
    }

    /**
     * 生成新sign
     *
     * @param str 字符串
     * @return String
     */
    private static String createSign(String str) throws Exception {
        if (str == null || str.length() == 0) {
            return null;
        }
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        MessageDigest mdTemp = MessageDigest.getInstance("SHA1");
        mdTemp.update(str.getBytes("UTF-8"));

        byte[] md = mdTemp.digest();
        int j = md.length;
        char[] buf = new char[j * 2];
        int k = 0;
        int i = 0;
        while (i < j) {
            byte byte0 = md[i];
            buf[k++] = hexDigits[byte0 >>> 4 & 0xf];
            buf[k++] = hexDigits[byte0 & 0xf];
            i++;
        }
        return new String(buf);
    }
}
