package com.zeroten.common.util;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckUtils {
    /**
     * String... strings为可变参数，你可以认为它是 String[] strings。
     * 如果 strings 中有任意一个字符串为空，
     * 则返回 false，否则返回 true。
     *
     * @param args
     * @return
     */
    public static boolean isAnyEmpty(String... args) {
        boolean isNull = true;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == null) {
                isNull = false;
                break;
            }
        }
        return isNull;
    }

    /**
     * 判断引用类型数组是否为空，为空或 null 则返回 true，否则返回 false
     *
     * @param arr
     * @return
     */
    public static boolean isEmpty(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || "".equals(arr[i])) {
                return true;
            }
        }
        return false;
    }

    /**
     * 判断 str1 字符串是否相等，相等则返回 true，否则返回 false。
     * 当其中一个是 null 时返回false
     *
     * @param str1
     * @param str2
     * @return
     */
    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equals(str2);
    }

    /**
     * 判断 n1 和 n2 的值是否相等，相等则返回 true，否则返回 false。
     * 当其中一个是 null 时返回false。
     *
     * @param n1
     * @param n2
     * @return
     */
    public static boolean equals(Integer n1, Integer n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        return n1.equals(n2);
    }

}
