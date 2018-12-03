package com.test.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class Group1 {
    public void test1(){
        System.out.println("class 1 teacher 1 is runing........");
    }
    public void test2(){
        System.out.println("class 1 teacher 2 is runing........");
    }
}
