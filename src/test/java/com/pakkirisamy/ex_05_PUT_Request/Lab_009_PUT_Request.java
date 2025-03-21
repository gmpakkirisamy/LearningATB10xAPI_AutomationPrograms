package com.pakkirisamy.ex_05_PUT_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class Lab_009_PUT_Request {
    //PUT
    //token, booking id

    //public void get_token(){}
    //public void get_booking_id(){}
    @Test
    @Description ("Verify the PUT Request for the Restful Booker APIs")
    public void test_put_non_bdd() {
        String token = "c4bef35dc11764d";
        String bookingid = "1593";

        String payload = "{\n" +
                "    \"firstname\": \"Samy\",\n" +
                "    \"lastname\": \"Pakkirisamy\",\n" +
                "    \"totalprice\": 111,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";

        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com/");
        requestSpecification.basePath("/booking/"+bookingid);
        requestSpecification.contentType(ContentType.JSON);
        // requestSpecification.auth().basic("admin","password123"); - User name password also can be used. But use only use one.
        requestSpecification.cookie("token",token);
        requestSpecification.body(payload).log().all();

        Response response = requestSpecification.when().put();

        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

    }


}
