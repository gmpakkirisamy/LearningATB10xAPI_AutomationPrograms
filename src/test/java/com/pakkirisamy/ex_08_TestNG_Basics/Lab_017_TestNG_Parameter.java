package com.pakkirisamy.ex_08_TestNG_Basics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Lab_017_TestNG_Parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Am demo one Testcase !");

        if (value.equalsIgnoreCase("chrome"))
        {
            System.out.println("I will start the chrome browser");
        }
        if (value.equalsIgnoreCase("firefox"))
        {
            System.out.println("I will start the firefox browser");
        }
    }
}
