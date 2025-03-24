package com.pakkirisamy.ex_10_payloadManagement.Tool_Method_02;
import java.util.LinkedHashMap;
import java.util.Map;
public class Booking {

    //Payloads are sent in this website and converted as json https://www.jsonschema2pojo.org/
    //These are the inputs
//    {
//        "firstname" : "Jim",
//            "lastname" : "Brown",
//            "totalprice" : 111,
//            "depositpaid" : true,
//            "bookingdates" : {
//        "checkin" : "2018-01-01",
//                "checkout" : "2019-01-01"
//    },
//        "additionalneeds" : "Breakfast"
//    }

    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private BookingDates bookingdates;
    private String additionalneeds;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

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

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
