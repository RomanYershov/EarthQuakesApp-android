package com.example.s.earthquakesapp;

public class Earthquake {
    private double magnituda;
    private String place;
    private boolean isCunami;
    private long time;


    public Earthquake(double magnituda, String place, boolean isCunami, long time) {
        this.magnituda = magnituda;
        this.place = place;
        this.isCunami = isCunami;
        this.time = time;

    }

    public double getMagnituda() {
        return magnituda;
    }

    public void setMagnituda(double magnituda) {
        this.magnituda = magnituda;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public boolean isCunami() {
        return isCunami;
    }

    public void setCunami(boolean cunami) {
        isCunami = cunami;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
