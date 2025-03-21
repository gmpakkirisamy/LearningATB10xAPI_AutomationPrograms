package com.pakkirisamy.ex_08_TestNG_Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lab_016_TestNG_DependsOn {

    @Test
    public void method1() {

        System.out.println("Method1");
        Assert.assertTrue(true);

    }
    @Test (dependsOnMethods = "method3")
    public void method2() {
        System.out.println("Method2");
        Assert.assertTrue(true);
    }
    @Test
    public void method3() {
        System.out.println("Method3");
        Assert.assertTrue(true);
    }
}
