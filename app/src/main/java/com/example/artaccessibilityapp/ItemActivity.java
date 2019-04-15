package com.example.artaccessibilityapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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
        TextView info = findViewById(R.id.item_info);
        info.setText("Hello, I am an intent and I contain info on " + pt.getPaintingName() + " by " + pt.getPaintingArtist() + "\n\nID#_" + pt.getPID());
        icon.setImageResource(pt.getPhoto());

    }
/*
    public void openItem(View view, Painting pt) {
        // Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);

        //TextView getInputText = findViewById(R.id.menu_artists);
        //String menuText = getInputText.getText().toString();

        //ImageView img = findViewById(R.id.item_img);
        //TextView txt = findViewById(R.id.item_info);

        Intent mIntent = new Intent(this, ItemActivity.class);
        mIntent.putExtra(Keys.SORTING_KEY_ITEM, pt);

        if (mIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mIntent);
        }


    }
*/
}