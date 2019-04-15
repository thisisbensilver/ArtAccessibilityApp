package com.example.artaccessibilityapp;

import android.content.Intent;
import android.view.View;

import java.io.Serializable;
import java.util.Comparator;

public class Painting implements Serializable {


    private String paintingName;
    private int paintingDate;
    private int photo;
    private String aboutPainting;
    private String paintingLocation;
    private String paintingEra;
    private String paintingArtist;
    private String paintingTheme;
    private static int trackerID = 0; //Used to give unique ID to every painting... even if its sorted.
    private int pID; //this is the unique ID for each painting (see below)

    //Ben Experimenting
    //private IconViewHolder ivh;


    public Painting(String name, String artist, int date, int photo, String aboutPainting,
                    String paintingLocation, String era, String theme) {
        this.paintingName = name;
        this.paintingDate = date;
        this.photo = photo;
        this.aboutPainting = aboutPainting;
        this.paintingLocation = paintingLocation;
        this.paintingEra = era;
        this.paintingArtist = artist;
        this.paintingTheme = theme;

        //Take the last ID and add 1 so you can save this new ID
        trackerID++;
        pID = trackerID;

    }

    public String getPaintingEra() {
        return paintingEra;
    }

    public int getPaintingDate() {
        return paintingDate;
    }

    public int getPhoto() {
        return photo;
    }

    public String getPaintingLocation() {
        return paintingLocation;
    }

    public String getAboutPainting() {
        return aboutPainting;
    }

    public String getPaintingName() {
        return paintingName;
    }

    public String getPaintingArtist() {
        return paintingArtist;
    }

    public String getPaintingTheme() {
        return paintingTheme;
    }

    public int getPID() {
        return pID;
    }

    public String getPIDasString() {
        return ("" + pID);
    }

    public static Comparator<Painting> SortPaintingByLocation = new Comparator<Painting>() {

    public int compare(Painting painting1, Painting painting2) {

        String paintingLocation1 = painting1.getPaintingLocation().toUpperCase();
        String paintingLocation2 = painting2.getPaintingLocation().toUpperCase();
        //ascending order
        return paintingLocation1.compareTo(paintingLocation2);
    }
    };


    public void openItem(View view) {
        // Intent intent = new Intent(this, PaintingRecyclerView.class);
        //startActivity(intent);

        //TextView getInputText = findViewById(R.id.menu_artists);
        //String menuText = getInputText.getText().toString();

        //ImageView img = findViewById(R.id.item_img);
        //TextView txt = findViewById(R.id.item_info);

        Intent mIntent = new Intent(view.getContext(), ItemActivity.class);
        mIntent.putExtra(Keys.SORTING_KEY_ITEM, this);

        //if (mIntent.resolveActivity(getPackageManager()) != null) {
        view.getContext().startActivity(mIntent);
        //}


/*
    public void openItemView(View view)
    {
        Intent mIntent = new Intent(this, ItemActivity.class);
        mIntent.putExtra(Keys.SORTING_KEY_ITEM, pt);

        if (mIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mIntent);
        }
    }*/
/*
    //Ben Experimenting
    public IconViewHolder getIvh()
    {
        return ivh;
    }

    public void setIvh(IconViewHolder a)
    {
        ivh = a;
    }*/

    }
}
