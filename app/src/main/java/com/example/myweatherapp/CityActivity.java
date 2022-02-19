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

import com.example.myweatherapp.data.CityList;
import com.example.myweatherapp.data.CitySource;
import com.example.myweatherapp.ui.FABCity;
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

        FABCity fabCity = new FABCity();
        fabCity.click(findViewById(R.id.fabCity));
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
                    case 0: {RVCity rvCity = new RVCity();
                    rvCity.londonCity(getApplicationContext());
                        break;
                    }
                    case 1: {RVCity rvCity1 = new RVCity();
                        rvCity1.parisCity(getApplicationContext());
                        break;
                    }
                    case 2: {RVCity rvCity = new RVCity();
                        rvCity.madridCity(getApplicationContext());
                        break;
                    }
                    case 3: {RVCity rvCity = new RVCity();
                        rvCity.berlinCity(getApplicationContext());
                        break;
                    }
                    case 4: {RVCity rvCity = new RVCity();
                        rvCity.amsterdamCity(getApplicationContext());
                        break;
                    }
                    case 5: {RVCity rvCity = new RVCity();
                        rvCity.veinCity(getApplicationContext());
                        break;
                    }
                    case 6: {RVCity rvCity = new RVCity();
                        rvCity.milanCity(getApplicationContext());
                        break;
                    }
                    case 7: {RVCity rvCity = new RVCity();
                        rvCity.monacoCity(getApplicationContext());
                        break;
                    }
                    case 8: {RVCity rvCity = new RVCity();
                        rvCity.romeCity(getApplicationContext());
                        break;
                    }
                    case 9: {RVCity rvCity = new RVCity();
                        rvCity.pragueCity(getApplicationContext());
                        break;
                    }

                    }
                }
        });
    }


    public void onShowButtonClick(View view) {
        CityList cityList = new CityList();
        inputCity = findViewById(R.id.etInputCity);
        for (String city: cityList.getCityList()) {
            if (inputCity.getText().toString().equals(city)) {
                Intent intent = new Intent(this,MainActivity.class);
                intent.putExtra(Constants.CITY,city);
                startActivity(intent);
            }
            // тут подумать над колбэком
        }
    }
}