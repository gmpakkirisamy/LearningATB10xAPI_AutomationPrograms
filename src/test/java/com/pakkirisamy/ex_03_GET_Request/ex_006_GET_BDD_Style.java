package com.pakkirisamy.ex_03_GET_Request;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import org.testng.annotations.Test;

public class ex_006_GET_BDD_Style {
    @Test

    public void test_BDD_GET(){
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
}
