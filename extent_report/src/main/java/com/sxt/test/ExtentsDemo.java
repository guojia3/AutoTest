package com.sxt.test;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class ExtentsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test3(){
        Reporter.log("this is an error log");
        throw new RuntimeException();
    }


}
