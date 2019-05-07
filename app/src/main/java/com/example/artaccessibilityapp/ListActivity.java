package com.example.artaccessibilityapp;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void openRecyclerViewArtist(View view) {


        /*
        TextView getInputText = findViewById(R.id.menu_artists);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY_PAINTINGS, menuText);


        startActivity(intent);

        */
        sortAndLaunch(Keys.compare_by_artist);


//Intent intent = new Intent(this, PaintingRecyclerView.class);



    }

    public void openRecyclerViewTheme(View view) {
        // Intent intent = new Intent(this, PaintingRecyclerView.class);
        // startActivity(intent);

/*
        TextView getInputText = findViewById(R.id.menu_themes);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY_PAINTINGS, menuText);
        startActivity(intent);
*/
        sortAndLaunch(Keys.compare_by_theme);

    }

    public void openRecyclerViewLocation(View view) {
        // Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);
/*
        TextView getInputText = findViewById(R.id.menu_locations);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY_PAINTINGS, menuText);
        startActivity(intent);*/

        sortAndLaunch(Keys.compare_by_location);

    }

    public void openRecyclerViewEra(View view) {
        //Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);


        TextView getInputText = findViewById(R.id.menu_eras);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY_PAINTINGS, menuText);
        startActivity(intent);

    }

    public void clicktest(View view) {
        Toast.makeText(this, "CLICKED", Toast.LENGTH_SHORT).show();
    }


    public void sortAndLaunch(int code) {
        Painting.setSortCode(code);
        Collections.sort(Keys.paintings);


        Object a = Keys.paintings;
        String m = "";

        Intent intent = new Intent(this, PaintingRecyclerView.class);
        //intent.putExtra(Keys.SORTING_KEY_PAINTINGS, "TESTING");
        startActivity(intent);
    }
}
