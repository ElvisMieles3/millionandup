package com.certificacion.automation.models;

public class ReservationData {

    private String day;
    private String hour;


    public String getDay() {
        return day;
    }

    public String getHour() {
        return hour;
    }

    public ReservationData(String day, String hour) {
        this.day = day;
        this.hour = hour;
    }

}
