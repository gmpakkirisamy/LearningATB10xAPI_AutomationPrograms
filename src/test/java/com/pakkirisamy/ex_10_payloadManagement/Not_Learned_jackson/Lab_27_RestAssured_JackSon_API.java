package com.pakkirisamy.ex_10_payloadManagement.Not_Learned_jackson;
import com.google.gson.Gson;
import com.pakkirisamy.ex_10_payloadManagement.gson.Booking;
import com.pakkirisamy.ex_10_payloadManagement.gson.BookingResponse;
import com.pakkirisamy.ex_10_payloadManagement.gson.Bookingdates;
import io.restassured.RestAssured;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class Lab_27_RestAssured_JackSon_API {

    RequestSpecification requestSpecification;
    ValidatableResponse validatableResponse;
    @Test
    public void test_Create_Booking_Positive() {
        RestAssured.config = RestAssured.config().sslConfig(SSLConfig.sslConfig().allowAllHostnames().relaxedHTTPSValidation());
        Booking booking = new Booking();
        booking.setFirstname("Jim");
        booking.setLastname("Brown");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);

        com.pakkirisamy.ex_10_payloadManagement.gson.Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");
        booking.setBookingdates(bookingdates);
        booking.setAdditionalneeds("Breakfast");

        System.out.println(booking);

        //Java Object -> JSON // This cannot directly converted to server. so here we are using GSON to do that which means covnering to JSON file.
        //GSON- is the google library which will convert your class to JSON and JSON to class. This is provided by the google.

        Gson gson = new Gson();
        String jsonStringBooking = gson.toJson(booking);
        System.out.println(jsonStringBooking);


        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonStringBooking).log().all();

        Response response = requestSpecification.when().post();
        String jsonResponseString = response.asString();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        //Case 1 - extract() - Direct Extraction

        String firstname1 = response.then().extract().path("booking.firstname");
        System.out.println(firstname1);

        //TestNG Validation using Assertions
        Assert.assertEquals(firstname1,"Jim");

        //AssertJ Validation using Assertions
        assertThat(firstname1).isNotNull().isNotBlank().isNotEmpty().isEqualTo("Jim");

        //Case 2 - jsonPath.getString("") JSON Path Extraction

        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingId = jsonPath.getString("bookingid");
        String firstname = jsonPath.getString("booking.firstname");
        String checkin = jsonPath.getString("booking.bookingdates.checkin");

        System.out.println(bookingId);
        System.out.println(firstname);
        System.out.println(checkin);

        //Server - JSONString > Java Object (BookingResponse)- getter to verify

        //Case 3 - DeSerialization - Extraction (This is the one we are going to use in our projects)

        String jsonResponseString1 = response.asString();
        com.pakkirisamy.ex_10_payloadManagement.gson.BookingResponse bookingResponse = gson.fromJson(jsonResponseString1, BookingResponse.class);
        System.out.println(bookingResponse.getBookingid());
        System.out.println(bookingResponse.getBooking().getFirstname());
        System.out.println(bookingResponse.getBooking().getLastname());

        assertThat(bookingResponse.getBookingid()).isNotZero().isNotNull();
        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("Jim").isNotNull().isNotEmpty();

    }
}
