package com.example.myweatherapp.data;

import java.io.Serializable;


public class City implements Serializable {


    public City(String cityName, int coat_of_arms, boolean b) {
        this.cityName = cityName; this.coat_of_arms = coat_of_arms;
    }


    public String getCityName() {
        return cityName;
    }
    public int getCoat_of_arms() {
        return coat_of_arms;
    }


    private String cityName;
    private int coat_of_arms;

}
