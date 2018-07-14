package com.example.s.earthquakesapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class EathRecyclerViewAdapter extends RecyclerView.Adapter<EathRecyclerViewAdapter.EarthViewHolder> {
     private  List<Earthquake> earthquakeList;

    public EathRecyclerViewAdapter(@NonNull List<Earthquake> earthquakes) {
        earthquakeList = earthquakes;
    }

    @NonNull
    @Override
    public EarthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new EarthViewHolder(layoutInflater.inflate(R.layout.earthquakes, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull EarthViewHolder holder, int position) {
        Earthquake earthquake = earthquakeList.get(position);
        holder.time.setText(String.valueOf(earthquake.getTime()));
        holder.place.setText(earthquake.getPlace());
        holder.magnituda.setText(String.valueOf(earthquake.getMagnituda()));
        if(earthquake.isCunamy())
            holder.cunami.setText("Цунами");
    }

    @Override
    public int getItemCount() {
        return earthquakeList.size();
    }

    class EarthViewHolder extends RecyclerView.ViewHolder {


        public TextView place;
        public TextView cunami;
        public TextView time;
        public TextView magnituda;
        public EarthViewHolder(View itemView) {
            super(itemView);
            place = itemView.findViewById(R.id.earth_place_tv);
            cunami = itemView.findViewById(R.id.earth_cunami_tv);
            time = itemView.findViewById(R.id.ea_time_tv);
            magnituda = itemView.findViewById(R.id.ia_magnitude_tv);

        }
    }
}
