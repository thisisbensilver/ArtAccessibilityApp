package com.example.artaccessibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Collections;
import java.util.Comparator;


public class PaintingRecyclerView extends AppCompatActivity {


    // ArrayList<Location> locations;
    // ArrayList<Painting> paintings;
    PaintingAdapter paintingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting_recycler_view);
        Intent intent = getIntent();
        String sortingTitle = "Sort by " + String.valueOf(intent.getSerializableExtra(Keys.SORTING_KEY));

        setTitle(sortingTitle);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initialData();

        if (sortingTitle.equals("Artists")){
            Collections.sort(Keys.paintings, new SortPaintingByArtist());
        }
        else if (sortingTitle.equals("Locations")){
            Collections.sort(Keys.paintings, Painting.SortPaintingByLocation);
        }
        else if (sortingTitle.equals("Eras")){
            Collections.sort(Keys.paintings, new SortPaintingByEra());
        }
        else if (sortingTitle.equals("Themes")){
            Collections.sort(Keys.paintings, new SortPaintingByEra());
        }
        else {
            Collections.sort(Keys.paintings, new SortByPaintingName());
        }

        paintingAdapter = new PaintingAdapter(Keys.paintings, this);
        recyclerView.setAdapter(paintingAdapter);
    }



    public static Comparator<Painting> SortPaintingByLocation = new Comparator<Painting>() {

        public int compare(Painting painting1, Painting painting2) {

            String paintingLocation1 = painting1.getPaintingLocation().toUpperCase();
            String paintingLocation2 = painting2.getPaintingLocation().toUpperCase();
            //ascending order
            return paintingLocation1.compareTo(paintingLocation2);
        }
    };
}

