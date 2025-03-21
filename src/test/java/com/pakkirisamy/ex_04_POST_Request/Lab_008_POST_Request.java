package com.pakkirisamy.ex_04_POST_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Lab_008_POST_Request {



    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Test
    @Description ("Verify the POST Req Positive Create Token")

    public void test_POST_NonBDDStyle_CreateToken () {
        //We need URL, Method, Payload, body, headers
        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation());
        String payload = "{\n" +
        "    \"username\" : \"admin\",\n" +
        "    \"password\" : \"password123\"\n" +
        "}";

        //Part 1 - Pre-condition - Preparing request -URL, Headers, Auth....
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);

        //Making HTTP Request Part 2
        response = r.when().log().all().post();

        //Verification Part 3
        vr = response.then().log().all();
        vr.statusCode(200);
    }

}
