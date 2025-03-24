package com.pakkirisamy.ex_10_payloadManagement.Manual_Method_01;

public class Booking {
    //Since we are using encapulation then these are all private in nature
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

    // firstname, lastname, total price, depositpaid, additinalneeds - into one class called booking, i.e this class
    //checkin , checkout - into another class called BookingDates


    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private String additionalneeds;
    private String BookingDates; // This is different class

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public String getBookingDates() {
        return BookingDates;
    }

    public void setBookingDates(String bookingDates) {
        BookingDates = bookingDates;
    }
}
