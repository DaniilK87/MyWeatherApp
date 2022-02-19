package com.example.myweatherapp.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.widget.PopupMenu;

import com.example.myweatherapp.R;
import com.example.myweatherapp.AuthActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FABCity {

    public void click(View view) {
        FloatingActionButton fab = view.findViewById(R.id.fabCity);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu menu = new PopupMenu(fab.getContext(), view);
                menu.inflate(R.menu.popup_menu);
                menu.getMenu().findItem(R.id.settings);
                menu.getMenu().findItem(R.id.developer);
                menu.getMenu().findItem(R.id.write_to_us);
                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @SuppressLint("NonConstantResourceId")
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        int id = item.getItemId();
                        switch (id) {
                            case R.id.settings:
                                /*Intent intent = new Intent(fab.getContext(), AuthActivity.class);
                                view.getContext().startActivity(intent);
                                Toast.makeText(fab.getContext(), "Settings",Toast.LENGTH_LONG).show();*/
                            return true;
                            case R.id.developer:
                                Toast.makeText(fab.getContext(), "Developer",Toast.LENGTH_LONG).show();
                            return true;
                            case R.id.write_to_us:
                                Toast.makeText(fab.getContext(), "Send message",Toast.LENGTH_LONG).show();
                            return true;
                        }
                        return true;
                    }
                });
                menu.show();
            }
        });
    }

}
