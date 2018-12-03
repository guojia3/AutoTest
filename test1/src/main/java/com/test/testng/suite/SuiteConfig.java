package com.test.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("run before the testsuite..........");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("running after testSuite...........");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test............");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test.............");
    }
}
