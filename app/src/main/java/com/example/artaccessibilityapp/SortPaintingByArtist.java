package com.example.artaccessibilityapp;

import java.util.Comparator;

public class SortPaintingByArtist implements Comparator<Painting> {

    int comparisonVal;

    @Override
    public int compare(Painting a, Painting b) {
        comparisonVal = a.getPaintingArtist().compareTo(b.getPaintingArtist());
        return comparisonVal;
    }
}
