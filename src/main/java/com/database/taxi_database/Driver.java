package com.database.taxi_database;

import java.util.Date;

public class Driver {
    String driverID;
    String name;
    String addressFirstLine;
    String addressSecondLine;
    String city;
    String zip;
    String phone;
    String email;
    String DOB;
    String workHours;
    boolean isAvailable; //available to take trips
    boolean isWorking; //working
    Date expectedAvailabilityTime;
    String location;

    Driver (String fullName, String addressFirstLine, String addressSecondLine, String city, String zip, String phone, String email, String DOB, String workHours, boolean isWorking, Date expectedAvailabilityTime, String location){
        this.name = fullName;
        this.addressFirstLine = addressFirstLine;
        this.addressSecondLine = addressSecondLine;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
        this.DOB = DOB;
        this.workHours = workHours;
        this.isWorking = isWorking;
        this.expectedAvailabilityTime = expectedAvailabilityTime;
        this.location = location;
    }

    //tableview bindings for driver



}
