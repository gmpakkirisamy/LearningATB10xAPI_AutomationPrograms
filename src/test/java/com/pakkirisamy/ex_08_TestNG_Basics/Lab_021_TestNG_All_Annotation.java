package com.pakkirisamy.ex_08_TestNG_Basics;

import org.testng.annotations.*;

public class Lab_021_TestNG_All_Annotation {

    @BeforeSuite
    void demo1() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    void demo2() {
        System.out.println("Before Test");
    }

    @BeforeClass
    void demo3() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    void demo4() {
        System.out.println("Before Method");
    }

    @Test
    void test_Case() {
        System.out.println("Test Case");
    }

    @AfterMethod
    void demo5() {
        System.out.println("After Method");
    }

    @AfterClass
    void demo6() {
        System.out.println("After Class");
    }

    @AfterTest
    void demo7() {
        System.out.println("After Test");
    }

    @AfterSuite
    void demo8() {
        System.out.println("After Suite");
    }
}
