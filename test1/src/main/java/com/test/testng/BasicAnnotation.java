package com.test.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("this is test case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("this another testcase");
    }
    @BeforeMethod
    public void beforeTest(){
        System.out.println("do something before test");
    }
    @AfterMethod
    public void afterTest(){
        System.out.println("do something after test");
    }
}
