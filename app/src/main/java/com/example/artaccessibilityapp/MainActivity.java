package com.example.artaccessibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    IconAdapter iconAdapter;
    RecyclerView iconRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        initialData();

        //call initialdata a few times just to have a lot of items
        initialData();
        initialData();



        iconRecyclerView = findViewById(R.id.iconRecyclerView);
        iconRecyclerView.setHasFixedSize(true);

        //iconRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //iconRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        iconRecyclerView.setLayoutManager(staggeredGridLayoutManager);


        iconAdapter = new IconAdapter(Keys.paintings, this);
        iconRecyclerView.setAdapter(iconAdapter);





    }

    public void openList(View view) {


        //setContentView(R.layout.activity_list);

        Intent mIntent = new Intent(this, ListActivity.class);

        startActivity(mIntent);





    }

    private void initialData() {

        //Marilyn Monroe, Opus 217, Self Portrait, Starry Night, Untitled
        Keys.locations.add(new Location("The Museum of Modern Art",
                "11 W 53rd St", "New York", "NY", 10019, "USA"));
        //Birth of Venus
        Keys.locations.add(new Location("Uffizi Gallery",
                "Piazzale degli Uffizi, 6", "Firenze", "FI", 50122, "Italy"));
        //The Last Supper
        Keys.locations.add(new Location("Santa Maria delle Grazie",
                "Piazza di Santa Maria delle Grazie", "Milano", "MI", 20123, "Italy"));
        //The Last Supper Modern
        Keys.locations.add(new Location("The Metropolitan Museum of Art",
                "1000 5th Ave", "New York", "NY", 10028, "USA"));

        Keys.paintings.add(new Painting("The Birth of Venus", "Botticelli", 1485,
                R.drawable.birth_of_venus_renaissance_botticelli, "This is an interesting Painting",
                "Uffizi Gallery", "Renaissance", "Mythology"));

        Keys.paintings.add(new Painting("The Last Supper", "Ana Martins", 2013,
                R.drawable.last_supper_modern_ana_martins, "This is an interesting Painting",
                "The Metropolitan Museum of Art", "Modern", "Religious"));

        Keys.paintings.add(new Painting("Marilyn Monroe", "Andy Warhol", 1962,
                R.drawable.marilyn_monroe_modern_warhol, "This is an interesting Painting",
                "The Museum of Modern Art", "Modern", "Portrait"));

        Keys.paintings.add(new Painting("Opus 217", "Paul Signac", 1890,
                R.drawable.opus_217_neoimpressionist_paul_signac, "This is an interesting Painting",
                "The Museum of Modern Art", "Neo-Impressionist", "Abstract"));

        Keys.paintings.add(new Painting("Self Portrait", "Andy Warhol", 1962,
                R.drawable.self_portrait_modern_warhol, "This is an interesting Painting",
                "The Museum of Modern Art", "Modern", "Portrait"));

        Keys.paintings.add(new Painting("Starry Night", "Vincent Van Gogh", 1889,
                R.drawable.starry_night_postimpressionist_van_gogh, "This is an interesting Painting",
                "The Museum of Modern Art", "Post-Impressionist", "Landscape"));

        Keys.paintings.add(new Painting("The Last Supper", "Leonardo DaVinci", 1495,
                R.drawable.the_last_supper_renaissance_davinci, "This is an interesting Painting",
                "Santa Maria delle Grazie", "Renaissance", "Religious"));

        Keys.paintings.add(new Painting("Untitled", "Jean-Michel Basquiat", 1982,
                R.drawable.untitled_modern_basquiat, "This is an interesting Painting",
                "The Museum of Modern Art", "Modern", "Abstract"));
    }
}
