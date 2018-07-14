package com.example.s.earthquakesapp.view;

import com.example.s.earthquakesapp.model.entity.Feature;

import java.util.List;

public interface IMainView {
    void setEarthquakesListViewData(List<Feature> earthquakes);
    void updateEarthquakesListView(List<Feature> earthquakes);
    void setEmptyResponseText(String text);
    void hideLoadingIndicator();
    void showNoConnectionMessage();
}
