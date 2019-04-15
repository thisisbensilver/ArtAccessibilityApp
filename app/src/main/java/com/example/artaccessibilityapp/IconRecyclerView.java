package com.example.artaccessibilityapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class IconRecyclerView extends AppCompatActivity {

    IconAdapter iconAdapter;
    RecyclerView iconRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        iconRecyclerView = findViewById(R.id.iconRecyclerView);
        iconRecyclerView.setHasFixedSize(true);
        iconRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        iconAdapter = new IconAdapter(Keys.paintings, this);
        iconRecyclerView.setAdapter(iconAdapter);
    }


}

