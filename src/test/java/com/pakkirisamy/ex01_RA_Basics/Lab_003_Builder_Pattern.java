package com.pakkirisamy.ex01_RA_Basics;

public class Lab_003_Builder_Pattern {

    public Lab_003_Builder_Pattern step1() {
        System.out.println("Step1");
        return this;
    }
    public Lab_003_Builder_Pattern step2() {
        System.out.println("Step2");
        return this;
    }
    public Lab_003_Builder_Pattern step3(String name) {
        System.out.println("Step3");
        return this;
    }

    public static void main(String[] args) {
        Lab_003_Builder_Pattern bp = new Lab_003_Builder_Pattern();
        bp.step1().step2().step3("Samy");

        //This is the chain pattern!
        // This follow the builder pattern using given when then
    }
}
