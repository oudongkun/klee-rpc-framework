package com.klee.utils;

/**
 * @Date 2022/6/21 09:22
 * @Description: String utils
 * @Version v1.0
 */
public class StringUtil {
    public static boolean isBlank(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        for (int i = 0; i < s.length(); ++i) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
