package com.example.artaccessibilityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRecyclerViewArtist(View view){
       // Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);


        TextView getInputText = (TextView) findViewById(R.id.menu_artists);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY, menuText);
        startActivity(intent);

    }

    public void openRecyclerViewTheme(View view){
       // Intent intent = new Intent(this, PaintingRecyclerView.class);
        // startActivity(intent);


        TextView getInputText = (TextView) findViewById(R.id.menu_themes);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY, menuText);
        startActivity(intent);

    }

    public void openRecyclerViewLocation(View view){
       // Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);

        TextView getInputText = (TextView) findViewById(R.id.menu_locations);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY, menuText);
        startActivity(intent);

    }

    public void openRecyclerViewEra(View view){
        //Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);


        TextView getInputText = (TextView) findViewById(R.id.menu_eras);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY, menuText);
        startActivity(intent);

    }
}
