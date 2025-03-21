package com.pakkirisamy.ex_08_TestNG_Basics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lab_013_TestNG_AllAnnotations {
    //PUT Request
    //1. getToken
    //2. getBookingId
    //3. test_PUT (which will use the above two methods)

    @BeforeTest //Before @Test this will run
    public void getToken(){
        System.out.println("BeforeTest");
    }

    @Test
    public void test_PUT() {
        System.out.println("Test");
    }

    @Test
    public void rtest_PUT() {
        System.out.println("Based on the Alphabet order am coming in Test Annotation");
    }

    @AfterTest //After @Test this will run
    public void closeAllThings(){
        System.out.println("AfterTest");
    }
}

