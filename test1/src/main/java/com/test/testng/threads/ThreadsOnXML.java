package com.test.testng.threads;

import org.testng.annotations.Test;

public class ThreadsOnXML {

    @Test
    public void test1(){
        System.out.println("thread id:>>>>>>"+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println("thread id:>>>>>>"+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println("thread id:>>>>>>"+Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.println("thread id:>>>>>>"+Thread.currentThread().getId());
    }
}
