package com.example.s.earthquakesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.s.earthquakesapp.model.entity.Earthquake;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Earthquake> earthquakeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialList();

        RecyclerView recyclerView = findViewById(R.id.eq_rv);
        EathRecyclerViewAdapter eathRecyclerViewAdapter = new EathRecyclerViewAdapter(earthquakeList);
        recyclerView.setAdapter(eathRecyclerViewAdapter);
    }

    private void initialList() {
        earthquakeList = new ArrayList<>();
        earthquakeList.add(new Earthquake( "Alamaty",5.4, false, 123));
        earthquakeList.add(new Earthquake( "Astana",3, false, 123));
        earthquakeList.add(new Earthquake( "Bishkek",2.3, true, 123));

    }


}
