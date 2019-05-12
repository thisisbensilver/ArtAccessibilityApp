package com.example.artaccessibilityapp;

public class Location {
    private String museumName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String country;

    public Location(String name, String address, String city, String state, int zip, String country) {
        this.museumName = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
}
