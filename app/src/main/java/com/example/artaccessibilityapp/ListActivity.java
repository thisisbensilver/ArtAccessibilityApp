package com.example.artaccessibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.Collections;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void openRecyclerViewArtist(View view) {
        sortAndLaunch(Keys.compare_by_artist);
    }

    public void openRecyclerViewLocation(View view) {
        sortAndLaunch(Keys.compare_by_location);
    }

    public void openRecyclerViewEra(View view) {
        sortAndLaunch(Keys.compare_by_era);
    }

    public void openRecyclerViewTheme(View view) {

        sortAndLaunch(Keys.compare_by_theme);
    }


    //Just for debugging/testing
    public void clicktest(View view) {
        Toast.makeText(this, "CLICKED", Toast.LENGTH_SHORT).show();
    }


    public void sortAndLaunch(int code) {
        Painting.setSortCode(code);

        Collections.sort(Keys.paintings);

        String t = "\n\nSorted by: " + Painting.sortCode + "\n";
        for (int i = 0; i < Keys.paintings.size(); i++) {
            t += Keys.paintings.get(i).sortBy() + "\n";
        }
        t += "\n\n\n";
        Log.i("ARRAY", t);

        Intent intent = new Intent(this, PaintingRecyclerView.class);
        //intent.putExtra(Keys.SORTING_KEY_PAINTINGS, "TESTING");
        startActivity(intent);
    }
}
