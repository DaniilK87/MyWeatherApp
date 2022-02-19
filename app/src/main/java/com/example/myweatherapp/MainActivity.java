package com.example.myweatherapp;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myweatherapp.data.Retrofit.OpenWeather;
import com.example.myweatherapp.data.model.Weather;
import com.example.myweatherapp.data.model.WeatherRequest;

import java.nio.charset.StandardCharsets;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity {

    private TextView cityName;
    private TextView temp;
    private TextView wind;
    private TextView press;
    private OpenWeather openWeather;
    private ImageView imageWeatherView;
    public static final String apiKey = "266622b8a37f46d963a18a937fda0156";
    private static final float AbsoluteZERO = -273.15f;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRetrofit();
        init();
        getIntentCityActivity(intent(), apiKey);
    }

    public void initRetrofit() {
        Retrofit retrofit;
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        openWeather = retrofit.create(OpenWeather.class);
    }


    private void init() {
        cityName = findViewById(R.id.cityName);
        temp = findViewById(R.id.temp);
        wind = findViewById(R.id.wind);
        press = findViewById(R.id.press);
        imageWeatherView = findViewById(R.id.imageWeather);
    }

    private String intent() {
        Bundle args = getIntent().getExtras();
        String city = args.getString(Constants.CITY);
        cityName.setText(city);
        return city;
    }


    private void getIntentCityActivity(String cityCountry, String apiKey) {
        openWeather.loadWeather(cityCountry, apiKey).enqueue(new Callback<WeatherRequest>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<WeatherRequest> call, Response<WeatherRequest> response) {
                if (response.body() != null) {
                    float resultTemp = response.body().getMain().getTemp() + AbsoluteZERO;
                    int resultPress = response.body().getMain().getPressure();
                    float resultWind = response.body().getWind().getSpeed();
                    //List<Weather> weather = response.body().getWeather();
                    //byte[] category = weather.get(0).getIcon().getBytes(StandardCharsets.UTF_8);
                    temp.setText(Float.toString(resultTemp));
                    wind.setText(Integer.toString((int) resultWind));
                    press.setText(Float.toString(resultPress));
                }
            }
            @Override
            public void onFailure(Call<WeatherRequest> call, Throwable t) {
                temp.setText("жди");
                wind.setText("жди");
                press.setText("жди");
            }

        });
    }

}

