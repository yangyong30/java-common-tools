package com.zeroten.common.util;


import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @Test
    public void testQQPage() {
        Integer[] aa = {1, 2, 3, 55, 99};
        int[] bb = {22, 33, 44, 55, 66};
        int[] bb1 = {22, 33, 44, 55, 66};
        List<Integer> integers = Arrays.asList(aa);
        List<int[]> ints = Arrays.asList(bb,bb1);

        System.out.println(integers + ":" + integers.size());
        System.out.println(ints + ":" + ints.size());
        for (int i = 0; i < ints.size(); i++) {
            System.out.println(Arrays.toString(ints.get(i)));
        }
    }
}
