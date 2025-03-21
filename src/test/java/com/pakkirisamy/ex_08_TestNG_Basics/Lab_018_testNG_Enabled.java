package com.pakkirisamy.ex_08_TestNG_Basics;

import org.testng.annotations.Test;

public class Lab_018_testNG_Enabled {
    @Test
    public void test1(){
        System.out.println("Am Test 1");
    }

    @Test (enabled = false) // This will not run during the exeution.
    public void test2(){
        System.out.println("Am Test 2");
    }

    @Test
    public void test3(){
        System.out.println("Am Test 3");
    }
}
