package com.example.myweatherapp.data;



import java.util.ArrayList;
import java.util.List;

public class CityList {

    List<String> cityList = new ArrayList<>();

    public List<String> getCityList() {
        cityList.add("London");
        cityList.add("Paris");
        cityList.add("Madrid");
        cityList.add("Milan");
        cityList.add("Amsterdam");
        cityList.add("Berlin");
        cityList.add("Rome");
        cityList.add("Prague");
        cityList.add("Vein");
        cityList.add("Monaco");
        return cityList;
    }
}
