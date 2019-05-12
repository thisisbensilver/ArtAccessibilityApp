package com.example.artaccessibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;


public class PaintingRecyclerView extends AppCompatActivity {


    PaintingAdapter paintingAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting_recycler_view);
        Intent intent = getIntent();

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        recyclerView.setItemViewCacheSize(20);
        recyclerView.setDrawingCacheEnabled(true);
        recyclerView.setDrawingCacheQuality(View.DRAWING_CACHE_QUALITY_HIGH);

        paintingAdapter = new PaintingAdapter(Keys.paintings, this);
        paintingAdapter.setHasStableIds(true);

        recyclerView.setAdapter(paintingAdapter);
    }

}



