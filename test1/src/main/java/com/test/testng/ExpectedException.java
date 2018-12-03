package com.test.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void expectedException(){
        throw new RuntimeException();
    }
}
