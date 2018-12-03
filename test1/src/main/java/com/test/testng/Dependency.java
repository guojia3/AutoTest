package com.test.testng;

import org.testng.annotations.Test;

public class Dependency {
    @Test
    public void test1(){
        System.out.println("test1 running.........");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test1 running.........");
    }
}
