package com.example.s.earthquakesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Earthquake> earthquakeList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        earthquakeList = new ArrayList<>();

        initial();

       RecyclerView recyclerView = (RecyclerView)findViewById(R.id.am_list_rv);
       EarthRecyclerViewAdapter adapter = new EarthRecyclerViewAdapter(earthquakeList);
       recyclerView.setAdapter(adapter);

    }

    private void initial() {
        earthquakeList.add(new Earthquake(2.3, "Australiya", true, 1234534));
        earthquakeList.add(new Earthquake(4.4, "Almaty", false, 1234534));
        earthquakeList.add(new Earthquake(2.0, "Keyptoun", true, 1234534));
        earthquakeList.add(new Earthquake(7.0, "NewJersy", false, 1234534));
        earthquakeList.add(new Earthquake(5.1, "Cusco", false, 1234534));
    }
}
