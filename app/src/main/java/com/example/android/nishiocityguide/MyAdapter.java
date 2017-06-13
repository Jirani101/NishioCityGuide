package com.example.android.nishiocityguide;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;


/**
 * Created by delaroy on 2/13/17.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.CityViewHolder> {


    public static class CityViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView cityName;
        ImageView cityPhoto;

        CityViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            cityName = (TextView)itemView.findViewById(R.id.cardTitle);
           cityPhoto = (ImageView)itemView.findViewById(R.id.cardImage);
        }
    }

    List<City> cities;

    public MyAdapter(List<City> cities){
        this.cities = cities;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        CityViewHolder pvh = new CityViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(CityViewHolder personViewHolder, int i) {
        personViewHolder.cityName.setText(cities.get(i).name);
        personViewHolder.cityPhoto.setImageResource(cities.get(i).photoId);
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }
}