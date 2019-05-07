package com.example.artaccessibilityapp;

import java.util.ArrayList;

interface Keys {
    String SORTING_KEY_PAINTINGS = "heygirl";
    String SORTING_KEY_ITEM = "Give me an ITEM";

    ArrayList<Location> locations = new ArrayList<>();
    ArrayList<Painting> paintings = new ArrayList<>();

    int compare_by_title = 501;
    int compare_by_date = 502;
    int compare_by_location = 503;
    int compare_by_era = 504;
    int compare_by_artist = 505;
    int compare_by_theme = 506;

}
