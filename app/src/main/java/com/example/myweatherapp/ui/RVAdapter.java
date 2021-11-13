package com.example.myweatherapp.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myweatherapp.R;
import com.example.myweatherapp.data.City;
import com.example.myweatherapp.data.CitySource;


public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder>{

    private final LayoutInflater inflater;
    private CitySource citySource;
    private static OnItemClickListener itemClickListener;

    public RVAdapter(Context context, CitySource citySource) {
        this.inflater = LayoutInflater.from(context);
        this.citySource = citySource;
    }


    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.citylist_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RVAdapter.ViewHolder holder, int position) {
        City city = citySource.getCity(position);
        holder.setData(city.getCityName(),city.getCoat_of_arms());
    }

    public interface OnItemClickListener {
        void onItemClick(View view , int position);
    }

    public void SetOnItemClickListener(OnItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }


    @Override
    public int getItemCount() {
        return citySource.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView cityName;
        ImageView coat_of_arms;
        ViewHolder(View view){
            super(view);
            cityName = view.findViewById(R.id.itemCityName);
            coat_of_arms = view.findViewById(R.id.imageCOA);
            cityName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemClick(v, getAdapterPosition());
                    }
                }
            });
        }

        public void setData(String cityName, int coat_of_arms){
            getCoat_of_arms().setImageResource(coat_of_arms);
            getCityName().setText(cityName);
        }

        public TextView getCityName() {
            return cityName;
        }
        public ImageView getCoat_of_arms() {
            return coat_of_arms;
        }
    }
}

