package com.pakkirisamy.ex01_RA_Basics;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;

public class Lab_001_API_Testing {
    public static void main(String[] args) {

        //Gherkins Syntax
        //Given() -> Pre Req - URL, Headers, Auth, Body....
        //When() -> HTTP method ? - GET/POST/PUT/PATCH/DELETE....
        //Then() -> Validation -> 200 ok, firstname == SAMY

        //Full URL - https://api.zippopotam.us/IN/560016
        //Base URI  - https://api.zippopotam.us
        //Base Path -/IN/560016

        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames());
        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().relaxedHTTPSValidation());
        RestAssured.
                given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/560016")
                .when()
                    .get()
                .then()
                    .log().all()
                .statusCode(200);

    }
}
