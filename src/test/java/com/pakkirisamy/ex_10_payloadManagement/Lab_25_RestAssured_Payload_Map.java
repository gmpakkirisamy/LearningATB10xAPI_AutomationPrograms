package com.pakkirisamy.ex_10_payloadManagement;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Lab_25_RestAssured_Payload_Map {
    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    Response response;
    String token;
    Integer bookingId;
    //This type of Payload is rarely used in the companies.
    @Test
    public void test_POST() {
        //We can send the payload details using the Hash map
//    String payload_POST = "{\n" +
//            "    \"bookingid\": 832,\n" +
//            "    \"booking\": {\n" +
//            "        \"firstname\": \"Faye\",\n" +
//            "        \"lastname\": \"Hamill\",\n" +
//            "        \"totalprice\": 111,\n" +
//            "        \"depositpaid\": true,\n" +
//            "        \"bookingdates\": {\n" +
//            "            \"checkin\": \"2018-01-01\",\n" +
//            "            \"checkout\": \"2019-01-01\"\n" +
//            "        },\n" +
//            "        \"additionalneeds\": \"Breakfast\"\n" +
//            "    }\n" +
//            "}";
        Map<String, Object> jsonBodyusingMap = new LinkedHashMap<>();
        jsonBodyusingMap.put("firstname","Faye");
        jsonBodyusingMap.put("lastname","Hamill");
        jsonBodyusingMap.put("totalprice",111);
        jsonBodyusingMap.put("depositpaid",true);

        Map<String, Object> bookingDatesMap = new LinkedHashMap<>();
        bookingDatesMap.put("checkin","2018-01-01");
        bookingDatesMap.put("checkout","2019-01-01");

        jsonBodyusingMap.put("bookingdates",bookingDatesMap);
        jsonBodyusingMap.put("additionalneeds","Breakfast");
        System.out.println(jsonBodyusingMap);

    }
}

