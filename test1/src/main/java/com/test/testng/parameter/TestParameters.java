package com.test.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {

    @Test
    @Parameters({"name","age"})
    public void test(String name,int age){
        System.out.println("hello bodies,my name is " + name + ",and i am " + age + " years old");
    }
}
