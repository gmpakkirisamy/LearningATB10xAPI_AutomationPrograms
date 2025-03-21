package com.pakkirisamy.ex_07_DELETE_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ex_011_DELETE_Request {

    @Test
    @Description ("Delete Request")
    public void test_delete_non_bdd() {
        String token = "74ea81eda165232";
        String bookingid = "3";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        //requestSpecification.auth().basic("admin","password123"); // Username password also can be used. But use only use one.
        requestSpecification.cookie("token",token);


        Response response = requestSpecification.when().delete();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(201);
    }
}
