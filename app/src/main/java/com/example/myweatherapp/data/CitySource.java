package com.example.myweatherapp.data;

import android.content.res.Resources;
import android.content.res.TypedArray;

import com.example.myweatherapp.R;

import java.util.List;
import java.util.ArrayList;

public class CitySource {
    private List<City> citySource;
    private Resources resources;

    public CitySource(Resources resources) {
        citySource = new ArrayList<>(10);
        this.resources = resources;
    }

    public City getCity(int position) {
        return citySource.get(position);
    }

    public int size(){
        return citySource.size();
    }


    public CitySource build(){
        // строки описаний из ресурсов
        String[] cityName = resources.getStringArray(R.array.cityName);
        // изображения
        int[] coat_of_arms = getImageArray();
        // заполнение источника данных
        for (int i = 0; i < cityName.length; i++) {
            citySource.add(new City(cityName[i], coat_of_arms[i], false));
        }
        return this;
    }

    private int[] getImageArray() {
        TypedArray pictures = resources.obtainTypedArray(R.array.coat_of_arms);
        int length = pictures.length();
        int[] answer = new int[length];
        for(int i = 0; i < length; i++){
            answer[i] = pictures.getResourceId(i, 0);
        }
        return answer;
    }
}
