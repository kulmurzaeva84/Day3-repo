package com.cybertek.tests.day5_testNG_intro_dropdowns;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Introduction {
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before Method is running");
    }
    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After Method is running");
    }
   @Test
    public void test1(){
        System.out.println("Test1 is running");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is running");
    }
}
