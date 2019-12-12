package com.zeroten.common.util;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {
    @Test
    public void test() {
        Assert.assertFalse(CheckUtils.isAnyEmpty("2", "", "2", null));
    }
}
