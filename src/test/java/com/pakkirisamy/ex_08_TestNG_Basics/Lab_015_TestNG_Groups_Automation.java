package com.pakkirisamy.ex_08_TestNG_Basics;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_015_TestNG_Groups_Automation {
    //Grouping test cases as below
    //Sanity - 1 TC
    //Regression - 2 TC
    //Priority1 - 2 TC

    @Test (groups = {"sanity","reg"}, priority = 1 )
    public void test_sanityRun(){
        System.out.println("Sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }

    @Test (groups = {"p1","reg"}, priority = 2)
    public void test_regRun(){
        System.out.println("Regression");
        Assert.assertTrue(false);
    }

    @Test (groups = {"p1","reg"}, priority = 3)
    public void test_smokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }
}
