package com.example.artaccessibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void openRecyclerViewArtist(View view) {
        // Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);

        TextView getInputText = findViewById(R.id.menu_artists);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY_PAINTINGS, menuText);


        startActivity(intent);

    }

    public void openRecyclerViewTheme(View view) {
        // Intent intent = new Intent(this, PaintingRecyclerView.class);
        // startActivity(intent);


        TextView getInputText = findViewById(R.id.menu_themes);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY_PAINTINGS, menuText);
        startActivity(intent);

    }

    public void openRecyclerViewLocation(View view) {
        // Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);

        TextView getInputText = findViewById(R.id.menu_locations);
        String menuText = getInputText.getText().toString();
        Intent intent = new Intent(this, PaintingRecyclerView.class);
        intent.putExtra(Keys.SORTING_KEY_PAINTINGS, menuText);
        startActivity(intent);

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


}
