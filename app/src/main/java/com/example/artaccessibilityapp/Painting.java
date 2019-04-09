package com.example.artaccessibilityapp;

import java.util.Comparator;

public class Painting {

    private String paintingName;
    private int paintingDate;
    private int photo;
    private String aboutPainting;
    private String paintingLocation;
    private String paintingEra;
    private String paintingArtist;
    private String paintingTheme;


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

    public static Comparator<Painting> SortPaintingByLocation = new Comparator<Painting>() {

    public int compare(Painting painting1, Painting painting2) {

        String paintingLocation1 = painting1.getPaintingLocation().toUpperCase();
        String paintingLocation2 = painting2.getPaintingLocation().toUpperCase();
        //ascending order
        return paintingLocation1.compareTo(paintingLocation2);
    }
    };
}
