package com.example.artaccessibilityapp;

import android.content.Intent;
import android.view.View;

import java.io.Serializable;
import java.util.Comparator;

public class Painting implements Serializable, Comparable {

    public static int sortCode;
    public static Comparator<Painting> SortPaintingByLocation = new Comparator<Painting>() {

        public int compare(Painting painting1, Painting painting2) {

            String paintingLocation1 = painting1.getPaintingLocation().toUpperCase();
            String paintingLocation2 = painting2.getPaintingLocation().toUpperCase();
            //ascending order
            return paintingLocation1.compareTo(paintingLocation2);
        }
    };
    private static int trackerID = 0; //Used to give unique ID to every painting... even if its sorted.
    private String paintingName;
    private int paintingDate;
    private int photo;
    private String aboutPainting;
    private String paintingLocation;
    private String paintingEra;
    private String paintingArtist;
    private String paintingTheme;
    private String sortBy;
    private int pID; //this is the unique ID for each painting (see below)

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


        //default sortby
        sortCode = Keys.compare_by_title;

        //Take the last ID and add 1 so you can save this new ID
        trackerID++;
        pID = trackerID;
    }

    public static void setSortCode(int code) {

        if (code == Keys.compare_by_artist) {
            sortCode = code;
        } else if (code == Keys.compare_by_date) {
            sortCode = code;
        } else if (code == Keys.compare_by_era) {
            sortCode = code;
        } else if (code == Keys.compare_by_location) {
            sortCode = code;
        } else if (code == Keys.compare_by_title) {
            sortCode = code;
        } else if (code == Keys.compare_by_theme) {
            sortCode = code;
        } else {
            sortCode = Keys.compare_by_title;
        }
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

    public String sortBy() {

        if (sortCode == Keys.compare_by_artist) {
            sortBy = getPaintingArtist();
        } else if (sortCode == Keys.compare_by_date) {
            sortBy = Integer.toString(getPaintingDate());
        } else if (sortCode == Keys.compare_by_era) {
            sortBy = getPaintingEra();
        } else if (sortCode == Keys.compare_by_location) {
            sortBy = getPaintingLocation();
        } else if (sortCode == Keys.compare_by_title) {
            sortBy = getPaintingName();
        } else if (sortCode == Keys.compare_by_theme) {
            sortBy = getPaintingTheme();
        } else {
            sortBy = getPaintingName();
        }

        return sortBy;
    }

    public void openItem(View view) {

        Intent mIntent = new Intent(view.getContext(), ItemActivity.class);
        mIntent.putExtra(Keys.SORTING_KEY_ITEM, this);

        view.getContext().startActivity(mIntent);

    }

    @Override
    public int compareTo(Object o) {

        return this.sortBy().compareTo(((Painting) o).sortBy());
    }


}

