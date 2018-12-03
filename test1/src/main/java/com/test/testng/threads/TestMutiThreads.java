package com.test.testng.threads;

import org.testng.annotations.Test;

public class TestMutiThreads {
    @Test(invocationCount = 10,threadPoolSize = 5)
    public void testMutiThreads(){
        System.out.println("thread id>>>>>>>>"+Thread.currentThread().getId());
    }
}
