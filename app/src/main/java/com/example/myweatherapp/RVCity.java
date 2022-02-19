package com.example.myweatherapp;

import android.content.Context;
import android.content.Intent;

public class RVCity {

    public  void londonCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"London" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void parisCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Paris" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void madridCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Madrid" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void milanCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Milan" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void amsterdamCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Amsterdam" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void berlinCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Berlin" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void romeCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Rome" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void pragueCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Prague" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void veinCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Vein" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

    public  void monacoCity(Context context) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra(Constants.CITY,"Monaco" );
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivities(new Intent[]{intent});
    }

}
