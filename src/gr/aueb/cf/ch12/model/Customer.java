package gr.aueb.cf.ch12.model;

import java.io.StringReader;

public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private String vatRegNo;
    private String phoneNo;
    private String region;
    private String prefecture;
    private String city;
    private String street;
    private String streetNo;
    private String zipCode;

    public Customer() {
    }

    public Customer(int id, String firstname, String lastname, String vatRegNo,
                    String phoneNo, String region, String prefecture,
                    String city, String street, String streetNo, String zipCode) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.vatRegNo = vatRegNo;
        this.phoneNo = phoneNo;
        this.region = region;
        this.prefecture = prefecture;
        this.city = city;
        this.street = street;
        this.streetNo = streetNo;
        this.zipCode = zipCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getVatRegNo() {
        return vatRegNo;
    }

    public void setVatRegNo(String vatRegNo) {
        this.vatRegNo = vatRegNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(String prefecture) {
        this.prefecture = prefecture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
