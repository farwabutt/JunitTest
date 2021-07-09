package com.exercise;

import org.junit.Assert;
import org.junit.Test;

public class JavaCodeTest {
    JavaCode javaCode= new JavaCode();
    @Test
    public void CheckEvenOrOdd(){
        boolean b= javaCode.CheckEvenOrOdd(48);
        Assert.assertEquals(true,b);

    }

    @Test
    public void ReverseString(){
        String s= javaCode.ReverseString("hello");
        Assert.assertEquals("olleh",s);
    }

}