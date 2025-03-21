package com.pakkirisamy.ex_08_TestNG_Basics;

import org.testng.annotations.Test;

public class Lab_019_testNG_Always_Run {
    @Test
    public void test1(){
        System.out.println("Am Test 1");
    }

    @Test (alwaysRun = true) // This will run always.
    public void test2(){
        System.out.println("Am Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Am Test 3");
    }
}
