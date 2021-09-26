package com.example.myweatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView cityName;
    private TextView temp;
    private TextView wind;
    private TextView press;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        getIntentCityActivity1();
        getIntentCityActivity2();
        getIntentCityActivity3();
    }


    private void init() {
        cityName = findViewById(R.id.cityName);
        temp = findViewById(R.id.temp);
        wind = findViewById(R.id.wind);
        press = findViewById(R.id.press);
    }

    private void getIntentCityActivity1() {
        Intent intent = getIntent();
        String city1 = intent.getStringExtra("city1");
        String temp1 = intent.getStringExtra("temp1");
        String press1 = intent.getStringExtra("press1");
        String wind1 = intent.getStringExtra("wind1");
        cityName.setText(city1);
        temp.setText(temp1);
        wind.setText(wind1);
        press.setText(press1);
    }

    private void getIntentCityActivity2() {
        Intent intent = getIntent();
        String city2 = intent.getStringExtra("city2");
        String temp2 = intent.getStringExtra("temp2");
        String press2 = intent.getStringExtra("press2");
        String wind2 = intent.getStringExtra("wind2");
        cityName.setText(city2);
        temp.setText(temp2);
        wind.setText(wind2);
        press.setText(press2);
    }

    private void getIntentCityActivity3() {
        Intent intent = getIntent();
        String city3 = intent.getStringExtra("city3");
        String temp3 = intent.getStringExtra("temp3");
        String press3 = intent.getStringExtra("press3");
        String wind3 = intent.getStringExtra("wind3");
        cityName.setText(city3);
        temp.setText(temp3);
        wind.setText(wind3);
        press.setText(press3);
    }
}
