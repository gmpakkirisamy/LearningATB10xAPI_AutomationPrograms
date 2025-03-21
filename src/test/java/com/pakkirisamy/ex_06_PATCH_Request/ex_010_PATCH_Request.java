package com.pakkirisamy.ex_06_PATCH_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ex_010_PATCH_Request {
    //PATCH
    //token, booking id
    //Comparing to PUT, PATCH will be payload will be less and method will change as patch
    //public void get_token(){}
    //public void get_booking_id(){}
    @Test
    @Description("Verify the PUT Request for the Restful Booker APIs")
    public void test_put_non_bdd() {
        String token = "934c38cf33eb890";
        String bookingid = "3";

        String payload = "{\n" +
                "    \"firstname\": \"Karthy\",\n" +
                "    \"lastname\": \"Samy\"}";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        //requestSpecification.auth().basic("admin","password123"); // Username password also can be used. But use only use one.
        requestSpecification.cookie("token",token);
        requestSpecification.body(payload).log().all();

        Response response = requestSpecification.when().patch();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }
}
