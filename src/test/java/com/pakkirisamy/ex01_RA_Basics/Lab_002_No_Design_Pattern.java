package com.pakkirisamy.ex01_RA_Basics;

public class Lab_002_No_Design_Pattern {
    public static void main(String[] args) {

        Lab_002_No_Design_Pattern ndp = new Lab_002_No_Design_Pattern();
         ndp.step1();
         ndp.step2();
         ndp.step3("Samy");

         // This is non chaining pattern
        // We call using one by one using the reference

    }
    public void step1() {
        System.out.println("Step1");
    }
    public void step2() {
        System.out.println("Step2");
    }
    public void step3(String name) {
        System.out.println("Step3");
    }
}
