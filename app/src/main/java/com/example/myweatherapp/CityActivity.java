package com.example.myweatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myweatherapp.data.City;
import com.example.myweatherapp.data.CitySource;
import com.example.myweatherapp.data.Constants;
import com.example.myweatherapp.ui.RVAdapter;


public class CityActivity extends AppCompatActivity {

    private final static String TAG = "MainTAG";
    private EditText inputCity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);
        Log.d(TAG, "onCreate");

        CitySource citySource = new CitySource(getResources());
        initRecyclerView(citySource.build());
    }

        private void initRecyclerView(CitySource citySource){
            RecyclerView recyclerView = findViewById(R.id.rvList);
            recyclerView.setHasFixedSize(true);

            LinearLayoutManager layoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);

            RVAdapter adapter = new RVAdapter(this,citySource);
            recyclerView.setAdapter(adapter);


        adapter.SetOnItemClickListener(new RVAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0: city1();break;
                    case 1: city2();break;
                    case 2: city3();break;
                }
            }
        });
    }



    public void onShowButtonClick(View view) {
        inputCity = findViewById(R.id.etInputCity);
        Log.d(TAG, "onShowButtonClick");
       switch (inputCity.getText().toString()) {
           case Constants.CITY1:
                city1();
                break;
           case Constants.CITY2:
                city2();
                break;
           case Constants.CITY3:
                city3();
                break;
            default:
                Toast.makeText(this,"NO CITY",Toast.LENGTH_LONG).show();
                break;
        }
    }

   private void city1() {
        City city = new City("Ufa","02","02","02");
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(City.class.getSimpleName(), city);
        startActivity(intent);
    }

    private void city2() {
        City city = new City("Kazan","16","16","16");
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(City.class.getSimpleName(), city);
        startActivity(intent);
    }

    private void city3() {
        City city = new City("Moscow","77","77","77");
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra(City.class.getSimpleName(), city);
        startActivity(intent);
    }
}