package com.example.myweatherapp.data;

import java.io.Serializable;

public class City implements Serializable {

    public City(String cityName, int coat_of_arms, boolean b) {
        this.cityName = cityName; this.coat_of_arms = coat_of_arms;
    }


    public String getCityName() {
        return cityName;
    }

    public String getTemp() {
        return temp;
    }


    public String getPress() {
        return press;
    }


    public String getWind() {
        return wind;
    }

    public int getCoat_of_arms() {
        return coat_of_arms;
    }


    private String cityName;
    private int coat_of_arms;
    private String temp;
    private String press;
    private String wind;

    public City(String cityName, String temp, String press, String wind) {
        this.cityName = cityName;
        this.temp = temp;
        this.press = press;
        this.wind = wind;
    }

}
