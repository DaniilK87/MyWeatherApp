package com.example.myweatherapp;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myweatherapp.data.City;


public class MainActivity extends AppCompatActivity {

    private TextView cityName;
    private TextView temp;
    private TextView wind;
    private TextView press;
    City city;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getIntentCityActivity();
    }


    private void init() {
        cityName = findViewById(R.id.cityName);
        temp = findViewById(R.id.temp);
        wind = findViewById(R.id.wind);
        press = findViewById(R.id.press);
    }

    private void getIntentCityActivity() {
        Bundle args = getIntent().getExtras();
        if (args != null) {
            city = (City) args.getSerializable(City.class.getSimpleName());
            cityName.setText(city.getCityName());
            temp.setText(city.getTemp());
            wind.setText(city.getWind());
            press.setText(city.getPress());
        }
    }

}

