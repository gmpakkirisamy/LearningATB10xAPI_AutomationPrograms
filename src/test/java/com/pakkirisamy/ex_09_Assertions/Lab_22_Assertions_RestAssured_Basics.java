package com.pakkirisamy.ex_09_Assertions;

import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class Lab_22_Assertions_RestAssured_Basics {
//  These assertions are not used in the market or it used very less

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;

    @Test

    public void payload_POST() {
        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation());
        String payload_POST = "{\n" +
                "    \"firstname\": \"James\",\n" +
                "    \"lastname\": \"Brown\",\n" +
                "    \"totalprice\": 967,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2017-11-12\",\n" +
                "        \"checkout\": \"2020-11-27\"\n" +
                "    }\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(payload_POST).log().all();

        Response response = requestSpecification.when().post();


        //Get Validatable response to perform the validation.

        validatableResponse = response.then().log().all();

        //Rest Assured
        validatableResponse.statusCode(200);

        //To use the Rest Assure import the import.org.hamcrest.Matchers;
        //Need to verify below : firstname, lastname and booking id should not be null

        validatableResponse.body("booking.firstname", Matchers.equalTo("James"));
        validatableResponse.body("booking.lastname", Matchers.equalTo("Brown"));
        validatableResponse.body("booking.depositpaid", Matchers.equalTo(true));
        validatableResponse.body("bookingid",Matchers.notNullValue());

    }


}
