package com.exercise;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JavaCodeTest {
    JavaCode javaCode= new JavaCode();
    @Test
    public void CheckEvenOrOdd(){
        boolean b= javaCode.CheckEvenOrOdd(2);
        Assert.assertEquals(true,b);
        Assert.assertNotNull("Output is null",b);

    }

    @Test
public void ReverseString(){
        String s= javaCode.ReverseString("hello");
        Assert.assertEquals("olleh",s);
    }

}