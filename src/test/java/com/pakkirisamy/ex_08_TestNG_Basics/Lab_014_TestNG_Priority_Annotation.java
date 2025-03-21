package com.pakkirisamy.ex_08_TestNG_Basics;
import org.testng.annotations.Test;

public class Lab_014_TestNG_Priority_Annotation {

    @Test (priority = 2) //It will run based on the priority mentioned
    public void getToken(){
        System.out.println("2");
    }

    @Test (priority = 1)
    public void test_PUT() {
        System.out.println("1");
    }

    @Test (priority = 4)
    public void rtest_PUT() {
        System.out.println("4");
    }

    @Test (priority = 3)
    public void closeAllThings(){
        System.out.println("3");
    }
}
