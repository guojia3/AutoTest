package com.test.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "student")
public class Group2 {

    public void test1(){
        System.out.println("class 2 student 1 is runing........");
    }
    public void test2(){
        System.out.println("class 2 student 2 is runing........");
    }
}
