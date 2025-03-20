package com.pakkirisamy.ex01_RA_Basics;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

public class Lab_004_Multiple_Testcases {
    public static void main(String[] args) {

        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames());
        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());

        String pincode ="609607";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        pincode ="@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);

        pincode ="weewewe";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
