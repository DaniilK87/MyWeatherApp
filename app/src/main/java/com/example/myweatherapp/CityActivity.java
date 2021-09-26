package com.example.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class CityActivity extends AppCompatActivity {

    private final static String TAG = "MainTAG";
    private EditText inputCity;
    private Button showButton;
    private static final String CITY1 = "Ufa";
    private static final String CITY2 = "Kazan";
    private static final String CITY3 = "Moscow";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate");
        init();
    }

    private void init() {
        showButton = findViewById(R.id.showButton);
    }


    public void onShowButtonClick(View view) {
        inputCity = findViewById(R.id.etInputCity);
        Log.d(TAG, "onShowButtonClick");
       switch (inputCity.getText().toString()) {
            case CITY1:
                city1();
                break;
            case CITY2:
                city2();
                break;
            case CITY3:
                city3();
                break;
            default:
                Toast.makeText(this,"NO CITY",Toast.LENGTH_LONG).show();
                break;
        }
    }

    // temp press wind
    private void city1() {
            String temp1 = "+7";
            String press1 = "749";
            String wind1 = "3";
            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("city1", CITY1);
            intent.putExtra("temp1", temp1);
            intent.putExtra("press1", press1);
            intent.putExtra("wind1", wind1);
            startActivity(intent);
    }

    private void city2() {
        String temp2 = "+10";
        String press2 = "730";
        String wind2 = "8";
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("city2", CITY2);
        intent.putExtra("temp2", temp2);
        intent.putExtra("press2", press2);
        intent.putExtra("wind2", wind2);
        startActivity(intent);
    }

    private void city3() {
        String temp3 = "+12";
        String press3 = "750";
        String wind3 = "15";
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("city3", CITY3);
        intent.putExtra("temp3", temp3);
        intent.putExtra("press3", press3);
        intent.putExtra("wind3", wind3);
        startActivity(intent);
    }
}