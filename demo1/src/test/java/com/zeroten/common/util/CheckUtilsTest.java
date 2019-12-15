package com.zeroten.common.util;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckUtilsTest {
    @Test
    public void test() {
        Assert.assertFalse(CheckUtils.isAnyEmpty("2", "", "2", null));
    }

    @Test
    public void testSort() {
        int[] arr = {1, 23, 5, 6, 1, 2, 3};
        Assert.assertEquals(ArrayUtils.sort(arr), new int[]{1, 1, 2, 3, 5, 6, 23});
    }
}
