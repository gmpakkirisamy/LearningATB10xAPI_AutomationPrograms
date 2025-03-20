package com.pakkirisamy.ex_03_GET_Request;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class ex_007_GET_NonBDDSytle {

    //There are three parts in the non bdd framework

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

@Test
@Description ("Positive Testcase")
    public void test_NonBDD_GET() {

        r = RestAssured.given();
        r.baseUri("https://api.zippoptam.us");
        r.basePath("/IN/609607");

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(200);
    }

    //We can reuse, that is the best benefit here.

    @Test
    @Description("Negative Scenario")
    public void test_NonBDDStyleGET_Negative () {

        r = RestAssured.given();
        r.baseUri("https://api.zippoptam.us");
        r.basePath("/IN/-1");

        response = r.when().log().all().get();

        vr = response.then().log().all().statusCode(404);
    }
}

