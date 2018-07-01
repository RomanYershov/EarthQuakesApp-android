package com.example.s.earthquakesapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class EarthRecyclerViewAdapter extends RecyclerView.Adapter<EarthRecyclerViewAdapter.EarthViewHolder> {
    private List<Earthquake> earthquakeList;

    public EarthRecyclerViewAdapter(@NonNull List<Earthquake> earthquakes) {
        earthquakeList = earthquakes;
    }

    @NonNull
    @Override
    public EarthViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        return new EarthViewHolder(layoutInflater.inflate(R.layout.earthquakes, parent, false));
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull EarthViewHolder holder, int position) {
        Earthquake earthquake = earthquakeList.get(position);
        holder.time.setText(String.valueOf(earthquake.getTime()));
        holder.place.setText(earthquake.getPlace());
        if (earthquake.isCunami())
            holder.cunami.setText("Цунами");
        holder.round.setImageResource(R.drawable.round);


    }

    @Override
    public int getItemCount() {
        return earthquakeList.size();
    }

    class EarthViewHolder extends RecyclerView.ViewHolder {
        public TextView place;
        public TextView cunami;
        public TextView time;
        public ImageView round;

        public EarthViewHolder(View itemView) {
            super(itemView);
            place = itemView.findViewById(R.id.earth_place_tv);
            cunami = itemView.findViewById(R.id.earth_cunami_tv);
            time = itemView.findViewById(R.id.ea_time_tv);
            round = itemView.findViewById(R.id.ea_img_iv);
        }
    }
}
