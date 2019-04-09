package com.example.artaccessibilityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class PaintingRecyclerView extends AppCompatActivity {

    ArrayList<Location> locations;
    ArrayList<Painting> paintings;
    PaintingAdapter paintingAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting_recycler_view);

        Intent intent = getIntent();
        String sortingTitle = "Sort by " + String.valueOf(intent.getSerializableExtra(Keys.SORTING_KEY));

        setTitle(sortingTitle);

        android.support.v7.widget.RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        initialData();

        if (sortingTitle.equals("Artists")){
            Collections.sort(paintings, new SortPaintingByArtist());
        }
        else if (sortingTitle.equals("Locations")){
            Collections.sort(paintings, Painting.SortPaintingByLocation);}
        else if (sortingTitle.equals("Eras")){
            Collections.sort(paintings, new SortPaintingByEra());
        }
        else if (sortingTitle.equals("Themes")){
            Collections.sort(paintings, new SortPaintingByEra());
        }
        else {
            Collections.sort(paintings, new SortByPaintingName());
        }

       paintingAdapter = new PaintingAdapter(paintings, this);
        recyclerView.setAdapter(paintingAdapter);
    }

    private void initialData() {
        locations = new ArrayList<>();
        paintings = new ArrayList<>();
        //Marilyn Monroe, Opus 217, Self Portrait, Starry Night, Untitled
        locations.add(new Location("The Museum of Modern Art",
                "11 W 53rd St", "New York", "NY", 10019, "USA"));
        //Birth of Venus
        locations.add(new Location("Uffizi Gallery",
                "Piazzale degli Uffizi, 6", "Firenze", "FI", 50122, "Italy"));
        //The Last Supper
        locations.add(new Location("Santa Maria delle Grazie",
                "Piazza di Santa Maria delle Grazie", "Milano", "MI", 20123, "Italy"));
        //The Last Supper Modern
        locations.add(new Location("The Metropolitan Museum of Art",
                "1000 5th Ave", "New York", "NY",10028, "USA"));

        paintings.add(new Painting("The Birth of Venus", "Botticelli", 1485,
                R.drawable.birth_of_venus_renaissance_botticelli, "This is an interesting Painting",
                "Uffizi Gallery", "Renaissance", "Mythology"));

        paintings.add(new Painting("The Last Supper", "Ana Martins", 2013,
                R.drawable.last_supper_modern_ana_martins, "This is an interesting Painting",
                "The Metropolitan Museum of Art", "Modern", "Religious"));

        paintings.add(new Painting("Marilyn Monroe", "Andy Warhol", 1962,
                R.drawable.marilyn_monroe_modern_warhol, "This is an interesting Painting",
                "The Museum of Modern Art", "Modern", "Portrait"));

        paintings.add(new Painting("Opus 217", "Paul Signac", 1890,
                R.drawable.opus_217_neoimpressionist_paul_signac, "This is an interesting Painting",
                "The Museum of Modern Art", "Neo-Impressionist", "Abstract"));

        paintings.add(new Painting("Self Portrait", "Andy Warhol", 1962,
                R.drawable.self_portrait_modern_warhol, "This is an interesting Painting",
                "The Museum of Modern Art", "Modern","Portrait" ));

        paintings.add(new Painting("Starry Night", "Vincent Van Gogh", 1889,
                R.drawable.starry_night_postimpressionist_van_gogh, "This is an interesting Painting",
                "The Museum of Modern Art", "Post-Impressionist", "Landscape"));

        paintings.add(new Painting("The Last Supper", "Leonardo DaVinci", 1495,
                R.drawable.the_last_supper_renaissance_davinci, "This is an interesting Painting",
                "Santa Maria delle Grazie", "Renaissance", "Religious"));

        paintings.add(new Painting("Untitled", "Jean-Michel Basquiat", 1982,
                R.drawable.untitled_modern_basquiat, "This is an interesting Painting",
                "The Museum of Modern Art", "Modern", "Abstract"));
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

