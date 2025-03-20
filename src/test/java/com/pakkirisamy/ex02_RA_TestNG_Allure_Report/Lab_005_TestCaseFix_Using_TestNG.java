package com.pakkirisamy.ex02_RA_TestNG_Allure_Report;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import org.testng.annotations.Test;

public class Lab_005_TestCaseFix_Using_TestNG {

        @Test // TestNG know this is one of the test case by using this annotation
        @Description ("TC1 # Verify that positive testcase gives 200 ok")
        public void test_GET_positive_tc1(){
                RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation());
                RestAssured
                        .given()
                        .baseUri("https://api.zippopotam.us")
                        .basePath("IN/609607") // Here we are hard coding the value.
                        .when()
                        .get()
                        .then()
                        .log().all().statusCode(200);
        }

        @Test // TestNG know this is one of the test case by using this annotation
        @Description ("TC2 # Verify that negative testcase gives 201 ok")
        public void test_GET_negative_tc2(){
                RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation());
                RestAssured
                        .given()
                        .baseUri("https://api.zippopotam.us")
                        .basePath("IN/-1") // Here we are hard coding the value.
                        .when()
                        .get()
                        .then()
                        .log().all().statusCode(200);
        }

        @Test // TestNG know this is one of the test case by using this annotation
        @Description ("TC3 # Verify that negative testcase gives 201 ok")
        public void test_GET_negative_tc3(){
                RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation());
                RestAssured
                        .given()
                        .baseUri("https://api.zippopotam.us")
                        .basePath("IN/wedsde12") // Here we are hard coding the value.
                        .when()
                        .get()
                        .then()
                        .log().all().statusCode(200);

        }

}
