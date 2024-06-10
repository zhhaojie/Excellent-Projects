package com.meituan.sdk.internal.utils;

/**
 * <p>
 * 字符串工具类
 * </p>
 */
public class StringUtil {

    /**
     * 判断字符串是否为空或null
     *
     * @param value
     * @return boolean
     */
    public static boolean isEmpty(String value) {
        if (value == null) {
            return true;
        }
        for (int i = 0; i < value.length(); i++) {
            if ((!Character.isWhitespace(value.charAt(i)))) {
                return false;
            }
        }
        return true;
    }


    /**
     * 判断String[]是否为空
     *
     * @param values
     * @return boolean
     */
    public static boolean areNotEmpty(String... values) {
        boolean flag = true;
        if (values == null || values.length == 0) {
            flag = false;
        } else {
            for (String value : values) {
                flag &= !isEmpty(value);
            }
        }
        return flag;
    }
}
