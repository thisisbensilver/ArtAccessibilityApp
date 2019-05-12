package com.example.artaccessibilityapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        Intent iIntent = getIntent();
        Painting pt = (Painting) iIntent.getSerializableExtra(Keys.SORTING_KEY_ITEM);

        ImageView icon = findViewById(R.id.item_img);
        TextView info = findViewById(R.id.item_title);
        info.setText(pt.getPaintingName() + " by " + pt.getPaintingArtist());

        info = findViewById(R.id.item_description);
        info.setText(pt.getAboutPainting());

        icon.setImageResource(pt.getPhoto());

        Button button = findViewById(R.id.navButton);
        button.setText("Navigate to " + pt.getPaintingLocation());

    }

    public void openMaps(View view) {

        Intent iIntent = getIntent();
        Painting pt = (Painting) iIntent.getSerializableExtra(Keys.SORTING_KEY_ITEM);

        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + pt.getPaintingLocation());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

}
