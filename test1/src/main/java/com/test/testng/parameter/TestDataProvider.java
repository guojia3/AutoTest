package com.test.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class TestDataProvider {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider(){
        return  new Object[][]{
                {"zhangsan",15},
                {"lisi",20}
        };
    }

    @Test(dataProvider = "method")
    public void test1(String name,int age){
        System.out.println("test1>>>>>>>name="+name+";age="+age);
    }
    @Test(dataProvider = "method")
    public void test2(String name,int age){
        System.out.println("test2>>>>>>>name="+name+";age="+age);
    }

    @DataProvider(name = "method")
    public Object[][] methodData(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"alex",13},
                    {"nick",12}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"joe",23},
                    {"shirely",35}
            };
        }

        return result;
    }

}
