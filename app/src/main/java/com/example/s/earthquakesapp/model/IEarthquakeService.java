package com.example.s.earthquakesapp.model;

import com.example.s.earthquakesapp.model.entity.Earthquake;

import retrofit2.http.GET;
import rx.Observable;

public interface IEarthquakeService {
    @GET("query?format=geojson&eventtype=earthquake&orderby=time&minmag=6&limit=10")
    Observable<Earthquake> getEarthquakeData();
}
