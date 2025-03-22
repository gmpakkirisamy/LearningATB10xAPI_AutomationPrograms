package com.pakkirisamy.ex_08_TestNG_Basics;

import org.testng.annotations.Test;

public class Lab_020_testNG_invocationCount {
    @Test
    public void test1(){
        System.out.println("Am Test 1");
    }

    @Test (invocationCount = 5) // This will run 5 times continuously.
    public void test2(){
        System.out.println("Am Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Am Test 3");
    }
}
