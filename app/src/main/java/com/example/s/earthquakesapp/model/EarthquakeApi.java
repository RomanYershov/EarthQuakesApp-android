package com.example.s.earthquakesapp.model;

import com.example.s.earthquakesapp.model.entity.Earthquake;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

public class EarthquakeApi implements IEarthquakeApi {
    @Override
    public Observable<Earthquake> getEarthquakes() {
        Retrofit retrofit = new Retrofit.Builder()
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("http://earthquake.usgs.gov/fdsnws/event/1/")
                .build();

        IEarthquakeService weatherService = retrofit.create(IEarthquakeService.class);

        return weatherService.getEarthquakeData();
    }
}
