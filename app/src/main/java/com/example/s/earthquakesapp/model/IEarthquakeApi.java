package com.example.s.earthquakesapp.model;

import com.example.s.earthquakesapp.model.entity.Earthquake;

import rx.Observable;

public interface IEarthquakeApi {
    Observable<Earthquake> getEarthquakes();
}
