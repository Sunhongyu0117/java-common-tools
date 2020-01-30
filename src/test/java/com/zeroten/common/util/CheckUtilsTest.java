package com.zeroten.common.util;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckUtilsTest {

    @Test
    public void testIsAnyEmpty(){
        Assert.assertEquals( CheckUtils.isAnyEmpty(new String []{"1","2","3"}),true);
        Assert.assertEquals( CheckUtils.isAnyEmpty(new String []{"1","2",""}),false);
    }

    @Test
    public void testIsEmpty(){
        Assert.assertEquals(CheckUtils.isEmpty(new String[]{"1","2"}),false);
        Assert.assertEquals(CheckUtils.isEmpty(new Integer[]{}),true);
        Integer arr []= null;
        Assert.assertEquals(CheckUtils.isEmpty(arr),true);
    }

    @Test
    public void testEqualsString(){
        Assert.assertEquals(CheckUtils.equals("aaa","aaa"),true);
        Assert.assertEquals(CheckUtils.equals("aaa","aba"),false);
        Assert.assertEquals(CheckUtils.equals(null,"aba"),false);
        Assert.assertEquals(CheckUtils.equals("aaa",null),false);
        Assert.assertEquals(CheckUtils.equals(null,null),false);
    }

    @Test
    public void testEqualsInteger(){
        Assert.assertEquals(CheckUtils.equalsInteger(111,111),true);
        Assert.assertEquals(CheckUtils.equalsInteger(111,222),false);
        Assert.assertEquals(CheckUtils.equalsInteger(null,1111),false);
        Assert.assertEquals(CheckUtils.equalsInteger(1111,null),false);
        Assert.assertEquals(CheckUtils.equalsInteger(null,null),false);
    }

}