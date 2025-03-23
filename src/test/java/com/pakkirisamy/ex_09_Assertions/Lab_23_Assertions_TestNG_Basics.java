package com.pakkirisamy.ex_09_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_23_Assertions_TestNG_Basics {
    //This is majorly used in the market
    //There are two assertions
    //Soft Assertions
    //Hard Assertions
    @Test
    public void test_hardAssertions(){
        System.out.println("Start of the Program!!!");
        Boolean Is_meeru_female = false;
        Assert.assertEquals("samy","Samy");
        System.out.println("End of the program!");
    }
}
